package com.idomine.mbl.businesslanguage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idomine.mbl.businesslanguage.impl.BusinessLanguage;
import com.idomine.mbl.businesslanguage.model.Formula;
import com.idomine.mbl.businesslanguage.repository.FormulaRepository;

@RestController
@RequestMapping("api")
public class FormulaController {

	@Autowired
	FormulaRepository repo;
	
	@Autowired
	BusinessLanguage businessLanguage;

	@RequestMapping(value="formula", method=RequestMethod.GET)
	public Iterable<Formula> listaFormulas(){
		return repo.findAll();
	}
	
	@RequestMapping(value="execute/{formula}", method=RequestMethod.GET)
	public void executeFormulas(@PathVariable("formula")final String formula){
		businessLanguage.executeFormula(formula);
	}
	
}
