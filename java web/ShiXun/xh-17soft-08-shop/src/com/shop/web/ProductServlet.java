package com.shop.web;

import com.shop.entity.PageBean;
import com.shop.entity.Product;
import com.shop.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 */
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    // 创建并调用Service层对象
    private ProductService productService = new ProductService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");

        switch (method){
            case "findHotNewProduct":
                this.findHotNewProduct(request,response);
                break;

            case "findAllProductByCid":
                this.findAllProductByCid(request,response);
                break;

            case "findProductByPid":
                this.findProductByPid(request,response);
                break;

            case "findAllCategory":
                this.findAllCategory(request,response);
                break;

            default:
                request.getRequestDispatcher("/index.jsp").forward(request,response);
                break;

        }
    }



    //ProductServlet.java
    /**
     *查询最热和最新商品
     */
    private void findHotNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<Product> hotProductList = productService.findHotProduct();
        List<Product> newProductList = productService.findNewProduct();

        //02 将2个集合放入到request
        request.setAttribute("HOT_PRODUCT_LIST",hotProductList);
        request.setAttribute("NEW_PRODUCT_LIST",newProductList);

        //03 转发到index.jsp页面中
        request.getRequestDispatcher("index.jsp").forward(request,response);


    }


    /**
     * 根据类别编号，查询所有商品
     */
    private void findAllProductByCid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //01 获取类别编号
        String strCid = request.getParameter("cid");

        //02 获取当前页号
        String strCurrentPageNo = request.getParameter("currentPageNo");

        //03 如果没有接收到当前页号，就默认当前页号为1
        if (strCurrentPageNo == null){
            strCurrentPageNo = "1";
        }

        //04 调用Service层
        PageBean<Product> productPageBean = productService.findAllProductByCid(Integer.parseInt(strCid), Integer.parseInt(strCurrentPageNo));

        //05 将PageBean对象放入到request对象中
        request.setAttribute("PAGEBEAN",productPageBean);

        //06 转发到product_list.jsp中
        request.getRequestDispatcher("/product_list.jsp").forward(request, response);

    }



    /**
     * 根据商品编号，查询所有商品
     */
    private void findProductByPid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("findProductByPid");
        try {
            //01 获取商品编号
            String strPid = request.getParameter("pid");

            //02 创建并调用业务层对象的方法
            ProductService productService = new ProductService();
            Product product = productService.findProductByPid(Integer.parseInt(strPid));

            //03 将Product对象放入request域对象
            request.setAttribute("PRODUCT",product);

            //04 转发到product_info.jsp中
            request.getRequestDispatcher("/product_info.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("MESSAGE","系统出错，请联系管理员");
            request.getRequestDispatcher("/WEB-INF/message.jsp").forward(request,response);
        }

    }


    /**
     * 查询所有类别
     *
     */
    private void findAllCategory(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            System.out.println("findAllCategory");

            //01 调用业务层对象的方法
            String json = productService.findAllCategory();

            //02 将JSON字符串以IO的形式，输出到客户端
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(json);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("error");
        }

    }

}
