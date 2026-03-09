package com.foxsteps.gsonformat.ui;

import com.foxsteps.gsonformat.i18n.GsonFormatPlusBundle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorDialog extends JFrame {

    private JPanel contentPane;
    private JTextPane editTP;
    private JButton okButton;
    private JScrollPane scrollPane;

    public ErrorDialog(String errorInfo) {
        initLocalization();
        setContentPane(contentPane);
        setTitle("Error Info");
        getRootPane().setDefaultButton(okButton);
        this.setAlwaysOnTop(true);
        editTP.setText(errorInfo);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        editTP.setCaretPosition(0);

    }

    private void initLocalization() {
        okButton.setText(GsonFormatPlusBundle.message("common.ok"));
    }
}
