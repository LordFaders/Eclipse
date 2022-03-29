package com.desafiolatam.facade;

import java.sql.SQLException;
import java.util.List;

import com.desafiolatam.daos.CursoDao;
import com.desafiolatam.daos.FormaDePagoDAO;
import com.desafiolatam.daos.InscripcionDAO;
import com.desafiolatam.entidades.CursoDTO;
import com.desafiolatam.entidades.FormaDePagoDTO;
import com.desafiolatam.entidades.InscripcionDTO;
import com.desafiolatam.entidades.InscripcionDTO2;

public class Facade {
	
	public int registrarInscripcion(InscripcionDTO dto) throws SQLException, ClassNotFoundException {
		InscripcionDAO dao = new InscripcionDAO();
		int inscripcion = dao.insertarInscripcion(dto);
		return inscripcion;
	}
	
	public List<CursoDTO> obtenerCursos() throws SQLException, ClassNotFoundException{
		CursoDao dao = new CursoDao();
		List<CursoDTO> listaCurso = dao.obtieneCursos();
		return listaCurso;
	}
	
	public List<FormaDePagoDTO> obtenerFormasDePago() throws SQLException, ClassNotFoundException{
		FormaDePagoDAO dao = new FormaDePagoDAO();
		List<FormaDePagoDTO> formaDePago = dao.obtieneFormasDePago();
		return formaDePago;
	}
	
	public List<InscripcionDTO> obtieneInscripciones() throws SQLException, ClassNotFoundException{
		InscripcionDAO dao = new InscripcionDAO();
		List<InscripcionDTO> inscripcion = dao.obtieneInscripciones();
		return inscripcion;
	}
	
	public InscripcionDTO2 obtieneUltimo() throws SQLException, ClassNotFoundException{
		InscripcionDAO dao = new InscripcionDAO();
		InscripcionDTO2 isncripcionDTO2 = dao.obtieneUltimo();
		return isncripcionDTO2;
	}
}

