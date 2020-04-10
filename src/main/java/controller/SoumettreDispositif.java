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
	Models models;
	@Inject
	BindingResult formValidationErrors;

	@GET
	public void montreLeFormulaire() {
		final List<Categorie> touteslesCategories = categorieDAO.findAll();
		Categorie categorieChoisie = touteslesCategories.get(0);

		models.put("categories", touteslesCategories);
		models.put("selected", categorieChoisie);
	}

	@POST
	@ValidateOnExecution(type = ExecutableType.ALL)
	public void edit(@Valid @BeanParam DispositifForm formData, @FormParam("id") Integer codeCategorie) {

		final List<Categorie> touteslesCategories = categorieDAO.findAll();
		Categorie categorieChoisie;
		if (codeCategorie != null) {
			categorieChoisie = categorieDAO.find(codeCategorie);
		} else {
			categorieChoisie = touteslesCategories.get(0);
		}

		Collection<Categorie> categories = new ArrayList();
		categories.add(categorieChoisie);
		Dispositif d = new Dispositif();
		d.setId(formData.getId());
		d.setNom(formData.getNom());
		d.setDescription(formData.getDescription());
		d.setUrlPhoto(formData.getUrlPhoto());
		d.setCategorieCollection(categories);
		dispositifDAO.create(d);

		models.put("dispositif", d);
		models.put("categories", touteslesCategories);
		models.put("selected", categorieChoisie);
	}
}
