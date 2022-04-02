package associação;

public class Seminario {

    private String tit;
    private Aluno[] alu;
    private Professor pro;
    private Local loc;

    public Seminario() {}
    public Seminario(String tit) {
        this.setTit(tit);
    }

    public void print() {
        System.out.println("-----Informações do Seminário-----");
        System.out.println("Título: "+this.tit);
        System.out.print("Alunos: ");
        for (Aluno alu : this.alu) {
            System.out.print(alu.getNom()+", ");
        }
        System.out.println("\nProfessor: "+pro.getNom());
        System.out.println("Rua: "+loc.getRua()+" Barirro: "+loc.getBai());
    }
    public void setTit(String tit) {
        this.tit = tit;
    }
    public Local getLoc() {
        return this.loc;
    }
    public void setLoc(Local loc) {
        this.loc = loc;
    }
    public String getTit() {
        return this.tit;
    }
    public Aluno[] getAlu() {
        return this.alu;
    }
    public void setAlu(Aluno[] alu) {
        this.alu = alu;
    }
    public void setPro(Professor pro) {
        this.pro = pro;
    }
    public Professor getPro() {
        return this.pro;
    }
}
