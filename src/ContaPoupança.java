
public class ContaPoupanša extends Conta {
	

	public ContaPoupanša(Cliente cliente){
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanša ===");
		super.imprimirInfosComuns();
	}
}