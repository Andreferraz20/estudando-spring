package com.andreferraz.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreferraz.cursomc.domain.Cliente;
import com.andreferraz.cursomc.repositories.ClienteRepository;
import com.andreferraz.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {
	
	
	//Para acessar o objeto de acesso a dados
	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
