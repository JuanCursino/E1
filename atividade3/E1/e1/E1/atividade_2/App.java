public class App {
    public static void main(String[] args){
        // Gato
        Gato gato = new Gato("Persa", "Branco", 2);
        System.out.println("\n");
        cao.status();
        cao.late();
        cao.dorme();
        cao.come();



        // Bolacha
        Bolacha bolacha = new Bolacha("Negresco", "Chocolate", true);
        System.out.println("\n");
        racao.status();
        racao.servir();
        racao.guardar();
        racao.verificarDisponibilidade();




        // Copo
        Copo copo = new Copo("Vidro", "Azul", true);
        System.out.println("\n");
        casinha.status();
        casinha.entrar();
        casinha.sair();
        casinha.verificarHabitabilidade();
    }
}







//TESTE DE MESA
//Casa casinha = new Copo("Vidro", "Azul", true);
// No construtor da classe Casa
//this.material = "Vidro";
//this.cor = "azul";
//this.habitavel = true;
//String material = casinha.getMaterial(); // retorna "Madeira"
//String cor = casinha.getCor(); // retorna "Marrom"
//boolean habitavel = casinha.isHabitavel(); // retorna verdadeiro
