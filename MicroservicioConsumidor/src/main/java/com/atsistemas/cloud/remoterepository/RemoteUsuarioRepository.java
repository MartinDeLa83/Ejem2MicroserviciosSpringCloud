package com.atsistemas.cloud.remoterepository;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.atsistemas.cloud.entidad.Usuario;
import com.atsistemas.cloud.interfaz.UsuarioRepository;

@Repository
public class RemoteUsuarioRepository implements UsuarioRepository{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired 
	private DiscoveryClient client;
	
	private static final String  nombre_microservicio_a_consumir= "MICROSERVICIO_PRODUCTOR";
	
	@Override
	public List<Usuario> getUsuarios() {
		//Solamente tenemos una instancia levantada
		URI uri = client.getInstances(nombre_microservicio_a_consumir).get(0).getUri();		
		Usuario [] usuarios= restTemplate.getForObject(uri+"/usuario", Usuario[].class);
		return Arrays.asList(usuarios);
	}

	@Override
	public Usuario getUsuario(String id) {
		URI uri = client.getInstances(nombre_microservicio_a_consumir).get(0).getUri();		
		Usuario usuario= restTemplate.getForObject(uri+"/usuario/"+id, Usuario.class);
		return usuario;
	}
}
