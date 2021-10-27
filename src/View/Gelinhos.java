package View;

import Model.Gelinho;
import Model.Vendas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gelinhos {
    private JPanel pnlMain;
    private JTabbedPane tabbedMain;
    private JPanel pnlAdicionar;
    private JPanel pnlEstoque;
    private JPanel pnlVendas;
    private JLabel lblGelinhos;
    private JSpinner spinAddAmendoim;
    private JSpinner spinAddCoco;
    private JSpinner spinAddLimao;
    private JSpinner spinAddMaracuja;
    private JSpinner spinAddUva;
    private JTextField txtAddRS;
    private JTextField txtAddQuantidade;
    private JButton btnAddAdicionarAoEstoque;
    private JButton btnAddZerar;
    private JCheckBox CheckBEstoqueAmendoim;
    private JCheckBox CheckBEstoqueCoco;
    private JCheckBox CheckBEstoqueLimao;
    private JCheckBox CheckBEstoqueMaracuja;
    private JCheckBox CheckBEstoqueUva;
    private JTextField txtEstoqueAmendoim;
    private JTextField txtEstoqueCoco;
    private JTextField txtEstoqueLimao;
    private JTextField txtEstoqueMaracuja;
    private JTextField txtEstoqueUva;
    private JComboBox comboBEstoqueEdit;
    private JTextField txtEstoqueRS;
    private JTextField txtEstoqueQuantidade;
    private JSpinner spinVendasAmendoim;
    private JSpinner spinVendasCoco;
    private JSpinner spinVendasLimao;
    private JSpinner spinVendasMaracuja;
    private JSpinner spinVendasUva;
    private JTextField txtVendasRS;
    private JTextField txtVendasQuantidade;
    private JButton btnVendasRegistrarVenda;
    private JButton btnVendasZerar;
    private JTextField txtVendasNomeCliente;
    private JLabel lblAddAmendoim;
    private JLabel lblAddCoco;
    private JLabel lblAddLimao;
    private JLabel lblAddMaracuja;
    private JLabel lblAddUva;
    private JLabel lblAddRS;
    private JLabel lblAddQuantidade;
    private JPanel pnlAddAuxDados;
    private JPanel pnlAddMain;
    private JLabel lblEstoqueRS;
    private JLabel lblEstoqueQuantidade;
    private JLabel lblEstoqueDados;
    private JPanel pnlEstoqueMain;
    private JPanel pnlEstoqueAuxDados;
    private JPanel pnlEstoqueAux;
    private JLabel lblVendasAmendoim;
    private JLabel lblVendasCoco;
    private JLabel lblVendasLimao;
    private JLabel lblVendasMaracuja;
    private JLabel lblVendasUva;
    private JLabel lblVendasNomeCliente;
    private JLabel lblVendasRS;
    private JLabel lblVendasQuantidade;
    private JPanel pnlVendasMain;
    private JPanel pnlVendasAux;
    private JPanel pnlVendasAuxDados;
    private JPanel pnlBotoes;
    private JPanel pnlAddAux;
    private JPanel pnlAddBotoes;
    private JTextField txtVendasDescontos;
    private JTextField txtVendasVendasAPagar;
    private JPanel pnlVendasDadosFinais;
    private JLabel lblVendasDesconto;
    private JLabel lblVendasValorAPagar;
    private JLabel lblEstoqueQuantidadeAmendoim;
    private JLabel lblEstoqueQuantidadeCoco;
    private JLabel lblEstoqueQuantidadeLimao;
    private JLabel lblEstoqueQuantidadeMaracuja;
    private JLabel lblEstoqueQuantidadeUva;

    public Gelinhos() {
        //-------------------------------------------------------------ADICIONA------------------------------------
        btnAddAdicionarAoEstoque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Deseja realmente efetuar o incrementos dos gelinhos? ");
                if (result == JOptionPane.OK_OPTION){
                    //AQUI SERÃO GERADOS OS OBJETOS E INTEGRADOS AO BANCO
                    JOptionPane.showMessageDialog(null, "Gelinhos integrados ao estoque");
                    adicionaGelinho();
                    calculaQuantidadeEstoque();
                    limpaAdiciona();
                }
            }
        });
        //-------------------------------------------------------------ESTOQUE------------------------------------
        comboBEstoqueEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mudandoEditView();
            }
        });

        //-------------------------------------------------------------VENDAS------------------------------------
        btnVendasRegistrarVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Deseja registrar a venda? ");
                if (result == JOptionPane.OK_OPTION){
                    //AQUI SERÃO GERADOS OS OBJETOS E INTEGRADOS AO BANCO
                    JOptionPane.showMessageDialog(null, "Venda registrada com sucesso");
                    limpaVendas();
                }
            }
        });
        txtVendasQuantidade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        txtEstoqueQuantidade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculaQuantidadeEstoque();
            }
        });


    }
    //-------------------------------------------------------------ADICIONA------------------------------------
    //METODO LIMPA COMPONENTES
    public void adicionaGelinho(){
        txtEstoqueAmendoim.setText(String.valueOf(spinAddAmendoim.getValue()));
        txtEstoqueCoco.setText(String.valueOf(spinAddCoco.getValue()));
        txtEstoqueLimao.setText(String.valueOf(spinAddLimao.getValue()));
        txtEstoqueMaracuja.setText(String.valueOf(spinAddMaracuja.getValue()));
        txtEstoqueUva.setText(String.valueOf(spinAddUva.getValue()));
    }

    public void limpaAdiciona(){
        spinAddAmendoim.setValue(0);
        spinAddCoco.setValue(0);
        spinAddLimao.setValue(0);
        spinAddMaracuja.setValue(0);
        spinAddUva.setValue(0);
    }

    //-------------------------------------------------------------VENDAS------------------------------------
    //METODO LIMPA COMPONENTES
    public void limpaVendas(){
        txtVendasNomeCliente.setText(" ");
        spinVendasAmendoim.setValue(0);
        spinVendasCoco.setValue(0);
        spinVendasLimao.setValue(0);
        spinVendasMaracuja.setValue(0);
        spinVendasUva.setValue(0);
        txtVendasDescontos.setText(" ");
        txtVendasNomeCliente.requestFocus();
    }

    public void calculaQuantidadeEstoque(){
        int soma;
        int quantidadeAmendoim = Integer.parseInt(txtEstoqueAmendoim.getText());
        int quantidadeCoco = Integer.parseInt(txtEstoqueCoco.getText());
        int quantidadeLimao = Integer.parseInt(txtEstoqueLimao.getText());
        int quantidadeMaracuja = Integer.parseInt(txtEstoqueMaracuja.getText());
        int quantidadeUva = Integer.parseInt(txtEstoqueUva.getText());

        soma = quantidadeAmendoim+quantidadeCoco+quantidadeLimao+quantidadeMaracuja+quantidadeUva;
        txtEstoqueQuantidade.setText(String.valueOf(soma));
        txtEstoqueRS.setText(String.valueOf(soma*1.5));
    }



    //-------------------------------------------------------------ESTOQUE------------------------------------

    //MUDANDO ESTADO DE VIEW E EDIT NO PAINEL DE ESTOQUE
    public void mudandoEditView(){
        if (comboBEstoqueEdit.getSelectedItem() == "Edit"){
            txtEstoqueAmendoim.setEditable(true);
            txtEstoqueCoco.setEditable(true);
            txtEstoqueLimao.setEditable(true);
            txtEstoqueMaracuja.setEditable(true);
            txtEstoqueUva.setEditable(true);
        }else if (comboBEstoqueEdit.getSelectedItem() == "View"){
            txtEstoqueAmendoim.setEditable(false);
            txtEstoqueCoco.setEditable(false);
            txtEstoqueLimao.setEditable(false);
            txtEstoqueMaracuja.setEditable(false);
            txtEstoqueUva.setEditable(false);
        }
    }



    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setContentPane(new Gelinhos().pnlMain);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    }
}
