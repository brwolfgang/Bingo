package br.nom.marcos.wolfgang.desktop.bingo.controller.br.nom.marcos.wolfgang.desktop.bingo.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Wolfgang on 07/11/2015.
 */
public class FormOpcoes {
    private JPanel panPrincipal;
    private JPanel panOpcoesLetras;
    private JPanel panLetras;
    private JPanel panPrimeiraLetra;
    private JLabel lblPrimeiraLetra;
    private JTextField txtPrimeiraLetra;
    private JButton btnSalvarOpcoes;
    private JPanel panSegundaLetra;
    private JPanel panTerceiraLetra;
    private JPanel panQuartaLetra;
    private JPanel panQuintaLetra;
    private JLabel lblSegundaLetra;
    private JTextField txtSegundaLetra;
    private JTextField txtTerceiraLetra;
    private JLabel lblTerceiraLetra;
    private JLabel lblQuartaLetra;
    private JTextField txtQuartaLetra;
    private JLabel lblQuintaLetra;
    private JTextField txtQuintaLetra;
    private FormPrincipal formPrincipal;

    public FormOpcoes(FormPrincipal formPrincipal, JFrame jFrame) {
        this.formPrincipal = formPrincipal;
        jFrame.setContentPane(panPrincipal);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.pack();

        initComponentes();
    }

    private void initComponentes(){
        btnSalvarOpcoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] letras = {
                        txtPrimeiraLetra.getText(),
                        txtSegundaLetra.getText(),
                        txtTerceiraLetra.getText(),
                        txtQuartaLetra.getText(),
                        txtQuintaLetra.getText()};

                for(int i = 0; i < letras.length; i++){
                    letras[i] = letras[i].toUpperCase();
                    if(letras[i].length() != 1) {
                        JOptionPane.showMessageDialog(panPrincipal, "Todos os campos devem conter exatamente uma letra",
                                "Letras inválidas", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                formPrincipal.setLetras(letras);
            }
        });
    }
}
