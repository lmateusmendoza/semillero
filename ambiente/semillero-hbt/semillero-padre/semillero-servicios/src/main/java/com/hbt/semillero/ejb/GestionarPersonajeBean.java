package com.hbt.semillero.ejb;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;

@Stateless
public class GestionarPersonajeBean implements IGestionarPersonajeLocal {
	
	@PersistenceContext
	private static final Logger Logger = org.apache.log4j.Logger.getLogger(GestionarPersonajeBean.class);
	//private static final Logger Logger = Logger.getLogger(GestionarPersonajeBean.class);
	private EntityManager entityManager;
	
	@Override
	/**
	 * 
	 * Metodo encargado de realizar la actualizacion de la informacion del personaje
	 * 
	 * @author lmateus
	 */
	public void crearPersonaje(PersonajeDTO personajeDTO) {
		Logger.debug("Inicia metodo crearPersonaje");
		Personaje personaje = convertirDTOEntidad(personajeDTO);
		entityManager.persist(personaje);
		Logger.debug("Finaliza metodo crearPersonaje");
	}
	
	/**
	 * 
	 * Metodo encargado de realizar la actualizacion de la informacion del personaje
	 * 
	 * @author lmateus
	 */
	
	@Override
	public void actualizarPersonaje() {
		Logger.debug("Inicia metodo actualizarPersonaje");
		Logger.debug("Finaliza metodo actualizarPersonaje");
	}

	/**
	 * 
	 * Metodo encargado de eliminar un personaje
	 * 
	 * @author lmateus
	 */
	
	@Override
	public void eliminarPersonaje(){
		Logger.debug("Inicia metodo eliminarPersonaje");
		Logger.debug("Finaliza metodo eliminarPersonaje");
	}

	/**
	 * 
	 * Metodo encargado de consultar la informacion de un personaje en especifico
	 * 
	 * @author lmateus
	 */
	
	@Override
	public void consultarPersonaje(){
		Logger.debug("Inicia metodo consultarPersonaje");
		Logger.debug("Finaliza metodo consultarPersonaje");
	}

	/**
	 * 
	 * Metodo encargado consultar la lista de personajes
	 * @author lmateus
	 */
	@Override
	public listaPersonajeDTO consultarPersonajes(){
		Logger.debug("Inicia metodo consultarPersonajes");
		String query = "select personaje from Personaje personaje";
		List<Personaje> listaPersonajes = entityManager.createQuery(query).getResultList();
		List<PersonajeDTO> listaPersonajeDTO = new ArrayList<>();
		Logger.debug("Finaliza metodo consultarPersonajes");
		for (Personaje personaje:listaPersonajes) {
			listaPersonajeDTO.add(convertirEntidadDTO(personaje));
		}
		return listaPersonajeDTO;
	}
	
	/*
	 * Convierte un DTO en entidad
	 * */
	private Personaje convertirDTOEntidad(PersonajeDTO personajeDTO) {
		Personaje personaje = new Personaje();
		personaje.setId(personajeDTO.getId());
		personaje.setNombre(personajeDTO.getNombre());
		personaje.setComic(new Comic());
		personaje.getComic().setId(personajeDTO.getIdComic());
		personaje.setEstado(personajeDTO.getEstado());
		personaje.setSuperPoder(personajeDTO.getSuperPoder());
		return personaje;
	}
	
	/*
	 * Convierte un entidad en DTO
	 * */
	private PersonajeDTO convertirEntidadDTO(Personaje personaje) {
		PersonajeDTO personajeDTO = new PersonajeDTO();
		personajeDTO.setId(personaje.getId());
		personajeDTO.setNombre(personaje.getNombre());
		personajeDTO.setIdComic(personaje.getComic().getId());
		personajeDTO.setEstado(personajeDTO.getEstado());
		personajeDTO.setSuperPoder(personajeDTO.getSuperPoder());
		return personajeDTO;
	}
}
