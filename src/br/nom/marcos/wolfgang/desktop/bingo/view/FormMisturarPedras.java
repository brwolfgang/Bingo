package br.nom.marcos.wolfgang.desktop.bingo.view;

import javax.swing.*;

/**
 * Created by Wolfgang on 08/11/2015.
 */
public class FormMisturarPedras {
    private JPanel panPrincipal;
    private JLabel lblImagemMisturando;
    private JButton btnFechar;

    public FormMisturarPedras(JFrame jFrame) {
        jFrame.setContentPane(panPrincipal);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.pack();
    }
}
