/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.sistemabonusfuncionario;

/**
 *
 * @author tetzner
 */
public class CalculoBonusPorDistancia implements IModuloCalculoBonus {

    @Override
    public void calcular(Funcionario funcionario) {
        double bonus = 0;
        double distancia = funcionario.getDistanciaTrabalho();
        
        if(distancia >= 50 && distancia <= 100){
            bonus = 80;
        } else if(distancia > 100 && distancia <= 150){
            bonus = 120;
        } else if(distancia >= 150){
            bonus = 170;
        }
        
        if(bonus > 0) funcionario.adicionarBonus(new Bonus("Bonus por Distancia", bonus));
        
    }
    
}
