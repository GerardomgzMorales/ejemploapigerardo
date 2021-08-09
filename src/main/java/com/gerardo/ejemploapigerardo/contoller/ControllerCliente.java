package com.gerardo.ejemploapigerardo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerardo.ejemploapigerardo.model.Cliente;

@RestController
public class ControllerCliente {

	@Autowired
	private ClienteImpl servicioCliente; // Inyeccion

	@GetMapping("GET/NutriNET/Clientes")
	public List<Cliente> obtenerClientes() {
		return servicioCliente.todosClientes();
	}

	@PostMapping("POST/NutriNET/Cliente")
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		servicioCliente.guardar(cliente);
		return cliente;
	}

	@GetMapping("GET/NutriNET/Cliente/{id}")
	public Cliente clientePorID(@PathVariable("id") int idCliente) {
		return this.servicioCliente.clientePorID(idCliente);
	}

	@PutMapping("PUT/NutriNET/Cliente")
	public Cliente actualizarCliente(@RequestBody Cliente clienteNuevo) {
		this.servicioCliente.guardar(clienteNuevo);
		return clientePorID(clienteNuevo.getCliente_ID());
	}

}
