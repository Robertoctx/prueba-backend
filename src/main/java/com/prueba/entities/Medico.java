package com.prueba.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_MEDICO")
	@SequenceGenerator(name="SEQ_MEDICO", sequenceName="SEQ_MEDICO", allocationSize=1)
	@Column(name = "codigo_medico")
	private int codigo_medico;

	@Column(name = "tipo_identificacion")
	private String tipo_identificacion;

	@Column(name = "numero_identificacion")
	private String numero_identificacion;

	@Column(name = "primer_nombre")
	private String primer_nombre;

	@Column(name = "segundo_nombre")
	private String segundo_nombre;

	@Column(name = "primer_apellido")
	private String primer_apellido;

	@Column(name = "segundo_apellido")
	private String segundo_apellido;

	@Column(name = "nombre_completo")
	private String nombre_completo;

	@Column(name = "mail")
	private String mail;

	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;

	@Column(name = "sueldo")
	private double sueldo;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "codigo_sucursal")
	private String codigo_sucursal;

	@Column(name = "codigo_empresa")
	private String codigo_empresa;

	@Column(name = "usuario_registro")
	private String usuario_registro;

	@Column(name = "fecha_registro")
	private Date fecha_registro;

	public Medico() {

	}

	public Medico(int codigo_medico, String tipo_identificacion, String numero_identificacion, String primer_nombre,
			String segundo_nombre, String primer_apellido, String segundo_apellido, String nombreCompleto, String mail,
			Date fecha_nacimiento, double sueldo, String sexo, String codigo_sucursal, String codigo_empresa,
			String usuario_registro, Date fecha_registro) {
		super();
		this.codigo_medico = codigo_medico;
		this.tipo_identificacion = tipo_identificacion;
		this.numero_identificacion = numero_identificacion;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.nombre_completo = nombreCompleto;
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

}
