/*
 * AddVip.java
 *
 * Created on __DATE__, __TIME__
 */

package Main;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import AllDao.VipDao;

import model.Vip;
import util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class AddVip extends javax.swing.JInternalFrame {

	VipDao vipdao=new VipDao();
	/** Creates new form AddVip */
	public String dateNowStr;
	public AddVip() {
		initComponents();
	}

	public AddVip(String qtbh) {
		// TODO Auto-generated constructor stub
		initComponents();
		Date d = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        dateNowStr = sdf.format(d); 
        this.jTextField3.setText(dateNowStr);
		this.jLabel3.setText(qtbh);
		
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);

		jLabel2.setText("\u524d\u53f0\u4eba\u5458\u7f16\u53f7\uff1a");

		jLabel3.setText("jLabel3");

		jLabel4.setText("\u4f1a\u5458\u540d\u5b57\uff1a");

		jLabel5.setText("\u4f1a\u5458\u671f\u9650\uff1a");

		jTextField3.setEditable(false);

		jLabel6.setText("-");

		jLabel7.setText("\u8054\u7cfb\u65b9\u5f0f\uff1a");

		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

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
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				28,
																				28,
																				28)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel3))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel5)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jTextField3,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				125,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel4)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jTextField2,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				90,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addComponent(
																																jLabel7,
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																layout
																																		.createSequentialGroup()
																																		.addGap(
																																				63,
																																				63,
																																				63)
																																		.addComponent(
																																				jTextField5,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				127,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addGap(
																												5,
																												5,
																												5)
																										.addComponent(
																												jLabel6)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jTextField4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												142,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				192,
																				192,
																				192)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				84,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(88, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(34, 34, 34)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(jLabel3))
										.addGap(47, 47, 47)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(jLabel6)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												48, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(32, 32, 32).addComponent(
												jButton1).addGap(28, 28, 28)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		
        
		String vname = this.jTextField2.getText();
		String qid = this.jLabel3.getText();
		String vstime = dateNowStr;
		String vetime=this.jTextField4.getText();
		String vtel=this.jTextField5.getText();
		if (StringUtil.isEmpty(vname)) {
			JOptionPane.showMessageDialog(null, "会员名不能为空！ ");
			return;
		}
		if (StringUtil.isEmpty(vetime)) {
			JOptionPane.showMessageDialog(null, "会员到期时间不能为空！ ");
			return;
		}
		if (StringUtil.isEmpty(vtel)) {
			JOptionPane.showMessageDialog(null, "会员电话不能为空！ ");
			return;
		}
		Date date;
		Vip vip=new Vip(vname, qid, vstime, vetime, vtel);
			int addNum = vipdao.add(vip);
			if (addNum == 1) {
				JOptionPane.showMessageDialog(null, "会员添加成功！");
				
			} else {
				JOptionPane.showMessageDialog(null, "会员添加失败！");
			}
} 


	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}