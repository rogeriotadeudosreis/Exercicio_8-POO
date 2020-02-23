/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author roger
 */
public class Paciente {

    private String nome = "";
    private int peso = 0;
    private float altura = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularIMC() {
        return (peso / (altura * altura));
    }

    public String calculaFaixaPeso() {
        String auxPeso = "";
        float imc = 0;

        imc =  calcularIMC();

        if (imc < 20) {
            auxPeso = "Abaixo do peso ideal";
        } else if (imc >= 20 && imc < 26) {
            auxPeso = "Peso normal";
        } else if (imc > 25 && imc < 31) {
            auxPeso = "Excesso de peso";
        } else if (imc > 30 && imc < 36) {
            auxPeso = "Obesidade";
        } else if (imc > 35) {
            auxPeso = "Obesidade mórbida";
        }
        return auxPeso;
    }
    @Override    
    public String toString(){
        String saida = "Dados do paciente: \n";
        saida+= "Nome: " + getNome() + "\n";
        saida+= "Peso: " + getPeso() + "\n";
        saida+= "Altura: " + getAltura() + "\n";
        saida+= "Valor do IMC: " + calcularIMC() + "\n";
        saida+= "Faixa de Risco: " + calculaFaixaPeso() + "\n";
        return (saida);
    }
    
    

}
