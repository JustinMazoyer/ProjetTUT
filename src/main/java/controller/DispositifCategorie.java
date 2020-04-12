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
    @Inject
    DispositifFacade dispositif;
    @Inject // Les infos du joueur, Session scoped
    private RechercheInfo resultat;

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

    @POST
    public String voir(@FormParam("dispositif") String nomdispositif, @FormParam("nom") String nom, @QueryParam("id") Integer codeCategorie) {

        Dispositif d = dispositif.ReferenceDispositif(nomdispositif);
        if (d != null) {

            resultat.login(d.getId());
            
        
        final List<Categorie> touteslesCategories = facade.findAll();

        // On cherche la catégorie à partir de son code passé en paramètre
        Categorie categorieChoisie;
        if (codeCategorie != null) // Est-ce qu'on a un paramètre ?
        // On va chercher la catégorie 
        {
            categorieChoisie = facade.find(codeCategorie); // Et si on ne trouve pas ?
        } else // On prend la première de la liste (encore faut-il qu'il y en ait une !)
        {
            categorieChoisie = touteslesCategories.get(0);
        }
        models.put("categories", touteslesCategories);
        models.put("selected", categorieChoisie);
        return "redirect:/ResultatRecherche";
        }
        return null;

    }
}
