package primeirodemarco;

public class Especifico {

	public static boolean procurarNumero(int[] sequencia, int esp, int i, int t) {
		if (sequencia[i] != esp && i < t) {
			return procurarNumero(sequencia, esp, i + 1, t);
		} else if (sequencia[i] != esp && i >= t) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		int[] sequencia = { 6, 5, 3, 4 };
		System.out.println(procurarNumero(sequencia, 6, 0, 3));
	}

}
