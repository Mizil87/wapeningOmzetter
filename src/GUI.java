
import static java.lang.Math.pow;
import java.awt.Graphics;
import java.util.Arrays;
import javax.swing.JCheckBox;

import javax.swing.JComponent;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikai
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tekstAsreq = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelTypeSecties = new javax.swing.JLabel();
        labelPijltjes = new javax.swing.JLabel();
        labelDiameters = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelPijl = new javax.swing.JLabel();
        labelAntwoord1 = new javax.swing.JLabel();
        labelAntwoord2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VD12 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        VD14 = new javax.swing.JCheckBox();
        VD16 = new javax.swing.JCheckBox();
        VD20 = new javax.swing.JCheckBox();
        VD25 = new javax.swing.JCheckBox();
        VD28 = new javax.swing.JCheckBox();
        VD32 = new javax.swing.JCheckBox();
        VD40 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Omrekenen wapeningssectie");
        setResizable(false);

        tekstAsreq.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        tekstAsreq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tekstAsreq.setText("2500");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jButton1.setText("Reken om");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("mm²");

        labelTypeSecties.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelTypeSecties.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTypeSecties.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelPijltjes.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelPijltjes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        labelDiameters.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelDiameters.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDiameters.setToolTipText("");
        labelDiameters.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelDiameters.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("Opsomming secties:");

        labelPijl.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelPijl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPijl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelAntwoord1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelAntwoord1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelAntwoord2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelAntwoord2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelAntwoord2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setText("Oplossingen:");

        VD12.setText("Ø12");
        VD12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VD12ActionPerformed(evt);
            }
        });

        jLabel4.setText("Gebruik:");

        VD14.setText("Ø14");

        VD16.setSelected(true);
        VD16.setText("Ø16");
        VD16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VD16ActionPerformed(evt);
            }
        });

        VD20.setSelected(true);
        VD20.setText("Ø20");

        VD25.setSelected(true);
        VD25.setText("Ø25");
        VD25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VD25ActionPerformed(evt);
            }
        });

        VD28.setSelected(true);
        VD28.setText("Ø28");

        VD32.setSelected(true);
        VD32.setText("Ø32");

        VD40.setText("Ø40");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 691, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tekstAsreq, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(VD12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VD14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VD16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VD20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VD25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VD28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VD32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VD40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAntwoord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelAntwoord2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDiameters, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPijl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTypeSecties, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(labelPijltjes)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(labelPijltjes, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tekstAsreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VD12)
                    .addComponent(VD14)
                    .addComponent(VD16)
                    .addComponent(VD20)
                    .addComponent(VD25)
                    .addComponent(VD28)
                    .addComponent(VD32)
                    .addComponent(VD40))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDiameters, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTypeSecties, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPijl, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelAntwoord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAntwoord2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[] oppStaven;
        int[] typeStaven;
        double Asreq1;
        double Asreq;
        double Asprov1;
        double Asprov2;
        int Asprov;
        int RestAs;
        int a;
        int b;
        int teller1=0;
        int teller2=0;
        int aantal1=0;
        int aantal2=0;
        int aantalTotaal=0;
        int nstaven = 0;
        int i3=0;
        int margeMax = 450;
        int margeMin = 20;
        double ratioAantal = 7/5;
        
        
//-------------------------------------------------------------------------------------------------
//Bepalen wat aangevinkt is en dit in nieuwe array steken. (vrij inefficiënt!)
//-------------------------------------------------------------------------------------------------
        int[] mogStaven = new int[] {12, 14, 16, 20, 25, 28, 32, 40};
        int aantalMog = mogStaven.length;
        boolean[] staatStaven = new boolean[aantalMog];
        staatStaven[0] = VD12.isSelected();
        staatStaven[1] = VD14.isSelected();
        staatStaven[2] = VD16.isSelected();
        staatStaven[3] = VD20.isSelected();
        staatStaven[4] = VD25.isSelected();
        staatStaven[5] = VD28.isSelected();
        staatStaven[6] = VD32.isSelected();
        staatStaven[7] = VD40.isSelected();        
        
        for (int k = 0; k < staatStaven.length ; k++)
        {
            if(staatStaven[k])
            {
                nstaven++;
            }
        }
        typeStaven = new int[nstaven];
        for (int n = 0; n < staatStaven.length ; n++)
        {
            if(staatStaven[n])
            {
                typeStaven[i3] = mogStaven[n];
                i3++;
            }
        }
//-------------------------------------------------------------------------------------------------
        int aantalTypeStaven = typeStaven.length;
        oppStaven = new int[aantalTypeStaven];
       
        String opsommingSectiesStaven = "<html>";
        String opsommingPijltjes = "<html>";
        String opsommingDiameters = "<html>"; 
        String antwoord1 =  "<html>";
        String stavenReeks = "<html>"; 
        String stavenReeks1 = ""; 
        String stavenReeks2 = ""; 
        String margeReeks = "<html>";


        for (int i=0 ; i < aantalTypeStaven ; i++)
        {
          oppStaven[i] = (int) Math.round(Math.PI*pow(typeStaven[i],2)/4);
          opsommingDiameters = opsommingDiameters + "Ø" + typeStaven[i] + "<br>";
          opsommingPijltjes = opsommingPijltjes + "→<br>";
          opsommingSectiesStaven = opsommingSectiesStaven + oppStaven[i] + "mm²<br>";
        }
        opsommingDiameters = opsommingDiameters + "</html>";
        opsommingPijltjes = opsommingPijltjes + "</html>";
        opsommingSectiesStaven = opsommingSectiesStaven + "</html>";
        
        this.labelDiameters.setText(String.valueOf(opsommingDiameters));
        this.labelPijl.setText(String.valueOf(opsommingPijltjes));
        this.labelTypeSecties.setText(String.valueOf(opsommingSectiesStaven));
        //this.boolTest.setText(String.valueOf(booltest));
        
        try 
            {
            if(tekstAsreq.getText().length()==0) 
            {
                throw new Exception();
            }
            Asreq1 = Double.parseDouble(this.tekstAsreq.getText());
            } 
        catch(Exception e) 
        {
            Asreq1 = 0;
        } 
        //indien meerdere ingave mogelijk zijn, dit aanpassen
        Asreq = Asreq1;
        //---------------------------------------------------------------
        
        
        
        //min. aantal staven
        a = (int) Math.ceil(Asreq/oppStaven[aantalTypeStaven-1]);
        
        //max. aantal staven
        //b = (int) Math.ceil(Asreq/oppStaven[0]);
        b = (int) Math.ceil(a + ratioAantal*a);
        
        //forlus te beginnen met minst aantal staven nodig tot maximaal aantal staven en aantal combinaties ertussen
        //Asreq / min staven → geeft max diameter.
        for (int x = a;x<=b;x++){
            aantalTotaal = x;
            aantal1 = a;
            aantal2 = aantalTotaal-aantal1;
            
            double As1 = Asreq/aantalTotaal;            
            for (int y = aantalTypeStaven -1 ; y >= 0 ; y--)
                {
                    if ( As1 < oppStaven[y])
                    {
                        teller1=y;
                    }
                }
            Asprov1 = aantal1*oppStaven[teller1];
            double As2 = (Asreq - Asprov1)/aantal2;
            if (As2 > 0)
            {
                for (int z = aantalTypeStaven -1 ; z >= 0 ; z--)
                    {
                        if ( As2 < oppStaven[z])
                        {
                            teller2=z;
                        }
                    }
            }
            Asprov2 =   aantal2*oppStaven[teller2];
            Asprov  =   (int) Math.round(Asprov1 + Asprov2);
            RestAs  =   (int) Math.round(Asprov - Asreq);
            
            if (oppStaven[teller2] == oppStaven[teller1]){
                aantal1=aantal1+aantal2;
                aantal2=0;
            }
            
            stavenReeks1 = String.valueOf(aantal1) + "Ø" + String.valueOf(typeStaven[teller1]);
            stavenReeks2 = " + " + String.valueOf(aantal2) + "Ø" + String.valueOf(typeStaven[teller2]);
            if(aantal2==0){stavenReeks2 = "";}
            if (RestAs < margeMax && RestAs > margeMin)
            {
                stavenReeks = stavenReeks + stavenReeks1 +  stavenReeks2 + "<br>";
                margeReeks = margeReeks + "(Δ = "+ RestAs + "mm²)" +"<br>";
            }
        }
        stavenReeks = stavenReeks + "</html>";
        this.labelAntwoord1.setText(String.valueOf(stavenReeks));
        this.labelAntwoord2.setText(String.valueOf(margeReeks));
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VD12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VD12ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_VD12ActionPerformed

    private void VD16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VD16ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_VD16ActionPerformed

    private void VD25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VD25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VD25ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox VD12;
    private javax.swing.JCheckBox VD14;
    private javax.swing.JCheckBox VD16;
    private javax.swing.JCheckBox VD20;
    private javax.swing.JCheckBox VD25;
    private javax.swing.JCheckBox VD28;
    private javax.swing.JCheckBox VD32;
    private javax.swing.JCheckBox VD40;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelAntwoord1;
    private javax.swing.JLabel labelAntwoord2;
    private javax.swing.JLabel labelDiameters;
    private javax.swing.JLabel labelPijl;
    private javax.swing.JLabel labelPijltjes;
    private javax.swing.JLabel labelTypeSecties;
    private javax.swing.JTextField tekstAsreq;
    // End of variables declaration//GEN-END:variables
}
