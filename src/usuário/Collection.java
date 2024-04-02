package usuário;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Collection {
	
	static List<Usuario> list = new ArrayList<Usuario>();	//instancia do list como lista global para poder usar no método sem parametro
	
	public static void main(String[] args) {
		
		Collection test = new Collection(); //instanciar um objeto dentro da própria classe para poder usar o metodo remover
		//INICIALIZAÇÃO DOS USUARIOS
		Usuario jade = new Usuario(31, "Jade", "1230");
		Usuario ruby = new Usuario(32, "Ruby", "1230");
		Usuario crystal = new Usuario(12, "Crystal", "1230");
		
		
		//COLOCANDO OS USUARIOS NA LISTA
		test.list.add(jade);
		test.list.add(ruby);
		test.list.add(crystal);
		for (Usuario usuario : test.list) {
			System.out.println("nome: " + usuario.getNome());
		}
		
		//ORDENANDO A LISTA CONFORME O ID
		System.out.println("Ordenando...");
		Collections.sort(list);
		for (Usuario usuario : test.list) {
			System.out.println("nome: " + usuario.getNome() + "\tId:" + usuario.getId());
		}
	
		
		//PROCURAR UM NOME NA LISTA E REMOVE
		List<Usuario> listaAtualizada = new ArrayList<Usuario>();
		listaAtualizada = test.remover("Crystal");

		for (Usuario user : listaAtualizada) {
			System.out.println(user.getNome());
		}
		
		//MAPA
				Map mapa = new HashMap();
				mapa.put(1, jade);
				mapa.put(2, crystal);
				mapa.put(3, ruby);

				System.out.println("mapa");
				
				for(int i=1; i<=mapa.size(); i++) {
				Object objeto = mapa.get(i);
				Usuario usuario = (Usuario)objeto;
				System.out.println("usuario: " + usuario.getNome());
				}
				System.out.println("--------------------");
	}
	//METODO PARA PROCURAR ALGUM NOME NA LISTA
	public List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}else {
				System.out.println("registro não localizado");
			}
		}
		return list;
	}

}
