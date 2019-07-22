package com.shop.test;

import com.shop.dao.ProductDao;
import com.shop.entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestProductDao {
    private ProductDao productDao = new ProductDao();

    /**
     * 测试查询最热商品的方法findHotProduct()
     */
    @Test
    public void testFindHotProduct(){
        List<Product> hotProductList = productDao.findHotProduct();
        for (Product product : hotProductList) {
            System.out.println(product);
        }
    }


    /**
     * 测试查询最新商品的方法findNewProduct()
     */
    @Test
    public void testFindNewProduct(){
        List<Product> newProductList = productDao.findNewProduct();
//        for (Product product : newProductList) {
//            System.out.println(product);
//        }

        //断言方法
        Assert.assertEquals(12,newProductList.size());
    }

    /**
     * 测试Dao层的findAllProductByCid()
     */
    @Test
    public void testFindAllProductByCid(){
        List<Product> allProductList = productDao.findAllProductByCid(1,0,5);
        for (Product product : allProductList) {
            System.out.println(product);
        }
    }
}
