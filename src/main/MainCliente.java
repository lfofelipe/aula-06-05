package main;

import entity.Cliente;
import entity.Endereco;

public class MainCliente {

	public static void main(String[] args) {
		//Cliente-> Endereco
		Endereco e = new Endereco(10, "centro", "Niteroi");
		Cliente c = new Cliente(10, "luis felipe", "pro__felipe@hotmail.com", e);
		
		/////// ou
		
		//Endereco-> Cliente
		Cliente c2 = new Cliente(10, "luis felipe", "pro__felipe@hotmail.com");
		Endereco e2 = new Endereco(10, "centro", "Niteroi", c2);
	}
}
