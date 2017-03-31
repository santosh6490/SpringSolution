package com.solution.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solution.bean.Person;
import com.solution.service.PersonService;

@Controller
@RequestMapping(value = "/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value="/all", method=RequestMethod.GET)
	@ResponseBody
	public List<Person> getAllPersons() {
		logger.debug("inside allPersons");
		return personService.getAllPersons();
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	@ResponseBody
	public Person createPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	public Person updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person);
	}
	
	@RequestMapping(value="/get/{name}", method=RequestMethod.GET)
	@ResponseBody
	public Person getPerson(@PathVariable("name") String name, HttpServletRequest req) {
		return personService.getPerson(name);
	}
	
	@RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
	@ResponseBody
	public void deletePerson(@PathVariable("name") String name) {
		personService.deletePerson(name);
	}

}
