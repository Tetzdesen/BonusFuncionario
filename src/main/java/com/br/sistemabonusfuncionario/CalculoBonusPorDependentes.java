/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.sistemabonusfuncionario;

/**
 *
 * @author tetzner
 */
public class CalculoBonusPorDependentes implements IModuloCalculoBonus {

    @Override
    public void calcular(Funcionario funcionario) {
        double bonus = 0;
        int dependentes = funcionario.getNumeroDependentes();
        double salarioBase = funcionario.getSalarioBase();
        
        if(dependentes >= 3){
            bonus = salarioBase * 0.06;
        } else if(dependentes > 0 && dependentes < 3){
            bonus = salarioBase * 0.03;
        }
        
        funcionario.adicionarBonus(new Bonus("Bonus por Dependentes", bonus));
    }
    
}
