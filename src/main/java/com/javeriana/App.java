package com.javeriana;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Oficina> lO1 = new ArrayList<Oficina>();
        ListadoOficinas lOficinas = ListadoOficinas.getInstance();
        lOficinas.setListaOficinas(lO1);

        lOficinas.getListaOficinas().add(Oficina.oficinaFactory(1));
        lOficinas.getListaOficinas().add(Oficina.oficinaFactory(2));
        lOficinas.getListaOficinas().add(Oficina.oficinaFactory(3));
        lOficinas.getListaOficinas().add(Oficina.oficinaFactory(4));
        lOficinas.getListaOficinas().add(Oficina.oficinaFactory(5));
        lOficinas.getListaOficinas().add(Oficina.oficinaFactory(6));
        lOficinas.getListaOficinas().add(Oficina.oficinaFactory(7));
        System.out.println(lOficinas.getListaOficinas().toString());

    }
}
