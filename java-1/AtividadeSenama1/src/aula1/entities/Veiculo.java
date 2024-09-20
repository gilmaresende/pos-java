/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1.entities;

/**
 *
 * @author gilma
 */
public class Veiculo {

    private String placa;

    private String marca;

    private String modelo;

    private String cor;

    private float velocMax;

    private int qtdRodas;

    private Motor motor;

    public Veiculo() {
        this.placa = " ";
        this.marca = " ";
        this.cor = " ";
        this.modelo = " ";
        this.velocMax = 0F;
        this.qtdRodas = 0;
    }

    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPis, int potencia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPis, potencia);
    }

    public Veiculo(int qtdPis, int potencia) {
        this.motor = new Motor(qtdPis, potencia);
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the velocMax
     */
    public float getVelocMax() {
        return velocMax;
    }

    /**
     * @param velocMax the velocMax to set
     */
    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    /**
     * @return the qtdRodas
     */
    public int getQtdRodas() {
        return qtdRodas;
    }

    /**
     * @param qtdRodas the qtdRodas to set
     */
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("Placa: %s,\n");
        sb.append("Marca: %s,\n");
        sb.append("Modelo: %s,\n");
        sb.append("Cor: %s,\n");
        sb.append("Velocidade Maxima: %f,\n");
        sb.append("Nº de Rodas: %d,\n");
        sb.append("Motor: %s,\n");
        sb.append("},\n");
        return String.format(sb.toString(),
                this.placa,
                this.marca,
                this.modelo,
                this.cor,
                this.velocMax,
                this.qtdRodas,
                this.motor);
    }

}
