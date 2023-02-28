package joaozinhogames.trucobolado.model;


public class Jogo 
{
    //private int quantidade_jogadores;
    private int manilha;
    private Baralho baralho;
    private int rodada;
    private Jogador jogador;
    private Bot bot;
    
    public Jogo()
    {
        this.jogador = new Jogador();
        this.bot = new Bot();
        
        this.baralho = new Baralho();
        this.rodada = 0;
        this.manilha = baralho.getManilhaValor();
        
        distribuirCartas();
        
        
        /*
        for(int i = 0; i < baralho.getCartas().size(); i++)
        {
            System.out.println(baralho.getCartas().get(i));
        }
        
        System.out.println("Cartas jogador:");
        for(int i = 0; i < jogador.getCartas().size(); i++)
        {
            System.out.println(jogador.getCartas().get(i));
        }
        
        System.out.println("Cartas bot:");
        for(int i = 0; i < bot.getCartas().size(); i++)
        {
            System.out.println(bot.getCartas().get(i));
        }
        */
    }
    
    
    private void distribuirCartas()
    {
        Carta carta;
        int cartaId;
        
        for(int i = 0; i < 6; i++)
        {
            cartaId = 1 + (int)(Math.random() * baralho.getCartas().size());
            if(i % 2 == 0)
            {
                jogador.addCarta(baralho.getCartas().get(cartaId));
            }else bot.addCarta(baralho.getCartas().get(cartaId));
            
            baralho.getCartas().remove(cartaId);
        }
        
    }
    
}
