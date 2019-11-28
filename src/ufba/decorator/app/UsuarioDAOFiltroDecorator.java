package ufba.decorator.app;

import ufba.decorator.lib.Usuario;
import ufba.decorator.lib.UsuarioDAO;

public class UsuarioDAOFiltroDecorator implements UsuarioDAO {
	
	public UsuarioDAOFiltroDecorator(UsuarioDAO padrao) {
		super();
		this.padrao = padrao;
	}

	public UsuarioDAO padrao;

	@Override
	public void apagarTudo() {
		padrao.apagarTudo();
		
	}

	@Override
	public void inserir(Usuario u) {
		padrao.inserir(UsuarioUtils.filtraEntrada(u));

	}

	@Override
	public Usuario obter(String username) {
		return padrao.obter(username);
		
	}

}
