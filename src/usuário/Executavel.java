package usuário;

public class Executavel {

	public static void main(String[] args) {

		Usuario usuario[] = new Usuario[2];
		usuario[0] = new Usuario(123,"Jade", "1230" );
		usuario[1] = new Usuario(321,"Joao", "3210");
		
		for(int i =0; i< usuario.length; i++) {
			System.out.println(usuario[i].getNome());
		}
	}

}
