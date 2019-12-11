
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { informacionPersonaje } from '../../dto/informacion-personaje.dto';

/**
 * @description La clase MostrarInformacionComponent muestra el nombre y la ciudad del autor concatenados
 * @authorLuz Marina Mateus Mendoza <lmateusmendoza@gmail.com>
 */
@Component({
    selector: 'mostrar-informacion',
    templateUrl: './mostrar-informacion-component.html',
})

export class MostrarInformacionComponent implements OnInit {
    /*
     * @description Variable que contiene los datos del programador
    */

    //Se crea interfaz para el tipo de dato con la estructura definida
    public personajes: Array<informacionPersonaje>;
    public datos: string;

    /**
   * Se guarda el  personaje eliminado de la tabla
   */
   public personajeEliminado: informacionPersonaje;
   
   private mostrarMensaje: bool;

    /*
    * @description Constructor de la clase MostrarInformacionComponent 
    * @author Luz Marina Mateus Mendoza <lmateusmendoza@gmail.com>
   */
    constructor() {
        this.datos = "Luz Marina Mateus Mendoza - Monteria";
    }

    ngOnInit(): void {
        this.personajes = new Array<informacionPersonaje>();
        //Se asignan los valores del reg 1        
        this.personajes.push({
            id: 1,
            nombre: "batman",
            editorial: "marvel",
            tematica: "accion",
            numeroPaginas: 50,
            precio: 60500.99,
            autores: "Pedrito barrera",
            aColor: true,
            fechaVenta: new Date(),
            estado: "Activo"
        });
        //Se asignan los valores del reg 2
        this.personajes.push({
            id: 2,
            nombre: "robin",
            editorial: "marvel",
            tematica: "accion",
            numeroPaginas: 50,
            precio: 61500.99,
            autores: "Juan barrera",
            aColor: true,
            fechaVenta: new Date(),
            estado: "Activo"
        });
        //Se asignan los valores del reg 3
        this.personajes.push({
            id: 3,
            nombre: "superman",
            editorial: "marvel",
            tematica: "accion",
            numeroPaginas: 70,
            precio: 63500.99,
            autores: "Hernan barrera",
            aColor: true,
            fechaVenta: new Date(),
            estado: "Activo"
        });
        //Se asignan los valores del reg 4
        this.personajes.push({
            id: 4,
            nombre: "gemelos",
            editorial: "marvel",
            tematica: "accion",
            numeroPaginas: 80,
            precio: 64500.99,
            autores: "Julian barrera",
            aColor: true,
            fechaVenta: new Date(),
            estado: "Activo"
        });
        //Se asignan los valores del reg 5
        this.personajes.push({
            id: 5,
            nombre: "gemelos",
            editorial: "marvel",
            tematica: "accion",
            numeroPaginas: 70,
            precio: 65500.99,
            autores: "German barrera",
            aColor: true,
            fechaVenta: new Date(),
            estado: "Activo"
        });
        // Ctrl+Alt+F Formatear Archivo  
    }

    /**
   * Metodo que elimina el personaje seleccionado
   * @param item id del personaje que sera eliminado
   */
  private eliminarPersonaje(item: informacionPersonaje): void {
    this.personajeEliminado = item;
    //Se busca el id del personaje seleccionado
    let indice: number = this.personajes.findIndex(x => x === item);
    // Se elimina el libro seleccionado
    this.personajes.splice(indice, 1);
    // Mostrar el mensaje que se ha eliminado el libro
    this.mostrarMensaje = true;
    
  }
}