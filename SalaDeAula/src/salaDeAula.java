import java.util.Scanner;

public class salaDeAula {
	
	private static Turma turma;
	private static Scanner entrada;

	public static void main(String[] args) {
	
		
				while(opcaoSaladeaula());
				System.out.println("Tchau!");
			}

			private static boolean opcaoSaladeaula() {

			String menu = "";
			
			menu += "\n1 -  Turma                    ";
			menu += "\n2 -  Chamada                  ";
			menu += "\n3 -  Avaliações               ";
			menu += "\n4 -  Média Alunos             ";
			menu += "\n                              ";
			menu += "\n5 -  Sair                     ";
			menu += "\n                              ";
			menu += "\n ___ Escolha:                 ";
			menu += "\n                              ";
		

			while (true) {

				switch (teclado(menu).charAt(0)) {
				case '1':
					turma = new Turma("Pogramação I");
					break;
				case '2':
					if (turma == null) {
						System.out.println("Crie uma turma primeiro!");
						
					} else {
						Aula aula = new Aula("10/05/2018", "Aula de Orientação objetos");
						aula.chamadaAlunos(turma.getAlunos());
						aula.listaPresenca(turma.getAlunos());
					}
					
					break;
				case '3':
					turma.avaliacoes();
					 
					break;
				case '4':
					
					
					break;
					
				case '5':
					return false;

				default:
					System.out.println("...Erro. Opção não válida.");
				}
				
				return true;
				

			}

		}

		public static String teclado(String str) {
			entrada = new Scanner(System.in);
			System.out.print(str);
			return entrada.nextLine();
		}

	}


