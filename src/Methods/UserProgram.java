package Methods;

import javax.swing.ButtonGroup;

public class UserProgram extends javax.swing.JFrame {

    private CylindricalShapeWindows CShape;
    private RectangularShapeWindows RShape;
    private PolygonalShapeWindows   PShape;

    // Variables declaration - do not modify
    private javax.swing.JCheckBox ContinueOrder;
    private javax.swing.JCheckBox NoContinueOrder;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField ProductQuantity;
    private javax.swing.JComboBox<String> ProductShape;
    private javax.swing.JTextField ProductWeight;
    private javax.swing.JButton SummitButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private java.awt.Label label1;

    public UserProgram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        ProductShape = new javax.swing.JComboBox<>();
        ProductQuantity = new javax.swing.JTextField();
        ProductWeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ContinueOrder = new javax.swing.JCheckBox();
        NoContinueOrder = new javax.swing.JCheckBox();
        SummitButton = new javax.swing.JButton();

        ButtonGroup buttonSE = new ButtonGroup();
        buttonSE.add(ContinueOrder);
        buttonSE.add(NoContinueOrder);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hermod");
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("The best shipping company in the world ");

        label1.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        label1.setText("Welcome to Hermod");

        jLabel2.setText("Please enter your product information very carefully");

        jLabel3.setText("Type your product name:");

        jLabel4.setText("Introduce your product shape:");

        jLabel5.setText("Introduce your product's quantity");

        jLabel6.setText("Introduce your product weight:");

        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });

        ProductShape.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"--Select Shape--", "Cylindrical", "Rectangular", "Polygonal" }));
        ProductShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductShapeActionPerformed(evt);
            }
        });

        ProductWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductWeightActionPerformed(evt);
            }
        });

        jLabel7.setText("Want to order something else?");

        ContinueOrder.setText("Yes");
        ContinueOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueOrderActionPerformed(evt);
            }
        });

        NoContinueOrder.setText("No");

        SummitButton.setBackground(new java.awt.Color(204, 0, 153));
        SummitButton.setForeground(new java.awt.Color(255, 255, 255));
        SummitButton.setText("Summit");
        SummitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        SummitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ContinueOrder)
                                .addGap(18, 18, 18)
                                .addComponent(NoContinueOrder))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ProductName)
                                .addComponent(ProductShape, 0, 262, Short.MAX_VALUE)
                                .addComponent(ProductQuantity)
                                .addComponent(ProductWeight))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(SummitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(ProductShape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ProductWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ContinueOrder)
                    .addComponent(NoContinueOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(SummitButton)
                .addContainerGap())
        );

        pack();
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

    private void ProductShapeActionPerformed(java.awt.event.ActionEvent evt) {
    	System.out.println();
    	 if(CShape == null){
        	 CShape = new CylindricalShapeWindows();
        	 CShape.setVisible(true);

         }
         else if (RShape == null) {
        	 RShape = new RectangularShapeWindows();
        	 RShape.setVisible(true);
         }
         else if (PShape == null) {
        	 PShape = new PolygonalShapeWindows();
        	 PShape.setVisible(true);
         }
    }

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProgram().setVisible(true);
            }
        });
    }



}
