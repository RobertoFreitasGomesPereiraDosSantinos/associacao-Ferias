package associação;

public class AssociacaoTest {
    public static void main(String... args) {
        Aluno aln1 = new Aluno("Robeto das Bragas", 16);
        Aluno aln2 = new Aluno("Jucelina Kudchek", 17);
        Professor prof = new Professor("Gildevan Ferratus", "Sociologia Esperimental");
        Seminario sem = new Seminario("Como ser um burro de forma inteligente");
        Local loc = new Local("Rua Pacu das asas ", "Peixotes");
        aln1.setSem(sem);
        aln2.setSem(sem);
        sem.setPro(prof);
        sem.setLoc(loc);
        sem.setAlu(new Aluno[] {aln1, aln2});
        prof.setSem(new Seminario[] {sem});
        sem.print();
    }
}
