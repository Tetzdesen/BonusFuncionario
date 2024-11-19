/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.sistemabonusfuncionario;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("João", 2000, 35, "Analista", 1, 75, 2);
        Funcionario funcionario2 = new Funcionario("Maria", 3000, 42, "Gerente", 0, 120, 4);

        CalculadoraBonusService calculadoraBonusService = new CalculadoraBonusService();

        calculadoraBonusService.processar(funcionario1);
        calculadoraBonusService.processar(funcionario2);

        System.out.println("Salário total de João: " + funcionario1.getSalarioTotal());
        System.out.println("Salário total de Maria: " + funcionario2.getSalarioTotal());
        
        System.out.println(funcionario1.getBonusRecebidos());

    }
}
