
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

/**
 * @description La clase MostrarInformacionComponent muestra el nombre y la ciudad del autor concatenados
 * @authorLuz Marina Mateus Mendoza <lmateusmendoza@gmail.com>
 */
@Component({
    selector: 'mostrar-informacion',
    templateUrl: './mostrar-informacion-component.html' , 
})

export class MostrarInformacionComponent implements OnInit {
    /*
     * @description Variable que contiene los datos del programador
    */ 
    public datos : string;
     
     /*
     * @description Constructor de la clase MostrarInformacionComponent 
     * @author Luz Marina Mateus Mendoza <lmateusmendoza@gmail.com>
    */  
    constructor() {
       this.datos = "Luz Marina Mateus Mendoza - Monteria";      
    }

    ngOnInit(): void {
        console.log('Hola');      
    }
}