/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.services;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "quotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quotes.findAll", query = "SELECT q FROM Quotes q"),
    @NamedQuery(name = "Quotes.findByCompanyId", query = "SELECT q FROM Quotes q WHERE q.companyId = :companyId"),
    @NamedQuery(name = "Quotes.findByQuoteDate", query = "SELECT q FROM Quotes q WHERE q.quoteDate = :quoteDate"),
    @NamedQuery(name = "Quotes.findByOpen", query = "SELECT q FROM Quotes q WHERE q.open = :open"),
    @NamedQuery(name = "Quotes.findByHigh", query = "SELECT q FROM Quotes q WHERE q.high = :high"),
    @NamedQuery(name = "Quotes.findByLow", query = "SELECT q FROM Quotes q WHERE q.low = :low"),
    @NamedQuery(name = "Quotes.findByClose", query = "SELECT q FROM Quotes q WHERE q.close = :close"),
    @NamedQuery(name = "Quotes.findByVolume", query = "SELECT q FROM Quotes q WHERE q.volume = :volume"),
    @NamedQuery(name = "Quotes.findByAdj", query = "SELECT q FROM Quotes q WHERE q.adj = :adj"),
    @NamedQuery(name = "Quotes.findByCurrDate", query = "SELECT q FROM Quotes q WHERE q.currDate = :currDate"),
    @NamedQuery(name = "Quotes.findById", query = "SELECT q FROM Quotes q WHERE q.id = :id")})
public class Quotes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "quote_date")
    @Temporal(TemporalType.DATE)
    private Date quoteDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "open")
    private BigDecimal open;
    @Column(name = "high")
    private BigDecimal high;
    @Column(name = "low")
    private BigDecimal low;
    @Column(name = "close")
    private BigDecimal close;
    @Column(name = "volume")
    private BigInteger volume;
    @Column(name = "adj")
    private BigDecimal adj;
    @Column(name = "curr_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Quotes() {
    }

    public Quotes(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(Date quoteDate) {
        this.quoteDate = quoteDate;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigInteger getVolume() {
        return volume;
    }

    public void setVolume(BigInteger volume) {
        this.volume = volume;
    }

    public BigDecimal getAdj() {
        return adj;
    }

    public void setAdj(BigDecimal adj) {
        this.adj = adj;
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
        if (!(object instanceof Quotes)) {
            return false;
        }
        Quotes other = (Quotes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.services.Quotes[ id=" + id + " ]";
    }
    
}
