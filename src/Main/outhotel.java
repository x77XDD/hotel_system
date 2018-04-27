/*
 * outhotel.java
 *
 * Created on __DATE__, __TIME__
 */

package Main;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;

import util.StringUtil;

import AllDao.OutHotelDao;
import AllDao.SearchZHbhDao;

import model.BookRoomModel;
import model.CheckoutModel;
import model.OuthotelModel;
import model.ZhinforModel;

/**
 *
 * @author  __USER__
 */
public class outhotel extends javax.swing.JInternalFrame {

	/** Creates new form outhotel */
	OutHotelDao othoteldao = new OutHotelDao();
	SearchZHbhDao seachzhdao = new SearchZHbhDao();

	public outhotel() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();

		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);

		jLabel2.setText("\u623f\u95f4\u53f7\uff1a");

		jLabel3.setText("\u4f4f\u6237\u59d3\u540d\uff1a");

		jTextField2.setEditable(false);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/search.png"))); // NOI18N
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel4.setText("\u8eab\u4efd\u8bc1\u53f7\uff1a");

		jTextField3.setEditable(false);

		jLabel5.setText("\u5165\u4f4f\u65e5\u671f\uff1a");

		jTextField4.setEditable(false);

		jLabel6.setText("\u662f\u5426\u4f1a\u5458\uff1a");

		jTextField5.setEditable(false);

		jLabel7.setText("\u623f\u95f4\u7c7b\u578b\uff1a");

		jTextField6.setEditable(false);

		jLabel8.setText("\u623f\u95f4\u5355\u4ef7\uff1a");

		jTextField7.setEditable(false);

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/money.png"))); // NOI18N
		jButton2.setText("\u7ed3\u7b97");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel9.setText("\u6700\u7ec8\u7ed3\u7b97\u91d1\u989d\uff1a");

		jLabel10.setText("0.00\u5143");

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/outroom.png"))); // NOI18N
		jButton3.setText("\u9000\u623f");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel11.setForeground(new java.awt.Color(255, 0, 0));
		jLabel11.setText("\u6ce8\uff1a\u4f1a\u5458\u7ed3\u7b978.8\u6298");

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
																				39,
																				39,
																				39)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel2)
																						.addGroup(
																								layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jLabel7)
																										.addComponent(
																												jLabel5)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField6)
																						.addComponent(
																								jTextField2)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								99,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField4,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								113,
																								Short.MAX_VALUE))
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												27,
																												27,
																												27)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addComponent(
																																jLabel6,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel4,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel8,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				false)
																																		.addComponent(
																																				jTextField7,
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jTextField5,
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				107,
																																				Short.MAX_VALUE))
																														.addComponent(
																																jTextField3,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																181,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												52,
																												52,
																												52)
																										.addComponent(
																												jButton1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												82,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				88,
																				88,
																				88)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												79,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												216,
																												216,
																												216))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel11)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel9)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				121,
																				Short.MAX_VALUE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				202,
																				202,
																				202)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				86,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(32, 32, 32)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1))
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(42, 42, 42)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(jLabel6)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(40, 40, 40)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(46, 46, 46)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																41,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				32,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				48,
																				Short.MAX_VALUE))
														.addComponent(jLabel11))
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String ot = this.jTextField1.getText();

		if (StringUtil.isEmpty(ot)) {
			JOptionPane.showMessageDialog(null, "��Զ�Ӧ��������˷��� ");
			return;
		}
		if (jLabel10.getText().equals("0.00Ԫ")) {
			JOptionPane.showMessageDialog(null, "���Ƚ��㣡 ");
			return;
		}

		String xm = this.jTextField2.getText();
		ZhinforModel zhxm = new ZhinforModel(xm);
		List<ZhinforModel> shousuoid = seachzhdao.list(zhxm);
		ZhinforModel out1 = null;
		String zhid = "";
		if (shousuoid.size() != 0) {
			out1 = shousuoid.get(0);
			zhid = out1.getZId();
		}
		System.out.println(zhid);

		String kid = this.jTextField1.getText();
		SimpleDateFormat sdf = new SimpleDateFormat(" yyyy-MM-dd");
		String nowtime = sdf.format(new java.util.Date());
		String date = nowtime;
		String zongjia = this.jLabel10.getText();
		Date date1;
		CheckoutModel chkout;
		try {
			date1 = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(
					date).getTime());
			chkout = new CheckoutModel(kid, zhid, date1, zongjia);
			int addNum = seachzhdao.add(chkout);
			if (addNum == 1) {
				JOptionPane.showMessageDialog(null, "�Ѿ�¼����ʷ��¼��");
			} else {
				JOptionPane.showMessageDialog(null, "¼����ʷ��¼ʧ�ܣ�");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			int deleteNum = seachzhdao.delete(zhid);
			if (deleteNum == 1) {
				JOptionPane.showMessageDialog(null, "�˷��ɹ�");
				this.jTextField1.setText("");
				this.jTextField2.setText("");
				this.jTextField3.setText("");
				this.jTextField4.setText("");
				this.jTextField5.setText("");
				this.jTextField6.setText("");
				this.jTextField7.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "�˷�ʧ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "�˷�ʧ��");
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String ot = this.jTextField1.getText();

		if (StringUtil.isEmpty(ot)) {
			JOptionPane.showMessageDialog(null, "��Զ�Ӧ������н��㣡 ");
			return;
		}

		float danjia = Float.parseFloat(this.jTextField7.getText());
		String ruzhuriqi = this.jTextField4.getText();
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
		String nowtime = dfs.format(new java.util.Date());
		try {
			java.util.Date end = dfs.parse(nowtime);
			java.util.Date begin = dfs.parse(ruzhuriqi);
			long between = (end.getTime() - begin.getTime()) / 1000;
			long day1 = between / (24 * 3600);
			if (this.jTextField5.getText().equals("0")) {
				float zongjia = (float) (danjia * day1);
				String zj = String.valueOf(zongjia);
				this.jLabel10.setText(zj);
			} else {
				float zongjia = (float) (danjia * day1 * 0.88);
				String zj = String.valueOf(zongjia);
				this.jLabel10.setText(zj);
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String ot = this.jTextField1.getText();
		if (StringUtil.isEmpty(ot)) {
			JOptionPane.showMessageDialog(null, "�����뷿��ţ� ");
			return;
		}

		OuthotelModel out = new OuthotelModel(ot);
		List<OuthotelModel> listouthotel = othoteldao.list(out);
		OuthotelModel out1 = null;

		if (listouthotel.size() != 0) {
			out1 = listouthotel.get(0);
			SimpleDateFormat sdf = new SimpleDateFormat(" yyyy-MM-dd");
			String ruzhutime = sdf.format(out1.getZDate());
			this.jTextField2.setText(out1.getZName());
			this.jTextField3.setText(out1.getZSid());
			this.jTextField4.setText(ruzhutime);
			this.jTextField5.setText(out1.getZMember());
			this.jTextField6.setText(out1.getRName());
			this.jTextField7.setText(out1.getKPrice());
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	// End of variables declaration//GEN-END:variables

}