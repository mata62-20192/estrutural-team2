package ufba.decorator.lib;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class UsuarioArquivoDAO implements UsuarioDAO {
	List<Usuario> usuarios = new ArrayList<Usuario>();
	String filename = "usuarios.txt";
	
	public void apagarTudo() {
		try {
		    PrintWriter writer = new PrintWriter(filename, "UTF-8");
			writer.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void inserir(Usuario u) {
		try {
		    PrintWriter writer = new PrintWriter(filename, "UTF-8");
			writer.println(u.toString());
			writer.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public Usuario obter(String username) {
		Usuario ret = null;
		
		try {
			InputStream fis = new FileInputStream(filename);
			InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
			BufferedReader br = new BufferedReader(isr);
			String line;
			
			while ((line = br.readLine()) != null) {
				Usuario u = Usuario.fromString(line);
				if (u.username.equals(username)) {
					ret = u;
					break;
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return ret;
	}
}