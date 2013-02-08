import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Principal {

	private dao dao;
	
	private FileReader fr;
	private BufferedReader br;
	
	private String[] cabecalho;
	
	private void ler() {
		File file = new File("src/cliente.txt");
		try {
			// Abrir
			dao = new dao();
			fr = new FileReader(file); 
			br = new BufferedReader(fr);
	
			// Armazena Cabeçalho
			cabecalho = br.readLine().replace("\"", "").split(";");
			
			// Ler
			while (br.ready()) {
				String[] dados = br.readLine().split(";");
				dao.salvar(new Cliente(dados[2], dados[5], 21, new Date()));
			}
			
//			for (int i = 0; i < cabecalho.length; i++) {
//				System.out.println(cabecalho[i]);
//			}
			
			for (Cliente c : dao.clientes) {
				System.out.println(c.toString());
			}
			
			// Fechar
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não foi encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo" + file);
		} 
	}

	public static void main(String[] args) {
		new Principal().ler();
	}
}