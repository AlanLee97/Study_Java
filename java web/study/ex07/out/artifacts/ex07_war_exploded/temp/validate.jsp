<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/11
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@page
import="java.awt.*"
import="java.util.*"
import="javax.imageio.ImageIO"
pageEncoding="UTF-8"
%>
<%@ page import="java.awt.image.BufferedImage" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    response.setHeader("Cache-Control","no-cache");
    int width = 600, height = 200;
    BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    Graphics graphics = image.getGraphics();
    graphics.setColor(new Color(19, 187, 255, 240));
    graphics.fillRect(0,0,width,height);

//    Random random = new Random();
//    int randNum = random.nextInt(8999) + 1000;
//    String randStr = String.valueOf(randNum);
//
//    session.setAttribute("randStr",randStr);
//    graphics.setColor(Color.black);
//    graphics.setFont(new Font("Arial",Font.PLAIN, 20));
//    graphics.drawString(randStr,10,17);
//
//    for (int i = 0; i < 100; i++){
//        int x = random.nextInt(width);
//        int y = random.nextInt(height);
//        graphics.drawOval(x,y,1,1);
//    }

    ImageIO.write(image,"JPEG",response.getOutputStream());
    out.clear();
    out = pageContext.pushBody();





%>

