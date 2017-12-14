package principal;
import dominio.*;

public class Principal {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Funcionario f1 = new Funcionario();
		Altomovel a1 = new Altomovel();
		
		Locacao aluguel1 = new Locacao();
		aluguel1.informarAlromovel(a1);
		aluguel1.informarCliente(c1);
		aluguel1.informarFuncionario(f1);
		aluguel1.setId(1);
		
	}
	
}
