package com.gerardo.ejemploapigerardo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerardo.ejemploapigerardo.model.Cliente;

@Service
public class ClienteImpl {

	@Autowired
	private ICliente cliente;

	public void guardar(Cliente cliente) {
		this.cliente.save(cliente);
	}

	public List<Cliente> todosClientes() {
		return this.cliente.findAll();
	}

	public Cliente clientePosID(int idCliente) {
		return null;
	}

	public Cliente clientePorID(int idCliente) {
		return this.cliente.getOne(idCliente);
	}

}