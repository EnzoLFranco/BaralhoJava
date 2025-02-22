public class Carta {

    private String nome;
    private String naipe;

    public Carta(String nome, String nipe) {
        this.nome = nome;
        this.naipe = nipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String nipe) {
        this.naipe = nipe;
    }

    @Override
    public String toString(){
        return nome + " de " + naipe;
    }
}
