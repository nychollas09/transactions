package br.com.transactions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.transactions.filter.JPAFilterBeanFactory;
import br.com.transactions.filter.SummarySaleSpecification;

@Configuration
public class SpecificationBeanConfiguration {

  @Bean
  public SummarySaleSpecification summarySaleSpecification(JPAFilterBeanFactory filterFactory) {
    return new SummarySaleSpecification(filterFactory);
  }

}
