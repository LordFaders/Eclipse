package cl.desafiolatanf20210104;

import java.util.ArrayList;

public class ArrayDinamico {

	public static void main(String[] args) {
		//Array dinamicos
		// declarar, inicializar, usar
		
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		System.out.println(numerosPares);//arreglo vacío
		System.out.println(numerosPares.size());// 0, cantidad de elemntos o tamaño
		//agregar elementos al arreglo
        numerosPares.add(22);
        numerosPares.add(12);
        numerosPares.add(36);
        numerosPares.add(102);
        System.out.println(numerosPares);
        System.out.println(numerosPares.size());//4
        
        numerosPares.add(4, 88);//insertar en una posicion
        numerosPares.add(3, 44);//si existe un elemento desplaza a la derecha todo el arrray desde ese punto
        System.out.println(numerosPares);
        
        //acceder a un elemento del arreglo por su posicion
        //arreglo.get(posicion)
        System.out.println(numerosPares.get(3));//44
        
        ArrayList<Integer> datosAEliminar = new ArrayList<Integer>();
        datosAEliminar.add(36);
        datosAEliminar.add(102);
        
        //eliminar elementos a partir de otro array
        numerosPares.removeAll(datosAEliminar);
        
        System.out.println("arreglo final: "+numerosPares);
	}
        
	}


