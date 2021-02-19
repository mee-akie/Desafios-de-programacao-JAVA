import java.util.Scanner;

public class O_Mensageiro {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        while(sc.hasNextLine()){    //enquanto houver uma entrada

            String entrada = sc.nextLine();

            //Nao existe destinatario
            if(!(entrada.contains("[") && entrada.contains("]"))){
                System.out.println("...");
            }

            //Existe destinatario
            else {
                String destinatario = "";

                String[] separaEntrada = entrada.split(""); //arranjo com os caracteres da String entrada

                int i = 0;
                while (i < separaEntrada.length) {  //i percorre todas as posicoes do arranjo separaEntrada
                    if (separaEntrada[i].equals("[")) {
                        i++;
                        while (!separaEntrada[i].equals("]")) {
                            destinatario = destinatario + separaEntrada[i]; //pega todos os char dentro do []
                            i++;
                        }
                    }
                    i++;
                }

                destinatario = destinatario.toLowerCase();  //destinatario fica com letra minuscula

                if(destinatario.equals("oxufala")){     //se o destinatario for Oxufala
                    System.out.println("...");
                }
                else {
                    System.out.println(entrada);
                }
            }
        }
    }
}
