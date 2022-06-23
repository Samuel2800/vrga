package Methods;
import java.awt.Component;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Items.item;
import Methods.UserProgram;

public class ResultsFrame extends javax.swing.JFrame {

    public ResultsFrame() {
        initComponents();        
    }
    
    String a = "eres puto";

    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();  
        ShowResult = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Object value = new Object();
        
        
        
        //javax.swing.JLabel jLabelName = new javax.swing.JLabel();
    	//javax.swing.JLabel jLabelAmount = new javax.swing.JLabel();
    	//javax.swing.JLabel jLabelVolume = new javax.swing.JLabel();
    	//javax.swing.JLabel jLabelWeight = new javax.swing.JLabel();
    	//javax.swing.JLabel jLabelBaseShape = new javax.swing.JLabel();
    	//javax.swing.JLabel jLabelSeparate = new javax.swing.JLabel();
    	
    	//jLabelName.setText(((Items.item) value).getItemName());
    	//jLabelAmount.setText(Integer.toString(((Items.item) value).getAmount()));
    	//jLabelVolume.setText(Double.toString(((Items.item) value).getVolume()));
    	//jLabelWeight.setText(Double.toString(((Items.item) value).getWeight()));
    	//jLabelBaseShape.setText(((Items.item) value).getBaseShape());
    	//jLabelSeparate.setText("-----------------------------------------------");
    	
    	//jScrollPane1.add(jLabelName);
    	//jScrollPane1.add(jLabelAmount);
    	//jScrollPane1.add(jLabelVolume);
    	//jScrollPane1.add(jLabelWeight);
    	//jScrollPane1.add(jLabelBaseShape);
    	//jScrollPane1.add(jLabelSeparate);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ResultsFrame");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ShowResult.setToolTipText("");
        ShowResult.setText(a);
        
		/*
		 * for(int i = 0; i < 5; i++) { ShowResult.setText(Integer.toString(i)); }
		 */
        jScrollPane1.setViewportView(ShowResult);

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thanks For using Hermod");
        jLabel1.setToolTipText("");

        jLabel2.setText("Here is Your Order");
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    //Shows information about the information for an item:
    public void showOrderInfo(HashMap<String, Object> map) {
    	System.out.println(map.size());
    		for(Object value : map.values()) {
    			showItemInfo(value);
    		}
	}
    
    //Show information about an item
    public void showItemInfo(Object value) {
    		JLabel labelName = new JLabel();
    		JLabel labelVolume = new JLabel();
    		
    		labelName.setToolTipText("");
    		labelName.setText(((Items.item) value).getItemName());
    		labelName.setVisible(true);
    		System.out.println(((Items.item) value).getItemName());
    		//labelVolume.setToolTipText("");
    		labelVolume.setText(Double.toString(((item) value).getVolume()));
    	
    }

    public void ShowResultsFrame(HashMap<String, Object> map) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultsFrame().setVisible(true);
            	showOrderInfo(map);
            }
        }
        );
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ShowResult;

}
