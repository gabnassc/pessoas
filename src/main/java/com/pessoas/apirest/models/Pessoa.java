package com.pessoas.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name ="pessoa")
@Data
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private String data_nasc;
	private String signo;
	private String mae;
	private String pai;
	private String email;
	private String senha;
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone_fixo;
	private String celular;
	private double peso;
	private double altura;
	private String tipo_sanguineo;
	private String cor;

}
