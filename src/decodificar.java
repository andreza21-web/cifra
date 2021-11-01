import java.util.Scanner;

public class decodificar {
 public static void main(String[] args) throws Exception {
        Boolean menu = false;
		int  numero;
		int cifra;
      
		System.out.println("Digite sua mensagem:  ");
		
		Scanner input = new Scanner(System.in);
		String msg = input.nextLine();
		char[] caracteres = msg.toCharArray();

		System.out.println("Digite o valor da cifra: ");
		 cifra = input.nextInt();

		for (int i = 0; i < caracteres.length; i++) {
			int ascii = (int) caracteres[i] - cifra;
			System.out.print((char) ascii);
		}
        
		System.out.println("");
		System.out.println("QUAL FOI A CIFRA CRIPTOGRÁFICA UTILIZADA PARA CRIPTOGRAFAR OS DADOS? ");
		System.out.println("1. Cifra de Cesar");
		System.out.println("2. ROT13");
		System.out.println("3. ROT47");
		System.out.println("4. Cifra de Vigenère");
		System.out.println("5. Cifra de Gronsfeld");
          
            while (!menu)
            {
				do
                {
					System.out.println("Digite a resposta: ");
					numero = input.nextInt();
                } while( numero < 1 || numero > 5);

                switch (numero)
                {
                    case 1:
					System.out.println("Resposta correta, Parabéns!");
                    menu = true;	
                        break;

                    case 2:
                    System.out.println("NÃO, TENTE NOVAMENTE");
                        break;

                    case 3:
                    System.out.println("NÃO, TENTE NOVAMENTE");
                        break;

                    case 4:
                    System.out.println("NÃO, TENTE NOVAMENTE");
                        break;

                    case 5:
                    System.out.println("NÃO, TENTE NOVAMENTE");
                        break;
                }
            }

        input.close();

	}
}
