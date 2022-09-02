package Questao3;

public class Nota {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("matheus",123, 40, 30, 50,  "ADS", 3);
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarRecuperacao());
		aluno1.alteraNotaAE(1313);
		System.out.println("Altera nota AE");
		System.out.println(aluno1.avaliarRecuperacao());

	}

}
