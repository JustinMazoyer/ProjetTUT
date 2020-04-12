/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Classe.dao.CategorieFacade;
import Classe.dao.DispositifFacade;
import Classe.dao.ModeleFacade;
import Classe.dao.PathologieFacade;
import Classe.dao.ReferenceFacade;
import Classe.entity.Categorie;
import Classe.entity.Dispositif;
import Classe.entity.Modele;
import Classe.entity.Pathologie;
import Classe.entity.Reference;
import form.DispositifForm;
import form.ModeleForm;
import form.ReferenceForm;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;
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
import javax.ws.rs.FormParam;
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
    DispositifFacade dispositifDAO;
    @Inject
    CategorieFacade categorieDAO;
    @Inject
    PathologieFacade pathologieDAO;
    @Inject
    ReferenceFacade referenceDAO;
    @Inject
    ModeleFacade modeleDAO;
    @Inject
    Models models;

    @GET
    public void montreLeFormulaire() {
        final List<Categorie> touteslesCategories = categorieDAO.findAll();
        Categorie categorieChoisie = touteslesCategories.get(0);
        final List<Pathologie> touteslesPathologie = pathologieDAO.findAll();
        Pathologie pathologieChoisie = touteslesPathologie.get(0);

        models.put("categories", touteslesCategories);
        models.put("selected", categorieChoisie);
        models.put("pathologies", touteslesPathologie);
        models.put("select", pathologieChoisie);
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public String edit(@Valid @BeanParam DispositifForm formData, @FormParam("id") Integer codeCategorie, @FormParam("id1") Integer codePathologie, @BeanParam ModeleForm form, @BeanParam ReferenceForm data) {

        final List<Categorie> touteslesCategories = categorieDAO.findAll();
        Categorie categorieChoisie;
        if (codeCategorie != null) {
            categorieChoisie = categorieDAO.find(codeCategorie);
        } else {
            categorieChoisie = touteslesCategories.get(0);
        }

        final List<Pathologie> touteslesPathologie = pathologieDAO.findAll();
        Pathologie pathologieChoisie;
        if (codePathologie != null) {
            pathologieChoisie = pathologieDAO.find(codePathologie);
        } else {
            pathologieChoisie = touteslesPathologie.get(0);
        }
        Modele mode = modeleDAO.ReferenceModele(form.getNom());
        if (mode == null) {
            Collection<Reference> references = new ArrayList();
            Collection<Categorie> categories = new ArrayList();
            Collection<Pathologie> pathologies = new ArrayList();
            Collection<Modele> modeles = new ArrayList();
            pathologies.add(pathologieChoisie);
            categories.add(categorieChoisie);

            Dispositif dispo = dispositifDAO.ReferenceDispositif(formData.getNom());
            if (dispo == null) {
                Dispositif d = new Dispositif();
                Reference r = new Reference();
                Modele m = new Modele();

                r.setLien(data.getLien());
                references.add(r);

                m.setNom(form.getNom());
                m.setDescription(form.getDescription());
                m.setIdPossede(d);
                modeles.add(m);

                d.setNom(formData.getNom());
                d.setDescription(formData.getDescription());
                d.setUrlPhoto(formData.getUrlPhoto());
                d.setCategorieCollection(categories);
                d.setPathologieCollection(pathologies);
                d.setModeleCollection(modeles);
                d.setReferenceCollection(references);

                referenceDAO.create(r);
                dispositifDAO.create(d);
                models.put("dispositif", d);
                models.put("categories", touteslesCategories);
                models.put("selected", categorieChoisie);
                models.put("pathologies", touteslesPathologie);
                models.put("select", pathologieChoisie);
                return "redirect:../index.html";
            } else {
                Reference r = new Reference();
                Modele m = new Modele();

                r.setLien(data.getLien());
                references.add(r);

                m.setNom(form.getNom());
                m.setDescription(form.getDescription());
                m.setIdPossede(dispo);
                modeles.add(m);

                dispo.setCategorieCollection(categories);
                dispo.setPathologieCollection(pathologies);
                dispo.setModeleCollection(modeles);
                dispo.setReferenceCollection(references);

                referenceDAO.create(r);
                dispositifDAO.edit(dispo);
                models.put("dispositif", dispo);
                models.put("categories", touteslesCategories);
                models.put("selected", categorieChoisie);
                models.put("pathologies", touteslesPathologie);
                models.put("select", pathologieChoisie);
                return "redirect:../index.html";
            }
        } else {
            models.put("databaseErrorMessage", "Ce modele existe déja");
            models.put("categories", touteslesCategories);
            models.put("selected", categorieChoisie);
            models.put("pathologies", touteslesPathologie);
            models.put("select", pathologieChoisie);
        }
        return null;
    }
}
