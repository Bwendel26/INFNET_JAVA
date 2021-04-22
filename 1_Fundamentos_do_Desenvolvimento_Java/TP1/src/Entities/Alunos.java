package Entities;

import java.util.List;

public class Alunos {
    List<Aluno> alunos;
    List<Nota> AV1;
    List<Nota> AV2;

    public  Alunos() {}

    public Alunos(List<Aluno> alunos, List<Nota> AV1, List<Nota> AV2) {
        this.alunos = alunos;
        this.AV1 = AV1;
        this.AV2 = AV2;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Nota> getAV1() {
        return AV1;
    }

    public void setAV1(List<Nota> AV1) {
        this.AV1 = AV1;
    }

    public List<Nota> getAV2() {
        return AV2;
    }

    public void setAV2(List<Nota> AV2) {
        this.AV2 = AV2;
    }
}
