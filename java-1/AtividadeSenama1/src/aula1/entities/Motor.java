/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1.entities;

/**
 *
 * @author gilma
 */
public class Motor {

    private int qtdPis;

    private int potencia;

    public Motor() {
        this.qtdPis = 0;
        this.potencia = 0;
    }

    public Motor(int qtdPis, int potencia) {
        this.qtdPis = qtdPis;
        this.potencia = potencia;
    }

    /**
     * @return the qtdPis
     */
    public int getQtdPis() {
        return qtdPis;
    }

    /**
     * @param qtdPis the qtdPis to set
     */
    public void setQtdPis(int qtdPis) {
        this.qtdPis = qtdPis;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Potencia: %d,");
        sb.append("Nº Pistões: %d");
        sb.append("}");

        return String.format(sb.toString(), this.potencia, this.qtdPis);
    }

}
