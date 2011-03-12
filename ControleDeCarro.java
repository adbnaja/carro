import java.util.Scanner;

public class ControleDeCarro {

    public static void main(String[] args) {

        char opcao;

        Scanner in = new Scanner(System.in);

        Carro c;
        c = new Carro();
        c.iniciar();

        do {

            int vel = c.getVelocidade();
            System.out.println("Carro ligado? " + c.getLigado());
            System.out.println("Velocidade: " + vel);

            System.out.println("Digite a opcao (S=sair)?");
            opcao = in.nextLine().charAt(0);

            switch (opcao) {
                case '+':
                    c.acelerar();
                    break;
                case '-':
                    c.brecar();
                    break;
                case 'l':
                    c.ligar();
                    break;
                case 'd':
                    c.desligar();
                    break;
            }

        } while (opcao != 'S');

    }
}
