/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Classe.dao.DispositifFacade;
import Classe.entity.Dispositif;
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
@Path("Dispositif")
//@View("Dispositif.jsp")
public class DispositifController {
    @Inject
	Models models;
	
    @Inject
	DispositifFacade facadeD;
    
        @Inject
        Dispositif dispositif;
        
	@GET
	@View("Dispositif.jsp")
	public void show() {
		models.put("dispositifs", facadeD.findAll());
	}
}
