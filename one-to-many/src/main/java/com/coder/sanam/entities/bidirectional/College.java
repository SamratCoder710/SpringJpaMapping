package com.coder.sanam.entities.bidirectional;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String collegeName;
	
	private Boolean isNaacCertified;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private University university;

	public College(String collegeName, Boolean isNaacCertified, University university) {
		super();
		this.collegeName = collegeName;
		this.isNaacCertified = isNaacCertified;
		this.university = university;
	}
	
	

}
