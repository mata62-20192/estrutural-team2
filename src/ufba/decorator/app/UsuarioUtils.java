package ufba.decorator.app;

import ufba.decorator.lib.Usuario;

class UsuarioUtils {
	public static boolean ehValido(Usuario u) {
		return !u.getUsername().contains(",") &&
				!u.getEmail().contains(",") &&
				!u.getNomeCompleto().contains(",");
	}
	
	public static Usuario filtraEntrada(Usuario u) {
		Usuario ret = new Usuario();
		ret.setUsername(u.getUsername().replaceAll(",", ""));
		ret.setEmail(u.getEmail().replaceAll(",", ""));
		ret.setNomeCompleto(u.getNomeCompleto().replaceAll(",", ""));
		return ret;
	}
	
	public static boolean ehAdministrador(String ip) {
		return ip.equals("192.168.0.100");
	}
}