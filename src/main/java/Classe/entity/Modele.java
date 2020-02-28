/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Justin
 */
@Entity
@Table(name = "MODELE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modele.findAll", query = "SELECT m FROM Modele m")
    , @NamedQuery(name = "Modele.findById", query = "SELECT m FROM Modele m WHERE m.id = :id")
    , @NamedQuery(name = "Modele.findByNom", query = "SELECT m FROM Modele m WHERE m.nom = :nom")
    , @NamedQuery(name = "Modele.findByDescription", query = "SELECT m FROM Modele m WHERE m.description = :description")})
public class Modele implements Serializable {

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
    @JoinColumn(name = "ID_CREE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Constructeur idCree;
    @JoinColumn(name = "ID_POSSEDE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Dispositif idPossede;

    public Modele() {
    }

    public Modele(Integer id) {
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

    public Constructeur getIdCree() {
        return idCree;
    }

    public void setIdCree(Constructeur idCree) {
        this.idCree = idCree;
    }

    public Dispositif getIdPossede() {
        return idPossede;
    }

    public void setIdPossede(Dispositif idPossede) {
        this.idPossede = idPossede;
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
        if (!(object instanceof Modele)) {
            return false;
        }
        Modele other = (Modele) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.Modele[ id=" + id + " ]";
    }
    
}
