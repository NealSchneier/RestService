/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.services;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author neal
 */
@Entity
@Table(name = "companyToSector")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyToSector.findAll", query = "SELECT c FROM CompanyToSector c"),
    @NamedQuery(name = "CompanyToSector.findById", query = "SELECT c FROM CompanyToSector c WHERE c.id = :id"),
    @NamedQuery(name = "CompanyToSector.findByIndustryId", query = "SELECT c FROM CompanyToSector c WHERE c.industryId = :industryId"),
    @NamedQuery(name = "CompanyToSector.findByCompanyId", query = "SELECT c FROM CompanyToSector c WHERE c.companyId = :companyId")})
public class CompanyToSector implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "industry_id")
    private int industryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "company_id")
    private int companyId;

    public CompanyToSector() {
    }

    public CompanyToSector(Integer id) {
        this.id = id;
    }

    public CompanyToSector(Integer id, int industryId, int companyId) {
        this.id = id;
        this.industryId = industryId;
        this.companyId = companyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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
        if (!(object instanceof CompanyToSector)) {
            return false;
        }
        CompanyToSector other = (CompanyToSector) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.services.CompanyToSector[ id=" + id + " ]";
    }
    
}
