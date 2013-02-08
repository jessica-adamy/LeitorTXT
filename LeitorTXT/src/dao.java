import java.util.ArrayList;
import java.util.List;

public class dao {

	public static List<Cliente> clientes = new ArrayList<>();
	
	public void salvar(Cliente cliente) {
		dao.clientes.add(cliente);
	}
}