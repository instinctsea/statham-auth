package com.hms.auth.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource(value = {
        ///"classpath:dubbo-provider.xml"
})
@ComponentScan(basePackages = {"com.hms.auth"})
public class HmsAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(HmsAuthApplication.class, args);
        try {
            //DataSize dataSize;
        }catch (Throwable e){
            e.printStackTrace();
        }

       // log.info("teamApplication start completed");
    }
}
