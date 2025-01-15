package com.coderhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Cliente;
import com.coderhouse.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	public Cliente findById(Long id) {
		return clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));
				
				
	}
	
	@Transactional
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Transactional
	public Cliente updateClienteById(Long id, Cliente clienteDetails) {
		Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));
		cliente.setNombre(clienteDetails.getNombre());
		cliente.setApellido(clienteDetails.getApellido());
		
		if (clienteDetails.getDni()!= 0) {
			cliente.setDni(clienteDetails.getDni());
		}
		
		if(clienteDetails.getMail() != null && !clienteDetails.getMail().isEmpty()) {
			cliente.setMail(clienteDetails.getMail());
		}
		
		return clienteRepository.save(cliente);
	}
	
	
	
	
	public void deleteClienteById(Long id) {
		if(!clienteRepository.existsById(id)) {
			throw new IllegalArgumentException("Cliente no encontrado");
		}
		
		clienteRepository.deleteById(id);
	}

}
