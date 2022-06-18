/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Actividad;
import clases.Empleado;
import clases.Entrenador;
import clases.Monitor;
import clases.ServiciosAdicionales;
import clases.Socio;
import clases.Util;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        //director
        Date fecha1 = new GregorianCalendar(1978, Calendar.FEBRUARY, 11).getTime();
        Empleado e1 = new Empleado("37087726L", "Carmen Fuentes Aranda", fecha1, 82000, "617922845", UUID.randomUUID(), "Director", "carmen", "carmen1");

        //limpiadores
        Date fecha2 = new GregorianCalendar(1985, Calendar.OCTOBER, 18).getTime();
        Empleado e2 = new Empleado("27073914Q", "Antoni Pastor Carbonell", fecha2, 37000, "693655322", UUID.randomUUID(), "Limpiador", "antoniop", "antoniop18");

        Date fecha3 = new GregorianCalendar(2000, Calendar.JUNE, 2).getTime();
        Empleado e3 = new Empleado("13082948L", "Emilio Alba Cobos", fecha3, 55000, "703195309", UUID.randomUUID(), "Limpiador", "emilio_02", "emilio_0200");

        Date fecha4 = new GregorianCalendar(1994, Calendar.JANUARY, 30).getTime();
        Empleado e4 = new Empleado("14989130F", "Purificacion Zamora Brito", fecha4, 42000, "633184063", UUID.randomUUID(), "Limpiador", "puri_zamora", "purificada1122");

        Date fecha5 = new GregorianCalendar(1985, Calendar.MAY, 23).getTime();
        Empleado e5 = new Empleado("33998409Q", "Leticia Chen Guijarro", fecha5, 33000, "682166312", UUID.randomUUID(), "Limpiador", "leticia_guijarro", "atleti23");

        Date fecha6 = new GregorianCalendar(2001, Calendar.DECEMBER, 15).getTime();
        Empleado e6 = new Empleado("47388209K", "Claudia Ballesteros Tirado", fecha6, 35000, "755596056", UUID.randomUUID(), "Limpiador", "claudia_ball", "pelotas");

        //actividades
        Actividad cardio = new Actividad(UUID.randomUUID(), "Cardio", "18:00 - 19:00", "Sala cardio");
        Actividad piscina = new Actividad(UUID.randomUUID(), "Piscina", "13:00 - 14:00", "Sala piscina");
        Actividad fuerza = new Actividad(UUID.randomUUID(), "Fuerza", "15:30 - 16:30", "Sala fuerza");
        Actividad fitness = new Actividad(UUID.randomUUID(), "Fitness", "12:00 - 13:00", "Sala fitness");
        Actividad zumba = new Actividad(UUID.randomUUID(), "Zumba", "08:00 - 09:00", "Sala zumba");
        
        //monitores
       
        Date fecha7 = new GregorianCalendar(1996, Calendar.MAY, 22).getTime();
        Monitor e7 = new Monitor("76025665Q", "Iole Porras Miramontes", fecha7, 28000, "619533386", UUID.randomUUID(), "Monitor", "iole_porras", "iole22",cardio,6.78);

        Date fecha8 = new GregorianCalendar(1997, Calendar.AUGUST, 30).getTime();
        Monitor e8 = new Monitor("69568113A", "Belmiro Sandoval Gracia", fecha8, 28000, "772469003", UUID.randomUUID(), "Monitor", "belmiro_sand", "bel34", piscina, 5.65);

        Date fecha9 = new GregorianCalendar(1992, Calendar.APRIL, 25).getTime();
        Monitor e9 = new Monitor("960877677", "Lena Ochoa Heredia", fecha9, 29000, "613234960", UUID.randomUUID(), "Monitor", "lena_ochoa", "lena45", fuerza,8.12);

        Date fecha10 = new GregorianCalendar(1988, Calendar.MARCH, 14).getTime();
        Monitor e10 = new Monitor("351628626", "Ian Valentín Fonseca", fecha10, 28000, "735866198", UUID.randomUUID(), "Monitor", "ian_valen", "ian98", fitness,3.68);

        Date fecha11 = new GregorianCalendar(2001, Calendar.JANUARY, 17).getTime();
        Monitor e11 = new Monitor("38270261D", "Walda Laboy Salazar", fecha11, 28000, "737629858", UUID.randomUUID(), "Monitor", "walda_laboy", "walda01",zumba,6.01);

        //entrenadores
        Date fecha12 = new GregorianCalendar(1995, Calendar.NOVEMBER, 18).getTime();
        Entrenador e12 = new Entrenador("24986297V", "Monica Prado Oliva", fecha12, 35000, "783892153", UUID.randomUUID(), "Entrenador", "monica_59", "monica_59", 0, 8);

        Date fecha13 = new GregorianCalendar(1982, Calendar.FEBRUARY, 19).getTime();
        Entrenador e13 = new Entrenador("43795340M", "Ines Olmo Mohamed", fecha13, 35000, "678864918", UUID.randomUUID(), "Entrenador", "ines_01", "ines_01", 0, 8);

        Date fecha14 = new GregorianCalendar(1992, Calendar.MAY, 12).getTime();
        Entrenador e14 = new Entrenador("50781021B", "Juan Carlos Mateos Araujo", fecha14, 35000, "718204635", UUID.randomUUID(), "Entrenador", "juancarlos_82", "juancarlos_82", 0, 8);

        Date fecha15 = new GregorianCalendar(1990, Calendar.SEPTEMBER, 21).getTime();
        Entrenador e15 = new Entrenador("19735128R", "Gisela Romero Fraile", fecha15, 35000, "723497090", UUID.randomUUID(), "Entrenador", "gisela_84", "gisela_84", 0, 8);

        Date fecha16 = new GregorianCalendar(1976, Calendar.OCTOBER, 27).getTime();
        Entrenador e16 = new Entrenador("61916169P", "Victor Morcillo Alfaro", fecha16, 35000, "685468867", UUID.randomUUID(), "Entrenador", "victor_86", "victor_86", 0, 8);

        //recepcionistas
        Date fecha17 = new GregorianCalendar(1976, Calendar.SEPTEMBER, 10).getTime();
        Empleado e17 = new Empleado("82447655T", "Zoraida Montoya Cabrera", fecha17, 40000, "732843256", UUID.randomUUID(), "Recepcionista", "zoraida_78", "zoraida78");

        Date fecha18 = new GregorianCalendar(1982, Calendar.JULY, 27).getTime();
        Empleado e18 = new Empleado("24986297V", "Jezebel Juárez Jimínez", fecha18, 40000, "771679792", UUID.randomUUID(), "Recepcionista", "jezebel_2", "jezebel_2");

        //socios
        Socio s1 = new Socio("Pedrito1", "p123", "Pedro Garcia Lopez", "669785213", "pedro.g@gmail.com", "ES26387282", UUID.randomUUID());
        Socio s2 = new Socio("Lorena1", "l123", "Lorena Villaespesa Santo", "473892099", "lorena@gmail.com", "ES73845890", UUID.randomUUID());
        Socio s3 = new Socio("Carlos1", "c123", "Carlos Cifuentes Garcia", "521487965", "carlos@gmail.com", "ES36527871", UUID.randomUUID());
        Socio s4 = new Socio("Belen1", "b123", "Belen Martos Moral", "653214987", "belen@gmail.com", "ES56321489", UUID.randomUUID());
        Socio s5 = new Socio("Champi1", "ch123", "Sergio Onita", "987452167", "champi@gmail.com", "ES58961709", UUID.randomUUID());
        Socio s6 = new Socio("Paula1", "pau123", "Paula Prieto Martinez", "548796301", "paula@gmail.com", "ES78930123", UUID.randomUUID());
        Socio s7 = new Socio("Gonzalo1", "gon123", "Gonzalo Lopez Torremolinos", "789541204", "gonzalo@gmail.com", "ES56521876", UUID.randomUUID());

       

        //servicios adicionales
        ServiciosAdicionales jacuzzi = new ServiciosAdicionales(UUID.randomUUID(), "Jacuzzi");
        ServiciosAdicionales spa = new ServiciosAdicionales(UUID.randomUUID(), "Spa");
        ServiciosAdicionales sauna = new ServiciosAdicionales(UUID.randomUUID(), "Sauna");
        ServiciosAdicionales masaje = new ServiciosAdicionales(UUID.randomUUID(), "Masaje");

        //alta empleados y socios
        Util.altaEmpleado(e1);
        Util.altaSocio(s1);
        Util.altaEmpleado(e2);
        Util.altaSocio(s2);
        Util.altaEmpleado(e3);
        Util.altaSocio(s3);
        Util.altaEmpleado(e4);
        Util.altaSocio(s4);
        Util.altaEmpleado(e5);
        Util.altaSocio(s5);
        Util.altaSocio(s6);
        Util.altaSocio(s7);
        Util.altaEmpleado(e5);
        Util.altaEmpleado(e6);
        Util.altaEmpleado(e7);
        Util.altaEmpleado(e8);
        Util.altaEmpleado(e9);
        Util.altaEmpleado(e10);
        Util.altaEmpleado(e11);
        Util.altaEmpleado(e12);
        Util.altaEmpleado(e13);
        Util.altaEmpleado(e14);
        Util.altaEmpleado(e15);
        Util.altaEmpleado(e16);
        Util.altaEmpleado(e17);
        Util.altaEmpleado(e18);
        Util.altaActividad(cardio);
        Util.altaActividad(piscina);
        Util.altaActividad(fuerza);
        Util.altaActividad(fitness);
        Util.altaActividad(zumba);
        Util.registrar_Servicios_adicionales(jacuzzi);
        Util.registrar_Servicios_adicionales(spa);
        Util.registrar_Servicios_adicionales(sauna);
        Util.registrar_Servicios_adicionales(masaje);
        Util.asignarTurno(e2, "Mañana");
        Util.asignarZonaLimpieza("Zona A", e2);
        Util.asignarTurno(e3, "Mañana");
        Util.asignarZonaLimpieza("Zona B", e3);
        Util.asignarTurno(e4, "Mañana");
        Util.asignarZonaLimpieza("Zona C", e4);
        Util.asignarTurno(e5, "Tarde");
        Util.asignarZonaLimpieza("Zona D", e5);
        Util.asignarTurno(e6, "Tarde");
        Util.asignarZonaLimpieza("Zona E", e6);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("GIMNASIO POPEYE");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int numero;

        String usuario = jTextField1.getText();
        String contraseña = jPasswordField1.getText();

        numero = Util.inicioSesion(usuario, contraseña);

        switch (numero) {
            case -1:
                this.setVisible(false);
                Director director = new Director();
                director.setVisible(true);
                director.setLocationRelativeTo(null);
                director.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                director.setResizable(false);
                break;
            case -2:
                JOptionPane.showMessageDialog(this, "Incorrecto", "Mensaje", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                this.setVisible(false);
                MonitorVentana monitor = new MonitorVentana(usuario);
                monitor.setVisible(true);
                monitor.setLocationRelativeTo(null);
                monitor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                monitor.setResizable(false);
                break;
            case 2:
                this.setVisible(false);
                Recepcionista recepcionista = new Recepcionista();
                recepcionista.setVisible(true);
                recepcionista.setLocationRelativeTo(null);
                recepcionista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                recepcionista.setResizable(false);
                break;
            case 3:
                this.setVisible(false);
                EntrenadorVentana entrenador = new EntrenadorVentana();
                entrenador.setVisible(true);
                entrenador.setLocationRelativeTo(null);
                entrenador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                entrenador.setVisible(true);
                entrenador.setResizable(false);
                break;
            case 4:
                Empleado e = Util.buscarEmpleado(usuario);
                this.setVisible(false);
                LimpiadorVentana limpiador = new LimpiadorVentana(e);
                limpiador.setVisible(true);
                limpiador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                limpiador.setLocationRelativeTo(null);
                limpiador.setResizable(false);
                break;
            case 5:
                SocioVentana socio = new SocioVentana(usuario);
                socio.setVisible(true);
                socio.setLocationRelativeTo(null);
                socio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.setVisible(false);
                socio.setResizable(false);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error", "Mensaje", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
