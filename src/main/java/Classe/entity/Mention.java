/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Justin
 */
@Entity
@Table(name = "MENTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mention.findAll", query = "SELECT m FROM Mention m")
    , @NamedQuery(name = "Mention.findById", query = "SELECT m FROM Mention m WHERE m.mentionPK.id = :id")
    , @NamedQuery(name = "Mention.findByCode", query = "SELECT m FROM Mention m WHERE m.mentionPK.code = :code")
    , @NamedQuery(name = "Mention.findById1", query = "SELECT m FROM Mention m WHERE m.mentionPK.id1 = :id1")})
public class Mention implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MentionPK mentionPK;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Dispositif dispositif;
    @JoinColumn(name = "ID_1", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pathologie pathologie;
    @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Reference reference;

    public Mention() {
    }

    public Mention(MentionPK mentionPK) {
        this.mentionPK = mentionPK;
    }

    public Mention(int id, int code, int id1) {
        this.mentionPK = new MentionPK(id, code, id1);
    }

    public MentionPK getMentionPK() {
        return mentionPK;
    }

    public void setMentionPK(MentionPK mentionPK) {
        this.mentionPK = mentionPK;
    }

    public Dispositif getDispositif() {
        return dispositif;
    }

    public void setDispositif(Dispositif dispositif) {
        this.dispositif = dispositif;
    }

    public Pathologie getPathologie() {
        return pathologie;
    }

    public void setPathologie(Pathologie pathologie) {
        this.pathologie = pathologie;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mentionPK != null ? mentionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mention)) {
            return false;
        }
        Mention other = (Mention) object;
        if ((this.mentionPK == null && other.mentionPK != null) || (this.mentionPK != null && !this.mentionPK.equals(other.mentionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.Mention[ mentionPK=" + mentionPK + " ]";
    }
    
}
