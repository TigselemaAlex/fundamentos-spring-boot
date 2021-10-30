package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanOperation() {
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation() {
        return new MyOperationImplement();
    }

    @Bean
    public MyOperationReto beanOperationOperationReto() {
        return new MyOperationRetoImplement();
    }

    @Bean
    public MyBeanWithDependecy beanOperationOperationWithDependecy(MyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }

    @Bean
    public MyBeanWithDependencyReto beanOperationWithDependecyReto(MyOperationReto myOperationReto) {
        return new MyBeanWithDependecyRetoImplement(myOperationReto);
    }
}
