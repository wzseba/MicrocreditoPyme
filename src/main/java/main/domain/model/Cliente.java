package main.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Cliente {

	private final UUID id;
	private String nombreEmpresa;
	private BigDecimal ingresoAnuales;

	public Cliente(String nombreEmpresa, BigDecimal ingresoAnuales) {
		this.id = UUID.randomUUID();
		this.nombreEmpresa = nombreEmpresa;
		this.ingresoAnuales = ingresoAnuales;
	}

	public Cliente(UUID id, String nombreEmpresa, BigDecimal ingresoAnuales) {
		this.id = id;
		this.nombreEmpresa = nombreEmpresa;
		this.ingresoAnuales = ingresoAnuales;
	}

	public BigDecimal calcularCapacidadEndeudamiento() {
		// Regla: como maximo 40% de ingresos anuales
		return this.ingresoAnuales.multiply(new BigDecimal("0.4"));
	}
}
