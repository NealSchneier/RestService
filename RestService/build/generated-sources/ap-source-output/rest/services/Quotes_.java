package rest.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-01T22:25:27")
@StaticMetamodel(Quotes.class)
public class Quotes_ { 

    public static volatile SingularAttribute<Quotes, BigInteger> volume;
    public static volatile SingularAttribute<Quotes, Integer> companyId;
    public static volatile SingularAttribute<Quotes, BigDecimal> high;
    public static volatile SingularAttribute<Quotes, BigDecimal> low;
    public static volatile SingularAttribute<Quotes, BigDecimal> adj;
    public static volatile SingularAttribute<Quotes, Integer> id;
    public static volatile SingularAttribute<Quotes, Date> currDate;
    public static volatile SingularAttribute<Quotes, BigDecimal> close;
    public static volatile SingularAttribute<Quotes, Date> quoteDate;
    public static volatile SingularAttribute<Quotes, BigDecimal> open;

}