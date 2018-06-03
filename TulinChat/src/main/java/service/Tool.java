package service;

import bean.User;
import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;

import java.io.*;
import java.net.*;

public class Tool {
    public String sendMeg(String jsonstr) {
        String back = null;
        String result = null;
        try {
            //创建连接
            URL url = new URL("http://www.tuling123.com/openapi/api");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(300000);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Charset", "UTF-8");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            connection.setRequestProperty("accept", "application/json");
            connection.connect();
            // POST请求
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
//            JSONObject obj = JSONObject.fromObject(jsonstr);
//            String json = java.net.URLEncoder.encode(obj.toString(), "utf-8");
            out.writeBytes(jsonstr);
            out.flush();
            out.close();
             //读取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = URLDecoder.decode(URLDecoder.decode(lines, "GBK"), "UTF-8");
                sb.append(lines);
            }
            //System.out.println(sb+"是返回数据");
            back = sb.toString();
            reader.close();
            // 断开连接
            connection.disconnect();

            /*InputStream inputStream = HttpURLConnection.getInputStream();
            if (HttpURLConnection.getResponseCode() == 200) {
                // 内存流对象
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(data)) != -1) {
                    byteArrayOutputStream.write(data, 0, len);
                }
                result = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            } else {
                //此处写入请求失败操作
            }
            inputStream.close();
            outputStream.close();*/
//            int length = (int) connection.getContentLength();// 获取长度
//            InputStream is = connection.getInputStream();
//            if (length != -1) {
//                byte[] data = new byte[length];
//                byte[] temp = new byte[512];
//                int readLen = 0;
//                int destPos = 0;
//                while ((readLen = is.read(temp)) > 0) {
//                    System.arraycopy(temp, 0, data, destPos, readLen);
//                    destPos += readLen;
//                }
//                 result = new String(data, "UTF-8");
//            }
//            /*StringBuffer strBuf = new StringBuffer();
//
//            // 打开输入流 , 读取服务器返回的数据
//            BufferedReader reader = new BufferedReader(new
//                    InputStreamReader(connection.getInputStream()));
//
//            String line;
//
//            // 一行一行的读取服务器返回的数据
//            while ((line = reader.readLine()) != null) {
//                strBuf.append(line).append("\n");
//            }
//
//            // 关闭输入流
//            reader.close();
//            System.out.println("执行到这里了ttt");
//            // 打印服务器返回的数据
//            back = strBuf.toString();*/

//            return back;

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//                return result;
            return back;
    }
}
