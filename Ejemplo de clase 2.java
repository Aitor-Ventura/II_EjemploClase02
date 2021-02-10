public class Excercise {
    public static int sumar(int[] v1, int[] v2) {
        // Añada aquí el código necesario para completar el método
        int a = 0, b = 0;
        for (int i = 0; i < v1.length; i++){
            if (v1[i] % 2 == 1){
                a += v1[i];
            }
            if (v2[i] % 2 == 1){
                b += v2[i];
            }
        }
        return a - b;
    }
}