package servlet;

import DB.DatabaseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/TextServlet")   //测试类
public class TextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();

        SimpleDateFormat f_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = f_date.format(new Date());
        String context = request.getParameter("text");
        String username = "da98fb2b5af941d991ef9af6fafed462";

        DatabaseUtils dbUtils = new DatabaseUtils();
        dbUtils.InsertSql(context,username,date);

        session.setAttribute("text",context);
            //request.getRequestDispatcher("/UploadServlet").forward(request,response);
        response.sendRedirect("UploadServlet");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
