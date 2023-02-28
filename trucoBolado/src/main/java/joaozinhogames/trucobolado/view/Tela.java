package joaozinhogames.trucobolado.view;

import javax.swing.*;
import java.awt.*;
import joaozinhogames.trucobolado.controller.*;
import joaozinhogames.trucobolado.model.*;
        

public class Tela extends JFrame
{
    private JPanel principal;
    private JPanel menu;
    private JPanel jogo;
    
    Tela()
    {
        super("Truco bolado");
        
    }
    
    public void telaPrincipal()
    {
        this.setSize(1280,720);
        this.setVisible(true);
        
        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        this.principal.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        
        menu();
        
        this.add(this.principal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.repaint();
    }
    
    private void menu()
    {
        this.menu = new JPanel();
        //this.menu.setBackground(new Color(239,186,237));
        this.menu.setLayout(new GridLayout(3, 1));
        this.menu.setPreferredSize(new Dimension(1280, 720));
        
        JButton novoJogoBtn = new JButton("Novo Jogo");
        novoJogoBtn.setFont(new Font("Arial", Font.PLAIN, 70));
        //novoJogoBtn.setBackground(new Color(239,186,237));
        
        JLabel titulo = new JLabel("Truco Bolado", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.PLAIN, 120));
        
        JButton sairBtn = new JButton("Sair");
        sairBtn.setFont(new Font("Arial", Font.PLAIN, 70));
        //sairBtn.setBackground(new Color(239,186,237));
        
        sairBtn.addActionListener(new Sair(this));
        novoJogoBtn.addActionListener(new NovoJogo(this));
        this.menu.add(titulo);
        this.menu.add(novoJogoBtn);
        this.menu.add(sairBtn);
        
        this.principal.add(menu, BorderLayout.CENTER);
    }
    
    private void jogo()
    {
        this.menu = new JPanel();
        this.menu.setLayout(new BorderLayout());
        this.menu.setPreferredSize(new Dimension(1280, 720));
    }
    
    
    public static void main(String[] args) 
    {
        Tela tela = new Tela();
        tela.telaPrincipal();
        tela.pack();
    }
}
