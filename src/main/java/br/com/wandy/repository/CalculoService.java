package br.com.wandy.repository;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Component;

import br.com.wandy.model.Beneficiario;

@Component
public class CalculoService implements ICalculo{

		public Beneficiario saldoCalculado(Beneficiario param) {

			BigDecimal saldo = param.getSaldo().divide(new BigDecimal((param.getAnosAposentadoria() * 12 )),2,RoundingMode.HALF_DOWN);
			
			param.setSaldo(param.getSaldo().add(saldo));
			
			return param;
			
		}
}
