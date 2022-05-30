package com.uce.edu.demo.matriculacion;

public class Materia {

	private String nombreMateria;
	private String semestre;
	private String aula;
	
	//SET Y GET
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	@Override
	public String toString() {
		return "Materia [nombreMateria=" + nombreMateria + ", semestre=" + semestre + ", aula=" + aula + "]";
	}
	
	
}
