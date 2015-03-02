package rest.services;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-01T22:25:27")
@StaticMetamodel(Sectors.class)
public class Sectors_ { 

    public static volatile SingularAttribute<Sectors, BigDecimal> marketCap;
    public static volatile SingularAttribute<Sectors, BigDecimal> debtToEquity;
    public static volatile SingularAttribute<Sectors, BigDecimal> netProfitMargin;
    public static volatile SingularAttribute<Sectors, BigDecimal> roePercent;
    public static volatile SingularAttribute<Sectors, BigDecimal> priceToFreeCashFlow;
    public static volatile SingularAttribute<Sectors, BigDecimal> divYieldPercent;
    public static volatile SingularAttribute<Sectors, Integer> id;
    public static volatile SingularAttribute<Sectors, Date> currDate;
    public static volatile SingularAttribute<Sectors, BigDecimal> priceToEarningsRatio;
    public static volatile SingularAttribute<Sectors, String> sector;
    public static volatile SingularAttribute<Sectors, BigDecimal> priceToBook;
    public static volatile SingularAttribute<Sectors, BigDecimal> dayPriceChange;

}