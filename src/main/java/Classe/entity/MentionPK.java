/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Justin
 */
@Embeddable
public class MentionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE")
    private int code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_1")
    private int id1;

    public MentionPK() {
    }

    public MentionPK(int id, int code, int id1) {
        this.id = id;
        this.code = code;
        this.id1 = id1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) code;
        hash += (int) id1;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MentionPK)) {
            return false;
        }
        MentionPK other = (MentionPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.code != other.code) {
            return false;
        }
        if (this.id1 != other.id1) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classe.entity.MentionPK[ id=" + id + ", code=" + code + ", id1=" + id1 + " ]";
    }
    
}
