package com.solution.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solution.bean.Person;

@Repository
public class PersonDao {

	@Autowired
	private Map<String, Person> personRepository;

	public Map<String, Person> getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(Map<String, Person> personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> getAllPersons() {
		List<Person> list = new ArrayList<>();
		Collection<Person> values = personRepository.values();
		list.addAll(values);
		return list;
	}

	public Person createPerson(Person person) {
		String name = person.getName();
		person = personRepository.put(name, person);
		return person;
	}

	public Person getPerson(String name) {
		return personRepository.get(name);
	}

	public void deletePerson(String name) {
		if(personRepository.containsKey(name)){
			personRepository.remove(name);
		}
	}

	public Person updatePerson(String name, Person person) {
		if(personRepository.containsKey(name)){
			personRepository.put(name, person);
			return person;
		}
		return null;
	}

}
