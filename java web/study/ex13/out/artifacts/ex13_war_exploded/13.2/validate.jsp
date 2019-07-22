<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.Random" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="com.sun.image.codec.jpeg.JPEGImageEncoder" %>
<%@ page import="com.sun.image.codec.jpeg.JPEGCodec" %>
<%@ page import="java.io.IOException" %>
<%--
  Created by IntelliJ IDEA.
  User: AlanLee
  Date: 2019/4/28
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    response.setHeader("Cache-Control","no-cache");
    int width = 60, height = 20;
    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics g = image.getGraphics();
    g.setColor(new Color(200,200,200));
    g.fillRect(0,0,width,height);
    Random rnd = new Random();
    int randNum = rnd.nextInt(8999) + 1000;
    out.print("随机数：" + randNum);

    String randStr = String.valueOf(randNum);
    session.setAttribute("randStr", randStr);
    out.print("随机数：" + randStr);
    g.setColor(Color.black);
    g.setFont(new Font("", Font.PLAIN, 20));
    g.drawString(randStr,10,17);



    for (int i = 0; i < 100; i++){
        int x = rnd.nextInt(width);
        int y = rnd.nextInt(height);
        g.drawOval(x,y,1,1);
    }

//显示图片方式2：
    response.reset();
    g.dispose();
    JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(response.getOutputStream());
    encoder.encode(image);

//    out.print("<br>有没有输出我？？？？？？？？？？？？？？？");
//

//    显示图片方式1：不能显示
//    try{
//        ImageIO.write(image,"JPEG",response.getOutputStream());
//    }catch (IOException e){
//        e.printStackTrace();
//    }



    out.clear();
    out = pageContext.pushBody();

%>
</body>
</html>
