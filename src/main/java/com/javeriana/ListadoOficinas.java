package com.javeriana;

import java.util.ArrayList;
import java.util.List;

public class ListadoOficinas {
    private List<Oficina> listaOficinas;
    public static ListadoOficinas ListadoOficinas_instance = null;

    public ListadoOficinas(ArrayList<Oficina> listaOficinas) {
        this.listaOficinas = listaOficinas;
    }

    public ListadoOficinas() {
    }

    public List<Oficina> getListaOficinas() {
        return listaOficinas;
    }

    public void setListaOficinas(List<Oficina> listaOficinas) {
        this.listaOficinas = listaOficinas;
    }

    public static ListadoOficinas getInstance() {
        if (ListadoOficinas_instance == null) {
            ListadoOficinas_instance = new ListadoOficinas();
        }
        return ListadoOficinas_instance;
    }
}
