package com.movevoip.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos básicos da classe
	private Integer id;
	private String name;

	// Associações:
	// ----->Depois volta para fazer as associações.

	// Construtor vazio:
	// Os objetos poderão ser instanciado sem que seja necessaŕio passar nenhuma
	// variável para os atributos
	public Categoria() {

	}

	// Construtor recebendo atributos.
	public Categoria(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// HashCode and equals - Operações que comparam os objetos por valor.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
