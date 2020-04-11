/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.io.Serializable;
import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

/**
 *
 * @author Justin
 */
public class ModeleForm implements Serializable {

    private static final long serialVersionUID = -3523783484400524581L;
    @MvcBinding
    @FormParam("id")
    //@NotEmpty
    @Min(1)
    private Integer id;

    @MvcBinding
    @FormParam("nomM")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String nom;
     
    @MvcBinding
    @FormParam("descriptionM")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    
}
