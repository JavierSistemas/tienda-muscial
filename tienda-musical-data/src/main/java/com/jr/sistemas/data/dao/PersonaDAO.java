/**
 * 
 */
package com.jr.sistemas.data.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.jr.sistemas.entities.Persona;

/**
 * @author Jreye
 * Interface DAO que realiza el CRUD con SpringJPA para la tabla persona
 */
public interface PersonaDAO  extends PagingAndSortingRepository<Persona, Long>
{
	/**
	 * Método que permite consultar el usuario que trata de ingresar a sesión.
	 * @param usuario  {@link String}  usuario capturado por la persona
	 * @param password {@link String} contraseña capturada por la persona.
	 * @return {@link Persona}  objeto con la persona encotrada
	 */
	@Query("SELECT p FROM Persona p WHERE p.usuario = ?1 AND p.password = ?2")
	Persona findByUsuarioAndPassword(String usuario, String password);
	
//	@Query("SELECT p FROM Persona p WHERE p.usuario = :usuario AND p.password = :password")
//	Persona findByUserAndPassword( @Param("usuario") String usuario ,@Param("password")  String password);
}
