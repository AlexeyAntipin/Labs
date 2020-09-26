package com.company.Exercise4;

import javax.swing.*;
import java.awt.*;

public class GUITable extends JFrame {

    private int milanScore = 0;
    private int realScore = 0;
    private JButton milan = new JButton("Milan");
    private JButton real = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: 0 X 0");
    private JLabel lastScorer = new JLabel("Last scorer: N/A");
    private JLabel winner = new JLabel("Winner: N/A");
    private Font fnt = new Font("Times new roman", Font.BOLD,20);

    public GUITable() {
        super("Table");
        milan.setFont(fnt);
        real.setFont(fnt);
        result.setFont(fnt);
        lastScorer.setFont(fnt);
        winner.setFont(fnt);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(milan);
        add(result);
        add(real);
        add(lastScorer);
        add(winner);

        milan.addActionListener(actionEvent -> {
            milanScore++;
            result.setText("Result: " + milanScore + " X " + realScore);
            lastScorer.setText("Last scorer: Milan");
            if (milanScore == realScore) {
                winner.setText("draw");
            } else {
                winner.setText("Winner: Milan");
            }
        });

        real.addActionListener(actionEvent -> {
            realScore++;
            result.setText("Result: " + milanScore + " X " + realScore);
            lastScorer.setText("Last scorer: Real Madrid");
            if (milanScore == realScore) {
                winner.setText("draw");
            } else {
                winner.setText("Winner: Real Madrid");
            }
        });
    }
}
