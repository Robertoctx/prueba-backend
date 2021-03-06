package com.prueba.dto;

public class SucursalMinDto {

	private String nombre;

	private String region;

	public SucursalMinDto() {

	}

	public SucursalMinDto(String nombre_sucursal, String region) {
		this.nombre = nombre_sucursal;
		this.region = region;
	}

	public String getNombre_sucursal() {
		return nombre;
	}

	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre = nombre_sucursal;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	public String dateToString(String date) {
		String[] dateTime = date.split(" ");
		String[] fecha = dateTime[0].split("-");
		String fechaConvertida = fecha[2] + "/" + fecha[1] + "/" + fecha[0];
		return fechaConvertida;
	}

}
