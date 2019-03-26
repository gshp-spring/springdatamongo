package com.sriharilabs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sriharilabs.model.Summary;
import com.sriharilabs.repository.SummaryRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(SummaryRepository repository) {
		return (args) -> {
			
			
			Summary c1=new Summary();
			Summary c2=new Summary();
			c1.setModelId("1");
			c1.setMvmUseCases("mvm1");
			c1.setTdmTableName("table1");
			
			c2.setModelId("2");
			c2.setMvmUseCases("mvm2");
			c2.setTdmTableName("table2");
			repository.save(c1);
			repository.save(c2);
			
			repository.findByModelId("2").stream().forEach(d->{
				log.info(d.getMvmUseCases());
			});
			
		};
	}

}
