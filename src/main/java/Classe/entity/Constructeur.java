/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Justin
 */
@Entity
@Table(name = "CONSTRUCTEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Constructeur.findAll", query = "SELECT c FROM Constructeur c")
    , @NamedQuery(name = "Constructeur.findById", query = "SELECT c FROM Constructeur c WHERE c.id = :id")
    , @NamedQuery(name = "Constructeur.findByNom", query = "SELECT c FROM Constructeur c WHERE c.nom = :nom")})
public class Constructeur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "NOM")
    private String nom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCree")
    private Collection<Modele> modeleCollection;

    public Constructeur() {
    }

    public Constructeur(Integer id) {
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
    public Collection<Modele> getModeleCollection() {
        return modeleCollection;
    }

    public void setModeleCollection(Collection<Modele> modeleCollection) {
        this.modeleCollection = modeleCollection;
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
        if (!(object instanceof Constructeur)) {
            return false;
        }
        Constructeur other = (Constructeur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.Constructeur[ id=" + id + " ]";
    }
    
}
