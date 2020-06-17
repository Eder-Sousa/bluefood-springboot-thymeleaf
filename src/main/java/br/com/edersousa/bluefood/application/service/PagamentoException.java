package br.com.edersousa.bluefood.application.service;

@SuppressWarnings("serial")
public class PagamentoException extends Exception{

	public PagamentoException() {
		super();
	}

	public PagamentoException(String message) {
		super(message);
	}

	public PagamentoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PagamentoException(String message, Throwable cause) {
		super(message, cause);
	}
}
