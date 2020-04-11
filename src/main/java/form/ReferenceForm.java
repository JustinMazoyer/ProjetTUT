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
public class ReferenceForm implements Serializable {

    private static final long serialVersionUID = -3523783484400524581L;
    @MvcBinding
    @FormParam("id")
    //@NotEmpty
    @Min(1)
    private Integer id;

    @MvcBinding
    @FormParam("lienRef")
    //@NotEmpty
    @Size(min = 1, max = 255)
    private String lien;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }
    
}
