/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Nicolas
 */
import java.util.HashMap;
import java.util.Map;
import javax.mvc.security.Csrf;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Default JAX-RS application listening on /mvc
 */
@ApplicationPath("/mvc")
public class App extends Application {
    @Override
	public Map<String, Object> getProperties() {
		Map<String, Object> props = new HashMap<>();
		props.put(Csrf.CSRF_PROTECTION, Csrf.CsrfOptions.OFF);
		org.eclipse.persistence.jaxb.BeanValidationHelper x;
		return props;
	}
}
