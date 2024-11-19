/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.sistemabonusfuncionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class Funcionario {
    private String nome;
    private double salarioBase;
    private int idade;
    private String cargo;
    private int numeroFaltas;
    private double distanciaTrabalho;
    private int numeroDependentes;
    private List<Bonus> bonusRecebidos;

    public Funcionario(String nome, double salarioBase, int idade, String cargo, int numeroFaltas, double distanciaTrabalho, int numeroDependentes) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.idade = idade;
        this.cargo = cargo;
        this.numeroFaltas = numeroFaltas;
        this.distanciaTrabalho = distanciaTrabalho;
        this.numeroDependentes = numeroDependentes;
        this.bonusRecebidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }

    public double getDistanciaTrabalho() {
        return distanciaTrabalho;
    }

    public void setDistanciaTrabalho(double distanciaTrabalho) {
        this.distanciaTrabalho = distanciaTrabalho;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public List<Bonus> getBonusRecebidos() {
        return bonusRecebidos;
    }

    public void setBonusRecebidos(List<Bonus> bonusRecebidos) {
        this.bonusRecebidos = bonusRecebidos;
    }
    
    public void adicionarBonus(Bonus bonus){
        bonusRecebidos.add(bonus);
    }
    
    public double getSalarioTotal(){
        return salarioBase + getValorBonusTotal();
    }
    
    public double getValorBonusTotal(){
        return bonusRecebidos.stream().mapToDouble(Bonus::getValor).sum();
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salarioBase=" + salarioBase + ", idade=" + idade + ", cargo=" + cargo + ", numeroFaltas=" + numeroFaltas + ", distanciaTrabalho=" + distanciaTrabalho + ", numeroDependentes=" + numeroDependentes + ", bonusRecebidos=" + bonusRecebidos + '}';
    }
    
}
