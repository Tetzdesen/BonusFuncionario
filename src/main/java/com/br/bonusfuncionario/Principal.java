/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.bonusfuncionario;

import com.br.models.Funcionario;
import com.br.services.CalculadoraBonusService;
import java.time.LocalDate;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Joao", 2000, 35, "Analista", 1, 75, 2, LocalDate.now());
        Funcionario funcionario2 = new Funcionario("Maria", 3000, 42, "Gerente", 0, 120, 4, LocalDate.now());

        CalculadoraBonusService calculadoraBonusService = new CalculadoraBonusService();

        calculadoraBonusService.processar(funcionario1);
        calculadoraBonusService.processar(funcionario2);

        System.out.println("Salario total de Joao: " + funcionario1.getSalarioTotal());
        System.out.println("Salario total de Maria: " + funcionario2.getSalarioTotal());
        
        System.out.println(funcionario1.getBonusRecebidos());

    }
}
