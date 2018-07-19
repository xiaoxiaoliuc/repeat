package com.liuc.repeat;

import com.liuc.repeat.annotation.CacheKeyGenerator;
import com.liuc.repeat.annotation.LockKeyGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RepeatApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepeatApplication.class, args);
    }
    @Bean
    public CacheKeyGenerator cacheKeyGenerator() {
        return new LockKeyGenerator();
    }
}
