public class relacionais {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

       boolean simNao = numero1 == numero2;
       System.out.println(" O número 1 é igual ao número 2 ?" + (simNao));

       if(numero1 > numero2)
	    System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

    }
}
