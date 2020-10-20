package com.movevoip.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movevoip.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() { //Método List<Categoria>
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2,"Escritório");
		
		//List é uma INTERFACE por isso não pode ser instanciada.
		//Usa-se ArrayList classe que vai fazer a implementação da INTERFACE.
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1); //Add categoria 1
		lista.add(cat2); //Add categoria 2
					
		
		return lista; // O método retorna lista de categorias
	}
}
