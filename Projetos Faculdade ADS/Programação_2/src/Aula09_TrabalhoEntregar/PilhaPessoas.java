/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula09_TrabalhoEntregar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Pessoa {

    public Pessoa(String nome, int idade, String sexo, double altura) {
    }
}
class PilhaPessoasGUI extends JFrame {
    private JPanel panel;
    private JTextField nomeTextField, idadeTextField, sexoTextField, alturaTextField;
    private JButton adicionarButton, removerButton;
    private JTextArea pilhaTextArea;
    private PilhaPessoas pilha;

    public PilhaPessoasGUI() {
        // Configuração da janela
        super("Pilha de Pessoas");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação dos componentes
        panel = new JPanel(new GridLayout(5, 2));
        nomeTextField = new JTextField();
        idadeTextField = new JTextField();
        sexoTextField = new JTextField();
        alturaTextField = new JTextField();
        adicionarButton = new JButton("Adicionar Pessoa");
        removerButton = new JButton("Remover Pessoa do Topo");
        pilhaTextArea = new JTextArea();

        // Adiciona os componentes ao painel
        panel.add(new JLabel("Nome:"));
        panel.add(nomeTextField);
        panel.add(new JLabel("Idade:"));
        panel.add(idadeTextField);
        panel.add(new JLabel("Sexo:"));
        panel.add(sexoTextField);
        panel.add(new JLabel("Altura:"));
        panel.add(alturaTextField);
        panel.add(adicionarButton);
        panel.add(removerButton);

        // Adiciona o painel à janela
        add(panel, BorderLayout.NORTH);
        add(pilhaTextArea, BorderLayout.CENTER);

        // Criação da pilha
        pilha = new PilhaPessoas();

        // Adiciona o listener ao botão de adicionar
        adicionarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                int idade = Integer.parseInt(idadeTextField.getText());
                String sexo = sexoTextField.getText();
                double altura = Double.parseDouble(alturaTextField.getText());

                Pessoa pessoa = new Pessoa(nome, idade, sexo, altura);
                pilha.push(pessoa);
                pilhaTextArea.append(pessoa.toString() + "\n");
                nomeTextField.setText("");
                idadeTextField.setText("");
                sexoTextField.setText("");
                alturaTextField.setText("");
            }
        });

        // Adiciona o listener ao botão de remover
        removerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pessoa pessoaRemovida = pilha.pop();
                if (pessoaRemovida != null) {
                    JOptionPane.showMessageDialog(null, "Pessoa removida: " + pessoaRemovida.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Pilha vazia!");
                }
            }
        });
    }

   
}

class PilhaPessoas {
     public static void main(String[] args) {
        PilhaPessoasGUI pilhaGUI = new PilhaPessoasGUI();
        pilhaGUI.setVisible(true);
    }

    void push(Object pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Pessoa pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
