package com.solution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solution.bean.Person;
import com.solution.dao.PersonDao;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	public List<Person> getAllPersons() {
		return personDao.getAllPersons();
	}

	public Person createPerson(Person person) {
		return personDao.createPerson(person);
	}

	public Person getPerson(String name) {
		return personDao.getPerson(name);
	}

	public void deletePerson(String name) {
		personDao.deletePerson(name);
	}

	public Person updatePerson(Person person) {
		String name = null;
		if(person != null){
			name = person.getName();
		}
		return personDao.updatePerson(name,person);
	}

}
