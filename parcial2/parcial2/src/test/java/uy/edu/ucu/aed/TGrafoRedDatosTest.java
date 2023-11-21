package uy.edu.ucu.aed;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class TGrafoRedDatosTest {

    @Test
    void conectados1() {
        TVertice vert1 = new TVertice("1");
        TVertice vert2 = new TVertice("2");
        TVertice vert3 = new TVertice("3");
        TVertice vert4 = new TVertice("4");

        TArista art1 = new TArista(vert1.getEtiqueta(), vert2.getEtiqueta(), 4);
        TArista art2 = new TArista(vert2.getEtiqueta(), vert3.getEtiqueta(), 2);
        TArista art3 = new TArista(vert3.getEtiqueta(), vert1.getEtiqueta(), 6);
        TArista art4 = new TArista(vert3.getEtiqueta(), vert4.getEtiqueta(), 8);


        LinkedList<TVertice> vertices = new LinkedList<>();
        vertices.add(vert1);
        vertices.add(vert2);
        vertices.add(vert3);
        vertices.add(vert4);

        LinkedList <TArista> aristas = new LinkedList<>();

        aristas.add(art1);
        aristas.add(art2);
        aristas.add(art3);
        aristas.add(art4);


        TGrafoRedDatos gd = new TGrafoRedDatos(vertices, aristas);


        Boolean Resultado = gd.conectados(vert1.getEtiqueta(), vert4.getEtiqueta());

        boolean resultadoEsperado = true;

        Assert.assertEquals(Resultado, resultadoEsperado);
    }

    @Test
    public void conectados2(){
        TVertice vert1 = new TVertice("1");
        TVertice vert2 = new TVertice("2");
        TVertice vert3 = new TVertice("3");
        TVertice vert4 = new TVertice("4");
        TVertice vert5 = new TVertice("5");

        TArista art1 = new TArista(vert1.getEtiqueta(), vert2.getEtiqueta(), 4);
        TArista art2 = new TArista(vert2.getEtiqueta(), vert3.getEtiqueta(), 2);
        TArista art3 = new TArista(vert3.getEtiqueta(), vert1.getEtiqueta(), 6);
        TArista art4 = new TArista(vert3.getEtiqueta(), vert4.getEtiqueta(), 8);


        LinkedList<TVertice> vertices = new LinkedList<>();
        vertices.add(vert1);
        vertices.add(vert2);
        vertices.add(vert3);
        vertices.add(vert4);
        vertices.add(vert5);

        LinkedList <TArista> aristas = new LinkedList<>();

        aristas.add(art1);
        aristas.add(art2);
        aristas.add(art3);
        aristas.add(art4);


        TGrafoRedDatos gd = new TGrafoRedDatos(vertices, aristas);


        Boolean Resultado = gd.conectados(vert1.getEtiqueta(), vert5.getEtiqueta());

        boolean resultadoEsperado = false;

        Assert.assertEquals(Resultado, resultadoEsperado);
    }

    @Test
    public void conectados3(){
        TVertice vert1 = new TVertice("1");
        TVertice vert2 = new TVertice("2");
        TVertice vert3 = new TVertice("3");
        TVertice vert4 = new TVertice("4");

        TArista art1 = new TArista(vert1.getEtiqueta(), vert2.getEtiqueta(), 4);
        TArista art2 = new TArista(vert2.getEtiqueta(), vert3.getEtiqueta(), 2);
        TArista art3 = new TArista(vert3.getEtiqueta(), vert1.getEtiqueta(), 6);
        TArista art4 = new TArista(vert3.getEtiqueta(), vert4.getEtiqueta(), 8);


        LinkedList<TVertice> vertices = new LinkedList<>();
        vertices.add(vert1);
        vertices.add(vert2);
        vertices.add(vert3);
        vertices.add(vert4);

        LinkedList <TArista> aristas = new LinkedList<>();

        aristas.add(art1);
        aristas.add(art2);
        aristas.add(art3);
        aristas.add(art4);


        TGrafoRedDatos gd = new TGrafoRedDatos(vertices, aristas);


        Boolean Resultado = gd.conectados(vert1.getEtiqueta(), vert1.getEtiqueta());

        boolean resultadoEsperado = true;

        Assert.assertEquals(Resultado, resultadoEsperado);
    }

    @Test
    public void conectados4(){
        TVertice vert1 = new TVertice("1");
        TVertice vert2 = new TVertice("2");
        TVertice vert3 = new TVertice("3");
        TVertice vert4 = new TVertice("4");

        TArista art1 = new TArista(vert1.getEtiqueta(), vert2.getEtiqueta(), 4);
        TArista art2 = new TArista(vert2.getEtiqueta(), vert3.getEtiqueta(), 2);
        TArista art3 = new TArista(vert3.getEtiqueta(), vert1.getEtiqueta(), 6);
        TArista art4 = new TArista(vert3.getEtiqueta(), vert4.getEtiqueta(), 8);


        LinkedList<TVertice> vertices = new LinkedList<>();
        vertices.add(vert1);
        vertices.add(vert2);
        vertices.add(vert3);
        vertices.add(vert4);

        LinkedList <TArista> aristas = new LinkedList<>();

        aristas.add(art1);
        aristas.add(art2);
        aristas.add(art3);
        aristas.add(art4);


        TGrafoRedDatos gd = new TGrafoRedDatos(vertices, aristas);


        Boolean Resultado = gd.conectados(vert1.getEtiqueta(), vert2.getEtiqueta());

        boolean resultadoEsperado = true;

        Assert.assertEquals(Resultado, resultadoEsperado);
    }

    @Test
    public void conectados5(){
        TVertice vert1 = new TVertice("1");
        TVertice vert2 = new TVertice("2");
        TVertice vert3 = new TVertice("3");
        TVertice vert4 = new TVertice("4");

        TArista art1 = new TArista(vert1.getEtiqueta(), vert2.getEtiqueta(), 4);
        TArista art2 = new TArista(vert2.getEtiqueta(), vert3.getEtiqueta(), 2);
        TArista art3 = new TArista(vert3.getEtiqueta(), vert1.getEtiqueta(), 6);
        TArista art4 = new TArista(vert3.getEtiqueta(), vert4.getEtiqueta(), 8);


        LinkedList<TVertice> vertices = new LinkedList<>();
        vertices.add(vert1);
        vertices.add(vert2);
        vertices.add(vert3);
        vertices.add(vert4);

        LinkedList <TArista> aristas = new LinkedList<>();

        aristas.add(art1);
        aristas.add(art2);
        aristas.add(art3);
        aristas.add(art4);


        TGrafoRedDatos gd = new TGrafoRedDatos(vertices, aristas);


        Boolean Resultado = gd.conectados(vert1.getEtiqueta(), null);

        boolean resultadoEsperado = false;

        Assert.assertEquals(Resultado, resultadoEsperado);
    }

    @Test
    public void conectados6(){
        TVertice vert1 = new TVertice("1");
        TVertice vert2 = new TVertice("2");
        TVertice vert3 = new TVertice("3");
        TVertice vert4 = new TVertice("4");

        TArista art1 = new TArista(vert1.getEtiqueta(), vert2.getEtiqueta(), 4);
        TArista art2 = new TArista(vert2.getEtiqueta(), vert3.getEtiqueta(), 2);
        TArista art3 = new TArista(vert3.getEtiqueta(), vert1.getEtiqueta(), 6);
        TArista art4 = new TArista(vert3.getEtiqueta(), vert4.getEtiqueta(), 8);


        LinkedList<TVertice> vertices = new LinkedList<>();
        vertices.add(vert1);
        vertices.add(vert2);
        vertices.add(vert3);
        vertices.add(vert4);

        LinkedList <TArista> aristas = new LinkedList<>();

        aristas.add(art1);
        aristas.add(art2);
        aristas.add(art3);
        aristas.add(art4);


        TGrafoRedDatos gd = new TGrafoRedDatos(vertices, aristas);


        Boolean Resultado = gd.conectados(null, vert1.getEtiqueta());

        boolean resultadoEsperado = false;

        Assert.assertEquals(Resultado, resultadoEsperado);
    }

}


