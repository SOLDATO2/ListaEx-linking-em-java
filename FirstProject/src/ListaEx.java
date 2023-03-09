import java.util.Scanner;

public class ListaEx {

    public static void RodarEx01(){
        Scanner leitor = new Scanner(System.in);
        int java[] = new int[5];

        for(int x = 0; x < java.length; x++){
            System.out.println("Digite um numero para o espaço "+(x+1)+ " do vetor: ");
            java[x] = leitor.nextInt();
        }

        for(int y = 0; y < java.length; y++){
            if(java[y] > 0){
                System.out.println("Positivo");
            } else if (java[y] < 0){
                System.out.println("Negativo");
            } else if(java[y] == 0){
                System.out.println("Zero");
            }
        }

        leitor.close();
    }

    public static void RodarEx02(){

        float media = 0;

        Scanner leitor2 = new Scanner(System.in);

        float java2[] = new float[5];

        for(int x = 0; x < java2.length; x++){
            System.out.println("Digite um numero para o espaço "+(x+1)+ " do vetor: ");
            java2[x] = leitor2.nextFloat();
            media= java2[x] + media;
        }

        media = media/java2.length;

        System.out.printf("Média: %.2f\n", (media));

        for(int y = 0; y < java2.length; y++){
            if(java2[y] > media){
                System.out.printf("Numero no espaço %d é maior que a média %f\n", (y+1), media);
            }
        }

        leitor2.close();
    }
}
