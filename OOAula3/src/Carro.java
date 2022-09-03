//Exercício criando a Classe Carro

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque

    // Construtor aqui

    Carro () {
        
    }


    // Métodos Get e Set da cor (preciso aprofundar no conceito e para que serve esses dois tipos de método)

    void SetCor (String cor) {
        this.cor = cor;
    }

    String GetCor () {
        return cor;
    }

    // Métodos Get e Set do Modelo (Set serve para definir, ou seja, setar ou colocar um valor no atributo, e o get serve para pegar, ou seja, retornar algo)

    void SetModelo (String modelo) {
        this.modelo = modelo;
    }

    String GetModelo () {
        return modelo;
    }

    // Get e Set do Tanque

    void SetCapacidadeTanque (int CapacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    Int GetCapacidadeTanque () {
        return capacidadeTanque;
    }
    
    // Método calcular total para ecnher o tanque (usar o tipo double que pode representar números fracionados e também mais casas decimais)

    double calcularEncherTanque (double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
        

}
