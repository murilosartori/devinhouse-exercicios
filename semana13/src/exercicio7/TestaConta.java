package exercicio7;

public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.nomeDoTitular = "Nome do Titular";
		conta.numero = 1;
		conta.agencia = 2;
		conta.saldo = 100;
		conta.limite = 50;
		conta.dataAbertura = "19/03/2021";
		System.out.println(String.format("A conta � a de n�mero: %d%n", conta.getIdentificador()));
		
		conta.depositar(300);
		System.out.println(String.format("O saldo em conta � %.2f%n", conta.verificaSaldo()));
		
		conta.sacar(126.53D);
		System.out.println(String.format("O saldo em conta � %.2f%n%n", conta.verificaSaldo()));
		
		System.out.println(conta.recuperaDadosParaImpressao());
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.nomeDoTitular = "Nome do Titular";
		conta2.numero = 1;
		conta2.agencia = 2;
		conta2.saldo = 100;
		conta2.limite = 50;
		conta2.dataAbertura = "19/03/2021";
		System.out.println(String.format("%nA conta2 � a de n�mero: %d%n", conta2.getIdentificador()));
	}

}
