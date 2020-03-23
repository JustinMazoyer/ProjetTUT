/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Classe.dao.CategorieFacade;
import Classe.entity.Categorie;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

/**
 *
 * @author Nicolas
 */
@Controller
@Path("DispositifCategorie")
@View("DispositifCategorie.jsp")
public class DispositifCategorie {

    @Inject
    CategorieFacade facade;

    @Inject
    Models models;

    @GET
    public void dispositifParCategorie(@QueryParam("id") Integer idCategorie) {

        final List<Categorie> touteslesCategories = facade.findAll();
        Categorie categorieChoisie;
        if (idCategorie != null) {
            categorieChoisie = facade.find(idCategorie);
        } else {
            categorieChoisie = touteslesCategories.get(0);
        }

        models.put("categories", touteslesCategories);
        models.put("selected", categorieChoisie);

    }
    
}
