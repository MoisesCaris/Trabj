package primeirodemarco;

public class Inverso {
	public static String inverso(String palavra) {
		if (palavra.length() <= 1) {
			return palavra;
		} else {
			return inverso(palavra.substring(1)) + palavra.charAt(0);
		}
	}

	public static void main(String[] args) {
		String palavra = "Teste";
		System.out.println(inverso(palavra));
	}
}