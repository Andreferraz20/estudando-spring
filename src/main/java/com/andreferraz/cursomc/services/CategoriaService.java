package com.andreferraz.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreferraz.cursomc.domain.Categoria;
import com.andreferraz.cursomc.repositories.CategoriaRepository;
import com.andreferraz.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService {
	
	
	//Para acessar o objeto de acesso a dados
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
