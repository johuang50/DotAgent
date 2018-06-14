/**
 *
 * @author Joshua
 */
public class SetWindow extends javax.swing.JFrame {

	boolean adding = true;

	/**
	 * Creates new form SetWindow
	 */
	public SetWindow(boolean a) {
		this.adding = a;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jToggleButton1 = new javax.swing.JToggleButton();
		jLabel5 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox<>();
		jLabel6 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jToggleButton2 = new javax.swing.JToggleButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Set");
		setResizable(false);

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jLabel1.setText("Counts:");

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jLabel2.setText("Side:");

		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setText("1");

		buttonGroup1.add(jRadioButton2);
		jRadioButton2.setText("2");

		jButton1.setText("Add Set");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		if (!adding) {
			jButton1.setText("Edit Set");
		}

		jLabel3.setText("Yard Line:");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "20", "30", "40", "50" }));

		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jLabel4.setText("Steps In/Out:");

		jToggleButton1.setText("Inward");
		jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButton1ActionPerformed(evt);
			}
		});

		jLabel5.setText("Vertical Mark:");

		jComboBox2.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Front SL", "Front H", "Back H", "Back SL" }));

		jLabel6.setText("Steps Off:");

		jToggleButton2.setText("Forward");
		jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jToggleButton2ActionPerformed(evt);
			}
		});

		jButton2.setText("Cancel");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel5).addComponent(jLabel3).addComponent(jLabel1))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
								.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jTextField1).addComponent(jComboBox1, 0,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addComponent(jLabel2)
												.addGap(42, 42, 42).addComponent(jRadioButton1).addGap(47, 47, 47)
												.addComponent(jRadioButton2)
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(jLabel4)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
														92, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12,
												Short.MAX_VALUE)
										.addComponent(jLabel6).addGap(8, 8, 8)
										.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
						.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2).addComponent(jRadioButton1).addComponent(jRadioButton2))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4).addComponent(jToggleButton1)
						.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(25, 25, 25)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5)
						.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jToggleButton2))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1)
						.addComponent(jButton2))
				.addContainerGap()));

		pack();
	}// </editor-fold>

	private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jToggleButton1.isSelected()) {
			jToggleButton1.setText("Outward");
		} else {
			jToggleButton1.setText("Inward");
		}
	}

	private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (jToggleButton2.isSelected()) {
			jToggleButton2.setText("Backward");
		} else {
			jToggleButton2.setText("Forward");
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		DirectionX x;
		if (jToggleButton1.isSelected()) {
			x = DirectionX.OUT;
		}
		else {
			x = DirectionX.IN;
		}
		DirectionY y;
		if (jToggleButton2.isSelected()) {
			y = DirectionY.BEHIND;
		}
		else {
			y = DirectionY.FRONT;
		}
		Location l;
		if (jComboBox2.getSelectedIndex()==0) {
			l = Location.FRONT_SIDELINE;
		} 
		else if (jComboBox2.getSelectedIndex()==1) {
			l = Location.FRONT_HASH;
		} 
		else if (jComboBox2.getSelectedIndex()==2) {
			l = Location.BACK_HASH;
		} 
		else {
			l = Location.BACK_SIDELINE;
		} 
		try {
			// TODO add your handling code here:
			if (jRadioButton1.isSelected()) {
				DotAgentGUI.updateSets(Integer.parseInt(jTextField1.getText()), Side.ONE, l, jComboBox1.getSelectedIndex()*10,
						x, y, Double.parseDouble(jTextField2.getText()),
						Double.parseDouble(jTextField3.getText()));
			} else if (jRadioButton2.isSelected()) {
				DotAgentGUI.updateSets(Integer.parseInt(jTextField1.getText()), Side.TWO, l,  jComboBox1.getSelectedIndex()*10,
						x, y, Double.parseDouble(jTextField2.getText()),
						Double.parseDouble(jTextField3.getText()));
			} else {
				(new WarningMessage(new javax.swing.JFrame(), true)).setVisible(true);
			}
			if (jRadioButton1.isSelected() || jRadioButton2.isSelected()) {
				this.setVisible(false);
			}
		} catch (java.lang.NumberFormatException e) {
			(new WarningMessage(new javax.swing.JFrame(), true)).setVisible(true);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.setVisible(false);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	// public static void main(String args[]) {
	// /* Set the Nimbus look and feel */
	// //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
	// (optional) ">
	// /* If Nimbus (introduced in Java SE 6) is not available, stay with the
	// default look and feel.
	// * For details see
	// http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	// */
	// try {
	// for (javax.swing.UIManager.LookAndFeelInfo info :
	// javax.swing.UIManager.getInstalledLookAndFeels()) {
	// if ("Nimbus".equals(info.getName())) {
	// javax.swing.UIManager.setLookAndFeel(info.getClassName());
	// break;
	// }
	// }
	// } catch (ClassNotFoundException ex) {
	// java.util.logging.Logger.getLogger(SetWindow.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (InstantiationException ex) {
	// java.util.logging.Logger.getLogger(SetWindow.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (IllegalAccessException ex) {
	// java.util.logging.Logger.getLogger(SetWindow.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	// java.util.logging.Logger.getLogger(SetWindow.class.getName()).log(java.util.logging.Level.SEVERE,
	// null, ex);
	// }
	// //</editor-fold>
	//
	// /* Create and display the form */
	// java.awt.EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// new SetWindow().setVisible(true);
	// }
	// });
	// }

	// Variables declaration - do not modify
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JToggleButton jToggleButton1;
	private javax.swing.JToggleButton jToggleButton2;
	// End of variables declaration
}
