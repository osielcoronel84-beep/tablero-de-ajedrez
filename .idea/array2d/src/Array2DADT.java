public class Array2DADT <T>{
    private int columnas;
    private int filas;
    private ArrayADT<ArrayADT<T>> datos;

    public Array2DADT(int columnas, int filas){
        this.columnas = columnas;
        this.filas = filas;
        datos = new ArrayADT<>(filas);
        for(int i = 0; i < filas; i++){
            datos.establecerElemento(new ArrayADT<>(columnas), i);
        }
    }

    public void limpiar(T dato){
        for(int i = 0; i < filas; i++){
            datos.obtenerElemento(i).limpiar(dato);
        }
    }

    public int getRowSize(){
        return filas;
    }

    public int getColSize(){
        return columnas;
    }

    public void setElemento(int fila, int columna, T dato){
        if(fila >= 0 && fila < filas && columna >= 0 && columna < columnas){
            datos.obtenerElemento(fila).establecerElemento(dato, columna);
        } else {
            System.out.println("fuera de rango");
        }
    }

    public T getElemento(int fila, int columna){
        if(fila >= 0 && fila < filas && columna >= 0 && columna < columnas){
            return datos.obtenerElemento(fila).obtenerElemento(columna);
        } else {
            System.out.println("fuera de rango");
            return null;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                sb.append(getElemento(i, j)).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
