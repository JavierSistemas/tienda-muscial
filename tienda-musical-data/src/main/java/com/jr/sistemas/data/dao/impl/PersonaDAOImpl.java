/**
 * 
 */
package com.jr.sistemas.data.dao.impl;

import com.jr.sistemas.data.common.CommonDAO;
import com.jr.sistemas.data.dao.PersonaDAO;
import com.jr.sistemas.entities.Persona;

/**
 * @author Jreye
 * Clase que implementa el CRUD genérico y las funciones de la interface de PersonaDAO
 */
public class PersonaDAOImpl extends CommonDAO<Persona, PersonaDAO> 
{
	/**
	 * Método que permite consultar una persona por su usuario y contraseña.
	 * @param usuario {@link String} usuario capturado por la persona.
	 * @param password {@link String} contraseña capturado por la persona.
	 * @return {@link Persona} persona encontrada.
	 */
	public Persona findUsuarioAndPassword(String usuario, String password) {
		return this.repository.findByUsuarioAndPassword(usuario, password);
	}
}
