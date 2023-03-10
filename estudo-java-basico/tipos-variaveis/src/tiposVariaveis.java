
public class tiposVariaveis {
   public static void main(String[] args) {
      System.out.println("Tipos de variáveis");

      short numeroCurto = 1;   /* short até 32.768 */
      int numeroNormal = numeroCurto; /* Integer 2.147.483.648  */
      short numeroCurto2 = (short) numeroNormal; /* Precisou converter para short  */
    
       int numero = 1;
       numero = 2;
       System.out.println(numero);

       String nome_completo = "Aretha Lima Giacon";
       System.out.println(nome_completo);
   }

}