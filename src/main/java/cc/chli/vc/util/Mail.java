package cc.chli.vc.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Mail {

    protected final Logger logger = Logger.getLogger(getClass());

    public static final String ENCODEING = "UTF-8";

        public String host; // 服务器地址

        public String sender; // 发件人的邮箱

        public List<String> receiver; // 收件人的邮箱

        public String name; // 发件人昵称

        public String username; // 账号

        public String password; // 密码

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public List getReceiver() {
        return receiver;
    }

    public void setReceiver(List receiver) {
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean send(String subject, String message){

        HtmlEmail email = new HtmlEmail();
        try {
            // 这里是SMTP发送服务器的名字：163的如下："smtp.163.com"
            email.setHostName(host);
            // 字符编码集的设置
            email.setCharset(Mail.ENCODEING);
            // 收件人的邮箱
            for (int i = 0; i <receiver.size() ; i++) {
                email.addTo(receiver.get(i));
            }

            // 发送人的邮箱
            email.setFrom(sender, name);
            // 如果需要认证信息的话，设置认证：用户名-密码。分别为发件人在邮件服务器上的注册名称和密码
            email.setAuthentication(username,password);
            // 要发送的邮件主题
            email.setSubject(subject);
            // 要发送的信息，由于使用了HtmlEmail，可以在邮件内容中使用HTML标签
            email.setMsg(message);
            // 发送
            email.send();
            if (logger.isDebugEnabled()) {
                logger.debug(sender + " 发送邮件到 " + receiver);
            }
            return true;
        } catch (EmailException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return false;
        }

    }

}
