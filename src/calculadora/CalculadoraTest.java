package calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Divisao divisao = new Divisao();
		Multiplicacao multiplicacao = new Multiplicacao();

		// Teste Soma
		// Cenario de teste 1: Soma de dois valores
		int somatoria = soma.somar(3, 7);
		System.out.println(somatoria);

		// Cenario de teste 2: Soma de dois valores, sendo um zero
		somatoria = soma.somar(3, 0);
		System.out.println(somatoria);

		// Cenario de teste 3: Soma de dois valores, ambos zero
		somatoria = soma.somar(0, 0);
		System.out.println(somatoria);

		// Cenario de teste 4: Soma de dois valores, sendo um negativo
		somatoria = soma.somar(3, -1);
		System.out.println(somatoria);

		System.out.println("/////////SUBTRAÇÃO///////////");

		// Teste Subtração
		// Cenario de teste 1: Subtração de dois valores
		int subtrai = subtracao.subtrair(3, 7);
		System.out.println(subtrai);

		// Cenario de teste 2: Subtração de dois valores, sendo um zero
		subtrai = subtracao.subtrair(3, 0);
		System.out.println(subtrai);

		// Cenario de teste 3: Subtração de dois valores, ambos zero
		subtrai = subtracao.subtrair(0, 0);
		System.out.println(subtrai);

		// Cenario de teste 4: Subtração de dois valores, sendo um negativo
		subtrai = subtracao.subtrair(3, -1);
		System.out.println(subtrai);

		System.out.println("/////////MULTIPLICAÇÃO///////////");

		// Teste Multiplicação
		// Cenario de teste 1: Multiplicação de dois valores
		int multiplica = multiplicacao.multiplicar(3, 7);
		System.out.println(multiplica);

		// Cenario de teste 2: Multiplicação de dois valores, sendo um zero
		multiplica = multiplicacao.multiplicar(3, 0);
		System.out.println(multiplica);

		// Cenario de teste 3: Multiplicação de dois valores, ambos zero
		multiplica = multiplicacao.multiplicar(0, 0);
		System.out.println(multiplica);

		// Cenario de teste 4: Multiplicação de dois valores, sendo um negativo
		multiplica = multiplicacao.multiplicar(3, -1);
		System.out.println(multiplica);

		System.out.println("/////////DIVISÃO///////////");

		// Teste Divisão
		// Cenario de teste 1: Divisão de dois valores
		int dividi = divisao.dividir(7, 3);
		System.out.println(dividi);

		// Cenario de teste 2: Divisão de dois valores, sendo um zero
//		dividi = divisao.dividir(3, 0);
//		System.out.println(dividi);
		// O mesmo retornará erro, pois não é possivel dividir um numero inteiro por
		// zero
		// Soluções: Inserir um Exception na qual poderá retornar um resultado zero, ou
		// inserir um erro informando que um dos valores é zero.

		// Cenario de teste 3: Divisão de dois valores, ambos zero
//		dividi = divisao.dividir(0, 0);
//		System.out.println(dividi);
		// Resultado: Retornará erro, pois não é possivel dividir zero por zero.
		// Solução: Retornar uma Exception na qual informará um erro na operação por
		// conta dos valores serem 0

		// Cenario de teste 4: Divisão de dois valores, sendo um negativo
		dividi = divisao.dividir(200, -2);
		System.out.println(dividi);

	}

}
