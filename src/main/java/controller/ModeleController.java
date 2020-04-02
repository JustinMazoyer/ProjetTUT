/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;



import Classe.dao.DispositifFacade;
import Classe.dao.ModeleFacade;
import Classe.entity.Dispositif;
import Classe.entity.Modele;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Nicolas
 */
@Controller
@Path("Modele")
@View("Modele.jsp")
public class ModeleController {
    @Inject
	Models models;
	
    @Inject
	DispositifFacade facadeD;
    
       // @Inject
        //Modele modele;
        
	 @GET
    public void dispositif(@QueryParam("nom") String idDispositif) {

        final List<Dispositif> touslesDispositifs = facadeD.findAll();
        Dispositif dispositifChoisi;
        if (idDispositif != null) {
            dispositifChoisi = facadeD.find(idDispositif);
        } else {
            dispositifChoisi = touslesDispositifs.get(0);
        }

        models.put("dispositifs", touslesDispositifs);
        models.put("selected", dispositifChoisi);

    }
}
