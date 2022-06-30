/**
 * 
 */
package com.jr.sistemas.data.common;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Jreye
 * Clase que proporciona los métodos genericos para el CRUD
 * E - Significa la entidad a utilizar en el CRUD
 * R - Significa el repositorio a utilizar de JPA para  ejecutar el CRUD
 */
public class CommonDAO<E, R extends PagingAndSortingRepository<E, Long>> {
	
	@Autowired
	protected R repository;
	
	/**
	 * Método que permite consultar una lista de datos paginable de una entidad.
	 * @param desde {@link Integer} indica a partir de que valor  se obtendrán los resultados.  
	 * @param hasta {@link Integer} indica el límite de resultados paginados a obtener.
	 * @param orderBy {@link String} indica a partir de que campo se ordenaran los registros.
	 * @return {@link List} lista con los dattos consultados paginados.
	 */
	public List<E> consultarListaPaginable(int desde, int hasta,String orderBy) {
		Pageable pageable = PageRequest.of(desde, hasta,Sort.by(orderBy));
		Page<E> page = this.repository.findAll(pageable);
		return page.getContent();
	}
	
	/**
	 * Método que permite persistir la información de cualquier entidad.
	 * @param e {@link Object} objeto o entidad a persistir 
	 * @return {@link Object} objeto recuperado después de persistir el registro.
	 */
	public E guardar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * Método que permite actualizar la información de cualquier entidad.
	 * @param e {@link Object} objeto o entidad a actualizar  
	 * @return {@link Object} objeto recuperado después de actualizar en registro.
	 */
	public E actualizar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * Método que permite eliminar la información de cualquier entidad
	 * @param e {@link Object} objeto o entidad a peristir
	 * @return {@link Oject} objeto recuperado después de persistir el registro.
	 */
	public void eliminar(E e) {
		 this.repository.delete(e);
	}
}

















