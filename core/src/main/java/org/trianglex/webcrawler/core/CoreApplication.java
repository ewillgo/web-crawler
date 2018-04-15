package org.trianglex.webcrawler.core;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Import;
import org.trianglex.webcrawler.common.config.CommonConfig;

@SpringCloudApplication
@Import(CommonConfig.class)
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }
}
