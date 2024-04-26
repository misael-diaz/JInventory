import javax.swing.JFrame;

public class Inventory
{
  public static final int WINDOW_LEN = 2048;
  public static void main (String args[])
  {
    JFrame frame = new JFrame();
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
