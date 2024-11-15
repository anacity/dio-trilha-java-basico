import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo número");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for(int x = 0; x <= contagem; x++){
            System.out.println(x);
        }
    }
}