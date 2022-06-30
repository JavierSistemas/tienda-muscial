/**
 * 
 */
package com.jr.sistemas.services.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jr.sistemas.data.dao.PersonaDAO;
import com.jr.sistemas.entities.Persona;
import com.jr.sistemas.services.service.LoginService;

/**
 * @author Jreye
 * Clase que implenta las funciones para la lógica de negocio para la pantalla de login
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private PersonaDAO personaDaoImpl;
	
	@Override
	public Persona consultarUsuarioLogin(String usuario, String password) {
		return this.personaDaoImpl.findByUsuarioAndPassword(usuario, password);
	}

}
