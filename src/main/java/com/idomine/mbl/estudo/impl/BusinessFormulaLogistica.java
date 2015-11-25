package com.idomine.mbl.estudo.impl;

import com.idomine.mbl.estudo.dao.Formula;
import com.idomine.mbl.estudo.dao.FormulaDao;

public class BusinessFormulaLogistica implements BusinessFormula {

	public BusinessFormulaLogistica() {
	}

	public BusinessFormula executeFormula(String formula) {
		Formula f = new FormulaDao().findByNome(formula);
		if ((f != null)) {
			System.out.println("formula " + formula + " executada!");
		} else {
			System.out.println("formula " + formula + " não encontrada!");
		}
		return this;
	}

	@Override
	public String toString() {
		return "DolphinFormulaLogistica []";
	}

}
