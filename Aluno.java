package associação;

public class Aluno {

    private String nom;
    private int ida;
    private Seminario sem;

    public Aluno() {}
    public Aluno(String nom, int ida) {
        this.nom = nom;
        this.ida = ida;
    }

    public void print() {
        System.out.println("-----Informações do Aluno-----");
        System.out.println("Nome: "+nom);
        System.out.println("Idade: "+ida);
        if (sem != null) {
            System.out.println("Seminário: "+sem.getTit());
        } else {
            System.out.println("Aluno sem séminario");
        }
    }
    public void setSem(Seminario sem) {
        this.sem = sem;
    }
    public Seminario getSem() {
        return sem;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setIda(int ida) {
        this.ida = ida;
    }
    public int getIda() {
        return ida;
    }
}
