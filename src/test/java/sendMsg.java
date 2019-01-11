import com.alibaba.fastjson.JSON;
import com.ls.shares.Application;
import com.ls.shares.system.entity.RegisteredUser;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/718:31
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class sendMsg {

    @Autowired
    private DefaultMQProducer defaultMQProducer;

    @Test
    public void sendMsg() {

        for (int i = 0; i < 100; i++) {
            RegisteredUser user = new RegisteredUser();
            String number = "139";
            Random random = new Random();
            for (int j = 0; j < 8; j++) {
                number += random.nextInt(9);
            }
            user.setNickname("我是mybatis"+i);  //昵称
            user.setPhone(number);  //手机号
            user.setPassword("000000");  //密码
            String json = JSON.toJSONString(user);
            Message msg = new Message("user-topic", "white", json.getBytes());
            try {
                SendResult result = defaultMQProducer.send(msg);
                System.out.println("消息id:" + result.getMsgId() + ":" + "," + "发送状态:" + result.getSendStatus());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
