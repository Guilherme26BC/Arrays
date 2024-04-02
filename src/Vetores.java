
public class Vetores {

	public static void main(String[] args) {
		
		int[] x = new int[10];
		lerVetor(x);
		imprimirVetor(x);
		imprimirVetorForEach(x);
	}
	public static void lerVetor(int[] x) {
		for(int i =0; i< x.length; i++) {
			x[i] = 2*i;
		}
	}
	public static void imprimirVetor(int[]x) {
		for(int i=0; i< x.length;i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
	}
	
	public static void imprimirVetorForEach(int[] x) {
		for(int numero: x) {
			System.out.print(numero + "\t");
		}
	}
	
	
}
