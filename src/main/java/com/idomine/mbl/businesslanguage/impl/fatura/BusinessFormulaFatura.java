package com.idomine.mbl.businesslanguage.impl.fatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idomine.mbl.businesslanguage.abstrato.BusinessFormula;
import com.idomine.mbl.businesslanguage.model.Formula;
import com.idomine.mbl.businesslanguage.repository.FormulaRepository;

@Service("BusinessFormulaFatura")
public class BusinessFormulaFatura  implements BusinessFormula{

	
	@Autowired
	FormulaRepository repo;

	@Override
	public BusinessFormula executeFormula(String formula) {
		Iterable<Formula> f = repo.findByDescricaoIgnoreCase(formula);
		if ((f != null)) {
			System.out.println("formula " + formula + " executada!");
		} else {
			System.out.println("formula " + formula + " não encontrada!");
		}
		return this;
	}

	@Override
	public String toString() {
		return "DolphinFormulaFatura []";
	}

	
}
