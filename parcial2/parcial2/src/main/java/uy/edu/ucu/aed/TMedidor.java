package uy.edu.ucu.aed;

/*
 * NO LICENCE 
 * Author: Ing. Agustin Paredes
 */

import java.util.Collection;
import java.util.LinkedList;


/**
 *
 * @author agustinp
 */
public class TMedidor {
    public TDato obtenerMayorMedicion(TDato[] datos) {
        for (int i = (datos.length - 1) / 2; i >= 0; i--) {
            armaHeap(datos, i, datos.length - 1);
        }
        for (int i = datos.length - 1; i > 0; i--) {
            intercambiar(datos, 0, i);
            armaHeap(datos, 0, i - 1);
        }
        return datos[0];
    }


    private void armaHeap(TDato[] datosParaClasificar, int primero, int ultimo) {
        if (primero < ultimo) {
            int actual = primero;
            while (actual <= ultimo / 2) {
                if (ultimo == 2 * actual) { //r tiene un hijo solo
                    if (datosParaClasificar[actual].getValor() > datosParaClasificar[actual * 2].getValor()) {
                        intercambiar(datosParaClasificar, actual, 2 * actual);
                    }
                    actual = ultimo;
                } else { //r tiene 2 hijos
                    int posicionIntercambio = 0;
                    if (datosParaClasificar[2 * actual].getValor() > datosParaClasificar[2 * actual + 1].getValor()) {
                        posicionIntercambio = 2 * actual + 1;
                    } else {
                        posicionIntercambio = 2 * actual;
                    }
                    if (datosParaClasificar[actual].getValor() > datosParaClasificar[posicionIntercambio].getValor()) {
                        intercambiar(datosParaClasificar, actual, posicionIntercambio);
                        actual = posicionIntercambio;
                    } else {
                        actual = ultimo;
                    }
                }
            }
        }
    }

        private void intercambiar(TDato[] vector, int pos1, int pos2) {
            TDato temp = vector[pos2];
            vector[pos2] = vector[pos1];
            vector[pos1] = temp;
        }
}

