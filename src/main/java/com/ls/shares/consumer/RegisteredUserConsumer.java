package com.ls.shares.consumer;

import com.ls.shares.common.base.MessageEvent;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/718:18
 *
 * 监听消息进行消费
 **/
@Component
public class RegisteredUserConsumer {

    @EventListener(condition = "#event.msgs[0].topic=='user-topic' && #event.msgs[0].tags=='white'")
    public void rocketmqMsgListener(MessageEvent event){
        List<MessageExt> msgs = event.getMsgs();
        for (MessageExt msg:msgs
             ) {
            System.out.println("消费消息："+new String(msg.getBody()));
        }
        
    }
}
