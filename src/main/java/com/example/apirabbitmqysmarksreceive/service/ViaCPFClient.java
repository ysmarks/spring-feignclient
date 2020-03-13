package com.example.apirabbitmqysmarksreceive.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.apirabbitmqysmarksreceive.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCPFClient {

	@GetMapping("{cep}/json")
	Endereco buscaEnderecoPor(@PathVariable("cep") String cep);
}
