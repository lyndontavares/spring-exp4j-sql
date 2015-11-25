package com.idomine.mbl.businesslanguage.impl.logistica;

import com.idomine.mbl.businesslanguage.abstrato.BusinessFormula;
import com.idomine.mbl.businesslanguage.dao.BusinessFormulaLogisticaDao;
import com.idomine.mbl.businesslanguage.model.Formula;

public class BusinessFormulaLogistica implements BusinessFormula {

	public BusinessFormulaLogistica() {
	}

	public BusinessFormula executeFormula(String formula) {
		Formula f = new BusinessFormulaLogisticaDao().findByNome(formula);
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
