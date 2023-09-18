/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import Menus.MenuPrincipal;
import Menus.RegistroUser;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Configuracion extends javax.swing.JFrame {

    RegistroUser obrg = new RegistroUser();
    private String[] coloresSeleccionados;
    private int contClicksFicha;

    public Configuracion() {
        initComponents();

        contClicksFicha = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbn_inicio = new javax.swing.JButton();
        btn_cantidad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tbn_inicio.setBackground(new java.awt.Color(102, 0, 0));
        tbn_inicio.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        tbn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        tbn_inicio.setText("Regresar");
        tbn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbn_inicioMouseClicked(evt);
            }
        });

        btn_cantidad.setBackground(new java.awt.Color(102, 0, 0));
        btn_cantidad.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        btn_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        btn_cantidad.setText("Configurar jugadores y colores");
        btn_cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cantidadMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Broadway", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("CONFIGURACIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(tbn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cantidad))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbn_inicio)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbn_inicioMouseClicked
        boolean coloresNoSeleccionados = true;
        if (coloresSeleccionados != null) {
            for (String color : coloresSeleccionados) {
                if (color == null) {
                    coloresNoSeleccionados = false;
                    break;
                }
            }

        }

        if (coloresNoSeleccionados) {
            MenuPrincipal mi = new MenuPrincipal();
            mi.setVisible(true);
            this.setVisible(false);
            coloresSeleccionados = null;
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el color de los tokens", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbn_inicioMouseClicked

    private void btn_cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cantidadMouseClicked
        // SELLECIONAR cant JUGADORES terminado
        String[] opciones = {"2", "3", "4", "6", "8"};
        String seleccionJ = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la cantidad de jugadores:",
                "Players",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccionJ != null) {
            RegistroUser miRegistro = new RegistroUser();
            int cantidadUsuarios;

            try {
                cantidadUsuarios = miRegistro.contarUsuarios();
                int cantSeleccionado = Integer.parseInt(seleccionJ);

                if (cantSeleccionado <= cantidadUsuarios) {
                    JOptionPane.showMessageDialog(null, "Juego de "+cantSeleccionado+" jugadores");

                    try {
                        String colorFicha = miRegistro.getColorFicha();
                        int teamind = miRegistro.getModo();
                        String colorG = miRegistro.getColorEquipo();
                        miRegistro.sobreModo(cantSeleccionado, colorFicha, teamind, colorG);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR\nNo hay suficientes jugadores\nDebe agregar " + (cantSeleccionado-cantidadUsuarios)+ "", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "¡Error!", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Elegir modo/color
        RegistroUser miRegistro = new RegistroUser();
        String[] ColorMode = {"Equipo", "Individual"};
        String mod = (String) JOptionPane.showInputDialog(null,
                "¿Quieres elegir el color de token individual o grupal?",
                "Token Colors",
                JOptionPane.PLAIN_MESSAGE,
                null,
                ColorMode,
                ColorMode[0]);

        if (mod != null) {
            if (mod.equals("Equipo")) {
                try {
                    int t = 2;
                    int ContPlayers = miRegistro.getCantidadJ();
                    String colorFicha = miRegistro.getColorFicha();
                    String colorG = miRegistro.getColorEquipo();
                    miRegistro.sobreModo(ContPlayers, colorFicha, 0, colorG);

                    if (miRegistro.getCantidadJ() == 2) {
                        t = 2;
                    } else if (miRegistro.getCantidadJ() == 3) {
                        t = 3;
                    } else if (miRegistro.getCantidadJ() == 4) {
                        t = 2;
                    } else if (miRegistro.getCantidadJ() == 6) {
                        t = 3;
                    } else if (miRegistro.getCantidadJ() == 8) {
                        t = 2;
                    }
                    coloresSeleccionados = new String[t];
                    for (int i = 0; i < t; i++) {
                        String equipo = "Equipo " + (i + 1);
                        if (miRegistro.getCantidadJ() == 3) {
                            equipo = "Turn" + (i + 1);
                        } else if (miRegistro.getCantidadJ() == 2) {
                            equipo = "Turn" + (i + 1);
                        } else {

                        }
                        String seleccion = seleccionarColor(equipo);

                        if (seleccion != null) {
                            if (!yaSeleccionado(seleccion, coloresSeleccionados)) {
                                coloresSeleccionados[i] = seleccion;
                            } else {
                                JOptionPane.showMessageDialog(null, "Ese color ya fue elegido por otros");
                                i--;
                            }
                        }
                    }
                    listaColores();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                try {
                    String jugadorCambiar = listado();
                    String seleccion = "";
                    if (jugadorCambiar != null) {
                        seleccion = seleccionarColor(jugadorCambiar);

                        if (seleccion != null) {
                            int contadorJ = miRegistro.getCantidadJ();
                            String colorFicha = miRegistro.getColorFicha();
                            String colorG = miRegistro.getColorEquipo();
                            miRegistro.sobreModo(contadorJ, colorFicha, 1, colorG);
                            if (miRegistro.nadieTieneColor(seleccion)) {
                                obrg.sobreModoFuera(jugadorCambiar, seleccion);
                                JOptionPane.showMessageDialog(null, "Se ha añadido el color:  " + seleccion + "\nAl jugador:  " + jugadorCambiar, "", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(null, "Ya fue elegido");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error", "Modo Individual", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No selecciono jugador", "Colores Elegidos Individual", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btn_cantidadMouseClicked

    //MOSTRAR ESTO J VECES SEGUN CUANTOS EQUIPOS O INDI MIN
    private String seleccionarColor(String equipo) {
        String[] coloresDisponibles = {"AZUL", "AMARILLO", "VERDE", "ROJO", "MORADO", "NARANJA", "CAFE", "NEGRO"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona un color para el " + equipo + ":",
                "Selección de Color",
                JOptionPane.PLAIN_MESSAGE,
                null,
                coloresDisponibles,
                coloresDisponibles[0]);
        return seleccion;
    }
    //INDIVIDUAL

    public String listado() {
        try {
            RegistroUser reg = new RegistroUser();
            String usuarios = reg.listarUsuarios();
            String[] usuariosArray = usuarios.split("\n");

            JComboBox<String> comboBox = new JComboBox<>(usuariosArray);

            int opcion = JOptionPane.showConfirmDialog(null,
                    comboBox,
                    "Selecciona un usuario:",
                    JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.OK_OPTION) {
                String seleccion = (String) comboBox.getSelectedItem();
                return seleccion;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ups";
    }

    //COLORES YA SELECCIONADOS NO SE VALE DE NUEVO EQUIPO
    private boolean yaSeleccionado(String color, String[] colores) {
        for (String seleccionado : colores) {
            if (color.equals(seleccionado)) {
                return true;
            }
        }
        return false;
    }

    //GRUPAL
    //LISTA Y AÑADE LOS COLORES A MI ARCHIVO, SERAN SPLIT CON EL GUIEN DESPUES SIRVE PARA EQUIPO NO INDIVIDUAL
    private void listaColores() {
        try {
            RegistroUser miRegistro = new RegistroUser();
            if (coloresSeleccionados != null && coloresSeleccionados.length > 0) {
                String mensaje = "Colores elegidos:\n";
                String coloresConsola = "";

                for (int i = 0; i < coloresSeleccionados.length; i++) {
                    String equipo = "Equipo " + (i + 1);
                    if (miRegistro.getCantidadJ() == 3) {
                        equipo = "Turno " + (i + 1);
                    } else if (miRegistro.getCantidadJ() == 2) {
                        equipo = "Turno " + (i + 1);
                    } else {

                    }
                    mensaje += equipo + ": " + coloresSeleccionados[i] + "\n";
                    coloresConsola += coloresSeleccionados[i];

                    if (i < coloresSeleccionados.length - 1) {
                        coloresConsola += "-";
                    }
                }

                System.out.println("Colores en consola: " + coloresConsola);
                try {
                    int contadorJ = miRegistro.getCantidadJ();
                    String colorFicha = miRegistro.getColorFicha();
                    miRegistro.sobreModo(contadorJ, colorFicha, 0, coloresConsola);
                } catch (IOException e) {
                    e.printStackTrace();
                }
//                JOptionPane.showMessageDialog(null, mensaje, "Colores Elegidos", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "No fue hecha ninguna acción", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbn_inicio;
    // End of variables declaration//GEN-END:variables
}
