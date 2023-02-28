package joaozinhogames.trucobolado.model;

import java.util.ArrayList;
import java.util.List;


public class Baralho 
{
    private List<Carta> cartas = new ArrayList<>();
    private Carta manilha;
    
    public Baralho()
    {
        
        Carta carta;
        for(int naipe = 0; naipe < 4; naipe++)
        {
            for(int valor = 4; valor < 14; valor++)
            {
                carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
        
        int manilhaId = 1 + (int)(Math.random() * cartas.size());
        
        manilha = cartas.get(manilhaId);
        cartas.remove(manilhaId);
        
    }
    
    public List<Carta> getCartas()
    {
        return this.cartas;
    }
    
    public int getManilhaValor()
    {
        if(this.manilha.getValor() == 13)
        {
            return 4;
        }else return this.manilha.getValor() + 1;
        
    }
    
}
