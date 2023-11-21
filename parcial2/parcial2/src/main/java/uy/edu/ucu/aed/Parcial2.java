package uy.edu.ucu.aed;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class Parcial2
{    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // 1 - Cargar el Grafo
        TGrafoRedDatos grafo = UtilGrafos.cargarGrafo("src/main/dispositivos.txt", "src/main/conexiones.txt", false, TGrafoRedDatos.class);

        // 2 - Verificar que los componentes se encuentren conectados
        //boolean conectados = grafo.conectados("nodoX","nodoY");
        grafo.conectados("CS10","CS60");
        grafo.conectados("CS30","CS80");
        grafo.conectados("CS80","CS90");



        String a = "La conexion CS10 a CS60 es:" + grafo.conectados("CS10", "CS60");
        String b = "La conexion CS30 a CS80 es:" + grafo.conectados("CS30", "CS80");
        String c = "La conexion CS80 a CS90 es:" + grafo.conectados("CS80", "CS90");
        String[] vectoresConexiones =  new String[]{a, b, c};


        // 3 - Leer y cargar archivo mediciones.txt
        TDato[] datos = Parcial2.cargarMediciones("src/main/mediciones.txt");
        
        // 4 - Obtener dato de mayor medicion.
        TMedidor medidor = new TMedidor();
        TDato mayorMedicion = medidor.obtenerMayorMedicion(datos);
        
        // 5 - Emitir archivo de salida salida.txt
        // COMPLETAR CÓDIGO

        ManejadorArchivosGenerico.escribirArchivo("src/main/java/salida.txt", vectoresConexiones);
    }

    private static TDato[] cargarMediciones(String rutaAlArchivo) {
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(rutaAlArchivo, false);
        
        TDato[] mediciones = new TDato[lineas.length];
        for (int i = 0; i < lineas.length; i++) {
            String[] datos = lineas[i].split(",");
            mediciones[i] = new TDato(Double.parseDouble(datos[1]), Integer.parseInt(datos[0]));
        }

        return mediciones;
    }
}
