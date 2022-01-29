 package com.indianajeans.general;

import java.util.ArrayList;

import com.indianajeans.models.Producto;

public abstract class ExportadorTxt {
	
	public abstract void exportar(ArrayList<Producto> listaProductos);

}
