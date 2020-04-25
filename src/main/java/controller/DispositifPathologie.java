/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Justin
 */
import Classe.dao.DispositifFacade;
import Classe.dao.PathologieFacade;
import Classe.entity.Dispositif;
import Classe.entity.Pathologie;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Controller
@Path("DispositifPathologie")
@View("DispositifPathologie.jsp")
public class DispositifPathologie {

    @Inject
    PathologieFacade facade;
    @Inject
    Models models;
    @Inject
    DispositifFacade dispositif;
    @Inject // Les infos du joueur, Session scoped
    private RechercheInfo resultat;

    @GET
    public void dispositifParPathologie(@QueryParam("id") Integer idPathologie) {

        final List<Pathologie> touteslesPathologie = facade.findAll();
        Pathologie pathologieChoisie;
        if (idPathologie != null) {
            pathologieChoisie = facade.find(idPathologie);
        } else {
            pathologieChoisie = touteslesPathologie.get(0);
        }

        models.put("pathologies", touteslesPathologie);
        models.put("selected", pathologieChoisie);

    }

    @POST
    public String voir(@FormParam("dispositif") String nomdispositif,@QueryParam("id") Integer codePathologie) {

        Dispositif d = dispositif.ReferenceDispositif(nomdispositif);
        if (d != null) {

            resultat.login(d.getId());

            final List<Pathologie> touteslesPathologie = facade.findAll();
            Pathologie pathologieChoisie;
            if (codePathologie != null) {
                pathologieChoisie = facade.find(codePathologie);
            } else {
                pathologieChoisie = touteslesPathologie.get(0);
            }
            models.put("pathologies", touteslesPathologie);
            models.put("selected", pathologieChoisie);
            return "redirect:/ResultatRecherche";
        }
        return null;

    }
}
