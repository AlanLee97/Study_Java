package com.shop.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shop.dao.ProductDao;
import com.shop.entity.Category;
import com.shop.entity.PageBean;
import com.shop.entity.Product;
import org.apache.commons.beanutils.BeanUtils;

import java.util.List;
import java.util.Map;

/**
 * 产品业务层
 */
public class ProductService {
    private ProductDao productDao = new ProductDao();

    /**
     * 查询最热商品
     */
    public List<Product> findHotProduct(){

        return productDao.findHotProduct();
    }


    /**
     * 查询最新商品
     */
    public List<Product> findNewProduct(){

        return productDao.findNewProduct();
    }


    /**
     * 根据类别编号查询所有商品
     * @param currentCid 类别编号
     * @param currentPageNo 当前页号
     * @return
     */
    public PageBean<Product> findAllProductByCid(int currentCid, int currentPageNo) {
        PageBean<Product> pageBean = new PageBean<Product>();

        //封装当前页号
        pageBean.setCurrentPageNo(currentPageNo);

        //封装页面数量
        pageBean.setPageNums(6);

        //封装总记录数
        int allRecord = productDao.getAllRecord(currentCid);
        pageBean.setAllRecord(allRecord);

        //封装总页号
        int allPage = 0;
        if (pageBean.getAllRecord() % pageBean.getPageNums() == 0){ // 总记录数 % 总页数->30 % 6 = 0
            allPage = pageBean.getAllRecord() / pageBean.getPageNums();
        }else {
            //如果不能整除，则页面总页数要加1
            allPage = pageBean.getAllRecord() / pageBean.getPageNums() + 1;
        }
        pageBean.setAllPage(allPage);


        //封装页面内容:计算方法：(start = (页号-1) * size)
        int size = pageBean.getPageNums();
        int start = (pageBean.getCurrentPageNo() - 1) * size;
        List<Product> pageContent =  productDao.findAllProductByCid(currentCid, start, size);
        pageBean.setPageContent(pageContent);

        return pageBean;

    }


    /**
     * 根据商品编号，查询商品的详细信息，包括类别编号和名称
     */
    public Product findProductByPid(int pid) throws Exception {
        Product product = new Product();
        Category category = new Category();

        Map<String, Object> map = productDao.findProductByPid(pid);

        //封装Product信息,但cid和cname没有封装
        BeanUtils.populate(product, map);

        //封装Category信息，cid和cname有封装
        BeanUtils.populate(category, map);


        //让Product封装Category
        product.setCategory(category);

        return product;
    }


    /**
     * 根据商品编号，查询商品的详细信息，包括类别编号和名称
     */
    public String findAllCategory() throws Exception {

        //01 调用访问层对象的方法
        String categoryListJson = productDao.findAllCategoryWithRedis();

        //判断JSON为NULL
        if (null == categoryListJson){
            List<Category> categoryList = productDao.findAllCategoryWithMysql();

            //使用第三方工具将List<Category>对象转成JSON字符串
            categoryListJson = new ObjectMapper().writeValueAsString(categoryList);

            //为了下次直接访问Redis就能获取数据，所以将结果再次存入Redis
            productDao.saveCategoryWithRedis(categoryListJson);
        }
        return categoryListJson;
    }

}
