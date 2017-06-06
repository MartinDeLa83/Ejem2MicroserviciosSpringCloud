package com.atsistemas.cloud.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atsistemas.cloud.entidad.Usuario;

public interface UsuarioMongoRepository extends MongoRepository<Usuario, Long> {
    Usuario findByNombre(String nombre);
    Usuario findById(String id);
}
