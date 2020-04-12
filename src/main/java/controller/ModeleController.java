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
	ModeleFacade facadeM;
    
       // @Inject
        //Modele modele;
        
	 @GET
    public void modele(@QueryParam("id") Integer idModele) {

        final List<Modele> touslesModeles = facadeM.findAll();
        Modele modeleChoisi;
        if (idModele != null) {
            modeleChoisi = facadeM.find(idModele);
        } else {
            modeleChoisi = touslesModeles.get(0);
        }

        models.put("modeles", touslesModeles);
        models.put("selected", modeleChoisi);

    }
}
