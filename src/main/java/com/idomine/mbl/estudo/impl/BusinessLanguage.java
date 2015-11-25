package com.idomine.mbl.estudo.impl;

import com.idomine.mbl.estudo.enums.ModuloSistema;

public class BusinessLanguage implements BusinessFormula {
	
	private ModuloSistema moduloSistema;
	
	public BusinessLanguage(ModuloSistema moduloSistema){
		this.moduloSistema=moduloSistema;
	}
	
	public BusinessFormula executeFormula(String formula ){

		if ( moduloSistema.equals(ModuloSistema.LOGISTICA) ) {
			BusinessFormula f = new BusinessFormulaLogistica();
			f.executeFormula(formula);
			return f;
		}
		
		return null;
		
	}

}
