package com.javeriana;

public class Oficina {
    private int id;
    private String nombre;

    public Oficina(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Oficina() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Oficina oficinaFactory(int idO) {
        if (idO == 0 || idO > 7)
            return null;

        switch (idO) {
            case 1:
                return new Oficina(1, "Oficina Pricipal");
            case 2:
                return new Oficina(2, "Oficina Barrio cercano");
            case 3:
                return new Oficina(3, "Oficina Barrio Lejano");
            case 4:
                return new Oficina(4, "Oficina Jubilados");
            case 5:
                return new Oficina(5, "Oficina Juvenil");
            case 6:
                return new Oficina(6, "Oficina horario extendido");
            case 7:
                return new Oficina(7, "Oficina horario corto");
            default:
                throw new IllegalArgumentException("Invalid id: " + idO);

        }
    }

    @Override
    public String toString() {
        return "Oficina [id=" + id + ", nombre=" + nombre + "]";
    }
}
