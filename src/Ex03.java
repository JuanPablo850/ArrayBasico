public class Ex03 {


     public static void main(String[] args) throws Exception {


        //Maior número do array
        //Crie um array com 6 números e mostre qual é o maior valor.

        int [] numeros = {10,20,30,40,10,60,50};
        int maior = 0;

        for(int i = 0; i < numeros.length; i++){
            if(maior < numeros[i]) {
                maior = numeros[i];
            }
            }

        System.out.printf("O maior número é: %d", maior);

     }
}
