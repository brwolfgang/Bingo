package br.nom.marcos.wolfgang.desktop.bingo.view;

import br.nom.marcos.wolfgang.desktop.bingo.controller.Sorteador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Created by Wolfgang on 07/11/2015.
 */
public class FormPrincipal {
    private JPanel panSorteio;
    private JPanel panTabelaSorteados;
    private JLabel lblLetraSorteada;
    private JLabel lblNumeroSorteado;
    private JPanel panInfoSorteio;
    private JPanel panSorteioComando;
    private JButton btnSortear;
    private JButton btnReiniciarSorteio;
    private JButton btnMisturarPedras;
    private JPanel panNum1_7;
    private JLabel lblNum01;
    private JLabel lblNum02;
    private JLabel lblNum03;
    private JLabel lblNum04;
    private JLabel lblNum05;
    private JLabel lblNum06;
    private JLabel lblNum07;
    private JPanel panNum8_14;
    private JLabel lblNum08;
    private JLabel lblNum09;
    private JLabel lblNum10;
    private JLabel lblNum11;
    private JLabel lblNum12;
    private JLabel lblNum13;
    private JLabel lblNum14;
    private JLabel lblNum15;
    private JPanel panNum16_22;
    private JPanel panNum23_29;
    private JLabel lblNum30;
    private JLabel lblNum16;
    private JLabel lblNum17;
    private JLabel lblNum18;
    private JLabel lblNum19;
    private JLabel lblNum20;
    private JLabel lblNum21;
    private JLabel lblNum22;
    private JLabel lblNum23;
    private JLabel lblNum24;
    private JLabel lblNum25;
    private JLabel lblNum26;
    private JLabel lblNum27;
    private JLabel lblNum28;
    private JLabel lblNum29;
    private JLabel lblNum31;
    private JLabel lblNum32;
    private JLabel lblNum33;
    private JLabel lblNum34;
    private JLabel lblNum35;
    private JLabel lblNum36;
    private JLabel lblNum37;
    private JPanel panNum31_37;
    private JPanel panNum38_44;
    private JLabel lblNum38;
    private JLabel lblNum39;
    private JLabel lblNum40;
    private JLabel lblNum41;
    private JLabel lblNum42;
    private JLabel lblNum43;
    private JLabel lblNum44;
    private JLabel lblNum45;
    private JPanel panNum46_52;
    private JPanel panNum53_59;
    private JLabel lblNum46;
    private JLabel lblNum47;
    private JLabel lblNum48;
    private JLabel lblNum49;
    private JLabel lblNum50;
    private JLabel lblNum51;
    private JLabel lblNum52;
    private JLabel lblNum53;
    private JLabel lblNum54;
    private JLabel lblNum55;
    private JLabel lblNum56;
    private JLabel lblNum57;
    private JLabel lblNum58;
    private JLabel lblNum59;
    private JLabel lblNum60;
    private JPanel panNum61_67;
    private JPanel panNum68_74;
    private JLabel lblNum75;
    private JPanel panPrincipal;
    private JLabel lblNum61;
    private JLabel lblNum62;
    private JLabel lblNum63;
    private JLabel lblNum64;
    private JLabel lblNum65;
    private JLabel lblNum66;
    private JLabel lblNum67;
    private JLabel lblNum68;
    private JLabel lblNum69;
    private JLabel lblNum70;
    private JLabel lblNum71;
    private JLabel lblNum72;
    private JLabel lblNum73;
    private JLabel lblNum74;
    private JLabel lblPrimeiraLetra;
    private JPanel panPrimeiraLetra;
    private JPanel panSegundaLetra;
    private JLabel lblSegundaLetra;
    private JPanel panTerceiraLetra;
    private JLabel lblTerceiraLetra;
    private JPanel panQuartaLetra;
    private JLabel lblQuartaLetra;
    private JPanel panQuintaLetra;
    private JLabel lblQuintaLetra;
    private JButton btnOpcoes;

    private LinkedList<JLabel> lstNumeros;
    private Sorteador sorteador;
    private String[] letras = {"B", "I", "N", "G", "O"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bingo");
        frame.setContentPane(new FormPrincipal().panPrincipal);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(900, 500));
        frame.pack();
        frame.setVisible(true);
    }

    public FormPrincipal() {
        initListaNumeros();
        initComponentes();
        initSorteio();
    }

    private void initSorteio(){
        sorteador = new Sorteador();
        initInterface();
    }

    private void initInterface(){
        lblLetraSorteada.setText("Boa");
        lblNumeroSorteado.setText("Sorte");

        initLetras();

        for(JLabel lblNumero : lstNumeros)
            marcarNumeroNaoSorteado(lblNumero);
    }

    private void initLetras(){
        lblPrimeiraLetra.setText(letras[0]);
        lblSegundaLetra.setText(letras[1]);
        lblTerceiraLetra.setText(letras[2]);
        lblQuartaLetra.setText(letras[3]);
        lblQuintaLetra.setText(letras[4]);
    }

    private void initListaNumeros(){
        lstNumeros = new LinkedList<JLabel>();
        lstNumeros.add(lblNum01);
        lstNumeros.add(lblNum02);
        lstNumeros.add(lblNum03);
        lstNumeros.add(lblNum04);
        lstNumeros.add(lblNum05);
        lstNumeros.add(lblNum06);
        lstNumeros.add(lblNum07);
        lstNumeros.add(lblNum08);
        lstNumeros.add(lblNum09);
        lstNumeros.add(lblNum10);
        lstNumeros.add(lblNum11);
        lstNumeros.add(lblNum12);
        lstNumeros.add(lblNum13);
        lstNumeros.add(lblNum14);
        lstNumeros.add(lblNum15);
        lstNumeros.add(lblNum16);
        lstNumeros.add(lblNum17);
        lstNumeros.add(lblNum18);
        lstNumeros.add(lblNum19);
        lstNumeros.add(lblNum20);
        lstNumeros.add(lblNum21);
        lstNumeros.add(lblNum22);
        lstNumeros.add(lblNum23);
        lstNumeros.add(lblNum24);
        lstNumeros.add(lblNum25);
        lstNumeros.add(lblNum26);
        lstNumeros.add(lblNum27);
        lstNumeros.add(lblNum28);
        lstNumeros.add(lblNum29);
        lstNumeros.add(lblNum30);
        lstNumeros.add(lblNum31);
        lstNumeros.add(lblNum32);
        lstNumeros.add(lblNum33);
        lstNumeros.add(lblNum34);
        lstNumeros.add(lblNum35);
        lstNumeros.add(lblNum36);
        lstNumeros.add(lblNum37);
        lstNumeros.add(lblNum38);
        lstNumeros.add(lblNum39);
        lstNumeros.add(lblNum40);
        lstNumeros.add(lblNum41);
        lstNumeros.add(lblNum42);
        lstNumeros.add(lblNum43);
        lstNumeros.add(lblNum44);
        lstNumeros.add(lblNum45);
        lstNumeros.add(lblNum46);
        lstNumeros.add(lblNum47);
        lstNumeros.add(lblNum48);
        lstNumeros.add(lblNum49);
        lstNumeros.add(lblNum50);
        lstNumeros.add(lblNum51);
        lstNumeros.add(lblNum52);
        lstNumeros.add(lblNum53);
        lstNumeros.add(lblNum54);
        lstNumeros.add(lblNum55);
        lstNumeros.add(lblNum56);
        lstNumeros.add(lblNum57);
        lstNumeros.add(lblNum58);
        lstNumeros.add(lblNum59);
        lstNumeros.add(lblNum60);
        lstNumeros.add(lblNum61);
        lstNumeros.add(lblNum62);
        lstNumeros.add(lblNum63);
        lstNumeros.add(lblNum64);
        lstNumeros.add(lblNum65);
        lstNumeros.add(lblNum66);
        lstNumeros.add(lblNum67);
        lstNumeros.add(lblNum68);
        lstNumeros.add(lblNum69);
        lstNumeros.add(lblNum70);
        lstNumeros.add(lblNum71);
        lstNumeros.add(lblNum72);
        lstNumeros.add(lblNum73);
        lstNumeros.add(lblNum74);
        lstNumeros.add(lblNum75);
    }

    private void sortearNumero(){
        int numeroSorteado = sorteador.sortearNumero();
        if(numeroSorteado == 0) {
            JOptionPane.showMessageDialog(panPrincipal, "Não há mais números a serem sorteados!", "Temos um vencedor!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        marcarNumeroSorteado(lstNumeros.get(numeroSorteado - 1));
        lblLetraSorteada.setText(calcularLetraSorteada(numeroSorteado));
        lblNumeroSorteado.setText(String.valueOf(numeroSorteado));
    }

    private String calcularLetraSorteada(int numeroSorteado){
        if(numeroSorteado <= 15)
            return letras[0];
        else if(numeroSorteado <= 30)
            return letras[1];
        else if(numeroSorteado <= 45)
            return letras[2];
        else if(numeroSorteado <= 60)
            return letras[3];
        else
            return letras[4];
    }

    private void marcarNumeroSorteado(JLabel lblNumero){
        pintarNumero(lblNumero, Color.BLACK);
    }

    private void marcarNumeroNaoSorteado(JLabel lblNumero){
        pintarNumero(lblNumero, Color.LIGHT_GRAY);
    }

    private void pintarNumero(JLabel lblNumero, Color color){
        lblNumero.setForeground(color);
    }

    private void editarOpcoes(){
        JFrame frame = new JFrame("Editar opções");
        frame.setLocationRelativeTo(panPrincipal);
        new FormOpcoes(this, frame);
        frame.setVisible(true);
    }

    public void setLetras(String[] letras){
        if(letras.length == 5) {
            this.letras = letras;
            initLetras();
        }
    }

    private void initComponentes(){
        btnSortear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortearNumero();
            }
        });
        btnReiniciarSorteio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(panPrincipal, "Deseja realmente iniciar um novo sorteio?", "Novo sorteio", JOptionPane.OK_CANCEL_OPTION);
                if(resposta == 0)
                    initSorteio();
            }
        });
        btnOpcoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarOpcoes();
            }
        });
    }
}
