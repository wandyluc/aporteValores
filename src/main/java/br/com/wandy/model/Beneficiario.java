package br.com.wandy.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beneficiario {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Long cpf;
	
	private String email;
	
	private BigDecimal saldo;
	
	private Integer anosAposentadoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Integer getAnosAposentadoria() {
		return anosAposentadoria;
	}

	public void setAnosAposentadoria(Integer anosAposentadoria) {
		this.anosAposentadoria = anosAposentadoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
