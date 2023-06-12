package com.marcos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marcos.model.Anomalia;
import com.marcos.repository.AnomaliaRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
		@Bean
		CommandLineRunner initDatabase(AnomaliaRepository anomaliaRepository){
	    return args -> {
        anomaliaRepository.deleteAll();

        Anomalia c = new Anomalia();
        c.setEquipamento("CCM1");
        c.setFalha("Elétrica");

        anomaliaRepository.save(c); // Correção: salvar a instância 'c' com os valores definidos
    };
		}
}
