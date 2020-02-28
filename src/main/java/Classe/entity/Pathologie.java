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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Justin
 */
@Entity
@Table(name = "PATHOLOGIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pathologie.findAll", query = "SELECT p FROM Pathologie p")
    , @NamedQuery(name = "Pathologie.findById", query = "SELECT p FROM Pathologie p WHERE p.id = :id")
    , @NamedQuery(name = "Pathologie.findByNom", query = "SELECT p FROM Pathologie p WHERE p.nom = :nom")
    , @NamedQuery(name = "Pathologie.findByDescription", query = "SELECT p FROM Pathologie p WHERE p.description = :description")})
public class Pathologie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 32)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToMany(mappedBy = "pathologieCollection")
    private Collection<Dispositif> dispositifCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pathologie")
    private Collection<Mention> mentionCollection;

    public Pathologie() {
    }

    public Pathologie(Integer id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Dispositif> getDispositifCollection() {
        return dispositifCollection;
    }

    public void setDispositifCollection(Collection<Dispositif> dispositifCollection) {
        this.dispositifCollection = dispositifCollection;
    }

    @XmlTransient
    public Collection<Mention> getMentionCollection() {
        return mentionCollection;
    }

    public void setMentionCollection(Collection<Mention> mentionCollection) {
        this.mentionCollection = mentionCollection;
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
        if (!(object instanceof Pathologie)) {
            return false;
        }
        Pathologie other = (Pathologie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.Pathologie[ id=" + id + " ]";
    }
    
}
