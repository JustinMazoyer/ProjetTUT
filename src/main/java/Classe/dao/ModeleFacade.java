/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.dao;

import Classe.entity.Modele;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Justin
 */
@Stateless
public class ModeleFacade extends AbstractFacade<Modele> {

    @PersistenceContext(unitName = "automesure")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ModeleFacade() {
        super(Modele.class);
    }
        	public Modele ReferenceModele(String nomModele){
            List<Modele> liste = em.createNamedQuery("Modele.findByNom").setParameter("nom", nomModele).getResultList();
            if(!liste.isEmpty())
                return (Modele) liste.get(0);
            return null;
}
}
