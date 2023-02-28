/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaozinhogames.trucobolado.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import joaozinhogames.trucobolado.view.*;

public class Sair implements ActionListener
{
    private Tela tela;
    
    public Sair(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
    
}