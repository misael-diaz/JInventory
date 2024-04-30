import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Font;

public class Inventory
{
  public static final int WINDOW_LEN = 2048;
  public static void main (String args[])
  {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JPanel headPanel = new JPanel();
    JLabel headLabel = new JLabel("PURCHASE ORDER");
    headLabel.setFont(new Font("Arial", Font.BOLD, 64));
    headPanel.add(headLabel);

    JPanel formPanel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(32, 32, 32, 32);

    JLabel clientLabel = new JLabel("Client:");
    clientLabel.setFont(new Font("Arial", Font.PLAIN, 40));
    Dimension dim = clientLabel.getPreferredSize();
    dim.setSize(dim.getWidth(), 48);
    clientLabel.setPreferredSize(new Dimension(dim));
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 2;
    formPanel.add(clientLabel, gbc);

    JTextField clientTxt = new JTextField(64);
    Dimension clientDim = clientTxt.getPreferredSize();
    clientDim.setSize(clientDim.getWidth(), 48);
    clientTxt.setPreferredSize(new Dimension(clientDim));

    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    formPanel.add(clientTxt, gbc);

    JLabel productLabel = new JLabel("Product");
    productLabel.setFont(new Font("Arial", Font.PLAIN, 40));
    gbc.gridx = 0;
    gbc.gridy = 1;
    formPanel.add(productLabel, gbc);

    JLabel unitValueLabel = new JLabel("Unit Value");
    unitValueLabel.setFont(new Font("Arial", Font.PLAIN, 40));
    gbc.gridx = 1;
    gbc.gridy = 1;
    formPanel.add(unitValueLabel, gbc);

    JLabel quantityLabel = new JLabel("Quantity");
    quantityLabel.setFont(new Font("Arial", Font.PLAIN, 40));
    gbc.gridx = 2;
    gbc.gridy = 1;
    formPanel.add(quantityLabel, gbc);

    JLabel totalLabel = new JLabel("Total");
    totalLabel.setFont(new Font("Arial", Font.PLAIN, 40));
    gbc.gridx = 3;
    gbc.gridy = 1;
    formPanel.add(totalLabel, gbc);

    JTextField prodTxt1 = new JTextField(32);
    prodTxt1.setPreferredSize(new Dimension(dim));
    gbc.gridx = 0;
    gbc.gridy = 2;
    formPanel.add(prodTxt1, gbc);

    JTextField unitValTxt1 = new JTextField(32);
    unitValTxt1.setPreferredSize(new Dimension(dim));
    gbc.gridx = 1;
    gbc.gridy = 2;
    formPanel.add(unitValTxt1, gbc);

    JTextField quantityTxt1 = new JTextField(32);
    quantityTxt1.setPreferredSize(new Dimension(dim));
    gbc.gridx = 2;
    gbc.gridy = 2;
    formPanel.add(quantityTxt1, gbc);

    JTextField totalTxt1 = new JTextField(32);
    totalTxt1.setPreferredSize(new Dimension(dim));
    gbc.gridx = 3;
    gbc.gridy = 2;
    formPanel.add(totalTxt1, gbc);


    JTextField prodTxt2 = new JTextField(32);
    prodTxt2.setPreferredSize(new Dimension(dim));
    gbc.gridx = 0;
    gbc.gridy = 3;
    formPanel.add(prodTxt2, gbc);

    JTextField unitValTxt2 = new JTextField(32);
    unitValTxt2.setPreferredSize(new Dimension(dim));
    gbc.gridx = 1;
    gbc.gridy = 3;
    formPanel.add(unitValTxt2, gbc);

    JTextField quantityTxt2 = new JTextField(32);
    quantityTxt2.setPreferredSize(new Dimension(dim));
    gbc.gridx = 2;
    gbc.gridy = 3;
    formPanel.add(quantityTxt2, gbc);

    JTextField totalTxt2 = new JTextField(32);
    totalTxt2.setPreferredSize(new Dimension(dim));
    gbc.gridx = 3;
    gbc.gridy = 3;
    formPanel.add(totalTxt2, gbc);


    JTextField prodTxt3 = new JTextField(32);
    prodTxt3.setPreferredSize(new Dimension(dim));
    gbc.gridx = 0;
    gbc.gridy = 4;
    formPanel.add(prodTxt3, gbc);

    JTextField unitValTxt3 = new JTextField(32);
    unitValTxt3.setPreferredSize(new Dimension(dim));
    gbc.gridx = 1;
    gbc.gridy = 4;
    formPanel.add(unitValTxt3, gbc);

    JTextField quantityTxt3 = new JTextField(32);
    quantityTxt3.setPreferredSize(new Dimension(dim));
    gbc.gridx = 2;
    gbc.gridy = 4;
    formPanel.add(quantityTxt3, gbc);

    JTextField totalTxt3 = new JTextField(32);
    totalTxt3.setPreferredSize(new Dimension(dim));
    gbc.gridx = 3;
    gbc.gridy = 4;
    formPanel.add(totalTxt3, gbc);


    JLabel grandTotalLabel = new JLabel("Grand Total");
    grandTotalLabel.setFont(new Font("Arial", Font.PLAIN, 40));
    gbc.gridx = 2;
    gbc.gridy = 5;
    formPanel.add(grandTotalLabel, gbc);

    JTextField grandTotalTxt = new JTextField(32);
    grandTotalTxt.setPreferredSize(new Dimension(dim));
    gbc.gridx = 3;
    gbc.gridy = 5;
    formPanel.add(grandTotalTxt, gbc);


    JButton button = new JButton("Calculate");
    button.setFont(new Font("Arial", Font.PLAIN, 40));
    gbc.gridx = 3;
    gbc.gridy = 6;
    formPanel.add(button, gbc);


    panel.add(headPanel);
    panel.add(formPanel);
    frame.add(panel);
    frame.setTitle("Inventory");
    frame.setSize(Inventory.WINDOW_LEN, Inventory.WINDOW_LEN);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

/*

JInventory					April 25, 2024

source: JInventory.java
author: misael-diaz

Copyright (c) 2024 Misael Díaz-Maldonado
This file is released under the GNU General Public License as published
by the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

*/
