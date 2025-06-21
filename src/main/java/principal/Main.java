package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um numero inteiro"));
          int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um numero inteiro"));

          int c = b + a;

          JOptionPane.showMessageDialog(null,"A soma de dois números inteiros é: "+c);
    }
}