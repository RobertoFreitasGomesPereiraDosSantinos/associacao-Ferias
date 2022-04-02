package associação;

public class Professor {

    private String nom;
    private String esp;
    private Seminario[] sem;

    public Professor() {}
    public Professor(String nom, String esp) {
        this.nom = nom;
        this.esp = esp;
    }

    public void print() {
        System.out.println("-----Informações do Professor-----");
        System.out.println("Nome: "+this.nom);
        System.out.println("Especialidade: "+this.esp);
        System.out.print("Seminários: ");
        for (Seminario sem : this.sem) {
            System.out.print(sem.getTit()+", ");
        }
        
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }
    public void setEsp(String esp) {
        this.esp = esp;
    }
    public String getEsp() {
        return this.esp;
    }
    public void setSem(Seminario[] sem) {
        this.sem = sem;
    }
    public Seminario[] getSem() {
        return this.sem;
    }
}
