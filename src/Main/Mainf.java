/*
 * Mainf.java
 *
 * Created on __DATE__, __TIME__
 */

package Main;

import java.awt.Dimension;

import javax.swing.JLabel;

/**
 *
 * @author  __USER__
 */
public class Mainf extends javax.swing.JFrame {

	/** Creates new form Mainf */
	public String qtbh;

	public Mainf(String qid) {
		initComponents();
		jLabel1.setText(qid);
		qtbh = jLabel1.getText();
		
		JLabel jLabel98 = new JLabel();
		Dimension size = this.jDesktopPane1.getSize();
		//		jLabel2.setBounds(0, 40, 1020, 640);
		jLabel98.setSize(this.jDesktopPane1.getSize());
		jLabel98.setText("<html><img width=" + size.width + " height="
				+ size.height + " src='"
				+ this.getClass().getResource("/Main/images/hotel.jpg")
				+ "'></html>");
		jDesktopPane1.add(jLabel98, new Integer(Integer.MIN_VALUE));
	}

	public Mainf() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jDesktopPane1 = new javax.swing.JDesktopPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenuItem10 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("\u9884\u5b9a\u623f\u95f4");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5165\u4f4f\u767b\u8bb0");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u9000\u623f\u767b\u8bb0");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u4f1a\u5458\u6dfb\u52a0");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("\u5ba2\u623f\u67e5\u8be2");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("\u7a7a\u623f\u67e5\u8be2");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jLabel1.setText("jLabel1");

		jLabel2.setText("\u524d\u53f0\u7f16\u53f7\uff1a");

		jMenu1.setText("\u9884\u5b9a\u7ba1\u7406");

		jMenuItem3.setText("\u6dfb\u52a0\u9884\u7ea6");
		jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenuItem3MouseClicked(evt);
			}
		});
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuItem1.setText("\u9884\u7ea6\u64cd\u4f5c");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu3.setText("\u4f4f\u623f\u7ba1\u7406");
		jMenu3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu3ActionPerformed(evt);
			}
		});

		jMenuItem4.setText("\u5165\u4f4f\u767b\u8bb0");
		jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenuItem4MouseClicked(evt);
			}
		});
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenuItem5.setText("\u9000\u623f\u767b\u8bb0");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem5);

		jMenuBar1.add(jMenu3);

		jMenu4.setText("\u4f1a\u5458\u7ba1\u7406");

		jMenuItem7.setText("\u6dfb\u52a0\u4f1a\u5458");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem7);

		jMenuItem9.setText("\u7eed\u8d39/\u4fee\u6539\u4f1a\u5458");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem9);

		jMenuBar1.add(jMenu4);

		jMenu5.setText("\u67e5\u8be2\u7ba1\u7406");

		jMenuItem2.setText("\u7a7a\u623f\u67e5\u8be2");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem2);

		jMenuItem8.setText("\u5ba2\u623f\u67e5\u8be2");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem8);

		jMenuItem10.setText("\u5386\u53f2\u67e5\u8be2");
		jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem10ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem10);

		jMenuBar1.add(jMenu5);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												173, Short.MAX_VALUE)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel1)
										.addContainerGap()).addComponent(
								jDesktopPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 814,
								Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								35,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								36,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jButton6,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												35,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel1)
																										.addComponent(
																												jLabel2))
																						.addComponent(
																								jButton5,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton3,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								35,
																								Short.MAX_VALUE))
																		.addGap(
																				9,
																				9,
																				9)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jDesktopPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												613,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		FindHistroy fidhistory = new FindHistroy();
		fidhistory.setVisible(true);
		jDesktopPane1.add(fidhistory);
		fidhistory.toFront();
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		FindRoominform fdromifm = new FindRoominform();
		fdromifm.setVisible(true);
		jDesktopPane1.add(fdromifm);
		fdromifm.toFront();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		FindRoominform fdromifm = new FindRoominform();
		fdromifm.setVisible(true);
		jDesktopPane1.add(fdromifm);
		fdromifm.toFront();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		FindEmptyRoom fdeptyrom = new FindEmptyRoom();
		fdeptyrom.setVisible(true);
		jDesktopPane1.add(fdeptyrom);
		fdeptyrom.toFront();
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		FindEmptyRoom fdeptyrom = new FindEmptyRoom();
		fdeptyrom.setVisible(true);
		jDesktopPane1.add(fdeptyrom);
		fdeptyrom.toFront();
	}

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		ChangeAndAddtimeVip caav = new ChangeAndAddtimeVip(qtbh);
		caav.setVisible(true);
		jDesktopPane1.add(caav);
		caav.toFront();
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AddVip addvip = new AddVip(qtbh);
		addvip.setVisible(true);
		jDesktopPane1.add(addvip);
		addvip.toFront();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AddVip addvip = new AddVip(qtbh);
		addvip.setVisible(true);
		jDesktopPane1.add(addvip);
		addvip.toFront();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		outhotel outhl = new outhotel();
		outhl.setVisible(true);
		jDesktopPane1.add(outhl);
		outhl.toFront();
	}

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		outhotel outhl = new outhotel();
		outhl.setVisible(true);
		jDesktopPane1.add(outhl);
		outhl.toFront();
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		FindBook fidbok = new FindBook();
		fidbok.setVisible(true);
		jDesktopPane1.add(fidbok);
		fidbok.toFront();
	}

	private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		inhotel inhl = new inhotel();
		inhl.setVisible(true);
		jDesktopPane1.add(inhl);
		inhl.toFront();
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		BookRoom bokrom = new BookRoom(qtbh);
		bokrom.setVisible(true);
		jDesktopPane1.add(bokrom);
		bokrom.toFront();
	}

	private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		BookRoom bokrom = new BookRoom();
		bokrom.setVisible(true);
		jDesktopPane1.add(bokrom);
		bokrom.toFront();
	}

	private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		new inhotel().setVisible(true);

	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		inhotel inhl = new inhotel(qtbh);
		inhl.setVisible(true);
		jDesktopPane1.add(inhl);
		inhl.toFront();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		inhotel inhl = new inhotel(qtbh);
		inhl.setVisible(true);
		jDesktopPane1.add(inhl);
		inhl.toFront();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		
		BookRoom bokrom = new BookRoom(qtbh);
		bokrom.setVisible(true);
		jDesktopPane1.add(bokrom);
		bokrom.toFront();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Mainf().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	// End of variables declaration//GEN-END:variables

}