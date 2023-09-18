/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sequence;

import Menus.MenuPrincipal;
import Menus.RegistroUser;
import clases.logica_tab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Multi extends javax.swing.JFrame {
    private int selec;
    private int equipoLog;
    private String name[];
    private  String n="";
    private int cantEquipos=0;
    private int E1=0;
    private int E2=0;
    private int E3=0;
    private int jper=0;
    private int swis=0;
    private int conta=0;
    
    public Multi() {
        initComponents();
        RegistroUser r = new RegistroUser();
        
//        ImageIcon icon = new ImageIcon("src/images/fondos/fondo_selecjug.png");
//        fondo_op.setIcon(icon);
        
        equipoLog=0;
        selec=0;
        swis=2;
        try {
            int t=r.getCantidadJ();
            name=new String[t];
            JOptionPane.showMessageDialog(null, "FUNCIONA");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error dormir");
        }
        String us=RegistroUser.getLogin();
        seleccionados.setText(us);
        oponentes();
        lista.setVisible(false);
        equipos();
        
        
    }
   
    private void oponentes() {//salida en combobox mostrara todos menos el login ya que ese fijo juega
        try {           
            RegistroUser reg=new RegistroUser();
            String usuarios=reg.listarUsuarios();
            String[] usuariosArray=usuarios.split("\n");
            
            String us=RegistroUser.getLogin();//obtener el login
            
            for (String usuario : usuariosArray) {
                if(!usuario.equals(us))
                    lista.addItem(usuario);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Anda dormi mejor 2");
        }
    }
    
    private void equipos() {//salida en combobox mostrara EQUIPOS
        try {
            equipo.removeAllItems(); 
            RegistroUser reg=new RegistroUser();
            int j=reg.getCantidadJ();
            if (j == 2) {
                equipo.addItem("TURNO 1");
                equipo.addItem("TURNO 2");
                cantEquipos=2;
                jper=1;
                confi.setText("Modo de "+j+" jugadores");
            } else if (j == 3) {
                equipo.addItem("TURNO 1");
                equipo.addItem("TURNO 2");
                equipo.addItem("TURNO 3");
                cantEquipos=3;
                jper=1;
                confi.setText("Modo de "+j+" jugadores");
            } else if (j == 4) {
                equipo.setVisible(false);
                lista.setVisible(true);
                String us=RegistroUser.getLogin();
                seleccionados.setText(us+"-"+"EQUIPO 1");
                n=us+"-"+"EQUIPO 1\n";
                conta++;
                E1++;
                cantEquipos=2;
                jper=2;
                confi.setText("Selecciona para equipo 2");
            } else if (j == 6) {
                equipo.setVisible(false);
                lista.setVisible(true);
                String us=RegistroUser.getLogin();
                seleccionados.setText(us+"-"+"EQUIPO 1");
                n=us+"-"+"EQUIPO 1\n";
                conta++;
                E1++;
                cantEquipos=3;
                jper=2;
                confi.setText("Selecciona para equipo 2");
            } else if (j == 8) {
                equipo.setVisible(false);
                lista.setVisible(true);
                String us=RegistroUser.getLogin();
                seleccionados.setText(us+"-"+"EQUIPO 1");
                n=us+"-"+"EQUIPO 1\n";
                cantEquipos=2;
                E1++;
                conta++;
                jper=4;
                confi.setText("Selecciona para equipo 2");
            } 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Anda dormi mejor 3");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seleccionados = new javax.swing.JTextArea();
        lista = new javax.swing.JComboBox<>();
        confi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbn_inicio = new javax.swing.JButton();
        btn_sele = new javax.swing.JButton();
        equipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        seleccionados.setEditable(false);
        seleccionados.setBackground(new java.awt.Color(153, 153, 153));
        seleccionados.setColumns(20);
        seleccionados.setRows(5);
        jScrollPane1.setViewportView(seleccionados);

        lista.setBackground(new java.awt.Color(153, 153, 153));
        lista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        confi.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        confi.setForeground(new java.awt.Color(102, 0, 0));
        confi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("MultiJugador");

        tbn_inicio.setBackground(new java.awt.Color(102, 0, 0));
        tbn_inicio.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        tbn_inicio.setText("Regresar");
        tbn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbn_inicioMouseClicked(evt);
            }
        });
        tbn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_inicioActionPerformed(evt);
            }
        });

        btn_sele.setBackground(new java.awt.Color(102, 0, 0));
        btn_sele.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        btn_sele.setText("Seleccionar");
        btn_sele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_seleMouseClicked(evt);
            }
        });

        equipo.setBackground(new java.awt.Color(153, 153, 153));
        equipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Jugadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn_sele, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confi, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(314, 314, 314)
                    .addComponent(jLabel3)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_sele)
                        .addGap(18, 18, 18)
                        .addComponent(tbn_inicio))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(398, 398, 398)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbn_inicioMouseClicked
        MenuPrincipal mi=new MenuPrincipal();
        mi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbn_inicioMouseClicked

    private void btn_seleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_seleMouseClicked
        RegistroUser r = new RegistroUser();
        String jugadores = lista.getSelectedItem().toString();
        try {
            //para modo 2 y 3
            if (selec < r.getCantidadJ() && (r.getCantidadJ()==2 || r.getCantidadJ()==3)) {
                        String equipos = equipo.getSelectedItem().toString(); 
                if(equipoLog==0){
                    if (equipos.equals("TURNO 1")) {
                        E1++;
                    } else if ( equipos.equals("TURNO 2")) {
                        E2++;
                    } else if ( equipos.equals("TURNO 3")) {
                        E3++;
                    }
                    String us = RegistroUser.getLogin();
                    n = us + "-" + equipos.trim()+ "\n";
                    name[selec] = us;
                    seleccionados.setText(us);
                    equipoLog++;
                    selec++;
                    lista.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Has seleccionado tu turno");
                    seleccionados.setText(n);
                }else if(equipoLog>=1){
                        if (!buscan(name, jugadores)) {
                            if (( equipos.equals("TURNO 1")&& E1 < jper ) ||
                                (equipos.equals("TURNO 2") && E2 < jper )||
                                (equipos.equals("TURNO 3") && E3 < jper )) {
                                name[selec] = jugadores;
                                selec++;
                                //aqui se hara setColor para 2
    //                             n += jugadores + "-" + equipos + (equipos.equals("EQUIPO 1") ? E1 : equipos.equals("EQUIPO 2") ? E2 : E3) + jper + "\n";
                                 n += jugadores + "-" + equipos.trim()+ "\n";
                                seleccionados.setText(n);
                                if (equipos.equals("TURNO 1")) {
                                    E1++;
                                } else if (equipos.equals("TURNO 2")) {
                                    E2++;
                                } else if (equipos.equals("TURNO 3")) {
                                    E3++;
                                }
                                if (selec == r.getCantidadJ()) {
                                    JOptionPane.showMessageDialog(null, "PREPARENSE PARA JUGAR");
//                                    TabSequence t = new TabSequence(n);
//                                    t.setVisible(true);
                                    this.setVisible(false);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Turno ocupado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Jugador YA fue seleccionado");
                        }
                    }
                //para modo 4, 6 y 8 EQUIPOS
            }else if(selec < r.getCantidadJ() && (r.getCantidadJ()>3) ){
                //que seleccione segun jugador por equipo alternado
                    
                    String eq="EQUIPO 2";
                    if (!buscan(name, jugadores)) {
                        if ((E1 < jper ) ||
                            (  E2 < jper )||
                            ( E3 < jper )) {
                            name[selec] = jugadores;
                            selec++;
                            JOptionPane.showMessageDialog(null, "Jugador añadido");
                            seleccionados.setText(n);
                            if (swis==1 && E1 < jper) {
                                E1++;
                                eq="EQUIPO 1";
                                swis=2;
                                confi.setText("Selecciona para equipo 2");
                                conta++;
                            } else if (swis==2 && E2 < jper) {
                                E2++;
                                eq="EQUIPO 2";
                                conta++;
                                if(r.getCantidadJ()==6){
                                    swis=3;
                                    confi.setText("Selecciona para equipo 3");
                                }else{
                                    swis=1;
                                    confi.setText("Selecciona para equipo 1");
                                }
                            } else if (swis==3 && E3 < jper) {
                                E3++;
                                eq="EQUIPO 3";
                                swis=1;
                                conta++;
                                confi.setText("Selecciona para equipo 1");
                            }
                    
                            n += jugadores + "-" + eq+ "\n";
                            seleccionados.setText(n);

                            if (r.getCantidadJ()==conta ) {
                                JOptionPane.showMessageDialog(null, "Puedes continuar");
                                //aqui se llama la funcion que le va a dar set color a todo
//                                TabSequence t = new TabSequence(n);
//                                t.setVisible(true);
                                this.setVisible(false);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Equipo lleno, son "+jper+" por equipo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Jugador YA fue seleccionado");
                    }
                 
            } else {
                JOptionPane.showMessageDialog(null, "Puedes continuar");
//                TabSequence t = new TabSequence(n);
//                t.setVisible(true);
                this.setVisible(false);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "...");
        }
    }//GEN-LAST:event_btn_seleMouseClicked

    private void tbn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbn_inicioActionPerformed
    private boolean buscan(String[] array, String player) {
        for (String b : array) {
            if (b != null && b.equals(player)) {
                return true;
            }
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sele;
    private javax.swing.JLabel confi;
    private javax.swing.JComboBox<String> equipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JTextArea seleccionados;
    private javax.swing.JButton tbn_inicio;
    // End of variables declaration//GEN-END:variables
}
