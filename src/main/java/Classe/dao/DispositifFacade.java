/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe.dao;

import Classe.entity.Dispositif;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Justin
 */
@Stateless
public class DispositifFacade extends AbstractFacade<Dispositif> {

    @PersistenceContext(unitName = "test")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DispositifFacade() {
        super(Dispositif.class);
    }
    
}
