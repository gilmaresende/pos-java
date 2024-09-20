/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

import aula1.entities.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gilmar
 */
public class Teste {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<Veiculo>();

        for (int veiculoN = 0; veiculoN < 5; veiculoN++) {
            System.out.println(String.format("Veiculo: %d", veiculoN + 1));
            veiculos.add(montarVeiculo());
        }

        veiculos.forEach(veiculo -> {
            System.out.println("----------------");

            //Exemplo de como faria o print usando toString da entidade, 
            //não foi usado devido enunciado pedir para usar metodos das entidades!
            //System.out.println(String.format("Carro: ", veiculo));
            
            System.out.println(String.format("Carro: {placa: %s, marca: %s, modelo: %s, cor: %s, velocidade máxima: %f, Nº de rodas: %d, Motor{qtd pistões: %d, potência: %d}}",
                    veiculo.getPlaca(),
                    veiculo.getMarca(),
                    veiculo.getModelo(),
                    veiculo.getCor(),
                    veiculo.getVelocMax(),
                    veiculo.getQtdRodas(),
                    veiculo.getMotor().getQtdPis(),
                    veiculo.getMotor().getPotencia()));
            System.out.println("----------------");
        });
    }

    private static Veiculo montarVeiculo() {
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a cor do veículo: ");
        String cor = scanner.nextLine();
        System.out.print("Digite a velocidade maxima do veículo: ");
        float velocMax = scanner.nextFloat();
        System.out.print("Digite o número de rodas do veículo: ");
        int qtdRodas = scanner.nextInt();
        System.out.print("Digite a quantidade de pistões do motor: ");
        int qtdPis = scanner.nextInt();
        System.out.print("Digite a potencia do motor: ");
        int potencia = scanner.nextInt();

        // Exemplo de criação usando apenas contrutor com parametro, como inunciado 
        // pedia que usasse os metodos para atribuir valores, este modelo não foi utilizado!
        // return new Veiculo(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPis, potencia);
        //motor instanciado dentro do contrutor do veiculo
        Veiculo veiculo = new Veiculo(qtdPis, potencia);
        veiculo.setPlaca(placa);
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setCor(cor);
        veiculo.setVelocMax(velocMax);
        veiculo.setQtdRodas(qtdRodas);

        return veiculo;
    }

}
