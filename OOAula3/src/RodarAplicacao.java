// Classe de exemplo para rodar a aplicação do Exercício 4

public class RodarAplicacao {

    public static void main(String[] args) {
        
        Carro exemplo1 = new Carro ();

        exemplo1.SetCor("Branco");
        exemplo1.SetModelo("Celta");
        exemplo1.SetCapacidadeTanque(46);

        System.out.println(exemplo1.GetModelo());
        System.out.println(exemplo1.GetCor());
        System.out.println(exemplo1.GetCapacidadeTanque());
        System.out.println(exemplo1.calcularEncherTanque(4.99));

        Carro exemplo2 = new Carro ("Cinza", "Kia Bongo", 60);

        System.out.println(exemplo2.GetModelo());
        System.out.println(exemplo2.GetCor());
        System.out.println(exemplo2.GetCapacidadeTanque());
        System.out.println(exemplo2.calcularEncherTanque(5.89));
        
    }
    
}
