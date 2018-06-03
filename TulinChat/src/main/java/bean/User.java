package bean;

import com.alibaba.fastjson.JSON;

public class User {
    private String key;
    private String info;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public static void main(String[] args) {
        User user = new User();
        user.setKey("da98fb2b5af941d991ef9af6fafed462");
        user.setInfo("hhhhhhhhh");

        String objson = JSON.toJSONString(user);
        System.out.println(objson);
    }

}

