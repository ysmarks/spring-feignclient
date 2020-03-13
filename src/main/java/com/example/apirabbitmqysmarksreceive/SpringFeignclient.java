package com.example.apirabbitmqysmarksreceive;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignclient {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignclient.class, args);
	}
	
	/*
	 * @Bean public CommandLineRunner run(ViaCPFClient client) {
	 * 
	 * return args -> { if(args.length > 0) { String cep = args[0];
	 * 
	 * Endereco endereco = client.buscaEnderecoPor("08762510");
	 * 
	 * System.out.println(endereco); } }; }
	 */

}
