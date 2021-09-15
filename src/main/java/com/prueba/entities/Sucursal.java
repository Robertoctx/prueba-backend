package com.prueba.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SUCURSAL")
public class Sucursal {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_SUCURSAL")
	@SequenceGenerator(name="SEQ_SUCURSAL", sequenceName="SEQ_SUCURSAL", allocationSize=1)
	@Column(name = "CODIGO_SUCURSAL")
	private int codigo_sucursal;

	@Column(name = "CODIGO_EMPRESA")
	private int codigo_empresa;

	@Column(name = "NOMBRE_SUCURSAL")
	private String nombre;

	@Column(name = "REGION")
	private String region;

	@Column(name = "USUARIO_REGISTRO")
	private String usuario_registro;

	@Column(name = "FECHA_REGISTRO")
	private String fecha_registro;

	public Sucursal() {

	}

	public Sucursal(int codigo_sucursal, int codigo_empresa, String nombre_sucursal, String region,
			String usuario_registro, String fecha_registro) {
		super();
		this.codigo_sucursal = codigo_sucursal;
		this.codigo_empresa = codigo_empresa;
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

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	
	public String toString() {
		return this.nombre + "," + this.region + "," + this.usuario_registro;
	}

}
