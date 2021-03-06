package com.desafiolatam;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ConsumirApi {

	public void obtenerListaDeLibros() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {
		});

		System.out.println(listaPublicaciones.get(0));

	}

	public void librosAutorTitulo() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {
		});

		for (Book book : listaPublicaciones) {
			System.out.println(book.getAuthor() + ": " + book.getTitle());
		}
	}

	public void librosIndice() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {
		});

		System.out.println("Libro número 3: " + listaPublicaciones.get(3).getAuthor() + ", "
				+ listaPublicaciones.get(3).getTitle() + ", " + listaPublicaciones.get(3).getCountry());
		System.out.println("Libro número 8: " + listaPublicaciones.get(8).getAuthor() + ", "
				+ listaPublicaciones.get(8).getTitle() + ", " + listaPublicaciones.get(8).getCountry());

	}

	public void detalleLibros() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks")
				.path("bookDetail");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<BookDetail> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<BookDetail>>() {
		});

		System.out.println(listaPublicaciones.get(0));

	}

	public void autoresAnonimos() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks")
				.path("bookDetail");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<BookDetail> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<BookDetail>>() {
		});
		for (BookDetail book : listaPublicaciones) {
			String autor = book.getAuthor();
			if (autor.contains("Unknown"))

				System.out.println("Autor: " + book.getAuthor() + " - libro: " + book.getTitle());
		}
	}

	public void deliveryDisponibles() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks")
				.path("bookDetail");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<BookDetail> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<BookDetail>>() {
		});
		for (BookDetail book : listaPublicaciones) {
			if (book.isDelivery() == true)
				System.out.println("Libro: " + book.getTitle());
		}
	}
}