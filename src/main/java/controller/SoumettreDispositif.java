/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Classe.dao.CategorieFacade;
import Classe.dao.DispositifFacade;
import Classe.entity.Categorie;
import Classe.entity.Dispositif;
import form.DispositifForm;
import java.util.List;
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
import javax.ws.rs.QueryParam;

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
    @Inject
    CategorieFacade facade;

    @GET
    public void produitsParCategorie(@QueryParam("id") Integer codeCategorie) {
        final List<Categorie> touteslesCategories = facade.findAll();

        Categorie categorieChoisie;
        if (codeCategorie != null) 
        {
            categorieChoisie = facade.find(codeCategorie);
        } else 
        {
            categorieChoisie = touteslesCategories.get(0);
        }

        models.put("categories", touteslesCategories);
        models.put("selected", categorieChoisie);
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public void edit(@Valid @BeanParam DispositifForm formData,@QueryParam("id") Integer codeCategorie) {
        final List<Categorie> touteslesCategories = facade.findAll();
        Categorie categorieChoisie;
        if (codeCategorie != null) 
        {
            categorieChoisie = facade.find(codeCategorie);
        } else 
        {
            categorieChoisie = touteslesCategories.get(0);
        }
        Dispositif c = new Dispositif();
        c.setId(formData.getId());
        c.setNom(formData.getNom());
        c.setDescription(formData.getDescription());
        c.setUrlPhoto(formData.getUrlPhoto());
        facadeP.create(c);
        models.put("dispositif", c);
        models.put("categories", touteslesCategories);
        models.put("selected", categorieChoisie);
    }

}
