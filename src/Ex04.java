public class Ex04 {

    public static void main(String[] args) throws Exception {

        //Média dos valores
        //Crie um array com 5 números e calcule a média.

        int[] numeros = {10,10,10,10,10};
        int soma = 0;
        int media;

        for (int i = 0; i < numeros.length; i++) {
               soma += numeros[i];
        }
        
        media = soma / numeros.length;
        System.out.println("A média é igual a: " + media);
    }   
}
