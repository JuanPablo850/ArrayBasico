public class Ex02 {

    public static void main(String[] args) throws Exception {

        //Soma dos elementos
        //Crie um array com 4 números e mostre a soma total dos valores.

        int [] numeros = {10, 20, 30, 40};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];         
        }

        System.out.println("A soma dos valores é: " + soma);


    }
}
