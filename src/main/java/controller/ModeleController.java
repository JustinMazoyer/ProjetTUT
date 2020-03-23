/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;



import Classe.dao.ModeleFacade;
import Classe.entity.Modele;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Nicolas
 */
@Controller
@Path("Modele")
public class ModeleController {
    @Inject
	Models models;
	
    @Inject
	ModeleFacade facadeM;
    
        @Inject
        Modele modele;
        
	@GET
	@View("Modele.jsp")
	public void show() {
		models.put("modeles", facadeM.findAll());
	}
}
