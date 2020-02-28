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
import javax.mvc.Models;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;

/**
 *
 * @author Justin
 */
public class SoumettreDispositif {
    @Inject
    DispositifFacade facadeP;
    @Inject
    Models models;
    @Inject
    BindingResult formValidationErrors;

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public void create(@Valid @BeanParam DispositifForm formData) {
        if (!formValidationErrors.isFailed()) { 
            Dispositif nouvelle = new Dispositif();
            nouvelle.setId(formData.getId());
            nouvelle.setDescription(formData.getDescription());


        }
        models.put("validationErrors", formValidationErrors);
        models.put("dispositif", facadeP.findAll());
    }
}
