/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;
import GUI_Client.visualiserHistoCommande;
import GUI_Client.Voir_CommanderProduit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Yassine
 */
public class interfaceClient extends javax.swing.JInternalFrame {

    /**
     * Creates new form interfaceProduit
     */
    public interfaceClient() {
        initComponents();
        this.setSize(1015,650);
        this.setBorder(createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    
//    int delay = 2000; //milliseconds
//    ActionListener taskPerformer = new ActionListener() {
//       public void actionPerformed(ActionEvent evt) {
//           jLabel5.setVisible(false);
//       }
//   };
//   new javax.swing.Timer(delay, taskPerformer).start();
   }
public void setColor(){
            
            this.setBackground(new Color(0,153,153));
        }
        public void resetColor(){
            this.setBackground(new Color(0,204,153));
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpClient = new javax.swing.JDesktopPane();
        JPRIGHTproduit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JPLEFTproduit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jVoirProd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jVoirHistoComm = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deconnexion = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 745));

        JPRIGHTproduit.setBackground(new java.awt.Color(249, 249, 249));
        JPRIGHTproduit.setPreferredSize(new java.awt.Dimension(791, 680));
        JPRIGHTproduit.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setText("Mon espace");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\yderi\\Desktop\\CS\\Projet S6\\App_Gestion_Vente_Achat_V2\\src\\images\\return3.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\yderi\\Desktop\\CS\\Projet S6\\App_Gestion_Vente_Achat_V2\\src\\images\\client1.png")); // NOI18N

        javax.swing.GroupLayout JPRIGHTproduitLayout = new javax.swing.GroupLayout(JPRIGHTproduit);
        JPRIGHTproduit.setLayout(JPRIGHTproduitLayout);
        JPRIGHTproduitLayout.setHorizontalGroup(
            JPRIGHTproduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRIGHTproduitLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPRIGHTproduitLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        JPRIGHTproduitLayout.setVerticalGroup(
            JPRIGHTproduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRIGHTproduitLayout.createSequentialGroup()
                .addGroup(JPRIGHTproduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPRIGHTproduitLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jdpClient.setLayer(JPRIGHTproduit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpClientLayout = new javax.swing.GroupLayout(jdpClient);
        jdpClient.setLayout(jdpClientLayout);
        jdpClientLayout.setHorizontalGroup(
            jdpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPRIGHTproduit, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        jdpClientLayout.setVerticalGroup(
            jdpClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPRIGHTproduit, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        JPLEFTproduit.setBackground(new java.awt.Color(0, 204, 204));
        JPLEFTproduit.setPreferredSize(new java.awt.Dimension(227, 680));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu Client");

        jVoirProd.setBackground(new java.awt.Color(0, 204, 153));
        jVoirProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVoirProdMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jVoirProdMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("<html><center><p>Voir ou commander<br/>un produit</p</center></html>");

        javax.swing.GroupLayout jVoirProdLayout = new javax.swing.GroupLayout(jVoirProd);
        jVoirProd.setLayout(jVoirProdLayout);
        jVoirProdLayout.setHorizontalGroup(
            jVoirProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVoirProdLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jVoirProdLayout.setVerticalGroup(
            jVoirProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVoirProdLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jVoirHistoComm.setBackground(new java.awt.Color(0, 204, 153));
        jVoirHistoComm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVoirHistoCommMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jVoirHistoCommMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("<html><center><p>Voir l'historique de mes<br/>commandes</p</center></html>");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jVoirHistoCommLayout = new javax.swing.GroupLayout(jVoirHistoComm);
        jVoirHistoComm.setLayout(jVoirHistoCommLayout);
        jVoirHistoCommLayout.setHorizontalGroup(
            jVoirHistoCommLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVoirHistoCommLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jVoirHistoCommLayout.setVerticalGroup(
            jVoirHistoCommLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        deconnexion.setBackground(new java.awt.Color(255, 255, 255));
        deconnexion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        deconnexion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deconnexion.setIcon(new javax.swing.ImageIcon("C:\\Users\\yderi\\Desktop\\CS\\Projet S6\\App_Gestion_Vente_Achat_V2\\src\\images\\logout1.png")); // NOI18N
        deconnexion.setText("Deconnexion");
        deconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deconnexionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPLEFTproduitLayout = new javax.swing.GroupLayout(JPLEFTproduit);
        JPLEFTproduit.setLayout(JPLEFTproduitLayout);
        JPLEFTproduitLayout.setHorizontalGroup(
            JPLEFTproduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLEFTproduitLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPLEFTproduitLayout.createSequentialGroup()
                .addGroup(JPLEFTproduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deconnexion, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jVoirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVoirHistoComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPLEFTproduitLayout.setVerticalGroup(
            JPLEFTproduitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLEFTproduitLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jVoirProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jVoirHistoComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(deconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPLEFTproduit, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jdpClient))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpClient)
            .addComponent(JPLEFTproduit, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVoirProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoirProdMouseClicked
       jdpClient.add(new Voir_CommanderProduit()).setVisible(true);
        setColor();
          //  jdpFourn.add(new AjouterFournisseur()).setVisible(true);
    }//GEN-LAST:event_jVoirProdMouseClicked

    private void jVoirProdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoirProdMouseExited
        resetColor();
    }//GEN-LAST:event_jVoirProdMouseExited

    private void jVoirHistoCommMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoirHistoCommMouseClicked
        jdpClient.add(new visualiserHistoCommande()).setVisible(true);
        setColor();       
    }//GEN-LAST:event_jVoirHistoCommMouseClicked

    private void jVoirHistoCommMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVoirHistoCommMouseExited
        resetColor();  
        // TODO add your handling code here:
    }//GEN-LAST:event_jVoirHistoCommMouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jdpClient.add(new visualiserHistoCommande()).setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void deconnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deconnexionMouseClicked
    this.setVisible(false);
       new MainGUI().setVisible(true);
    }//GEN-LAST:event_deconnexionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPLEFTproduit;
    private javax.swing.JPanel JPRIGHTproduit;
    private javax.swing.JLabel deconnexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jVoirHistoComm;
    private javax.swing.JPanel jVoirProd;
    private javax.swing.JDesktopPane jdpClient;
    // End of variables declaration//GEN-END:variables
}
