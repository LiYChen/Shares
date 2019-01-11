package com.ls.shares.common.base;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/715:07
 *
 * 监听对象
 **/

public class MessageEvent extends ApplicationEvent{

    private static final long serialVersionUID = -5256314990885720618L;

    private DefaultMQPushConsumer consumer;

    private List<MessageExt> msgs;

    public MessageEvent(List<MessageExt> msgs, DefaultMQPushConsumer consumer) {
        super(msgs);
        this.consumer = consumer;
        this.setMsgs(msgs);

    }

    public DefaultMQPushConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(DefaultMQPushConsumer consumer) {
        this.consumer = consumer;
    }

    public List<MessageExt> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<MessageExt> msgs) {
        this.msgs = msgs;
    }
}
