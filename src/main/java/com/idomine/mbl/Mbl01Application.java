package com.idomine.mbl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.idomine.mbl.businesslanguage.model.Formula;
import com.idomine.mbl.businesslanguage.repository.FormulaRepository;

@SpringBootApplication
public class Mbl01Application {

	
	@Autowired
	FormulaRepository repo;
	
    public static void main(String[] args) {
        SpringApplication.run(Mbl01Application.class, args);
    }
    
    @PostConstruct
    public void init(){
    
    	for(long i=1;i<=10;i++){
    		Formula f = new Formula(i,"formula"+i);
    		repo.save(f);
    	}
    	
    	
    }
    
    
}
