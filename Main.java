import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		
		int idadeInformada;
		final int iJovem = 17;
		final int iVelho = 60;

    System.out.println("Digite sua idade");
		Scanner i = new Scanner(System.in);
		idadeInformada = i.nextInt();

		if (idadeInformada <= iJovem) {
			System.out.println("A idade fornecida é uma pessoa jovem.");
		}else{
			if(idadeInformada > 18 && idadeInformada <= 60) {
			System.out.println("A idade fornecida é uma pessoa adulta.");
			}
			else{}
				if(idadeInformada < 18 || idadeInformada > iVelho) {
			System.out.println("A idade fornecida é uma pessoa idosa.");
			}
		}
  }
}