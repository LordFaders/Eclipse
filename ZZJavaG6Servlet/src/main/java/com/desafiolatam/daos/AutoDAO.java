package com.desafiolatam.daos;

import java.util.ArrayList;

import com.desafiolatam.models.Auto;

public interface AutoDAO {

	//CRUD Create-Read-Update-Delete
		public int crearAuto(Auto auto);//Create
		public Auto obtenerAuto(Integer id);//Read
		public int actualizarAuto(Auto auto);//Update
		public int eliminarAuto(Integer id);//Delete
		
		public ArrayList<Auto> obtenerListaAutos();//select * from
}
