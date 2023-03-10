public class operadores {
    public static void main(String[] args) {

        //classe Operadores.java

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //  para saber o resto da divisão, utilizado para saber se o número é par,exemplo.
        double resultado = (10 * 7) + (20/4);
        
        System.out.println(modulo);

        //concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

            
        int numero = 5;
        //Imprimindo o numero negativo
        System.out.println(- numero);

        // Operador condicional If/Else
          
            int a, b;
            a = 5;
            b = 6;

            if(a==b)
            System.out.println("True");
            else
            System.out.println("False");

            /* Operador condicional If/Else

            String resultado ="";
            if(a==b)
                resultado = "Verdadeiro";
             else
                resultado = "Falso";
             System.out.println(resultado);
             */

            //Operador condicional Ternário 

            String valor = (a==b) ? "verdadeiro" : "falso";
            System.out.println(valor);

    }

}
