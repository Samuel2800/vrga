package Methods;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class UserProgram extends javax.swing.JFrame {

    public UserProgram() {
        initComponents();
    }

//method to configure JFrame
    @SuppressWarnings("unchecked")
    public void initComponents() {

//create objects
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        ProductQuantity = new javax.swing.JTextField();
        ProductWeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ContinueOrder = new javax.swing.JCheckBox();
        NoContinueOrder = new javax.swing.JCheckBox();
        SummitButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Height = new javax.swing.JTextField();
        Lenght = new javax.swing.JTextField();
        Wide = new javax.swing.JTextField();
        Diameter = new javax.swing.JTextField();
        Sides = new javax.swing.JTextField();
        Cylindrical = new javax.swing.JRadioButton();
        Rectangular = new javax.swing.JRadioButton();
        Polygonal = new javax.swing.JRadioButton();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hermod");
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("The best shipping company in the world ");

        label1.setFont(new java.awt.Font("Marker Felt", 0, 36));
        label1.setText("Welcome to Hermod");

        //jLabel2.setText("Please enter your product information very carefully");
        
        jLabel2.setText("Please enter your measurements in meters");

        jLabel3.setText("Type your product name:");

        jLabel4.setText("Introduce your product shape:");

        jLabel5.setText("Introduce your product's quantity:");

        jLabel6.setText("Introduce your product weight:");

        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });

        ProductWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductWeightActionPerformed(evt);
            }
        });

        jLabel7.setText("Want order something else?");

        buttonGroup2.add(ContinueOrder);
        ContinueOrder.setText("Yes");
        ContinueOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueOrderActionPerformed(evt);
            }
        });

        buttonGroup2.add(NoContinueOrder);
        NoContinueOrder.setText("No");
        NoContinueOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoContinueOrderActionPerformed(evt);
            }
        });

        SummitButton.setBackground(new java.awt.Color(204, 0, 153));
        SummitButton.setForeground(new java.awt.Color(255, 255, 255));
        SummitButton.setText("Summit");
        SummitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        SummitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummitButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Introduce Height:");

        jLabel9.setText("Introduce Lenght:");

        jLabel10.setText("Introduce wide:");

        jLabel11.setText("Introduce Diameter:");

        jLabel12.setText("Sides of Products:");

        Sides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cylindrical);
        Cylindrical.setText("Cylindrical");
        Cylindrical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CylindricalActionPerformed(evt);
                //prueba();
            }
        });

        buttonGroup1.add(Rectangular);
        Rectangular.setText("Rectangular");
        Rectangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangularActionPerformed(evt);
            }
        });

        buttonGroup1.add(Polygonal);
        Polygonal.setText("Polygonal");
        Polygonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolygonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(SummitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ContinueOrder)
                                    .addGap(18, 18, 18)
                                    .addComponent(NoContinueOrder))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProductQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(ProductWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(ProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(Height)
                                    .addComponent(Lenght)
                                    .addComponent(Wide)
                                    .addComponent(Diameter)
                                    .addComponent(Sides)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cylindrical)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rectangular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Polygonal)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cylindrical)
                    .addComponent(Rectangular)
                    .addComponent(Polygonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ProductWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Lenght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Wide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Diameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Sides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ContinueOrder)
                    .addComponent(NoContinueOrder))
                .addGap(18, 18, 18)
                .addComponent(SummitButton)
                .addContainerGap())
        );

        pack();
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == Cylindrical) {
    		System.out.println("cylinder");
    	}
    	else if(e.getSource() == Rectangular) {
    		System.out.println("rectangle");
    	}
    	else if(e.getSource() == Polygonal) {
    		System.out.println("polygon");
    	}
    }
    

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ContinueOrderActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ProductWeightActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SummitButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void SidesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CylindricalActionPerformed(java.awt.event.ActionEvent evt) {
        CylOptions();
    }

    private void RectangularActionPerformed(java.awt.event.ActionEvent evt) {
        RecOptions();
    }

    private void PolygonalActionPerformed(java.awt.event.ActionEvent evt) {
        PolOptions();
    }

    private void NoContinueOrderActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void CylOptions(){

        Sides.setEnabled(false);
        Height.setEnabled(true);
        Lenght.setEnabled(false);
        Wide.setEnabled(false);
        Diameter.setEnabled(true);

    }

    public void RecOptions(){

        Sides.setEnabled(false);
        Height.setEnabled(true);
        Lenght.setEnabled(true);
        Wide.setEnabled(true);
        Diameter.setEnabled(false);

    }

    public void PolOptions(){
        Sides.setEnabled(true);
        Height.setEnabled(true);
        Lenght.setEnabled(true);
        Wide.setEnabled(false);
        Diameter.setEnabled(false);
    }


// method to show JFrame
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
      private javax.swing.JCheckBox ContinueOrder;
      protected javax.swing.JRadioButton Cylindrical;
      protected javax.swing.JTextField Diameter;
      protected javax.swing.JTextField Height;
      protected javax.swing.JTextField Lenght;
      private javax.swing.JCheckBox NoContinueOrder;
      protected javax.swing.JRadioButton Polygonal;
      protected javax.swing.JTextField ProductName;
      protected javax.swing.JTextField ProductQuantity;
      protected javax.swing.JTextField ProductWeight;
      protected javax.swing.JRadioButton Rectangular;
      protected javax.swing.JTextField Sides;
      private javax.swing.JButton SummitButton;
      protected javax.swing.JTextField Wide;
      private javax.swing.ButtonGroup buttonGroup1;
      private javax.swing.ButtonGroup buttonGroup2;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private java.awt.Label label1;
}
