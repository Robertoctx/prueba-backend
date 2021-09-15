package com.prueba.dto;

import java.sql.Date;

public class SucursalDto {

	private int codigo_empresa;

	private int codigo_sucursal;

	private String nombre;

	private String region;

	private String usuario_registro;

	private Date fecha_registro;

	public SucursalDto() {
		this.usuario_registro = "Roberto";
		this.fecha_registro = new Date(System.currentTimeMillis());
	}

	public SucursalDto(int codigo_empresa, int codigo_sucursal, String nombre_sucursal, String region,
			String usuario_registro, Date fecha_registro) {
		this.codigo_empresa = codigo_empresa;
		this.codigo_sucursal = codigo_sucursal;
		this.nombre = nombre_sucursal;
		this.region = region;
		this.usuario_registro = usuario_registro;
		this.fecha_registro = fecha_registro;
	}

	public int getCodigo_sucursal() {
		return codigo_sucursal;
	}

	public void setCodigo_sucursal(int codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}

	public int getCodigo_empresa() {
		return codigo_empresa;
	}

	public void setCodigo_empresa(int codigo_empresa) {
		this.codigo_empresa = codigo_empresa;
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

	public String getUsuario_registro() {
		return usuario_registro;
	}

	public void setUsuario_registro(String usuario_registro) {
		this.usuario_registro = usuario_registro;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

}
