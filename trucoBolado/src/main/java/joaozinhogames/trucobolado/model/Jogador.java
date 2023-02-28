/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joaozinhogames.trucobolado.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaop
 */
public class Jogador 
{
    private List<Carta> cartas = new ArrayList<>();
    protected int pontos;
    
    Jogador()
    {
        this.pontos = 0;
    }
    
    protected void addCarta(Carta carta)
    {
        this.cartas.add(carta);
    }
    
    private void Jogar()
    {
        
    }
    
    private void Trucar()
    {
        
    }
    
    public List<Carta> getCartas()
    {
        return this.cartas;
    }
    
}
