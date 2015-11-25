package com.idomine.mbl.businesslanguage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idomine.mbl.businesslanguage.abstrato.BusinessFormula;
import com.idomine.mbl.businesslanguage.abstrato.enums.ModuloSistema;
import com.idomine.mbl.businesslanguage.impl.fatura.BusinessFormulaFatura;
import com.idomine.mbl.businesslanguage.impl.logistica.BusinessFormulaLogistica;

@Service
public class BusinessLanguage implements BusinessFormula {

	@Autowired
	BusinessFormulaFatura businessFormulaFatura;
	
	private ModuloSistema moduloSistema;
	
	public BusinessLanguage() {
		this.moduloSistema =ModuloSistema.FATURA;
	}

	public BusinessLanguage moduloSistema(ModuloSistema moduloSistema) {
		this.moduloSistema = moduloSistema;
		return this;
	}

	public BusinessFormula executeFormula(String formula) {

		if (moduloSistema.equals(ModuloSistema.LOGISTICA)) {
			return new BusinessFormulaLogistica().executeFormula(formula);
		} else if (moduloSistema.equals(ModuloSistema.FATURA)) {
			return businessFormulaFatura.executeFormula(formula);
		}
		return null;

	}

}
