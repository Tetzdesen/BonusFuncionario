/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.sistemabonusfuncionario;

/**
 *
 * @author tetzner
 */
public class CalculoBonusPorCargo implements IModuloCalculoBonus {

    @Override
    public void calcular(Funcionario funcionario) {
        double bonus = 0;
        String cargo = funcionario.getCargo();
        
        switch(cargo){
            case "Gerente" -> bonus = funcionario.getSalarioBase() * 0.10;
            case "Analista" -> bonus = funcionario.getSalarioBase() * 0.05;
            case "Desenvolvedor" -> bonus = funcionario.getSalarioBase() * 0.03;
            default -> {
                break;
            }        
        }
        
        if(bonus > 0) funcionario.adicionarBonus(new Bonus("Bonus por cargo de funcionario", bonus));
    }
    
}
