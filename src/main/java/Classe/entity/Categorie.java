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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
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
@Table(name = "CATEGORIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c")
    , @NamedQuery(name = "Categorie.findById", query = "SELECT c FROM Categorie c WHERE c.id = :id")
    , @NamedQuery(name = "Categorie.findByNom", query = "SELECT c FROM Categorie c WHERE c.nom = :nom")})
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 32)
    @Column(name = "NOM")
    private String nom;
    @JoinTable(name = "APPARTIENT", joinColumns = {
        @JoinColumn(name = "ID_1", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "ID", referencedColumnName = "ID")})
    @ManyToMany
    private Collection<Dispositif> dispositifCollection;

    public Categorie() {
    }

    public Categorie(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.Categorie[ id=" + id + " ]";
    }
    
}
