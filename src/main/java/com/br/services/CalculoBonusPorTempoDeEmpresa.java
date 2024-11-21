/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.services;

import com.br.models.Bonus;
import com.br.models.Funcionario;
import com.br.interfaces.IModuloCalculoBonus;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author tetzner
 */
public class CalculoBonusPorTempoDeEmpresa implements IModuloCalculoBonus {

    @Override
    public void calcular(Funcionario funcionario) {
        LocalDate dataAtual = LocalDate.now();
        
        Period periodo = Period.between(funcionario.getDataContratacao(), dataAtual);
        
        int anosDeEmpresa = periodo.getYears();
        
        double bonus = 0;
        
        if(anosDeEmpresa >= 1 && anosDeEmpresa <= 3){
            bonus = funcionario.getSalarioBase() * 0.01;
        } else if(anosDeEmpresa > 3){
            bonus = funcionario.getSalarioBase() * 0.02;
        }
        if(bonus > 0) funcionario.adicionarBonus(new Bonus("Bonus por tempo de empresa", bonus));
    }
    
}
