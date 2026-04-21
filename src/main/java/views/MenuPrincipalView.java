package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipalView extends JFrame {

    public MenuPrincipalView() {
       
        setTitle("Menú Principal - Gestión de Vehículos");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(2, 1, 10, 10)); 

       
        JButton btnListar = new JButton("Listar Vehículos");
        JButton btnAgregar = new JButton("Agregar Vehículo");

      
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                ListarVehiculosView listarView = new ListarVehiculosView();
                listarView.setVisible(true);
            }
        });

     
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(null, "Abriendo ventana de alta (En desarrollo por Integrante 2)");
                
                //falta alta vehiculo;
                
            }
        });

       
        add(btnListar);
        add(btnAgregar);
    }
}