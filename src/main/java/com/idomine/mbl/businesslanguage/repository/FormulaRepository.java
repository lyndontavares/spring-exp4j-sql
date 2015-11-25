package com.idomine.mbl.businesslanguage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idomine.mbl.businesslanguage.model.Formula;

@RepositoryRestResource(collectionResourceRel="formula",path="formula",exported=true)
public interface FormulaRepository extends PagingAndSortingRepository<Formula, Long> {

	
	Iterable<Formula> findByDescricaoIgnoreCase(String descricao);
	
	
}
