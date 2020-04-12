/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.dao;

import Classe.entity.Dispositif;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Justin
 */
@Stateless
public class DispositifFacade extends AbstractFacade<Dispositif> {

    @PersistenceContext(unitName = "automesure")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DispositifFacade() {
        super(Dispositif.class);
    }
    	public Dispositif ReferenceDispositif(String nomdispositif){
            List<Dispositif> liste = em.createNamedQuery("Dispositif.findByNom").setParameter("nom", nomdispositif).getResultList();
            if(!liste.isEmpty())
                return (Dispositif) liste.get(0);
            return null;
}
}
