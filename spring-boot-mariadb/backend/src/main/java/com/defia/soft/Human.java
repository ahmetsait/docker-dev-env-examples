package com.defia.soft;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Human {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	protected Human() {
		
	}

	public Human(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format(
				"Human[id=%d, name='%s']",
				id, name);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
