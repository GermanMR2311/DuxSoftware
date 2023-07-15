package dux;

import javax.swing.*;


/**
 *
 * @author Usuario
 */
public class CreacionPersonaje extends JFrame {

    /**
     * Creates new form NewJFrame
     */
    public CreacionPersonaje() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        textoJugador1 = new JLabel();
        crearPersonaje1 = new JButton();
        jPanel3 = new JPanel();
        textoJugador2 = new JLabel();
        crearPersonaje2 = new JButton();
        inicio = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textoJugador1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        textoJugador1.setText("elije accion para jugador 1");

        crearPersonaje1.setText("Crear personaje");
        crearPersonaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPersonaje1ActionPerformed(evt);
            }
        });

        

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(textoJugador1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(crearPersonaje1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(textoJugador1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(crearPersonaje1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        textoJugador2.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        textoJugador2.setText("elije accion para jugador 2");

        crearPersonaje2.setText("Crear personaje");
        crearPersonaje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPersonaje2ActionPerformed(evt);
            }
        });

     

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(textoJugador2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(crearPersonaje2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(textoJugador2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(crearPersonaje2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(inicio, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicio, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void crearPersonaje1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    	if(controladorJugador1==false) {
            jugador1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del jugador 1"));
            if(jugador1.getNombre().equals("")){
                controladorJugador1=false;
                JOptionPane.showMessageDialog(null,"No ingreso ningun nombre, vuelva a intentarlo");
            }
            else{
            this.crearPersonaje1.setVisible(false);
            this.textoJugador1.setVisible(false);
            controladorJugador1=true;
            }

    	}
    }                                               
                           

    private void crearPersonaje2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    	if(controladorJugador2==false) {
            jugador2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del jugador 2"));
            if(jugador2.getNombre().equals("")){
                controladorJugador2=false;
                JOptionPane.showMessageDialog(null,"No ingreso ningun nombre, vuelva a intentarlo");
            }
            else{
            this.crearPersonaje2.setVisible(false);
            this.textoJugador2.setVisible(false);
            controladorJugador2=true;
            }

    	}
    }                                               

                                     

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    	if(controladorJugador1==true && controladorJugador2==false) {
          JOptionPane.showMessageDialog(null, "Elija una opcion para el jugador 2");
    	}
    	if(controladorJugador2==true && controladorJugador1==false) {
            JOptionPane.showMessageDialog(null, "Elija una opcion para el jugador 1");
      	}
    	if(controladorJugador2==false && controladorJugador1==false) {
        JOptionPane.showMessageDialog(null, "No eligio ninguna opcion para ningun jugador");    	
    	}
    	if(controladorJugador2==true && controladorJugador1==true) {
    		this.setVisible(false);
    		torneo.jugarConRevancha(true,jugador1,jugador2);
        	

    	}
    }                                      

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreacionPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionPersonaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionPersonaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton crearPersonaje1;
    private JButton crearPersonaje2;
    private JButton inicio;
    private JLabel textoJugador1;
    private JLabel textoJugador2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private boolean controladorJugador1=false;
    private boolean controladorJugador2=false; 
    
    Jugadores jugador1=new Jugadores();
    Jugadores jugador2=new Jugadores();
    Torneo torneo=new Torneo();
    // End of variables declaration                   
}