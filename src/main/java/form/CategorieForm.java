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
 * @author Nicolas
 */
public class CategorieForm implements Serializable{
    private static final long serialVersionUID = -3523783484400524581L;
    
    @MvcBinding
    @FormParam("id")
    //@NotEmpty
    @Min(1)
    private Integer id;
    
    @MvcBinding
    @FormParam("nom")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String nom;
    
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
