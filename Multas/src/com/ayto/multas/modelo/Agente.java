package com.ayto.multas.modelo;

import javax.persistence.*;

@Entity
public class Agente {
	
	@Id
	@Column(length = 9)
	private int codigo;
	
	@Column(length = 40)
	private String nombre;
	
	@Embedded
	private Direccion direccion;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
