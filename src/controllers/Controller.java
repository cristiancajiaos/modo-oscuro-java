package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.Modelo;
import views.Vista;

public class Controller implements ActionListener {

    private Vista vista;
    private Modelo modelo;

    public Controller(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnHabilitarModoOscuro.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnHabilitarModoOscuro) {
            boolean modoOscuro = this.modelo.isModoOscuro();
            this.cambiarColor(modoOscuro ? this.modelo.deshabilitarModoOscuro() : this.modelo.habilitarModoOscuro());
        }
    }

    public void cambiarColor(boolean modoOscuroCambiar) {
        System.out.println(this.modelo.isModoOscuro());
        List<JLabel> listaEtiquetas = new ArrayList();
        List<JButton> listaBotones = new ArrayList();
        List<JPanel> listaPaneles = new ArrayList();
        
        listaEtiquetas.add(this.vista.etiquetaNombreUsuario);
        listaEtiquetas.add(this.vista.etiquetaContrasennia);
        
        listaBotones.add(this.vista.btnIngresar);
        
        listaPaneles.add(this.vista.panelBtnModoOscuro);
        listaPaneles.add(this.vista.panelPrincipal);
        
        for (JLabel etiqueta: listaEtiquetas) {
            etiqueta.setForeground(modoOscuroCambiar ? Color.WHITE : Color.BLACK);
        }
        
        for (JButton boton: listaBotones) {
            boton.setForeground(modoOscuroCambiar ? Color.WHITE : Color.BLACK);
            boton.setBackground(modoOscuroCambiar ? Color.BLACK : Color.WHITE);
        }
        
        for(JPanel panel: listaPaneles) {
            panel.setBackground(modoOscuroCambiar ? Color.BLACK : Color.WHITE);
        }
        
        this.vista.btnHabilitarModoOscuro.setText(modoOscuroCambiar ? "Deshabilitar modo oscuro" : "Habilitar modo oscuro");
    }

}
