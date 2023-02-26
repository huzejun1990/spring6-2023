package com.dream.spring6.validator.three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @Author : huzejun
 * @Date: 2023/2/27-0:28
 */

@Configuration
@ComponentScan("com.dream.spring6.validator.three")
public class ValidationConfig {

    @Bean
    public MethodValidationPostProcessor validationPostProcessor() {
        return  new MethodValidationPostProcessor();
    }
}
