
public class Main {

	public static void main(String[] args) {
		Cliente Camila = new Cliente();
		Camila.setNome("Camila");
		
		Conta cc = new ContaCorrente(Camila);
		iConta poupanca = new ContaPoupança(Camila); 
		cc.depositar(100);						
		cc.transferir(10, poupanca);            
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
