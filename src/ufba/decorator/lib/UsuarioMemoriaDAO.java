package ufba.decorator.lib;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMemoriaDAO implements UsuarioDAO {
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void apagarTudo() {
		usuarios.clear();
	}
	public void inserir(Usuario u) {
		usuarios.add(u);
	}
	public Usuario obter(String username) {
		Usuario ret = null;
		
		for (Usuario u : usuarios) {
			if (u.username.equals(username)) {
				ret = u;
				break;
			}
		}
		
		return ret;
	}
}