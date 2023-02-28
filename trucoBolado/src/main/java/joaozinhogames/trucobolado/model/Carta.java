package joaozinhogames.trucobolado.model;


public class Carta 
{
    private String naipeNome;
    private String nome;
    private int valor;
    private int naipe; //0- ouros 1- espada 2- copas 3- paus
    
    public Carta(int naipe, int valor)
    {
        this.valor = valor;
        this.naipe = naipe;
        
        if(valor == 8)
        {
            this.nome = "Dama";
        }else if(valor == 9)
        {
            this.nome = "Valete";
        }else if(valor == 10)
        {
            this.nome = "Rei";
        }else if(valor == 11)
        {
            this.nome = "Ás";
        }else if(valor == 12)
        {
            this.nome = "2";
        }else if(valor == 13)
        {
            this.nome = "3";
        }else this.nome = Integer.toString(valor);
        
        if(naipe == 0)
        {
            this.naipeNome = "Ouros";
        }else if(naipe == 1)
        {
            this.naipeNome = "Espada";
        }else if(naipe == 2)
        {
            this.naipeNome = "Copas";
        }else
        {
            this.naipeNome = "Paus";
        }
        
    }
    
    public int getValor()
    {
        return this.valor;
    }
    
       public int getNaipe()
    {
        return this.naipe;
    }
       
    public void setValor(int valor)
    {
        this.valor = valor;
    }
    
    public void setNaipe(int naipe)
    {
        this.naipe = naipe;
    }
    
    //toString
    @Override
    public String toString()
    {
        return this.nome + " de " + this.naipeNome + " (" + this.valor + ")";
    }
}
