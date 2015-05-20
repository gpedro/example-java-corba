import CalculadoraApp.CalculadoraPOA;

public class CalculadoraHP extends CalculadoraPOA {

	@Override
	public int somar(int n1, int n2) {
		return (n1 + n2);
	}

	@Override
	public int substrair(int n1, int n2) {
		return (n1 - n2);
	}

	@Override
	public int multiplicar(int n1, int n2) {
		return (n1 * n2);
	}

	@Override
	public double dividir(int n1, int n2) {
		return (n1 / n2);
	}

}
