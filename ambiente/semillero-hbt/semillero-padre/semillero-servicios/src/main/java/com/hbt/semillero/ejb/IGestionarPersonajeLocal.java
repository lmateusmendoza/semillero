package com.hbt.semillero.ejb;
import javax.ejb.Local;
import java.util.List;

import com.hbt.semillero.dto.PersonajeDTO;
@Local
public interface IGestionarPersonajeLocal {
	/**
	 * 
	 * Metodo encargado de crear un personaje
	 * @author lmateus
	 */
	public void crearPersonaje(PersonajeDTO personajeDTO);

	/**
	 * 
	 * Metodo encargado de realizar la actualizaciion de la informacion del personaje
	 * 
	 * @author lmateus
	 */
	public void actualizarPersonaje();

	/**
	 * 
	 * Metodo encargado de eliminar un personaje
	 * 
	 * @author lmateus
	 */
	public void eliminarPersonaje();
	/**
	 * 
	 * Metodo encargado de consultar la informacion de un personaje en especifico
	 * 
	 * @author lmateus
	 */
	public void consultarPersonaje();

	/**
	 * 
	 * Metodo encargado consultar la lista de personajes
	 * @author lmateus
	 */
	public void consultarPersonajes();
}
