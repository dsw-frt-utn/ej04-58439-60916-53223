package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.MenuPrincipalView; 
import javax.swing.SwingUtilities;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
       
        Persistencia.inicializar();

       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuPrincipalView menu = new MenuPrincipalView();
                menu.setVisible(true);
            }
        });
    }
}