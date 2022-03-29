package com.desafiolatam.daos;

import java.util.ArrayList;

import com.desafiolatam.models.Usuario;

public interface UsuarioDAO {
	//DAO Data Access Object
	//CRUD Create-Read-Update-Delete
	public int crearUsuario(Usuario usuario);//Create
	public Usuario obtenerUsuario(Integer id);//Read
	public int actualizarUsuario(Usuario usuario);//Update
	public int eliminarUsuario(Integer id);//Delete
	
	public ArrayList<Usuario> obtenerListaUsuarios();//select * from
	public Usuario obtenerUsuarioEmail(String email);
}
