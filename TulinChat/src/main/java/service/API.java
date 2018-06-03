package service;

import DB.DatabaseUtils;
import bean.User;
import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//封装一个api接口
public class API {
    public String GetTulinStr(String mycontext){
        SimpleDateFormat f_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = f_date.format(new Date());
        String robotname = "TulinRobot";

        DatabaseUtils dbUtils = new DatabaseUtils();
        User user = new User();
        user.setInfo(mycontext);
        user.setKey("da98fb2b5af941d991ef9af6fafed462");
        dbUtils.InsertSql(mycontext,user.getKey(),date);
        String objson = JSON.toJSONString(user);

        Tool tool = new Tool();
        String getjson = tool.sendMeg(objson);//调用接口
        String text = null;
        Pattern pattern = Pattern.compile("\\\"text\\\":\\\"(.*?)\\\"}");
        Matcher matcher = pattern.matcher(getjson);
        while(matcher.find()){
            text = matcher.group(1);
        }
        dbUtils.InsertSql(text,robotname,date);

        return text;

    }
}
