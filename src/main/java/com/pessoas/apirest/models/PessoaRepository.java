package com.pessoas.apirest.models;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Optional<Pessoa> findByCpf(String cpf);

	Optional<Pessoa> findByNome(String nome);


	
}
