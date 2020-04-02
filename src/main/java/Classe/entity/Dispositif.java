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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Justin
 */
@Entity
@Table(name = "DISPOSITIF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dispositif.findAll", query = "SELECT d FROM Dispositif d")
    , @NamedQuery(name = "Dispositif.findById", query = "SELECT d FROM Dispositif d WHERE d.id = :id")
    , @NamedQuery(name = "Dispositif.findByNom", query = "SELECT d FROM Dispositif d WHERE d.nom = :nom")
    , @NamedQuery(name = "Dispositif.findByDescription", query = "SELECT d FROM Dispositif d WHERE d.description = :description")
    , @NamedQuery(name = "Dispositif.findByUrlPhoto", query = "SELECT d FROM Dispositif d WHERE d.urlPhoto = :urlPhoto")
    , @NamedQuery(name = "Dispositif.findByValide", query = "SELECT d FROM Dispositif d WHERE d.valide = :valide")})
public class Dispositif implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    @Min(1)
    private Integer id;
    @Id
    @Size(max = 128)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 255)
    @Column(name = "URL_PHOTO")
    private String urlPhoto;
    @Column(name = "VALIDE")
    private Boolean valide;
    @JoinTable(name = "CONCERNE", joinColumns = {
        @JoinColumn(name = "ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_1", referencedColumnName = "ID")})
    @ManyToMany
    private Collection<Pathologie> pathologieCollection;
    @ManyToMany(mappedBy = "dispositifCollection")
    private Collection<Categorie> categorieCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPossede")
    private Collection<Modele> modeleCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dispositif")
    private Collection<Mention> mentionCollection;

    public Dispositif() {
    }

    public Dispositif(Integer id) {
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

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Boolean getValide() {
        return valide;
    }

    public void setValide(Boolean valide) {
        this.valide = valide;
    }

    @XmlTransient
    public Collection<Pathologie> getPathologieCollection() {
        return pathologieCollection;
    }

    public void setPathologieCollection(Collection<Pathologie> pathologieCollection) {
        this.pathologieCollection = pathologieCollection;
    }

    @XmlTransient
    public Collection<Categorie> getCategorieCollection() {
        return categorieCollection;
    }

    public void setCategorieCollection(Collection<Categorie> categorieCollection) {
        this.categorieCollection = categorieCollection;
    }

    @XmlTransient
    public Collection<Modele> getModeleCollection() {
        return modeleCollection;
    }

    public void setModeleCollection(Collection<Modele> modeleCollection) {
        this.modeleCollection = modeleCollection;
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
        if (!(object instanceof Dispositif)) {
            return false;
        }
        Dispositif other = (Dispositif) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.Dispositif[ id=" + id + " ]";
    }
    
}
