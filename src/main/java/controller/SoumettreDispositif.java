/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Classe.dao.DispositifFacade;
import Classe.entity.Dispositif;
import form.DispositifForm;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Justin
 */
@Controller
@Path("SoumettreDispositif")
@View("SoumettreDispositif.jsp")
public class SoumettreDispositif {
    @Inject
    DispositifFacade facadeP;
    @Inject
    Models models;
    @Inject
    BindingResult formValidationErrors;

    
	@GET
	public void show() {
		models.put("dispositif", facadeP.findAll());
	}
        
        @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public void edit(@Valid @BeanParam DispositifForm formData) {
        Dispositif c =new Dispositif();
        c.setId(formData.getId());
        c.setNom(formData.getNom());
        c.setDescription(formData.getDescription());
        c.setUrlPhoto(formData.getUrlPhoto());
        facadeP.create(c);
        models.put("dispositif", c);
    }

}
