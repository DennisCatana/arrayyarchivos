import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class vehiculosxd {
    public static ArrayList<vehiculosxd> vehiculos = new ArrayList<>();

    private JPanel vehiculosxd;
    private JTextField marcax;
    private JTextField anio;
    private JTextField color;
    private JButton GuardarButton;
    private JButton anteriorButton;
    private JButton siguienteButton;
    private JButton MostrarButton;

    public vehiculosxd() {
        GuardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = marcax.getText();
                int aniox = Integer.parseInt(anio.getText());
                String colorx = color.getText();

                vehiculosxd vehiculo = new vehiculosxd(marca, aniox, colorx);
                vehiculos.add(vehiculo);

                // Limpiar campos de texto
                marcax.setText("");
                anio.setText("");
                color.setText("");
            }
        });

        MostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar los detalles de cada vehículo en la consola
                for (vehiculosxd : vehiculos) {
                    System.out.println(vehiculo.getMarca() + " " + vehiculo.getAnio() + " " + vehiculo.getColor());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("vehiculosxd");
        frame.setContentPane(new vehiculosxd().vehiculosxd);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}