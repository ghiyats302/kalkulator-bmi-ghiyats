package com.mycompany.klakulatorbmi;

import BMI_S.BMI_Sys; // Mengimpor JFrame dari package BMI_S

public class KlakulatorBMI {

    public static void main(String[] args) {
        // Memunculkan form BMI_Sys saat program dijalankan
        java.awt.EventQueue.invokeLater(() -> {
            new BMI_Sys().setVisible(true);
        });
    }
}