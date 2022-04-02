package associação;

public class Local {

    private String rua;
    private String bai;

    public Local() {}
    public Local(String rua, String bai) {
        this.rua = rua;
        this.bai = bai;
    }

    public void print() {
        System.out.println("-----Informações do Local-----");
        System.out.println("Rua: "+this.rua);
        System.out.println("Bairro: "+this.bai);
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return this.rua;
    }
    public void setBai(String bai) {
        this.bai = bai;
    }
    public String getBai() {
        return this.bai;
    }
}
