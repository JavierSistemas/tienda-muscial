/**
 * 
 */
package com.jr.sistemas.services.service;

import com.jr.sistemas.entities.Persona;

/**
 * @author Jreye
 * Interface que realiza la lógia ce negocio para el inicio de sesión de la persona
 *
 */
public interface LoginService {
	/**
	 * Método que permite consultar un usuario que trata de ingresar a sesion en la tienda músical.
	 * @param usuario {@link String} usuario capturado por la persona.
	 * @param password {@link String} constraseña capturada por la persona.
	 * @return {@link Persona} usuario encontrado en la base de datos.
	 */
	Persona consultarUsuarioLogin(String usuario, String password);
}
