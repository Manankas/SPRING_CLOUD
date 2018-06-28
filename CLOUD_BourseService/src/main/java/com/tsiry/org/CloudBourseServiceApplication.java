package com.tsiry.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.tsiry.org.entities.Societe;
import com.tsiry.org.repository.SocieteRepository;

@EnableEurekaClient
@SpringBootApplication
public class CloudBourseServiceApplication implements CommandLineRunner{
	
	@Autowired
	SocieteRepository societeRepository ;

	public static void main(String[] args) {
		SpringApplication.run(CloudBourseServiceApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		societeRepository.save(new Societe("ETECH"));
		societeRepository.save(new Societe("GOOGLE"));
		societeRepository.save(new Societe("SUNS"));
		societeRepository.save(new Societe("FACEBOOK"));
		
		societeRepository.findAll().forEach(s -> System.out.println(s.getNomSociete()));
	}
}
