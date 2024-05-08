import  javax.swing.*; 
import  java.awt.*; 
import  java.awt.event.*;

public class ExercioPratico extends JFrame{
    JLabel rt1, rt2, resposta,Mensage,resposta2;
    JTextField n1,n2;
    JButton sm,mn,vz,dv,limp,habit,ocult,exib,sair,desab;
    
    public ExercioPratico(){
        
        super("Mini Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        ImageIcon icone = new ImageIcon("Calc.png");
        setIconImage(icone.getImage());
        tela.setBackground(new Color(210,180,140));

        rt1 = new JLabel("1° numero");
        rt2 = new JLabel("2° numero");
        resposta2 = new JLabel("");
        resposta = new JLabel("Resultado::");
        Mensage = new JLabel("Desenvolvido por: Enzo Costa Paz - 2° AMS Grupo A");
        resposta.setForeground(Color.red);

        n1 = new JTextField(5);
        n2 = new JTextField(5);

        sm = new JButton("+");
        mn = new JButton("-");
        vz = new JButton("*");
        dv = new JButton("/");
        //Limpar, habilitar,ocultar,exibir e sair
        limp = new JButton("Limpar");
        habit = new JButton("Habilitar");
        ocult = new JButton("Ocultar");
        exib = new JButton("Exibir");
        sair = new JButton("Sair");
        desab = new JButton("Desabilitar");
        //Atalhos
        //Aperte Alt+ numero de 1 a 4
        sm.setMnemonic(KeyEvent.VK_1);
        mn.setMnemonic(KeyEvent.VK_2);
        vz.setMnemonic(KeyEvent.VK_3);
        dv.setMnemonic(KeyEvent.VK_4);
        //Calculos
        //soma
        sm.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int num1,num2, soma;
                    soma = 0;

                    num1 = Integer.parseInt(n1.getText());
                    num2 = Integer.parseInt(n2.getText());

                    soma = num1 + num2;
                    resposta2.setVisible(true);
                    resposta2.setText(" a soma é: "+soma);
                } 
            }
        );
        //subtração
        mn.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int num1,num2, sub;
                    sub = 0;

                    num1 = Integer.parseInt(n1.getText());
                    num2 = Integer.parseInt(n2.getText());

                    sub = num1 - num2;
                    resposta2.setVisible(true);
                    resposta2.setText(" A subtração é: "+sub);
                } 
            }
        );
        //multiplicação
        vz.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int num1,num2, mult;
                    mult = 0;

                    num1 = Integer.parseInt(n1.getText());
                    num2 = Integer.parseInt(n2.getText());

                    mult = num1 * num2;
                    resposta2.setVisible(true);
                    resposta2.setText(" A multiplicação é: "+mult);
                } 
            }
        );
        //divisão
        dv.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int num1,num2, div;
                    div = 0;

                    num1 = Integer.parseInt(n1.getText());
                    num2 = Integer.parseInt(n2.getText());

                    div = num1 / num2;
                    resposta2.setVisible(true);
                    resposta2.setText(" A divisão é: "+div);
                } 
            }
        );
        //Limpar Caixas
        limp.addActionListener(
            new ActionListener() {
             public void actionPerformed(ActionEvent e){
                n1.setText(null);
                n2.setText(null);
                n1.requestFocus();
             }   
            }
        );
        //Habilitar e desabilitar Caixas
        //Habilitar
            habit.addActionListener(
                new ActionListener() {
                 public void actionPerformed(ActionEvent e){
                    resposta.setEnabled(true);
                    resposta2.setEnabled(true);
                 }   
                }
            );
        //Desabilitar
            desab.addActionListener(
                new ActionListener() {
                 public void actionPerformed(ActionEvent e){
                    resposta.setEnabled(false);
                    resposta2.setEnabled(false);
                 }   
                }
            );
        //Ocultar e Exibir Caixas
        //Ocultar
        ocult.addActionListener(
            new ActionListener() {
             public void actionPerformed(ActionEvent e){
                resposta.setVisible(false);
                resposta2.setVisible(false);
             }   
            }
        );
        //Exibir
        exib.addActionListener(
            new ActionListener() {
             public void actionPerformed(ActionEvent e){
                resposta.setVisible(true);
                resposta2.setVisible(true);
             }   
            }
        );
        //Sair
        sair.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );
        //Posições na interface
        rt1.setBounds(40,10,100,20);
        rt2.setBounds(40,40,100,20);
        resposta.setBounds(40,80,100,20);
        resposta2.setBounds(105,80,200,20);

        n1.setBounds(120,10,100,20);
        n2.setBounds(120,40,100,20);

        sm.setBounds(310,10,50,20);
        mn.setBounds(310,30,50,20);
        vz.setBounds(310,50,50,20);
        dv.setBounds(310,70,50,20);
        limp.setBounds(310,90,80,20);

        habit.setBounds(20,130,140,20);
        desab.setBounds(150,130,140,20);
        ocult.setBounds(260,130,110,20);
        exib.setBounds(370,130,90,20);
        sair.setBounds(370,160,90,20);

        Mensage.setBounds(50,220,290,20);

        tela.add(rt1);
        tela.add(rt2);
        tela.add(resposta);
        tela.add(resposta2);

        tela.add(n1);
        tela.add(n2);

        tela.add(sm);
        tela.add(mn);
        tela.add(vz);
        tela.add(dv);
        tela.add(limp);

        tela.add(habit);
        tela.add(ocult);
        tela.add(exib);
        tela.add(sair);
        tela.add(desab);
        tela.add(Mensage);
        
        setSize(500,350);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
}