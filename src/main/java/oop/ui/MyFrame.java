package oop.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Created by zn on 2018/7/12.
 */
public class MyFrame extends JFrame{
   public MyFrame() {
       this.setSize(300,400);
       this.setTitle("My frame...");
//       FlowLayout flowLayout = new FlowLayout();
       GridLayout gridLayout = new GridLayout(3,2);
       this.setLayout(gridLayout);
       JButton btnNorth = new JButton("北方");
       JButton btnSouth = new JButton("南方");
       JButton btnEast = new JButton("东方");
       JButton btnWest = new JButton("西方");
       final JButton btnCenter = new JButton("中间");

       //==== 添加事件 ====
       btnNorth.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JButton button = (JButton) e.getSource();
               button.setBackground(Color.BLUE);
           }
       });
       btnSouth.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JButton button = (JButton) e.getSource();
               button.setBackground(Color.GREEN);
           }
       });
       btnEast.setActionCommand("east");
       btnWest.setActionCommand("west");
       btnCenter.setActionCommand("center");
//       ActionListener actionListener = new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               String command = e.getActionCommand();
//               JButton button = (JButton) e.getSource();
//               if(command.equals("east")) {
//                   button.setBackground(Color.BLUE);
//               } else if(command.equals("west")) {
//                   button.setForeground(Color.red);
//               } else if(command.equals("center")) {
//                   JOptionPane.showMessageDialog(MyFrame.this,"大家好");
//               }
//           }
//       };
       ActionListenerImpl actionListener = new ActionListenerImpl();
       btnEast.addActionListener(actionListener);
       btnWest.addActionListener(actionListener);
       btnCenter.addActionListener(actionListener);
       this.add(btnNorth);
       this.add(btnSouth);
       this.add(btnEast);
       this.add(btnWest);
       this.add(btnCenter);

//       this.add(btnNorth, BorderLayout.NORTH);
//       this.add(btnSouth, BorderLayout.SOUTH);
//       this.add(btnEast, BorderLayout.EAST);
//       this.add(btnWest, BorderLayout.WEST);
//       this.add(btnCenter, BorderLayout.CENTER);

       setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   public static void main(String [] args) {
       MyFrame myFrame = new MyFrame();
   }
}