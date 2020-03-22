package br.com.transactions.filter;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import br.com.transactions.domain.model.SummarySale;

public class SummarySaleSpecification extends AbstractSpecification {
  public SummarySaleSpecification(JPAFilterBeanFactory filterFactory) {
    super(filterFactory);
  }

  public Specification<SummarySale> byNumberOfInstallments(Long number) {

    return new Specification<SummarySale>() {

      private static final long serialVersionUID = -3661697551730516837L;

      @Override
      public Predicate toPredicate(Root<SummarySale> root, CriteriaQuery<?> query,
          CriteriaBuilder criteriaBuilder) {

        JPAFilter filter = getNewFilterInstance();

        filter.addPredicate((b, e) -> b.equal(e.get("numberOfInstallments"), number));

        return filter.getPredicate(criteriaBuilder, root);
      }
    };

  }

}
