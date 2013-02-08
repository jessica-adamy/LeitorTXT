import java.util.Date;


public class Cliente {

	private String nome;
	private String sexo;
	private int idade;
	private Date data_nascimento;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String sexo, int idade, Date data_nascimento) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.data_nascimento = data_nascimento;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\n Sexo: " + getSexo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
}