package Entities;

import java.util.List;

public class Notas {
    List<Nota> notas;

    public Notas() {}

    public Notas(List<Nota> notas) {
        this.notas = notas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }
}
