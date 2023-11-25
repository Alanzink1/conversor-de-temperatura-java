public class Main {
    public static void main(String[] args){

        double temperatura = 24.1;
        double tempConvertida = (temperatura * 1.8) + 32;
        System.out.println("""
                A temperatura de %.1f graus celsius,
                em fahrenheit, ficaria %f graus fahrenheit!
                """.formatted(temperatura, tempConvertida));

        int tempConvertInt = (int) tempConvertida;
        System.out.println("""
                A temperatura de %.2f graus celsius,
                em fahrenheit inteiro, ficaria %d graus fahrenheit!
                """.formatted(temperatura, tempConvertInt));
}
}