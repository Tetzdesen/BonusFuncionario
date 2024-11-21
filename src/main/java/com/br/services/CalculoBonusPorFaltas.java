/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.services;

import com.br.models.Bonus;
import com.br.models.Funcionario;
import com.br.interfaces.IModuloCalculoBonus;

/**
 *
 * @author tetzner
 */
public class CalculoBonusPorFaltas implements IModuloCalculoBonus {

    @Override
    public void calcular(Funcionario funcionario) {
       double bonus = 0.0;
       int faltas = funcionario.getNumeroFaltas();
       double salarioBase = funcionario.getSalarioBase();
       
       if(faltas == 0){
           bonus = salarioBase * 0.05;
       } else if(faltas >= 1 && faltas <= 3){
           bonus = salarioBase * 0.025;
       }
       if(bonus > 0) funcionario.adicionarBonus(new Bonus("Bonus por Falta", bonus));
    }
    
}
