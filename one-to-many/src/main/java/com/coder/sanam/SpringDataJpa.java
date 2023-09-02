package com.coder.sanam;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.coder.sanam.entities.bidirectional.College;
import com.coder.sanam.entities.bidirectional.University;
import com.coder.sanam.entities.unidirectional.Person;
import com.coder.sanam.entities.unidirectional.Pet;
import com.coder.sanam.repositories.CollegeRepo;
import com.coder.sanam.repositories.PersonRepo;
import com.coder.sanam.repositories.PetRepo;
import com.coder.sanam.repositories.UniversityRepo;

@SpringBootApplication
public class SpringDataJpa {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpa.class, args);
		//Unidirectional One to Many Mapping
		PersonRepo personRepo = ctx.getBean(PersonRepo.class);
		PetRepo petRepo = ctx.getBean(PetRepo.class);
		
		Pet pet = new Pet();
		pet.setAnimalType("Dog");
		pet.setPetName("Tawde");
		
		Pet catPet = new Pet();
		catPet.setAnimalType("Cat");
		catPet.setPetName("Hermoine");
		petRepo.save(pet);
		petRepo.save(catPet);
		
		List<Pet> pets = Arrays.asList(pet,catPet);
		
		Person person = new Person();
		person.setName("Raghu");
		person.setPets(pets);
		
		personRepo.save(person);
		
		//Bidirectional one to many mapping
		UniversityRepo universityRepo = ctx.getBean(UniversityRepo.class);
		University university = new University();
		university.setType("Goverment Aided");
		university.setCity("Amravati");
		university.setColleges(Arrays.asList(
				new College("Government College of Engineering", true, university),
				new College("P.R Pote college of Enginnering",false,university)
				));
		universityRepo.save(university);
		

	}

}
