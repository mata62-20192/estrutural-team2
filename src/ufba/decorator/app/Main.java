package ufba.decorator.app;

import ufba.decorator.lib.Usuario;
import ufba.decorator.lib.UsuarioArquivoDAO;
import ufba.decorator.lib.UsuarioMemoriaDAO;

public class Main {
	public static void main(String[] args) {
		
		Usuario um = new Usuario();
		um.setEmail("joao@yahoo.com");
		um.setNomeCompleto("Rodrigo Alves");
		um.setUsername("José");
		
		Usuario dois = new Usuario();
		dois.setEmail("diego.silva@bol.com");
		dois.setNomeCompleto("Rogério Santos");
		dois.setUsername("Felipe");
		
		Usuario tres = new Usuario();
		tres.setEmail("diego,silva@bol,,,,,com");
		tres.setNomeCompleto("Larissa,,,,Hora");
		tres.setUsername("W,i,l,l,i,a,m");
		
		UsuarioDAOAutenticacaoDecorator teste1 = new UsuarioDAOAutenticacaoDecorator(new UsuarioArquivoDAO(),"10.10.154.18");
		UsuarioDAOAutenticacaoDecorator teste2 = new UsuarioDAOAutenticacaoDecorator(new UsuarioArquivoDAO(),"192.168.0.100");
		
		teste1.inserir(um);
		System.out.println(teste1.obter("José"));
		
		teste2.inserir(dois);
		System.out.println(teste2.obter("Felipe"));
		
		UsuarioDAOFiltroDecorator teste3 = new UsuarioDAOFiltroDecorator(new UsuarioMemoriaDAO());
		
		teste3.inserir(um);
		teste3.inserir(tres);
		System.out.println(teste3.obter("W,i,l,l,i,a,m"));
		System.out.println(teste3.obter("William"));
	}
}
