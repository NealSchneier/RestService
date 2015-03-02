package rest.services;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-01T22:25:27")
@StaticMetamodel(Companies.class)
public class Companies_ { 

    public static volatile SingularAttribute<Companies, BigDecimal> marketCap;
    public static volatile SingularAttribute<Companies, BigDecimal> debtToEquity;
    public static volatile SingularAttribute<Companies, BigDecimal> netProfitMargin;
    public static volatile SingularAttribute<Companies, Integer> companyId;
    public static volatile SingularAttribute<Companies, BigDecimal> roePercent;
    public static volatile SingularAttribute<Companies, BigDecimal> priceToFreeCashFlow;
    public static volatile SingularAttribute<Companies, BigDecimal> divYieldPercent;
    public static volatile SingularAttribute<Companies, Integer> id;
    public static volatile SingularAttribute<Companies, Date> currDate;
    public static volatile SingularAttribute<Companies, BigDecimal> priceToEarningsRatio;
    public static volatile SingularAttribute<Companies, BigDecimal> priceToBook;
    public static volatile SingularAttribute<Companies, BigDecimal> dayPriceChange;

}