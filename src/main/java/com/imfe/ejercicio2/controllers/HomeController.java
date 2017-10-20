package com.imfe.ejercicio2.controllers;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imfe.ejercicio2.clases.Planeta;

@Controller
public class HomeController {
	
	@RequestMapping(value="/listados")
	//Obtengo la variable 'numero' enviada desde el formulario y la recojo en la variable 'numeroPlanetas', name y defaultvalue no es obligatorio solo si quieres poner un numero por defecto
	public String listados(Model model ,@RequestParam(name="numero",defaultValue="1") Integer numeroPlanetas) { 
		
			String msg="Mensaje desde el controlador"; //Mensaje
			
			ArrayList <Planeta> listaPlanetas=new ArrayList <Planeta>(); //Creamos el array listaPlanetas
			
			//Creamos 10 objetos y lo metemos en el array
			for(int i=0; i<numeroPlanetas; i++) { 
				
			Planeta planeta=new Planeta (); //Creamos el objeto planeta
			
			listaPlanetas.add(planeta); //Añadimos el objeto al array
			
			}
			
			model.addAttribute("mensaje",msg); //Enviamos al index.html el mensaje
			model.addAttribute("galaxia",listaPlanetas); // Enviamos al index.html el array creado con el nombre de galaxia
			
			return "listados";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
