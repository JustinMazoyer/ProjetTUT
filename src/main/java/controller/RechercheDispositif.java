/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Classe.dao.DispositifFacade;
import Classe.dao.ModeleFacade;
import Classe.dao.PathologieFacade;
import Classe.entity.Dispositif;
import form.DispositifForm;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author Nicolas
 */
@Controller
@Path("Recherche")
@View("Recherche.jsp")
public class RechercheDispositif {

    @Inject
    DispositifFacade dispositif;
    @Inject
    ModeleFacade modele;
    @Inject
    PathologieFacade pathologie;
    @Inject
    Models models;

    @GET
    public void show() {
        models.put("dispositif", dispositif.findAll());
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public String login(@Valid @BeanParam DispositifForm formData) {
        try {
            Dispositif nomdispositif = dispositif.find(formData.getNom());
            if(nomdispositif.getId().equals(null)){
                models.put("databaseErrorMessage", "Ce dispositif n'existe pas");
            }else{
            return "redirect:/Dispositif";
            }
        } catch (Exception e) {
            models.put("databaseErrorMessage", "Ce dispositif n'existe pas");
        }
        return null;  
    }
}
