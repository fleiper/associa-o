package assosiação;

public class Principal {

	public static void main(String[] args) {
		Universidade univ = new Universidade ("USP");
		Estudante fellipe = new Estudante ("fellipe");
		
		System.out.println("Estudante "+fellipe.getNome()+"/nUniversidade "+univ.getNome());
		
		
	}

}
