package com.salesianostriana.dam.ejemploformulario01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.ejemploformulario01.model.Empleado;

@Controller
public class EmpleadoController {

	/*
	 * Para los formularios necesitamos siempre dos métodos
	 * controladores (dos para cada Formulario
	 * 
	 * Uno para VER (peticion tipo Get) los campos/datos del formulario, es decir,
	 * para pintar el formulario al comienzo del proceso antes de hacer nada
	 * si es de alta, por ejemplo, estará vacio, como en este caso
	 * 
	 *  Otro para GESTIONAR (peticion tipo Post) los
	 *  datos que se recojan del formulario.
	 *  Necesitamos que sea post, porque vamos a "mandar"
	 *  datos en la peticion, los recogidos de los campos del formulario.
	 *  
	 */
	
	/*
	 * Este primer método solo muestra el formulario y es 
	 * igual a los que ya hemos usado en otras ocasiones:
	 * 
	 * Un Model al que añadimos una instancia nuestra 
	 * calse model tipo Empleado
	 * sin nigun valor, por eso el objeto está vacío, peticion tipo Get
	 * 
	 * Atendera a peticiones con la ruta empleado
	 */
	@GetMapping("/empleado")
	public String showForm(Model model) {
		//El empleado se instancia vacio porque e el que se usa 
		//para pintar el formulario que estamos creando sin datos
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		//Devolvemos el nombre del html que pinta el formulario
		return "form";
	}
	
	/*POST: anotada con el PostMapping y se encarga de recoger los atributos puesto en el 
	 * formulario y mandarlos.
	 * 
	 * Añadimos la anotacion @ModelAttribute como parametro del metodo para decirle
	 * de qué formulario debe coger los datos y montar un objeto (el mismo nombre se escribe
	 * en el th:object del form de la plantilla de html y "crear" un empleado
	 */
	
	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm")Empleado empleado, Model model) {
		//Se añade al modelo, el empleado que se creará al recoger los datos del formulario
		model.addAttribute("empleado", empleado);
		
		//En este ejemplo sencillo, se muestra la pagina con la informacion mandada
		//el formulario al pulsar el boton submit, no se guarda en la base de datos,
		//solo mostramos lo que se escribe en el formulario en otra pagina web.
		return "view";
	}
}
