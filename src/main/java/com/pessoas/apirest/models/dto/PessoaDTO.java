package com.pessoas.apirest.models.dto;

import org.modelmapper.ModelMapper;

import com.pessoas.apirest.models.Pessoa;

import lombok.Data;

@Data
public class PessoaDTO {
	
//	private Long id;
	private String nome;
	private int idade;
	private String email;
	private String celular;
	private String cidade;
	
	public static PessoaDTO create(Pessoa c) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(c, PessoaDTO.class);

	}

	
	
	

}
