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
public class CalculadoraBonusService {
    private final List<IModuloCalculoBonus> modulosCalculoBonus;
    
    public CalculadoraBonusService(){
        modulosCalculoBonus = new ArrayList<>();
        modulosCalculoBonus.add(new CalculoBonusPorDependentes());
        modulosCalculoBonus.add(new CalculoBonusPorDistancia());
        modulosCalculoBonus.add(new CalculoBonusPorFaltas());
    }
    
    public void processar(Funcionario funcionario){
        for(IModuloCalculoBonus moduloCalculoBonus : modulosCalculoBonus){
            moduloCalculoBonus.calcular(funcionario);
        }
    }
}
