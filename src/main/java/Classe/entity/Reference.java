/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Justin
 */
@Entity
@Table(name = "REFERENCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reference.findAll", query = "SELECT r FROM Reference r")
    , @NamedQuery(name = "Reference.findById", query = "SELECT r FROM Reference r WHERE r.id = :id")
    , @NamedQuery(name = "Reference.findByLien", query = "SELECT r FROM Reference r WHERE r.lien = :lien")})
public class Reference implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "LIEN")
    private String lien;
    @ManyToMany(mappedBy = "referenceCollection")
    private Collection<Dispositif> dispositifCollection;

    public Reference() {
    }

    public Reference(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    @XmlTransient
    public Collection<Dispositif> getDispositifCollection() {
        return dispositifCollection;
    }

    public void setDispositifCollection(Collection<Dispositif> dispositifCollection) {
        this.dispositifCollection = dispositifCollection;
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
        if (!(object instanceof Reference)) {
            return false;
        }
        Reference other = (Reference) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.Reference[ id=" + id + " ]";
    }
    
}
