package com.gerardo.ejemploapigerardo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Clientes")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cliente_ID;

	@Column(length = 20, nullable = false, unique = true)
	private String nombre_Usuario;

	private String contrasenia;

	private String nombre;

	private String apellido;

	@Column(nullable = false, unique = true)
	private String correo_Electronico;

	private int edad;

	private double peso;

	private double estatura;

	private double imc;

	private double geb;

	private double eta;

	private Date fecha_Creacion;

	private Date fecha_Actualizacion;

	public Cliente() {

	}

	public Cliente(int cliente_ID, String nombre_Usuario, String contrasenia, String nombre, String apellido,
			String correo_Electronico, int edad, double peso, double estatura, double imc, double geb, double eta,
			Date fecha_Creacion, Date fecha_Actualizacion) {
		this.cliente_ID = cliente_ID;
		this.nombre_Usuario = nombre_Usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo_Electronico = correo_Electronico;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.imc = imc;
		this.geb = geb;
		this.eta = eta;
		this.fecha_Creacion = fecha_Creacion;
		this.fecha_Actualizacion = fecha_Actualizacion;
	}

	public int getCliente_ID() {
		return cliente_ID;
	}

	public void setCliente_ID(int cliente_ID) {
		this.cliente_ID = cliente_ID;
	}

	public String getNombre_Usuario() {
		return nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		this.nombre_Usuario = nombre_Usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo_Electronico() {
		return correo_Electronico;
	}

	public void setCorreo_Electronico(String correo_Electronico) {
		this.correo_Electronico = correo_Electronico;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double getGeb() {
		return geb;
	}

	public void setGeb(double geb) {
		this.geb = geb;
	}

	public double getEta() {
		return eta;
	}

	public void setEta(double eta) {
		this.eta = eta;
	}

	public Date getFecha_Creacion() {
		return fecha_Creacion;
	}

	public void setFecha_Creacion(Date fecha_Creacion) {
		this.fecha_Creacion = fecha_Creacion;
	}

	public Date getFecha_Actualizacion() {
		return fecha_Actualizacion;
	}

	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		this.fecha_Actualizacion = fecha_Actualizacion;
	}

}
