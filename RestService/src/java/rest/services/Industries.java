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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author neal
 */
@Entity
@Table(name = "industries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Industries.findAll", query = "SELECT i FROM Industries i"),
    @NamedQuery(name = "Industries.findBySectorNumber", query = "SELECT i FROM Industries i WHERE i.sectorNumber = :sectorNumber"),
    @NamedQuery(name = "Industries.findByIndustry", query = "SELECT i FROM Industries i WHERE i.industry = :industry"),
    @NamedQuery(name = "Industries.findByDayPriceChange", query = "SELECT i FROM Industries i WHERE i.dayPriceChange = :dayPriceChange"),
    @NamedQuery(name = "Industries.findByMarketCap", query = "SELECT i FROM Industries i WHERE i.marketCap = :marketCap"),
    @NamedQuery(name = "Industries.findByPriceToEarningsRatio", query = "SELECT i FROM Industries i WHERE i.priceToEarningsRatio = :priceToEarningsRatio"),
    @NamedQuery(name = "Industries.findByRoePercent", query = "SELECT i FROM Industries i WHERE i.roePercent = :roePercent"),
    @NamedQuery(name = "Industries.findByDivYieldPercent", query = "SELECT i FROM Industries i WHERE i.divYieldPercent = :divYieldPercent"),
    @NamedQuery(name = "Industries.findByDebtToEquity", query = "SELECT i FROM Industries i WHERE i.debtToEquity = :debtToEquity"),
    @NamedQuery(name = "Industries.findByPriceToBook", query = "SELECT i FROM Industries i WHERE i.priceToBook = :priceToBook"),
    @NamedQuery(name = "Industries.findByNetProfitMargin", query = "SELECT i FROM Industries i WHERE i.netProfitMargin = :netProfitMargin"),
    @NamedQuery(name = "Industries.findByPriceToFreeCashFlow", query = "SELECT i FROM Industries i WHERE i.priceToFreeCashFlow = :priceToFreeCashFlow"),
    @NamedQuery(name = "Industries.findByCurrDate", query = "SELECT i FROM Industries i WHERE i.currDate = :currDate"),
    @NamedQuery(name = "Industries.findById", query = "SELECT i FROM Industries i WHERE i.id = :id")})
public class Industries implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "sector_number")
    private Integer sectorNumber;
    @Column(name = "industry")
    private Integer industry;
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

    public Industries() {
    }

    public Industries(Integer id) {
        this.id = id;
    }

    public Integer getSectorNumber() {
        return sectorNumber;
    }

    public void setSectorNumber(Integer sectorNumber) {
        this.sectorNumber = sectorNumber;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
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
        if (!(object instanceof Industries)) {
            return false;
        }
        Industries other = (Industries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.services.Industries[ id=" + id + " ]";
    }
    
}
