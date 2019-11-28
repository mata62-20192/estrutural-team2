package ufba.decorator.app;

import ufba.decorator.lib.Usuario;
import ufba.decorator.lib.UsuarioDAO;

public class UsuarioDAOAutenticacaoDecorator implements UsuarioDAO {

	public UsuarioDAOAutenticacaoDecorator(UsuarioDAO usuario, String iP) {
		super();
		this.usuario = usuario;
		IP = iP;
	}

	private UsuarioDAO usuario;
	private String IP;
	
	@Override
	public void apagarTudo() {
		if (UsuarioUtils.ehAdministrador(this.IP)) {
			usuario.apagarTudo();
		}
	}

	@Override
	public void inserir(Usuario u) {
		if(UsuarioUtils.ehAdministrador(this.IP)) {
			usuario.inserir(u);
		}

	}

	@Override
	public Usuario obter(String username) {
		if(UsuarioUtils.ehAdministrador(this.IP)) {
			return usuario.obter(username);
			
		}
		
		return null;
	}

}
