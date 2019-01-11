package com.ls.shares.Producer;

import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/89:27
 **/

@RestController
public class sendMsg {

    @Autowired
    private DefaultMQProducer defaultMQProducer;

    @GetMapping("/sendMessage")
    public void sendMsg(){

        for (int i = 0; i < 100; i++) {
            //RegisteredUser user = new RegisteredUser();
            String number = "139";
            Random random = new Random();
            for (int j = 0; j < 8; j++) {
                number += random.nextInt(9);
            }
  //          user.setNickname("jhp"+i);
//            user.setPassword(String.valueOf(i));
  //          user.setPhone(number);

 //           String jsonString = JSON.toJSONString(user);

 //           Message msg = new Message("user-topic","white",jsonString.getBytes());

            try {
//                SendResult result = defaultMQProducer.send(msg);
 //               System.out.println("消息id："+result.getMsgId()+"\t"+"发送状态："+result.getSendStatus());
            }catch (Exception e){
                e.printStackTrace();
            }




        }
    }
}
