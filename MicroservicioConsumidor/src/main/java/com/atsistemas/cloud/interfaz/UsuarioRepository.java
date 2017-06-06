package com.atsistemas.cloud.interfaz;

import java.util.List;

import com.atsistemas.cloud.entidad.Usuario;

public interface UsuarioRepository {
	
	List<Usuario> getUsuarios();	
	Usuario getUsuario(String id);
}
