import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
       
        
        int limiteVelocidade = 60;
        String resultado;


        if (velocidadeAtual > limiteVelocidade) {
            resultado = "Foi multado";
        } 

        else {
            resultado = "Nao foi multado";
        }
        
       
        System.out.println(resultado);
    }
}
