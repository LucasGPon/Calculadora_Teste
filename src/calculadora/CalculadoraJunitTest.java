package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraJunitTest {
	// Declarando atributos aritimeticos
	Soma soma = new Soma();
	Subtracao subtracao = new Subtracao();
	Divisao divisao = new Divisao();
	Multiplicacao multiplicacao = new Multiplicacao();

	//Declarando atributos para armazenar resultados
	int somatoria;
	int subtrai;
	int multiplica;
	int dividi;

	// Teste Soma
	// Cenario de teste 1: Soma de dois valores
	@Test
	@SuppressWarnings("deprecation")
	public void SomarDoisNumerosPositivos() {
		somatoria = soma.somar(3, 7);
		Assert.assertEquals(10, somatoria);
	}

	// Cenario de teste 2: Soma de dois valores, sendo um zero
	@Test
	@SuppressWarnings("deprecation")
	public void SomarDoisNumerosSendoUmZero() {
		somatoria = soma.somar(3, 0);
		Assert.assertEquals(3, somatoria);
	}

	// Cenario de teste 3: Soma de dois valores, ambos zero
	@Test
	@SuppressWarnings("deprecation")
	public void SomarDoisNumerosZero() {
		somatoria = soma.somar(0, 0);
		Assert.assertEquals(0, somatoria);
	}

	// Cenario de teste 4: Soma de dois valores, sendo um negativo
	@Test
	@SuppressWarnings("deprecation")
	public void SomarDoisNumerosSendoUmNegativo() {
		somatoria = soma.somar(3, -1);
		Assert.assertEquals(2, somatoria);
	}

	// Teste Subtração
	// Cenario de teste 1: Subtração de dois valores
	@Test
	@SuppressWarnings("deprecation")
	public void SubtrairDoisNumeros() {
		subtrai = subtracao.subtrair(3, 7);
		Assert.assertEquals(-4, subtrai);
	}

	// Cenario de teste 2: Subtração de dois valores, sendo um zero
	@Test
	@SuppressWarnings("deprecation")
	public void SubtrairDoisNumerosSendoUmZero() {
		subtrai = subtracao.subtrair(3, 0);
		Assert.assertEquals(3, subtrai);
	}

	// Cenario de teste 3: Subtração de dois valores, ambos zero
	@Test
	@SuppressWarnings("deprecation")
	public void SubtrairDoisNumerosZero() {
		subtrai = subtracao.subtrair(0, 0);
		Assert.assertEquals(0, subtrai);
	}

	// Cenario de teste 4: Subtração de dois valores, sendo um negativo
	@Test
	@SuppressWarnings("deprecation")
	public void SubtrairDoisNumerosSendoUmNegativo() {
		subtrai = subtracao.subtrair(3, -7);
		Assert.assertEquals(10, subtrai);
	}

	// Teste Multiplicação
	// Cenario de teste 1: Multiplicação de dois valores
	@Test
	@SuppressWarnings("deprecation")
	public void MultiplicarDoisNumeros() {
		multiplica = multiplicacao.multiplicar(3, 7);
		Assert.assertEquals(21, multiplica);
	}

	// Cenario de teste 2: Multiplicação de dois valores, sendo um zero
	@Test
	@SuppressWarnings("deprecation")
	public void MultiplicarDoisNumerosSendoUmZero() {
		multiplica = multiplicacao.multiplicar(3, 0);
		Assert.assertEquals(0, multiplica);
	}

	// Cenario de teste 3: Multiplicação de dois valores, ambos zero
	@Test
	@SuppressWarnings("deprecation")
	public void MultiplicarDoisNumerosZero() {
		multiplica = multiplicacao.multiplicar(0, 0);
		Assert.assertEquals(0, multiplica);
	}

	// Cenario de teste 4: Multiplicação de dois valores, sendo um negativo
	@Test
	@SuppressWarnings("deprecation")
	public void MultiplicarDoisNumerosSendoUmNegativo() {
		multiplica = multiplicacao.multiplicar(3, -1);
		Assert.assertEquals(-3, multiplica);
	}

	// Teste Divisão
	// Cenario de teste 1: Divisão de dois valores
	@Test
	@SuppressWarnings("deprecation")
	public void DividirDoisNumeros() {
		dividi = divisao.dividir(8, 2);
		Assert.assertEquals(4, dividi);
	}

	// Cenario de teste 2: Divisão de dois valores, sendo um zero
	// Resultado: não é possivel dividir um numero por zero
	// Solução: Inserir um Exception na qual informará a impossibilidade de dividir
	// numeros por zero
//	@Test
//	@SuppressWarnings("deprecation")
//	public void DividirDoisNumerosSendoUmZero() {
//		dividi = divisao.dividir(7, 0);
//		Assert.assertEquals(0, dividi);
//	}

	// Cenario de teste 3: Divisão de dois valores, ambos zero
	// Resultado: não é possivel dividir dois numeros por zero
	// Solução: Inserir um Exception na qual informará a impossibilidade de dividir
	// numeros por zero
//	@Test
//	@SuppressWarnings("deprecation")
//	public void DividirDoisNumerosZero() {
//		dividi = divisao.dividir(0, 0);
//		Assert.assertEquals(0, dividi);
//	}

	// Cenario de teste 4: Divisão de dois valores, sendo um negativo
	@Test
	@SuppressWarnings("deprecation")
	public void DividirDoisNumerosSendoUmNegativo() {
		dividi = divisao.dividir(7, -1);
		Assert.assertEquals(-7, dividi);
	}
}
