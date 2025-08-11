package main.domain.model;

import java.util.UUID;

public class Cliente {

	private final UUID id;
	private String nombreEmpresa;
	private double ingresoAnuales;

	public Cliente(String nombreEmpresa, double ingresoAnuales) {
		this.id = UUID.randomUUID();
		this.nombreEmpresa = nombreEmpresa;
		this.ingresoAnuales = ingresoAnuales;
	}

	public Cliente(UUID id, String nombreEmpresa, double ingresoAnuales) {
		this.id = id;
		this.nombreEmpresa = nombreEmpresa;
		this.ingresoAnuales = ingresoAnuales;
	}
}
