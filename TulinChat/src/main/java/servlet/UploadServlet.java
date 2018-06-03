package servlet;

import DB.Database;
import DB.DatabaseUtils;
import bean.User;
import com.alibaba.fastjson.JSON;
import service.Tool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet( "/UploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        HttpSession session = request.getSession();


        SimpleDateFormat f_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = f_date.format(new Date());
        String robotname = "TulinRobot";




        DatabaseUtils dbUtils = new DatabaseUtils();

        //设置用户，插入用户消息
        String mycontext = request.getParameter("text");
        User user = new User();
        user.setInfo(mycontext);
        user.setKey("da98fb2b5af941d991ef9af6fafed462");
        dbUtils.InsertSql(mycontext,user.getKey(),date);
        //json对象转json字符串
        String objson = JSON.toJSONString(user);
        //String mycontext = request.getParameter("context");

        Tool tool = new Tool();
        String getjson = tool.sendMeg(objson);//调用接口
        if(getjson == null){

            session.setAttribute("get","无参");
            //request.setAttribute("objson","无参");
        }
        else{

        session.setAttribute("objson",getjson);
           // request.setAttribute("objson",getjson);
        }

        //解析返回参数
        String text = null;
        Pattern pattern = Pattern.compile("\\\"text\\\":\\\"(.*?)\\\"}");
        Matcher matcher = pattern.matcher(getjson);
        while(matcher.find()){
            text = matcher.group(1);
        }

        //插入数据库
        dbUtils.InsertSql(text,robotname,date);




        session.setAttribute("text",text);
        //request.getRequestDispatcher("index.jsp").forward(request,response);
        response.sendRedirect("index.jsp");






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
