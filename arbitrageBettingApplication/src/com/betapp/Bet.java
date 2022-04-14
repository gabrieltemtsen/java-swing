package com.betapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Bet extends JFrame implements ActionListener {

    JButton jb1;
    JTextField investment, firstOdd, secondOdd, profit1, profit2,Stake1,Stake2;
    JLabel header,link,investor,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,developers;
    JFrame frame;
    JPanel panel;

    Bet() {
        panel = new JPanel();
        frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Arbitrage Betting");
        ImageIcon image = new ImageIcon("logo.jpg");
        frame.setIconImage(image.getImage());





        header = new JLabel("Two Outcomes(Arbitrage Betting Application) Risk Free you still make money anyway");
        header.setBounds(40, 20, 500, 30);
        panel.add(header);

        link = new JLabel("You can Visit https://surebet.com to get good betting Odds");
        link.setBounds(40, 40, 400, 30);
        panel.add(link);

        link = new JLabel("Bookmakers recommended: 1xBET,, Bet9ja,, Betway");
        link.setBounds(40, 60, 400, 30);
        panel.add(link);


        investor = new JLabel("Capital(N):");
        investor.setBounds(10, 90, 70, 30);
        panel.add(investor);
        investment = new JTextField();
        investment.setBounds(90, 90, 150, 30);
        panel.add(investment);


        lbl2 = new JLabel("FirstOdd:");
        lbl2.setBounds(10, 130, 70, 30);
        panel.add(lbl2);
        firstOdd = new JTextField();
        firstOdd.setBounds(90, 130, 150, 30);
        panel.add(firstOdd);



        lbl3 = new JLabel("SecondOdd:");
        lbl3.setBounds(10, 170, 70, 30);
        panel.add(lbl3);
        secondOdd = new JTextField();
        secondOdd.setBounds(90, 170, 150, 30);
        panel.add(secondOdd);



        jb1 = new JButton("result");
        jb1.setBounds(90, 250, 100, 30);
        panel.add(jb1);

        lbl4 = new JLabel("Go-Stake1:");
        lbl4.setBounds(10, 290, 70, 30);
        panel.add(lbl4);
        Stake1 = new JTextField();
        Stake1.setBounds(90, 290, 150, 30);
        panel.add(Stake1);

        lbl5 = new JLabel("Go-Stake2:");
        lbl5.setBounds(10, 330, 70, 30);
        panel.add(lbl5);
        Stake2 = new JTextField();
        Stake2.setBounds(90, 330, 150, 30);
        panel.add(Stake2);

        lbl6 = new JLabel("OddProfit1:");
        lbl6.setBounds(10, 370, 70, 30);
        panel.add(lbl6);
        profit1 = new JTextField();
        profit1.setBounds(90, 370, 150, 30);
        panel.add(profit1);

        lbl7 = new JLabel("OddProfit2:");
        lbl7.setBounds(10, 410, 70, 30);
        panel.add(lbl7);
        profit2 = new JTextField();
        profit2.setBounds(90, 410, 150, 30);
        panel.add(profit2);

        developers = new JLabel("Developers: " +
                " Danboyi Benjamin Bulus," +
                " Adams Dolapo," +
                " Ameshla Edom," +
                " Gabriel Temtsen," +
                " Bebeyi Samuel");
        developers.setBounds(10, 460, 600, 60);
        panel.add(developers);

        jb1.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setLayout(null);
        frame.setSize(700, 750);
        panel.setBackground(Color.orange);
        Stake1.setBackground(Color.green);
        Stake2.setBackground(Color.green);
        profit1.setBackground(Color.green);
        profit2.setBackground(Color.green);
        frame.setVisible(true);


    }


    public void actionPerformed(ActionEvent e) {
try {
    float invest = Integer.parseInt(investment.getText());
    float odd1 = Float.parseFloat(firstOdd.getText());
    float odd2 = Float.parseFloat(secondOdd.getText());
    float arbitrage1, arbitrage2, total_arbitrage;
    float stake_amount1, stake_amount2;
    float prof_1, prof_2;
    float div1 = 1 / odd1;
    float div2 = 1 / odd2;
    arbitrage1 = div1 * 100;
    float stake1 = invest * arbitrage1;
    arbitrage2 = div2 * 100;
    float stake2 = invest * arbitrage2;
    total_arbitrage = arbitrage2 + arbitrage1;
    if (total_arbitrage > 0) {

        stake_amount1 = stake1 / total_arbitrage;
        float x = stake_amount1 * odd1;

        stake_amount2 = stake2 / total_arbitrage;
        float y = stake_amount2 * odd2;

        prof_1 = x - invest;
        prof_2 = y - invest;
        String naira = "N";
        if (e.getSource().equals(jb1)) {


            Stake1.setText(String.valueOf(naira + stake_amount1));
            Stake2.setText(String.valueOf(naira + stake_amount2));
            profit1.setText(String.valueOf(naira + prof_1));
            profit2.setText(String.valueOf(naira + prof_2));
        }
    } else {
        System.out.print("Error");
    }
}catch (Exception error){
    System.out.println("XXXXXX");
}
    }
}