package com.idomine.mbl.estudo;

import com.idomine.mbl.estudo.enums.ModuloSistema;
import com.idomine.mbl.estudo.impl.BusinessFormula;
import com.idomine.mbl.estudo.impl.BusinessLanguage;

import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.function.Function;

public class TesteFormula {

	public static void main(String[] args) {
		
		BusinessFormula  formula2 = new BusinessLanguage(ModuloSistema.LOGISTICA)
				.executeFormula("reajustePreco1")
				.executeFormula("reajustePreco2")
				.executeFormula("reajustePrecoXXX");
		
		System.out.println(formula2);
	
		
		Function avg = new Function("avg", 4) {
		    @Override
		    public double apply(double... args) {
		        double sum = 0;
		        for (double arg : args) {
		            sum += arg;
		        }
		        return sum / args.length;
		    }
		};
		
		double result = new ExpressionBuilder("avg(1,2,3,4)")
		        .function(avg)
		        .build()
		        .evaluate();
		System.out.println(result);
		
	}
	
	
	
}
