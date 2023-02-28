/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaozinhogames.trucobolado.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import joaozinhogames.trucobolado.model.*;
import joaozinhogames.trucobolado.view.*;

public class NovoJogo implements ActionListener
{
    private Tela tela;
    private Jogo jogo;
    
    public NovoJogo(Tela tela)
    {
        this.tela = tela;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        this.jogo = new Jogo();
    }
    
}
