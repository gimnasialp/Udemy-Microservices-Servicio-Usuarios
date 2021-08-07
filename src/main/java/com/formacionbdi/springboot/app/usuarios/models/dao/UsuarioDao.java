package com.formacionbdi.springboot.app.usuarios.models.dao;

import com.formacionbdi.springboot.app.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuarioDao extends PagingAndSortingRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

    //@Query(value="select username from Usuario  where username=?1" ,nativeQuery = true)
    @Query(value="select u from Usuario u where u.username=?1" ,nativeQuery = true)
    public Usuario obtenerPorUsername(String username);


}