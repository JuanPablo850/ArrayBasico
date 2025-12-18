import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
        final int tam=5;

        int[] num=new int[tam];
        int[] numeros={10,20,30,40,50,60,70,80,90,100};

        num[0]=10;
        num[1]=5;
        num[2]=15;
        num[3]=0;
        num[4]=8;

        for(int i=0;i<numeros.length;i++){
            System.out.printf("%d - ",numeros[i]);
        }
         */

        final int tam=5;
        char[] gabarito={'a','a','d','b','c'};
        char[] respostas=new char[tam];
        int nota=0;
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            System.out.printf("Informe a resposta %d: ",i);
            respostas[i]=scan.nextLine().charAt(0);            
        }

        for(int i = 0; i < tam; i++){
            if(respostas[i]==gabarito[i]){
                nota++;
            }
        }

        System.out.printf("Nota do aluno = %d",nota);
    }
}
