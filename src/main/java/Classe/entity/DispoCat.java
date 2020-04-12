package Classe.entity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Nicolas
 */
@SessionScoped
@Named("DsipoCat")
public class DispoCat implements Serializable {
    private List<LigneDispoCat> lignesDsipoCat;

    public DispoCat(){
        super();
        this.lignesDsipoCat = new LinkedList<LigneDispoCat>();
    }
    public void addLigne(LigneDispoCat ligne) {
        lignesDsipoCat.add(ligne);
    }

    @Override
    public String toString() {
        String res ="";
        for(LigneDispoCat l : lignesDsipoCat){
            res += "Dispositif :" + l.getDispositif().getNom();
        }
        return res;
    }

    public List<LigneDispoCat> getLignesDispoCat() {
        return lignesDsipoCat;
    }

    public void setLignesDispoCat(List<LigneDispoCat> lignesDsipoCat) {
        this.lignesDsipoCat = lignesDsipoCat;
    }
    
}
