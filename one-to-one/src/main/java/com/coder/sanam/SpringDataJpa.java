package com.coder.sanam;

import java.text.MessageFormat;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.coder.sanam.entities.bidirectional.Passport;
import com.coder.sanam.entities.bidirectional.Person;
import com.coder.sanam.entities.unidirectional.Family;
import com.coder.sanam.entities.unidirectional.House;
import com.coder.sanam.repositories.FamilyRepository;
import com.coder.sanam.repositories.HouseRepository;
import com.coder.sanam.repositories.PassportRepository;
import com.coder.sanam.repositories.PersonRepository;

@SpringBootApplication
public class SpringDataJpa {
	
	private static final Logger log = LoggerFactory.getLogger(SpringDataJpa.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpa.class, args);

		//Bidirectional One to One Mapping
		
		PersonRepository personRepository = ctx.getBean(PersonRepository.class);
		PassportRepository passportRepository = ctx.getBean(PassportRepository.class);
		Person person = new Person("John", "Wick", new Passport("ABCD121", "Goregaon East Film City"));
		personRepository.save(person);

		Optional<Person> john = personRepository.findById(1L);
		Optional<Passport> pass = passportRepository.findById(1L);

		if (john.isPresent() && pass.isPresent() && log.isInfoEnabled()) {
			log.info(MessageFormat.format("{0} has passport {1}",john.get(), john.get().getPassport()));
			log.info(MessageFormat.format("{0} is identity for {1}",pass.get(), pass.get().getPerson()));
		}
		
		
		
		//Unidirectional One To One Mapping
		FamilyRepository familyRepository = ctx.getBean(FamilyRepository.class);
		HouseRepository houseRepository = ctx.getBean(HouseRepository.class);
		House house = new House();
		house.setInterior("European Finish");
		house.setFurnish("Italian Marble");
		houseRepository.save(house);
		
		Family family = new Family();
		family.setHouse(house);
		family.setFamilyName("Khuranas");
		family.setStatus("High Class");
		familyRepository.save(family);
	}

}
