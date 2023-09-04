package com.coder.sanam;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coder.sanam.entities.Family;
import com.coder.sanam.entities.House;
import com.coder.sanam.utils.HibernateUtils;

@SpringBootApplication
public class SpringDataJpa {
	
	private static final Logger log = LoggerFactory.getLogger(SpringDataJpa.class);

	public static void main(String[] args) {
		
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			session.beginTransaction();
			Family family = new Family();
			family.setFamilyName("Gada");
			family.setStatus("Upper class");
			
			
			House house = new House();
			house.setInterior("Italian marble");
			house.setFurnish("European flooring");
			family.setHouse(house);
			session.persist(family);
			session.getTransaction().commit();
		}catch(Exception ex) {
			log.error(ex.getMessage(),ex);
		}

		
	}

}
