public class Copo {
    private String material;
    private String cor;
    private boolean habitavel;

    public void status(){
        System.out.println("Copo feito de " + material);
        System.out.println("Cor: " + cor);
        System.out.println("É Usável? " + habitavel);
    }

    public Copo(String material, String cor, boolean habitavel){
        this.material = material;
        this.cor = cor;
        this.habitavel = habitavel;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isHabitavel() {
        return habitavel;
    }

    public void setHabitavel(boolean habitavel) {
        this.habitavel = habitavel;
    }

    // Métodos adicionais
    public void entrar(){
        System.out.println("O cachorro entrou na copo.");
    }

    public void sair(){
        System.out.println("O cachorro saiu da copo.");
    }

    public void verificarHabitabilidade(){
        if(habitavel){
            System.out.println("A copo está habitável.");
        } else {
            System.out.println("A copo não está habitável.");
        }
    }
}
