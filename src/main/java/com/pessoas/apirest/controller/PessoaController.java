package com.pessoas.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoas.apirest.models.dto.PessoaDTO;
import com.pessoas.apirest.service.PessoaService;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

	@Autowired
	PessoaService service;

	@GetMapping
	public ResponseEntity<List<PessoaDTO>> getPessoas() {

		return ResponseEntity.ok(service.getPessoas());
	}

}
