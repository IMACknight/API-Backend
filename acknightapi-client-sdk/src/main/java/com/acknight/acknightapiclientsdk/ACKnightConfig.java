package com.acknight.acknightapiclientsdk;

import com.acknight.acknightapiclientsdk.client.ACKnightClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Data
@ComponentScan
@Configuration
@ConfigurationProperties("acknight.client")
public class ACKnightConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ACKnightClient acKnightClient() {
        return new ACKnightClient(accessKey, secretKey);
    }
}
