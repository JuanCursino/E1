public class Gato {
    private String raca;
    private String cor;
    private int idade;

    public void status(){
        System.out.println("Gato de raça " + raca);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
    }

    public Gato(String raca, String cor, int idade){
        setRaca(raca);
        setCor(cor);
        setIdade(idade);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos adicionais
    public void late(){
        System.out.println("Gato latindo...");
    }

    public void dorme(){
        System.out.println("Gato dormindo...");
    }

    public void come(){
        System.out.println("Gato comendo...");
    }
}
