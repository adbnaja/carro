public class Principal {

    public static void main(String[] args) {

        Carro c1;
        c1 = new Carro();

        c1.setAno(2006);
        c1.setMarca("VW");
        c1.setModelo("Gol");

        c1.iniciar();

        c1.ligar();

        c1.acelerar();
        System.out.println("Velocidade do carro: " + c1.getVelocidade());

        c1.acelerar();
        System.out.println("Velocidade do carro: " + c1.getVelocidade());

        c1.brecar();
        c1.brecar();
        c1.desligar();

    }
}
