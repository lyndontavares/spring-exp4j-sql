package com.idomine.mbl.businesslanguage.dao;

import java.util.ArrayList;
import java.util.List;

import com.idomine.mbl.businesslanguage.model.Formula;

public class BusinessFormulaLogisticaDao {

	private List<Formula> formulas;
	
	public BusinessFormulaLogisticaDao(){
		formulas = new ArrayList<>();
		formulas.add( new Formula(1,"reajustePreco1") );
		formulas.add( new Formula(2,"reajustePreco2") );
	}

	
	public Formula findById(long id){
		return formulas.get((int)id);
	}

	public Formula findByNome(String descricao){
		for (Formula formula : formulas) {
			if ( formula.getDescricao().equals(descricao)){
				return formula;
			}
		}
		return null;
	}
	
	
}
