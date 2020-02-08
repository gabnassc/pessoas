package com.pessoas.apirest.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoas.apirest.models.Pessoa;
import com.pessoas.apirest.models.PessoaRepository;
import com.pessoas.apirest.models.dto.PessoaDTO;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository rep;

	public List<PessoaDTO> getPessoas() {

		List<Pessoa> pessoas = rep.findAll();
		List<PessoaDTO> pessoasLista = pessoas.stream().map(c -> PessoaDTO.create(c)).collect(Collectors.toList());

		return pessoasLista;
	}

	public PessoaDTO getPessoaById(Long id) throws ObjectNotFoundException {

		Optional<Pessoa> pessoa = rep.findById(id);

		return pessoa.map(PessoaDTO::create).orElseThrow(() -> new ObjectNotFoundException("Pessoa não encontrado!"));

	}

	public PessoaDTO getPessoaByCpf(String cpf) throws ObjectNotFoundException {
		Optional<Pessoa> pessoa = rep.findByCpf(cpf);

		return pessoa.map(PessoaDTO::create).orElseThrow(() -> new ObjectNotFoundException("CPF não cadastrado!"));
	}

	public PessoaDTO getPessoaByNome(String nome) throws ObjectNotFoundException {
		Optional<Pessoa> pessoa = rep.findByNome(nome);

		return pessoa.map(PessoaDTO::create).orElseThrow(() -> new ObjectNotFoundException("Nome não encontrado!"));
	}

}
