package com.robson.io.cleanarch.core.domain;

public class Customer {
	private String id;
	private String nome;
	private String address;
	private String isValidCpf;

	public Customer(String id, String nome, String address, String isValidCpf) {
		this.id = id;
		this.nome = nome;
		this.address = address;
		this.isValidCpf = isValidCpf;
	}
	public Customer() {
		this.isValidCpf = "false";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIsValidCpf() {
		return isValidCpf;
	}
	public void setIsValidCpf(String isValidCpf) {
		this.isValidCpf = isValidCpf;
	}
}
