package br.com.transactions.filter;

public abstract class AbstractSpecification {

  private JPAFilterBeanFactory filterFactory;

  public AbstractSpecification(JPAFilterBeanFactory filterFactory) {
    this.filterFactory = filterFactory;
  }

  protected JPAFilter getNewFilterInstance() {
    return filterFactory.getInstance();
  }

}
