package ufba.composite;

public abstract class Pessoa implements Membro{
	String nome;
	double experiencia;
	
	public String getNome() {
		return this.nome;
	}
	public double getExperiencia() {
		return this.experiencia;
	}
	
	public abstract double getSalario();
}