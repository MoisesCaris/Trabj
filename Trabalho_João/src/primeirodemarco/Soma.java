package primeirodemarco;

public class Soma {
	public static int soma(int[] vetor, int i) {
        if (i == 0) {
            return vetor[i];
        }
        return vetor[i] + soma(vetor, i - 1);
    }

	public static void main(String[] args) {
		int[] vetor = { 2, 6, 3, 8 };
		System.out.println(soma(vetor,3));
	}
}
