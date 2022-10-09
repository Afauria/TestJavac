package com.afauria.ui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton loginBtn = new JButton("登录");
        JTextField codeField = new JTextField();
        codeField.setBounds(20, 20, 160, 40);
        loginBtn.setBounds(20, 60, 160, 40);
        JPanel pane = new JPanel();
        setContentPane(pane);
        pane.setLayout(null);
        pane.add(codeField);
        pane.add(loginBtn);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (checkLogin(codeField.getText())) {
                    JOptionPane.showMessageDialog(MainFrame.this, "登录成功！");
                } else {
                    JOptionPane.showMessageDialog(MainFrame.this, "登录失败！");
                }

            }
        });
    }

    private boolean checkLogin(String code) {
        return "123".equals(code);
    }
}