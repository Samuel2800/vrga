package Methods;

import java.awt.Component;
//Group members Daniel Ramos, Samuel Pantoja, Gustavo Matamoros, Alejandro
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JOptionPane;

import Containers.BigContainer;
import Containers.SmallContainer;
import Items.CylindricalBox;
import Items.PolygonBox;
import Items.RectangularBox;
import Items.item;
import Methods.ResultsFrame;

public class UserProgram extends javax.swing.JFrame {

//Constructor to impliment JFrame settings
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
        ItemMap = new HashMap<String, Object>();


//Principal Frame configuration
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hermod");
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);

// setting text to the different labels
        jLabel1.setText("The best shipping company in the world ");
        label1.setFont(new java.awt.Font("Marker Felt", 0, 36));
        label1.setText("Welcome to Hermod");

        jLabel2.setText("Please enter your measurements in meters");

        jLabel3.setText("Type your product name:");

        jLabel4.setText("Introduce your product shape:");

        jLabel5.setText("Introduce your product's quantity:");

        jLabel6.setText("Introduce your product weight:");

// ActionListener for product name
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        }
        );

// ActionListener for ProductWeight
        ProductWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductWeightActionPerformed(evt);
            }
        }
        );

//setting text to label
        jLabel7.setText("Want order something else?");

//adding to JCheckBox in a group to use them better
        buttonGroup2.add(ContinueOrder);
        ContinueOrder.setText("Yes");
        ContinueOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueOrderActionPerformed(evt);
            }
        }
        );

        buttonGroup2.add(NoContinueOrder);
        NoContinueOrder.setText("No");
        NoContinueOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoContinueOrderActionPerformed(evt);
            }
        }
        );

//setting configuration to summit
        SummitButton.setBackground(new java.awt.Color(204, 0, 153));
        SummitButton.setForeground(new java.awt.Color(255, 255, 255));
        SummitButton.setText("Summit");
        SummitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        SummitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummitButtonActionPerformed(evt, ItemMap);
                clear();
            }
        }
        );

//setting text to sizes labels
        jLabel8.setText("Introduce Height:");

        jLabel9.setText("Introduce Lenght:");

        jLabel10.setText("Introduce wide:");

        jLabel11.setText("Introduce Diameter:");

        jLabel12.setText("Sides of Products:");

// ActionListener for sides
        Sides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidesActionPerformed(evt);
            }
        }
        );

// adding shapes into  buttonGroup1
        buttonGroup1.add(Cylindrical);
        Cylindrical.setText("Cylindrical");
        Cylindrical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CylindricalActionPerformed(evt);

                }
            }
        );

        buttonGroup1.add(Rectangular);
        Rectangular.setText("Rectangular");
        Rectangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangularActionPerformed(evt);
            }
        }
        );

        buttonGroup1.add(Polygonal);
        Polygonal.setText("Polygonal");
        Polygonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolygonalActionPerformed(evt);
            }
        }
        );

//positioning and adjusting the complements of JFrame
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
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
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

//Action Performer for product name JTextField
    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//Action Performer for yes JCheckBox
    private void ContinueOrderActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//Action Performer for product weight JTextField
    private void ProductWeightActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

// Summit button Action to sent products information to hash map and also catch errors
    private void SummitButtonActionPerformed(java.awt.event.ActionEvent evt, HashMap<String, Object> map) {
    	ResultsFrame o = new ResultsFrame(ItemMap);
    	
    	Cylindrical.setActionCommand("Cylindrical");
    	Rectangular.setActionCommand("Rectangular");
    	Polygonal.setActionCommand("Polygonal");
    	ContinueOrder.setActionCommand("Yes");
    	NoContinueOrder.setActionCommand("No");
    	String name = ProductName.getText();
    	int quantity = 0;
    	double weight = 0;
    	double height = 0;
    	try {
    		quantity = Integer.valueOf(ProductQuantity.getText());
    		weight = Double.valueOf(ProductWeight.getText());
    		height = Double.valueOf(Height.getText());
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null, "Not valid input:\n Detalles: " + e.getMessage());
    	}
    	if(buttonGroup1.getSelection().getActionCommand().equals("Cylindrical")) {
    		double diameter = 0;
    		try {
    			diameter = Double.valueOf(Diameter.getText());
    		}
    		catch(Exception e) {
        		JOptionPane.showMessageDialog(null, "Not valid input:\n Detalles: " + e.getMessage());
        	}
    		Double.valueOf(Diameter.getText());
    		CylindricalBox CB = new CylindricalBox(name, quantity, weight, diameter, 0, height, 0, "Cylinder");
    		double volume = CB.calculateVolume(diameter, 0, height);
    		if(volume > 75.587337) {
        		JOptionPane.showMessageDialog(null, "The item can't be shipped\n This item Is bigger than our big container");
    		}
    		else {
        		CB.setVolume(volume);
        		addToMap(CB, name, map);
    		}
    	}
    	else if(buttonGroup1.getSelection().getActionCommand().equals("Rectangular")) {
    		double length = 0;
    		double wide = 0;
    		try {
    			length = Double.valueOf(Lenght.getText());
    			wide = Double.valueOf(Wide.getText());
    		}
    		catch(Exception e) {
        		JOptionPane.showMessageDialog(null, "Not valid input:\n Detalles: " + e.getMessage());
        	}
    		RectangularBox RB = new RectangularBox(name, quantity, weight, length, wide, height, 0, "Rectangular");
    		double volume = RB.calculateVolume(wide, length, height);
    		if(volume > 75.587337) {
        		JOptionPane.showMessageDialog(null, "The item can't be shipped\n This item Is bigger than our big container");
    		}
    		else {
    			RB.setVolume(volume);
        		addToMap(RB, name, map);
    		}
    	}
    	else if(buttonGroup1.getSelection().getActionCommand().equals("Polygonal")) {
    		double length = Double.valueOf(Lenght.getText());
    		double sidesn = Double.valueOf(Sides.getText());
    		if(sidesn <= 4) {
        		JOptionPane.showMessageDialog(null, "A polygon should have more than 4 sides");
    		}
    		else {
    			PolygonBox PB = new PolygonBox(name, quantity, weight, length, sidesn, height, 0, "Polygon");
        		double volume = PB.calculateVolume(length, sidesn, height);
        		if(volume > 75.587337) {
            		JOptionPane.showMessageDialog(null, "The item can't be shipped\n This item Is bigger than our big container");
        		}
        		else {
        			PB.setVolume(volume);
            		addToMap(PB, name, map);
        		}
    		}
    		
    	}
    	if(buttonGroup2.getSelection().getActionCommand().equals("Yes")){
    		clear();
    	}
    	else if(buttonGroup2.getSelection().getActionCommand().equals("No")) {
    		BigContainer biggie = new BigContainer(0);
    		SmallContainer smalls = new SmallContainer(0);
    		//int bigAmount = 0;
    		//int smallAmount = 0;
    		//double cost = 0;
    		//showOrderInfo(map);
    		
    		dispose();
    		//System.exit(0);
    		o.ShowResultsFrame(map);
    	}
    }
    

    // method to empty all JTextFields and button selections
    private void clear() {
    	ProductName.setText("");
    	buttonGroup1.clearSelection();
    	ProductQuantity.setText("");
    	ProductWeight.setText("");
    	Height.setText("");
    	Lenght.setText("");
    	Wide.setText("");
    	Diameter.setText("");
    	Sides.setText("");
    	buttonGroup2.clearSelection();
	}

    // Method to put the items into a HashMap
    private void addToMap(Object box, String name, HashMap<String, Object> map) {
    	
    	if(map.containsKey(name)) {
    		JOptionPane.showMessageDialog(null, "Already added an Item with the same name");
    	}
    	else {
    		map.put(name, box);
    	}
    }
    
    // calculates the total volume of the order
    public double orderVolume(HashMap<String, Object> map) {
		double totalVolume = 0;
		for(Object value : map.values()) {
			totalVolume += (((item) value).getVolume() * ((item) value).getAmount());
		}
		System.out.println(totalVolume);
		return totalVolume;
	}
    
    // calculates the total weight of the order
    public double orderWeight(HashMap<String, Object> map) {
		double totalWeight = 0;
		for(Object value : map.values()) {
			totalWeight += (((item) value).getWeight() * ((item) value).getAmount());
		}
		return totalWeight;
	}
    
    // calculates the amount of each container needed for the shipment
    public void bestShippingMethod(HashMap<String, Object> order, BigContainer biggie, SmallContainer smalls) {
		double localVolume = orderVolume(order);
		double localWeight = orderWeight(order);
		double smallVolume = smalls.getContainerVolume();
		double bigVolume = biggie.getContainerVolume();
		//the counter variable stores the amount of objects from the order that have already been packed into a container
		int counter = 0;
		//when the packed items equals the items of the order, the program stops packing items
		while(counter != order.size()){
			double temp = 0;
			if(localVolume > smallVolume) {
				//every time a big container is added, the object's amount is updated
				biggie.setAmount(biggie.getAmount() + 1);
				//this loop goes through the order looking for objects that are not still in a container
				for(String key : order.keySet()) {
					Object value = order.get(key);
					while(!(((item) value).getAmount() == 0) && (temp + ((item) value).getVolume()) < bigVolume && !(((item) value).getAmount() == 0)) {
						temp += ((item) value).getVolume();
						((item) value).setAmount(((item) value).getAmount() - 1);
						localVolume -= ((item) value).getVolume();
						localWeight -= ((item) value).getWeight();
					}
					if(((item) value).getAmount() == 0) {
						counter += 1;
						continue;
					}
				}
			}
			else {
				//if there's the need, there will be only one small container
				smalls.setAmount(smalls.getAmount() + 1);
				smalls.setWeight(localWeight);
				//same than the loop for the big container
				for(String key : order.keySet()) {
					Object value = order.get(key);
					while(!(((item) value).getAmount() == 0) && !(((item) value).getAmount() == 0)) {
						temp += ((item) value).getVolume();
						((item) value).setAmount(((item) value).getAmount() - 1);
						localVolume -= ((item) value).getVolume();
					}
					if(((item) value).getAmount() == 0) {
						counter += 1;
						continue;
					}
				}
			}
		}
	}
    


    
    // calculates the price of the shipment according to the number and types of containers used
    public double shippingCost(BigContainer biggie, SmallContainer smalls) {
		return ((biggie.getAmount() * 1800) + ((smalls.getAmount()) * (smalls.getWeight() < 500 ? 1000 : 1200)));
	}

    //Action Performer for sides JTextField
    private void SidesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
//Action Performer for Cylindrical JRadioButton
    private void CylindricalActionPerformed(java.awt.event.ActionEvent evt) {
        CylOptions();

    }
//Action Performer for rectangular JRadioButton
    private void RectangularActionPerformed(java.awt.event.ActionEvent evt) {
        RecOptions();
    }
//Action Performer for polygonal JRadioButton
    private void PolygonalActionPerformed(java.awt.event.ActionEvent evt) {
        PolOptions();
    }
//Action Performer for "no" JCheckBox
    private void NoContinueOrderActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
//method for allowing just Cylindrical options
    public void CylOptions(){

        Sides.setEnabled(false);
        Height.setEnabled(true);
        Lenght.setEnabled(false);
        Wide.setEnabled(false);
        Diameter.setEnabled(true);

    }
//method for allowing just Rectangular options
    public void RecOptions(){
    	
        Sides.setEnabled(false);
        Height.setEnabled(true);
        Lenght.setEnabled(true);
        Wide.setEnabled(true);
        Diameter.setEnabled(false);

    }
//method for allowing just polygonal options
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

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProgram().setVisible(true);
            }
        }
        );
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
      protected HashMap<String, Object> ItemMap;
}
