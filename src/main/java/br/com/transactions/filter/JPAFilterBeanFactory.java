package br.com.transactions.filter;

public class JPAFilterBeanFactory {

  public JPAFilter getInstance() {
    return new JPADefaultFilter();
  }

}
