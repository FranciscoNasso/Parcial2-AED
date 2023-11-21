package uy.edu.ucu.aed;


/*
 * NO LICENCE 
 * Author: Ing. Agustin Paredes
 */

import java.util.Collection;


/**
 *
 * @author agustinp
 */
public class TGrafoRedDatos extends TGrafoNoDirigido implements ITGrafoRedDatos
{

    public TGrafoRedDatos(Collection<TVertice> vertices, Collection<TArista> aristas)
    {
        // Descomentar la siguiente línea luego de elegir una superclase
        super(vertices, aristas);
    }

    @Override
    public boolean conectados(Comparable a, Comparable b)
    {
        desvisitarVertices();
        TVertice vertOrigen = this.getVertices().get(a);
        if (vertOrigen != null && b != null){
            return vertOrigen.bea(b);
        }
        System.out.println("El nodo pasado por parametro no existe");
        return false;
    }


}
