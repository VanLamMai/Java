/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import javax.swing.JFrame;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SimplePaint wd = new SimplePaint();
        wd.setSize(600, 600);
        wd.setResizable(false);
        wd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wd.setLocationRelativeTo(null);
        wd.setVisible(true);
    }
}