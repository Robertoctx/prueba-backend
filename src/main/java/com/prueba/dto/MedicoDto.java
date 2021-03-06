package com.prueba.dto;

import java.sql.Date;

public class MedicoDto {

	private int codigo_medico;

	private String tipo_identificacion;

	private String numero_identificacion;

	private String primer_nombre;

	private String segundo_nombre;

	private String primer_apellido;

	private String segundo_apellido;

	private String nombre_completo;

	private String mail;

	private Date fecha_nacimiento;

	private double sueldo;

	private String sexo;

	private String codigo_sucursal;

	private String codigo_empresa;

	private String usuario_registro;

	private Date fecha_registro;

	public MedicoDto() {
		this.nombre_completo = this.concatenarNombreCompleto();
		this.fecha_nacimiento = null;
		this.usuario_registro = "Roberto";
		this.fecha_registro = new Date(System.currentTimeMillis());
	}

	public MedicoDto(int codigo_medico, String tipo_identificacion, String numero_identificacion, String primer_nombre,
			String segundo_nombre, String primer_apellido, String segundo_apellido, String mail, Date fecha_nacimiento,
			double sueldo, String sexo, String codigo_sucursal, String codigo_empresa, String usuario_registro,
			Date fecha_registro) {
		this.codigo_medico = codigo_medico;
		this.tipo_identificacion = tipo_identificacion;
		this.numero_identificacion = numero_identificacion;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.nombre_completo = this.concatenarNombreCompleto();
		this.mail = mail;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sueldo = sueldo;
		this.sexo = sexo;
		this.codigo_sucursal = codigo_sucursal;
		this.codigo_empresa = codigo_empresa;
		this.usuario_registro = usuario_registro;
		this.fecha_registro = fecha_registro;
	}

	public int getCodigo_medico() {
		return codigo_medico;
	}

	public void setCodigo_medico(int codigo_medico) {
		this.codigo_medico = codigo_medico;
	}

	public String getTipo_identificacion() {
		return tipo_identificacion;
	}

	public void setTipo_identificacion(String tipo_identificacion) {
		this.tipo_identificacion = tipo_identificacion;
	}

	public String getNumero_identificacion() {
		return numero_identificacion;
	}

	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getNombreCompleto() {
		return nombre_completo;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombre_completo = nombreCompleto;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCodigo_sucursal() {
		return codigo_sucursal;
	}

	public void setCodigo_sucursal(String codigo_sucursal) {
		this.codigo_sucursal = codigo_sucursal;
	}

	public String getCodigo_empresa() {
		return codigo_empresa;
	}

	public void setCodigo_empresa(String codigo_empresa) {
		this.codigo_empresa = codigo_empresa;
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

	public String concatenarNombreCompleto() {
		String nombre = "";
		nombre += this.primer_nombre + " ";
		if (this.segundo_nombre != null) {
			nombre += this.segundo_nombre + " ";
		}
		nombre += this.primer_apellido + " " + this.segundo_apellido;
		return nombre;
	}

}
