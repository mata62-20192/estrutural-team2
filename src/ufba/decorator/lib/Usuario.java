package ufba.decorator.lib;

public class Usuario {
	String username;
	String email;
	String nomeCompleto;
	
	public String toString() {
		return username + "," + email + "," + nomeCompleto;
	}
	public static Usuario fromString(String str) {
		String[] components = str.split(",");
		Usuario usuario = new Usuario();
		usuario.username = components[0];
		usuario.email = components[1];
		usuario.nomeCompleto = components[2];
		return usuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
}
