package com.atsistemas.cloud.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atsistemas.cloud.interfaz.UsuarioRepository;


@Controller
public class UsuarioController {
	
	@Autowired
	public UsuarioRepository repositorio;
	
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	@RequestMapping("/ListaUsuarios")
	public String accountList(Model model) {
		model.addAttribute("usuarios", repositorio.getUsuarios());
		return "ListaUsuarios";
	}
	
	@RequestMapping("/DetalleUsuario")
	public String accountDetails(@RequestParam("id") String id, Model model) {
		model.addAttribute("usuario", repositorio.getUsuario(id));
		return "DetalleUsuario";
	}

}


