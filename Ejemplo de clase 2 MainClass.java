import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Crea vector1 leyendo sus elementos
        int[] vector1 = Internal.loadIntArray(input); 
        // Crea vector2 leyendo sus elementos
        int[] vector2 = Internal.loadIntArray(input); 

        // Proceso y muestra del resultado
        System.out.print("El resultado es: ");
        int res =  Excercise.sumar(vector1, vector2);
        System.out.println(res);
    }
}