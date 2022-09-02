package EmpregadoDaFaculdade;

public class EmpregadoDaFaculdade {
		
			private String nome;
			private double salario;
			private int horasAula;
			double bonus;
			EmpregadoDaFaculdade(String nome, double salario, int horasAula){
				this.nome = nome;
				this.salario = salario;
				this.horasAula = horasAula;
				
			}
			double getGastos(){
				bonus = 40*horasAula;
			return this.salario + bonus;
			}
			String getInfo(){
			return "nome:" + this.nome + " com salário " + getGastos();
			}
			}






