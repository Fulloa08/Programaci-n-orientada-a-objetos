public class Main {
    public static void main(String[] args){
        String resultado =invertirpalabra("Hola Mundo");
        System.out.println(resultado);


    }
    public  static String invertirpalabra(String palabra) {
        String invertida = "";
        for(int recorrer = palabra.length() - 1; recorrer >= 0; recorrer-- ) {
            char actual = palabra.charAt(recorrer);
            invertida = invertida + actual;
        }
        return invertida;
    }

}