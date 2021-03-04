import java.util.Scanner;

public class Sopa_da_Cuca {

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String entrada1 = sc.nextLine();
            String entrada2 = sc.nextLine();

            String [] proporcao = entrada1.split(" ");
            String [] frutas = entrada2.split("");

            int abacaxi = 0;
            int banana = 0;
            int goiaba = 0;
            int maracuja = 0;

            //Conta quantas frutas de cada tipo existem
            for(int j = 0; j < frutas.length; j++){
                if(frutas[j].equals("a")) abacaxi++;
                if(frutas[j].equals("b")) banana++;
                if(frutas[j].equals("g")) goiaba++;
                if(frutas[j].equals("m")) maracuja++;
            }

            //Verifica se existe um numero minimo de frutas para realizar pelo menos uma receita
            boolean temAbacaxi = false;
            boolean temBanana = false;
            boolean temGoiaba = false;
            boolean temMaracuja = false;
            if(Integer.parseInt(proporcao[0]) <= abacaxi) temAbacaxi = true;
            if(Integer.parseInt(proporcao[1]) <= banana) temBanana = true;
            if(Integer.parseInt(proporcao[2]) <= goiaba) temGoiaba = true;
            if(Integer.parseInt(proporcao[3]) <= maracuja) temMaracuja = true;

            /////////CALCULO DO NUMERO DE RECEITAS///////////
            if(temAbacaxi && temBanana && temGoiaba &&temMaracuja) {


                //Encontra o menor divisor comum para a proporcao
                int menorProp = 0;

                while(menorProp == 0){ //inicializa a variavel menorProp
                    if(Integer.parseInt(proporcao[0]) != 0) menorProp = abacaxi / Integer.parseInt(proporcao[0]);
                    if(Integer.parseInt(proporcao[1]) != 0) menorProp = banana / Integer.parseInt(proporcao[1]);
                    if(Integer.parseInt(proporcao[2]) != 0) menorProp = goiaba / Integer.parseInt(proporcao[2]);
                    if(Integer.parseInt(proporcao[3]) != 0) menorProp = maracuja / Integer.parseInt(proporcao[3]);
                }

                //Busca o menor divisor comum
                if(Integer.parseInt(proporcao[0]) !=0 && menorProp > (abacaxi / Integer.parseInt(proporcao[0]))) menorProp = abacaxi / Integer.parseInt(proporcao[0]);
                if(Integer.parseInt(proporcao[1]) != 0 && menorProp > (banana / Integer.parseInt(proporcao[1]))) menorProp = banana / Integer.parseInt(proporcao[1]);
                if(Integer.parseInt(proporcao[2]) != 0 && menorProp > (goiaba / Integer.parseInt(proporcao[2]))) menorProp = goiaba / Integer.parseInt(proporcao[2]);
                if(Integer.parseInt(proporcao[3]) != 0 && menorProp > (maracuja / Integer.parseInt(proporcao[3]))) menorProp = maracuja / Integer.parseInt(proporcao[3]);

                System.out.println(menorProp);
            }

            //Nao eh possivel fazer nenhuma receita
            else {
                System.out.println(0);
            }
        }
    }
}
