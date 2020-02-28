/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.io.Serializable;
import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

/**
 *
 * @author Justin
 */
public class DispositifForm implements Serializable {

    private static final long serialVersionUID = -3523783484400524581L;
    @MvcBinding
    @FormParam("id")
    //@NotEmpty
    @Size(min = 1, max = 128)
    private Integer id;

    @MvcBinding
    @FormParam("nom")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String nom;

    @MvcBinding
    @FormParam("description")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String description;
    
    
    @MvcBinding
    @FormParam("urlphoto")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String urlPhoto;
    
       @MvcBinding
    @FormParam("valide")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String valide;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getValide() {
        return valide;
    }

    public void setValide(String valide) {
        this.valide = valide;
    }
       
       
}
