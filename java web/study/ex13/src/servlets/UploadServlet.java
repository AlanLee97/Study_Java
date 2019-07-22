package servlets;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SmartUpload smartUpload = new SmartUpload();
        //init
        ServletConfig config = this.getServletConfig();
        smartUpload.initialize(config,request,response);


        try{
            smartUpload.upload();
            File smartFile = smartUpload.getFiles().getFile(0);
            smartFile.saveAs("F:/test/" + smartFile.getFieldName(), smartUpload.SAVE_PHYSICAL);

        }catch (SmartUploadException e){
            e.printStackTrace();
        }

        String successMsg = "上传成功！";
        request.setAttribute("successMsg",successMsg);
        RequestDispatcher rd = request.getRequestDispatcher("/13.4/uploadForm.jsp");
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
