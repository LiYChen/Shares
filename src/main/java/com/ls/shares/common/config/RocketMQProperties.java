package com.ls.shares.common.config;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import java.util.ArrayList;
import java.util.List;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/715:25
 **/


@PropertySource("classpath:config/RegisteredRocketmq.yml")
@ConfigurationProperties(prefix = "config.rocketmq")
@Configuration
@Data
@Accessors(chain = true)
public class RocketMQProperties {

    @Value("${namesrvAddr}")
    private String namesrvAddr;
    @Value("${producerGroupName}")
    private String producerGroupName;
    @Value("${transactionProducerGroupName}")
    private String transactionProducerGroupName;
    @Value("${consumerGroupName}")
    private String consumerGroupName;
    @Value("${producerInstanceName}")
    private String producerInstanceName;
   @Value("${consumerInstanceName}")
    private String consumerInstanceName;
    @Value("${producerTranInstanceName}")
    private String producerTranInstanceName;
    @Value("${consumerBatchMaxSize}")
    private int consumerBatchMaxSize;
    @Value("${consumerBroadcasting}")
    private boolean consumerBroadcasting;
    @Value("${enableHistoryConsumer}")
    private boolean enableHistoryConsumer;
    @Value("${enableOrderConsumer}")
    private boolean enableOrderConsumer;
    @Value("${subscribe[0]}")
    private List<String> subscribe = new ArrayList<String>();
}
