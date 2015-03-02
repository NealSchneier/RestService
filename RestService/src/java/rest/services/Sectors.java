/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.services;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author neal
 */
@Entity
@Table(name = "sectors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sectors.findAll", query = "SELECT s FROM Sectors s"),
    @NamedQuery(name = "Sectors.findBySector", query = "SELECT s FROM Sectors s WHERE s.sector = :sector"),
    @NamedQuery(name = "Sectors.findByDayPriceChange", query = "SELECT s FROM Sectors s WHERE s.dayPriceChange = :dayPriceChange"),
    @NamedQuery(name = "Sectors.findByMarketCap", query = "SELECT s FROM Sectors s WHERE s.marketCap = :marketCap"),
    @NamedQuery(name = "Sectors.findByPriceToEarningsRatio", query = "SELECT s FROM Sectors s WHERE s.priceToEarningsRatio = :priceToEarningsRatio"),
    @NamedQuery(name = "Sectors.findByRoePercent", query = "SELECT s FROM Sectors s WHERE s.roePercent = :roePercent"),
    @NamedQuery(name = "Sectors.findByDivYieldPercent", query = "SELECT s FROM Sectors s WHERE s.divYieldPercent = :divYieldPercent"),
    @NamedQuery(name = "Sectors.findByDebtToEquity", query = "SELECT s FROM Sectors s WHERE s.debtToEquity = :debtToEquity"),
    @NamedQuery(name = "Sectors.findByPriceToBook", query = "SELECT s FROM Sectors s WHERE s.priceToBook = :priceToBook"),
    @NamedQuery(name = "Sectors.findByNetProfitMargin", query = "SELECT s FROM Sectors s WHERE s.netProfitMargin = :netProfitMargin"),
    @NamedQuery(name = "Sectors.findByPriceToFreeCashFlow", query = "SELECT s FROM Sectors s WHERE s.priceToFreeCashFlow = :priceToFreeCashFlow"),
    @NamedQuery(name = "Sectors.findByCurrDate", query = "SELECT s FROM Sectors s WHERE s.currDate = :currDate"),
    @NamedQuery(name = "Sectors.findById", query = "SELECT s FROM Sectors s WHERE s.id = :id")})
public class Sectors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "sector")
    private String sector;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "day_price_change")
    private BigDecimal dayPriceChange;
    @Column(name = "market_cap")
    private BigDecimal marketCap;
    @Column(name = "price_to_earnings_ratio")
    private BigDecimal priceToEarningsRatio;
    @Column(name = "roe_percent")
    private BigDecimal roePercent;
    @Column(name = "div_yield_percent")
    private BigDecimal divYieldPercent;
    @Column(name = "debt_to_equity")
    private BigDecimal debtToEquity;
    @Column(name = "price_to_book")
    private BigDecimal priceToBook;
    @Column(name = "net_profit_margin")
    private BigDecimal netProfitMargin;
    @Column(name = "price_to_free_cash_flow")
    private BigDecimal priceToFreeCashFlow;
    @Column(name = "curr_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Sectors() {
    }

    public Sectors(Integer id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public BigDecimal getDayPriceChange() {
        return dayPriceChange;
    }

    public void setDayPriceChange(BigDecimal dayPriceChange) {
        this.dayPriceChange = dayPriceChange;
    }

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    public BigDecimal getPriceToEarningsRatio() {
        return priceToEarningsRatio;
    }

    public void setPriceToEarningsRatio(BigDecimal priceToEarningsRatio) {
        this.priceToEarningsRatio = priceToEarningsRatio;
    }

    public BigDecimal getRoePercent() {
        return roePercent;
    }

    public void setRoePercent(BigDecimal roePercent) {
        this.roePercent = roePercent;
    }

    public BigDecimal getDivYieldPercent() {
        return divYieldPercent;
    }

    public void setDivYieldPercent(BigDecimal divYieldPercent) {
        this.divYieldPercent = divYieldPercent;
    }

    public BigDecimal getDebtToEquity() {
        return debtToEquity;
    }

    public void setDebtToEquity(BigDecimal debtToEquity) {
        this.debtToEquity = debtToEquity;
    }

    public BigDecimal getPriceToBook() {
        return priceToBook;
    }

    public void setPriceToBook(BigDecimal priceToBook) {
        this.priceToBook = priceToBook;
    }

    public BigDecimal getNetProfitMargin() {
        return netProfitMargin;
    }

    public void setNetProfitMargin(BigDecimal netProfitMargin) {
        this.netProfitMargin = netProfitMargin;
    }

    public BigDecimal getPriceToFreeCashFlow() {
        return priceToFreeCashFlow;
    }

    public void setPriceToFreeCashFlow(BigDecimal priceToFreeCashFlow) {
        this.priceToFreeCashFlow = priceToFreeCashFlow;
    }

    public Date getCurrDate() {
        return currDate;
    }

    public void setCurrDate(Date currDate) {
        this.currDate = currDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sectors)) {
            return false;
        }
        Sectors other = (Sectors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.services.Sectors[ id=" + id + " ]";
    }
    
}
