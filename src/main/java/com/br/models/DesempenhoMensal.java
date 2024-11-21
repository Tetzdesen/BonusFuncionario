/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.models;

/**
 *
 * @author tetzner
 */
public class DesempenhoMensal {
    private final String desempenho;
    private final String mesAno;
    
    public DesempenhoMensal(String desempenho, String mesAno){
        this.desempenho = desempenho;
        this.mesAno = mesAno;
    }

    public String getDesempenho() {
        return desempenho;
    }

    public String getMesAno() {
        return mesAno;
    }
    
    
}
