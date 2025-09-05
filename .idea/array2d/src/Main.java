public class Main {
    public static void main(String[] args) {
        Array2DADT<String> tablero = new Array2DADT<>(8, 8);

        String[] piezasNegras = {
                "\u265C",
                "\u265E",
                "\u265D",
                "\u265B",
                "\u265A",
                "\u265D",
                "\u265E",
                "\u265C"
        };
        for(int j = 0; j < 8; j++){
            tablero.setElemento(0, j, piezasNegras[j]);
            tablero.setElemento(1, j, "\u265F");
        }

        String[] piezasBlancas = {
                "\u2656",
                "\u2658",
                "\u2657",
                "\u2655",
                "\u2654",
                "\u2657",
                "\u2658",
                "\u2656"
        };
        for(int j = 0; j < 8; j++){
            tablero.setElemento(7, j, piezasBlancas[j]);
            tablero.setElemento(6, j, "\u2659");
        }

        for(int i = 2; i <= 5; i++){
            for(int j = 0; j < 8; j++){
                tablero.setElemento(i, j, " ");
            }
        }

        System.out.println(tablero.toString());

    }
}