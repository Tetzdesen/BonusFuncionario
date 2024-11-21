/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.sistemabonusfuncionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tetzner
 */
public class CalculoBonusPorDesempenhoTempo implements IModuloCalculoBonus {

    @Override
    public void calcular(Funcionario funcionario) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        
        String mesAnoAtual = LocalDate.now().format(formatter);
        String desempenhoAtual = null;
        
        for(DesempenhoMensal desempenhoMensal : funcionario.getDesempenhoMensais()){
            if(desempenhoMensal.getMesAno().equals(mesAnoAtual)){
                desempenhoAtual = desempenhoMensal.getDesempenho();
                break;
            }
        }
        
        if(desempenhoAtual != null){
            int tempoDeEmpresa = funcionario.getIdade();
            double bonus = 0;
            
            switch(desempenhoAtual){
                case "Excelente" -> {
                    if(tempoDeEmpresa > 5) bonus = funcionario.getSalarioBase() * 0.08;
                }
                case "Bom" -> {
                    if(tempoDeEmpresa > 3) bonus = funcionario.getSalarioBase() * 0.04;
                }
                case "Regular" -> {
                    if(tempoDeEmpresa > 1) bonus = funcionario.getSalarioBase() * 0.02;
                }
            }
            
            if(bonus > 0) funcionario.adicionarBonus(new Bonus("Bonus por desempenho e tempo", bonus));
        }
    }
    
}
