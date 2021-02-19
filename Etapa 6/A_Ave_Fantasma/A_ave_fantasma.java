import java.util.Scanner;

public class A_ave_fantasma {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String entrada = sc.nextLine();

            if(entrada.equals("XIU!")){ //finaliza o programa
                return;
            }

            else{
                String [] separaEntrada = entrada.split("");

                String cantos = ""; //guarda TODOS os cantos

                int i = 0;

                //Pega os cantos começados com F e terminados com I e junta-os na String cantos:
                while(i < separaEntrada.length){

                    if(separaEntrada[i].toLowerCase().equals("f")){
                        cantos = cantos + separaEntrada[i];
                        i++;

                        while((i < separaEntrada.length) && (!separaEntrada[i].toLowerCase().equals("i"))){
                            cantos = cantos + separaEntrada[i];
                            i++;
                        }

                        if(i < separaEntrada.length) {
                            if (separaEntrada[i].toLowerCase().equals("i")) {
                                cantos = cantos + separaEntrada[i];
                            }
                        }
                    }

                    i++;
                }

                int contCantos = 0; //conta os cantos VALIDOS
                String aux = "";    //ira guardar um canto por vez

                String [] separaCantos = cantos.split("");

                String alfabeto = "abcdefghjklmnpqrstuvwxyz";  //alfabeto sem a letra O e I
                String [] letras = alfabeto.split("");
                boolean naoEhCanto = false; //eh canto

                int i1 = 0;
                int i2 = 0;

                while(i1 < separaCantos.length){

                    if(separaCantos[i1].toLowerCase().equals("f")){
                        i2++;

                        //guarda os caracteres entre as letras F e I
                        while(i2 < separaCantos.length && !separaCantos[i2].toLowerCase().equals("i")){
                            aux = aux + separaCantos[i2].toLowerCase();
                            i2++;
                        }

                        //se o canto possui a letra I no final, entao acrescenta a letra I no final de AUX
                        if(i2 < separaCantos.length && separaCantos[i2].toLowerCase().equals("i")){
                            aux = aux + separaCantos[i2].toLowerCase();
                        }

                        int j = 0;
                        while(j < letras.length) {
                            if (aux.contains(letras[j])) {  //se existe uma letra diferente do "O" no meio da String "foi"
                                naoEhCanto = true;
                            }
                            j++;
                        }

                        //se for um canto VALIDO
                        if(naoEhCanto == false && aux.contains("oi")){
                            contCantos++;
                        }
                    }

                    aux = "";
                    naoEhCanto = false;
                    i1++;
                    i2 = i1;
                }

                System.out.println(contCantos);
            }
        }
    }
}
