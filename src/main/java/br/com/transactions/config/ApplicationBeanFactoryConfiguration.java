package br.com.transactions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.transactions.filter.JPAFilterBeanFactory;

@Configuration
public class ApplicationBeanFactoryConfiguration {

  @Bean
  public JPAFilterBeanFactory jpaFilterBeanFactory() {
    return new JPAFilterBeanFactory();
  }

}
