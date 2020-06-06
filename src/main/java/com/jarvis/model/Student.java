package com.jarvis.model;

import com.jarvis.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class Student {

	private UUID id;
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;

}
