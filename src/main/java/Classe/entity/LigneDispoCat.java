package Classe.entity;

/**
 *
 * @author Nicolas
 */
public class LigneDispoCat {
     private Dispositif dispositif;
    private String nom;

    public LigneDispoCat(Dispositif dispositif, String nom) {
        this.dispositif = dispositif;
        this.nom = nom;
    }

    public Dispositif getDispositif() {
        return dispositif;
    }

    public String getNom() {
        return nom;
    }

    public void setDispositif(Dispositif dispositif) {
        this.dispositif = dispositif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
