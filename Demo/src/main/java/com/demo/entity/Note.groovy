package com.demo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name="Note")
class Note {
	
	//Groovy Advantage 1 : No Need to add Public
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@NotNull
	@Column(name="Note_Name",nullable = false)
	String noteName;
	
	@NotNull
	@Column(name="NOTE_DESC",nullable = false)
	String noteDesc;
	
	//Groovy Advantage 2 : No Need to add Getters and Setters
}
