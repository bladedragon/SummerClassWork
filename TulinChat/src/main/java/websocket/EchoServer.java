package websocket;

import service.API;

import javax.servlet.http.HttpSession;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint("/echo")
public class EchoServer {


    public EchoServer() {
        System.out.println("EchoServer Constructor!!!");
    }


    @OnMessage
    public String receive(String incomingMessage) {
        API api = new API();
        return api.GetTulinStr(incomingMessage);
    }

    @OnOpen
    public void open(Session session) {

        System.out.println("建立连接成功！！" + session.getId());
    }


    @OnClose
    public void close(Session session) {
        System.out.println(session.getId() + "session 关闭啦！！！");
    }

}
