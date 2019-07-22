package com.shop.dao;

import com.shop.entity.Category;
import com.shop.entity.Product;
import com.shop.util.DataSourceUtil;
import com.shop.util.JedisUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

public class ProductDao {
    private JdbcTemplate jt = new JdbcTemplate(DataSourceUtil.getDataSource());
//    private Jedis jedis = JedisUtil.getJedis();

    /**
     * 查询最热商品且上架的商品
     */
    public List<Product> findHotProduct(){
        String sql = "select * from tab_product where is_hot=1 and pflag=1 limit 0,12";
        return jt.query(sql, new BeanPropertyRowMapper<>(Product.class));
    }


    /**
     * 查询最新商品
     */
    public List<Product> findNewProduct(){
        String sql = "select * from tab_product where pflag=1 order by pdate desc limit 0,12";
        return jt.query(sql, new BeanPropertyRowMapper<>(Product.class));
    }

    /**
     * 根据类别，获取该类别下的总记录数
     * @param cid
     */
    public int getAllRecord(int cid) {
        String sql = "select count(pid) from tab_product where cid=?";
        Object[] params = {cid};
        int allRecord = jt.queryForObject(sql, params, int.class);
        return allRecord;
    }


    /**
     * 根据类别，分页查询所有商品
     * @param cid 类别编号
     * @param start 从第几条记录开始查询
     * @param size 要查询多少条记录
     * @return 这页显示的内容
     */
    public List<Product> findAllProductByCid(int cid, int start, int size) {
        String sql = "select * from tab_product where cid=? limit ?,?";
        Object[] params = {cid, start, size};

        return jt.query(sql,params, new BeanPropertyRowMapper<>(Product.class));
    }


    /**
     * 根据商品编号，查询商品的详细信息（含类别编号和名称）
     */
    public Map<String, Object> findProductByPid(int pid) {
        String sql = "select * from tab_category c,tab_product p where c.cid = p.cid and pid=?";
        Object[] params = {pid};
        return jt.queryForMap(sql, params);

        /**
         * 笔记
         * //jt.query();查询所有记录，并封装成JavaBean对象
         * //jt.queryForObject();查询某条记录，并封装成JavaBean对象，或int.class
         * //jt.queryForMap()当没有一个JavaBean可以收集记录时，采用Map来收集
         * //Map的key表示字段名，如pid,pname,cid,cname
         * //Map的value表示字段值，如1,"小米1C"，1，"手机数码"
         */
    }

    public static void main(String[] args) {
        Map<String, Object> map = new ProductDao().findProductByPid(7);
        System.out.println(map);
    }


    /**
     * 从mysql中查询所有类别
     */
    public List<Category> findAllCategoryWithMysql() {
        System.out.println("findAllCategoryWithMysql");
        String sql = "select * from tab_category order by cid asc";
        return jt.query(sql,new BeanPropertyRowMapper<>(Category.class));
    }



    /**
     * 从redis查询所有类别
     * 如果Redis有数据，则返回JSON字符串
     * 如果Redis无数据，则返回NULL
     */
    public String findAllCategoryWithRedis() {
        System.out.println("findAllCategoryWithRedis");
        Jedis jedis = JedisUtil.getJedis();
        String categoryListJson = jedis.get("CATEGORY_LIST_JSON");
        jedis.close();

        return categoryListJson;
    }





    /**
     * 将所有类别保存到Redis数据库中
     */
    public void saveCategoryWithRedis(String value) {
        Jedis jedis = JedisUtil.getJedis();
        jedis.set("CATEGORY_LIST_JSON",value);
        jedis.close();

    }
}
