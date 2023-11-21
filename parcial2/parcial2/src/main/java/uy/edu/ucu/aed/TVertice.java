package uy.edu.ucu.aed;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TVertice implements IVertice
{

    private final Comparable etiqueta;
    private final LinkedList<TAdyacencia> adyacentes;
    private boolean visitado;
    private Object datos;


    @Override
    public Comparable getEtiqueta()
    {
        return etiqueta;
    }

    @Override
    public LinkedList<TAdyacencia> getAdyacentes()
    {
        return adyacentes;
    }

    public TVertice(Comparable unaEtiqueta)
    {
        this.etiqueta = unaEtiqueta;
        adyacentes = new LinkedList();
        visitado = false;
    }

    @Override
    public void setVisitado(boolean valor)
    {
        this.visitado = valor;
    }

    @Override
    public boolean getVisitado()
    {
        return this.visitado;
    }

    @Override
    public TAdyacencia buscarAdyacencia(TVertice verticeDestino)
    {
        if (verticeDestino != null)
        {
            return buscarAdyacencia(verticeDestino.getEtiqueta());
        }
        return null;
    }

    @Override
    public Double obtenerCostoAdyacencia(TVertice verticeDestino)
    {
        TAdyacencia ady = buscarAdyacencia(verticeDestino);
        if (ady != null)
        {
            return ady.getCosto();
        }
        return Double.MAX_VALUE;
    }

    @Override
    public boolean insertarAdyacencia(Double costo, TVertice verticeDestino)
    {
        if (buscarAdyacencia(verticeDestino) == null)
        {
            TAdyacencia ady = new TAdyacencia(costo, verticeDestino);
            return adyacentes.add(ady);
        }
        return false;
    }

    @Override
    public boolean eliminarAdyacencia(Comparable nomVerticeDestino)
    {
        TAdyacencia ady = buscarAdyacencia(nomVerticeDestino);
        if (ady != null)
        {
            adyacentes.remove(ady);
            return true;
        }
        return false;
    }

    @Override
    public TVertice primerAdyacente()
    {
        if (this.adyacentes.getFirst() != null)
        {
            return this.adyacentes.getFirst().getDestino();
        }
        return null;
    }

    @Override
    public TAdyacencia buscarAdyacencia(Comparable etiquetaDestino)
    {
        for (TAdyacencia adyacencia : adyacentes)
        {
            if (adyacencia.getDestino().getEtiqueta().compareTo(etiquetaDestino) == 0)
            {
                return adyacencia;
            }
        }
        return null;
    }

    @Override
    public Object getDatos()
    {
        return datos;
    }

    public void bpf(List<TVertice> lista)
    {
        throw new UnsupportedOperationException("Método no implementado :(");
    }
    
    public boolean bea(Comparable dest)
    {
        Queue<TVertice> cola = new LinkedList<>();

        this.setVisitado(true);
        cola.add(this);
        if (this.etiqueta == dest){
            return true;
        }

        while (!cola.isEmpty()) {
            TVertice x = cola.remove();
            LinkedList<TAdyacencia> adyacentes = x.getAdyacentes();
            for (TAdyacencia ady : adyacentes) {
                TVertice y = ady.getDestino();
                if (!y.getVisitado()) {
                    y.setVisitado(true);
                    cola.add(y);

                    if(y.getEtiqueta().compareTo(dest) == 0){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
    

    
}
