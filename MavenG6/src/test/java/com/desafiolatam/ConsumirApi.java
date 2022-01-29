package com.desafiolatam;

import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ConsumirApi {
	// get, post, put, delete

	public void obtenerApi() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuesta = invocationBuilder.get();
		List<Publicacion> listaPublicaciones = respuesta.readEntity(new GenericType<List<Publicacion>>() {
		});

		// System.out.println(listaPublicaciones.get(0));
		System.out.println("*** Publicaciones ***");
		for (Publicacion publicacion : listaPublicaciones) {
			System.out.println(publicacion.getUserId() + " - " + publicacion.getId() + " - " + publicacion.getTitle());
		}

		System.out.println("*** Comentarios ***");
		// comentarios
		target = client.target("https://jsonplaceholder.typicode.com").path("comments");
		invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		respuesta = invocationBuilder.get();

		List<Comentario> listaComentarios = respuesta.readEntity(new GenericType<List<Comentario>>() {
		});

		// System.out.println(listaComentarios.get(0));

		for (Comentario comentario : listaComentarios) {
			System.out.println(comentario.getPostId() + " - " + comentario.getId() + " - " + comentario.getName());
		}
	}

	public void metodoPost() {

		Publicacion publicacion = new Publicacion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nuevo título:");
		String title = sc.nextLine();
		System.out.println("Ingrese el cuerpo de la publicación");
		String cuerpo = sc.nextLine();
		System.out.println("Ingrese nuevo Id de usuario:");
		Integer userId = sc.nextInt();
		System.out.println("Ingrese nueva Id:");
		Integer id = sc.nextInt();
		publicacion.setTitle(title);
		publicacion.setBody(cuerpo);
		publicacion.setUserId(userId);
		publicacion.setId(id);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.post(Entity.entity(publicacion, MediaType.APPLICATION_JSON));
		System.out.println(publicacionRespuesta);
		if(publicacionRespuesta.getStatus() == 201) {
			System.out.println("Publicación agregada exitosamente");
		}else {
			System.out.println("Error al agregar la publicación");
		}
	}

	public void metodoPut() {
		Scanner sc = new Scanner(System.in);
		Publicacion publicacion = new Publicacion();
		System.out.println("Ingrese nuevo título:");
		String titulo = sc.nextLine();
		System.out.println("Ingrese el cuerpo de la publicación");
		String body = sc.nextLine();
		System.out.println("Ingrese nuevo Id de usuario:");
		Integer userId = sc.nextInt();
		System.out.println("Ingrese nueva Id:");
		Integer id = sc.nextInt();
		publicacion.setTitle(titulo);
		publicacion.setBody(body);
		publicacion.setUserId(userId);
		publicacion.setId(id);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts").path(id.toString());
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.put(Entity.entity(publicacion, MediaType.APPLICATION_JSON));
		//System.out.println(publicacionRespuesta);
		if(publicacionRespuesta.getStatus() == 200) {
			System.out.println("Publicación actualizada exitosamente");
		}else {
			System.out.println("Error al actualizar la publicación");
		}
	}

	public void metodoDelete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese elemento a eliminar");
		String idEliminar = sc.nextLine();
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts").path(idEliminar);
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.delete();
		//System.out.println(publicacionRespuesta);
		if(publicacionRespuesta.getStatus() == 200) {
			System.out.println("Elemento eliminado exitosamente");
		}else {
			System.out.println("Error al eliminar el elemento");
		}
	}
}
