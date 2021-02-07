package br.com.wandy.exception;

public class CaixaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1556952987872342011L;
	
	public CaixaException(Long id) {
		super("Cadastro nãao encontrado");
	}

}
