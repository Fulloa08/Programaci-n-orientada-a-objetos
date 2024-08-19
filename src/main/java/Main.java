

public class Main {
    public static void main(String[] args) {
        String vinilos[][] = new String[100][3];

        agregarVinilo(vinilos, "Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "Iron Maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron Maiden", "The number of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(vinilos, "AC-DC", "Highway to Hell", "1979");
        agregarVinilo(vinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(vinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(vinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(vinilos, "Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");

        System.out.println("Espacio máximo colección: " + vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista: " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        buscarArtista(vinilos, artista);
        mostrarColeccion(vinilos);
    }

    public static int totalVinilos(String[][] m) {
        int total = 0;

        for (int i = 0; i < 100; i++) {
            if (m[i][0] != null) {
                total++;
            }

        }
        return total;
    }


    public static void agregarVinilo(String[][] m, String gru, String lp, String agno){
        for (int f = 0; f < 100; f++) {
            if (m[f][0] == null) {
                m[f][0] = gru;
                m[f][1] = lp;
                m[f][2] = agno;
                System.out.println("Vinilo agregado:"+ gru + "-" + lp + "-" + "(" + agno + ")");
                return;
            }
        }
        System.out.println("No hay espacio disponible para agregar más vinilos");
    }





    public static boolean buscarArtista(String[][] m, String artista) {
        int filas = 100;

        for (int i = 0; i < filas; i++) {
            if (m[i][0] == artista && m[i][0] != null) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarColeccion(String[][] m) {
        int filas = 100;

        for (int i = 0; i < filas; i++) {
            if (m[i][0] != null) {
                    System.out.println(m[i][0] +"-"+ m[i][1] + "-" + m[i][2]);
            }
        }
    }

    public static void mostrarTotal(String[][] m) {
        int total = totalVinilos(m);
        System.out.println("Hay un total de: " + total + "vinilos en la colección." + "\n");
    }

    public static void mostrarDisponibles(String[][] m) {
        int disponibles = disponibles(m);
        System.out.println("Hay un total de:" + disponibles + "espacios disponibles en la colección.\n");
    }

    public static int disponibles(String[][] m) {
        int total = 0;
        for (int i = 0 ; i <100; i++){
            if (m[i][0] != null) {
                total++;
            }
        }
        return total;
    }

    public static void mostrarBusquedaArtista(String[][] m, String artista) {
        System.out.println("Vinilos de" + artista + " en la colección: ");
        for (int i= 0; i<100; i++){
            if (m[i][0] != null && m[i][0] == artista) {
                System.out.println(m[i][0] +"-"+ m[i][1] + "-" + m[i][2]);
            }
        }
    }
}




