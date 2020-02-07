package com.pessoas.apirest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoas.apirest.models.Pessoa;
import com.pessoas.apirest.models.PessoaRepository;
import com.pessoas.apirest.models.dto.PessoaDTO;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository rep;

	public List<PessoaDTO> getPessoas() {

		List<Pessoa> pessoas = rep.findAll();
		List<PessoaDTO> pessoasLista = pessoas.stream().map(c -> PessoaDTO.create(c)).collect(Collectors.toList());

		return pessoasLista;
	}

}