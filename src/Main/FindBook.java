/*
 * FindBook.java
 *
 * Created on __DATE__, __TIME__
 */

package Main;

import java.awt.Dimension;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import util.StringUtil;

import model.BookRoomModel;
import model.User;

import AllDao.BookRoomDao;
import AllDao.UserDao;

/**
 *
 * @author  __USER__
 */
public class FindBook extends javax.swing.JInternalFrame {

	BookRoomDao bkrmdao = new BookRoomDao();
	UserDao usdao = new UserDao();

	/** Creates new form FindBook */
	public FindBook() {
		initComponents();
	

		this.jComboBox1.removeAllItems();
		this.fillBookType();
		fillTable(new BookRoomModel());

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);

		jPanel1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("\u9884\u7ea6\u67e5\u8be2\u6761\u4ef6"));

		jLabel2.setText("\u524d\u53f0\u4eba\u5458\u7f16\u53f7\uff1a");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Item 1", "Item 2", "Item 3", "Item 4" }));

		jLabel3.setText("\u9884\u7ea6\u4eba\uff1a");

		jLabel4.setText("\u9884\u7559\u53f7\u7801\uff1a");

		jLabel5.setText("\u9884\u7ea6\u65e5\u671f\u8303\u56f4\uff1a");

		jLabel6.setText("-");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/search.png"))); // NOI18N
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				83,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel6))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				97,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				91,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																82,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				106,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																90,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(53, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(23, 23, 23)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																23,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												25, Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel5)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				25,
																				25,
																				25))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				33,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));

		jPanel3.setBorder(javax.swing.BorderFactory
				.createTitledBorder("\u9884\u5b9a\u4fe1\u606f\u64cd\u4f5c"));

		jLabel1.setText("\u9884\u7ea6\u5355\u53f7\uff1a");

		jTextField5.setEditable(false);

		jLabel7.setText("\u9884\u8fbe\u65e5\u671f\uff1a");

		jLabel8.setText("\u9884\u7ea6\u623f\u95f4\u53f7\uff1a");

		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField7ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/xiugai.png"))); // NOI18N
		jButton2.setText("\u4fee\u6539\u9884\u7ea6");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/tuifang.png"))); // NOI18N
		jButton3.setText("\u5220\u9664\u9884\u7ea6");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel9.setText("\u9884\u7ea6\u4eba\uff1a");

		jLabel10.setText("\u8054\u7cfb\u7535\u8bdd\uff1a");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(
																				130,
																				130,
																				130)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				115,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				126,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jLabel1))
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel3Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jTextField8,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																111,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jTextField5,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																86,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addGap(
																												7,
																												7,
																												7)
																										.addComponent(
																												jTextField6)))
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel9)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField9,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												198,
																												Short.MAX_VALUE))
																						.addGroup(
																								jPanel3Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel8)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												140,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGap(
																				121,
																				121,
																				121))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				82,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9)
														.addComponent(
																jTextField9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel10)
														.addComponent(
																jTextField8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(14, 14, 14)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																42,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																48,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null },
						{ null, null, null, null, null, null } }, new String[] {
						"前台人员编号", "房间号", "预约人", "联系电话", "预达日期", "预约单号" }));
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

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
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				10,
																				10,
																				10)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				568,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addComponent(
																jPanel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jPanel1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(22, 22, 22).addComponent(
						jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE,
						121, Short.MAX_VALUE).addGap(28, 28, 28).addComponent(
						jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18,
						18).addComponent(jPanel3,
						javax.swing.GroupLayout.PREFERRED_SIZE, 214,
						javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String pid = jTextField5.getText();
		if (StringUtil.isEmpty(pid)) {
			JOptionPane.showMessageDialog(null, "请选择要删除的记录");
			return;
		}
		int n = JOptionPane.showConfirmDialog(null, "确定要删除该记录吗？");
		if (n == 0) {
			try {
				BookRoomModel bokrom = new BookRoomModel();
				bokrom.setPId(Integer.parseInt(pid));

				int deleteNum = bkrmdao.delete(bokrom);
				if (deleteNum == 1) {
					JOptionPane.showMessageDialog(null, "删除成功");
					this.jTextField6.setText("");
					this.jTextField5.setText("");
					this.jTextField7.setText("");
					this.jTextField8.setText("");
					this.jTextField9.setText("");
					this.fillTable(new BookRoomModel());
				} else {
					JOptionPane.showMessageDialog(null, "删除失败");
				}
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "删除失败");
			}
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String pid = this.jTextField5.getText();
		if (StringUtil.isEmpty(pid)) {
			JOptionPane.showMessageDialog(null, "请选择要修改的预约记录");
			return;
		}
		String ptime = this.jTextField6.getText();
		String tel = this.jTextField8.getText();
		String name = this.jTextField9.getText();

		Date pdate;
		try {
			pdate = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(
					ptime).getTime());
			if (pdate == null) {
				JOptionPane.showMessageDialog(null, "预达日期不能为空！");
				return;
			}
			if (tel == null) {
				JOptionPane.showMessageDialog(null, "预留号码不能为空！");
				return;
			}
			if (name == null) {
				JOptionPane.showMessageDialog(null, "预约人不能为空！");
				return;
			}
			String kid = this.jTextField7.getText();
			if (StringUtil.isEmpty(kid)) {
				JOptionPane.showMessageDialog(null, "房间号不能为空！");
				return;
			}

			BookRoomModel BKROM = new BookRoomModel(kid, name, tel, pdate,
					Integer.parseInt(pid));

			int addNum = bkrmdao.update(BKROM);
			if (addNum == 1) {
				JOptionPane.showMessageDialog(null, "预约修改成功！");
				this.jTextField6.setText("");
				this.jTextField5.setText("");
				this.jTextField7.setText("");
				this.jTextField8.setText("");
				this.jTextField9.setText("");
				this.fillTable(new BookRoomModel());
			} else {
				JOptionPane.showMessageDialog(null, "预约修改失败！");
			}
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "预约修改失败！");
		}

	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		int rowIndex = jTable1.getSelectedRow();
		String id = String.valueOf(jTable1.getModel().getValueAt(rowIndex, 5));
		String date = String
				.valueOf(jTable1.getModel().getValueAt(rowIndex, 4));
		String roomnum = (String) jTable1.getModel().getValueAt(rowIndex, 1);
		String tel = (String) jTable1.getModel().getValueAt(rowIndex, 3);
		String name = (String) jTable1.getModel().getValueAt(rowIndex, 2);

		this.jTextField6.setText(date);
		this.jTextField5.setText(id);
		this.jTextField7.setText(roomnum);
		this.jTextField8.setText(tel);
		this.jTextField9.setText(name);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:		

		try {
			User qiddd = (User) this.jComboBox1.getSelectedItem();
			String qid = qiddd.getQId();
			String name = this.jTextField3.getText();
			String tel = this.jTextField4.getText();
			String frontdate = this.jTextField1.getText();
			String behinddate = this.jTextField2.getText();
			System.out.println(qid + name + tel + frontdate + behinddate);

			if (frontdate.equals("") && behinddate.equals("")) {
				Date ftime = new java.sql.Date(new SimpleDateFormat(
						"yyyy-MM-dd").parse("1900-01-01").getTime());
				Date dtime = new java.sql.Date(new SimpleDateFormat(
						"yyyy-MM-dd").parse("2099-01-01").getTime());
				BookRoomModel bkrommol = new BookRoomModel(qid, name, tel,
						dtime, ftime);
				this.fillTable(bkrommol);
			} else {
				Date bdate = new java.sql.Date(new SimpleDateFormat(
						"yyyy-MM-dd").parse(behinddate).getTime());
				Date fdate = new java.sql.Date(new SimpleDateFormat(
						"yyyy-MM-dd").parse(frontdate).getTime());
				BookRoomModel bkrommol = new BookRoomModel(qid, name, tel,
						bdate, fdate);
				this.fillTable(bkrommol);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void fillTable(BookRoomModel bookrom) {
		DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
		dtm.setRowCount(0);
		try {
			List<BookRoomModel> listBookROM = bkrmdao.list(bookrom);
			BookRoomModel bkrom = null;
			if (listBookROM.size() != 0) {
				for (int i = 0; i < listBookROM.size(); i++) {
					bkrom = listBookROM.get(i);
					Vector v = new Vector();
					v.add(bkrom.getQId());
					v.add(bkrom.getKId());
					v.add(bkrom.getPName());
					v.add(bkrom.getPtel());
					v.add(bkrom.getPdate());
					v.add(bkrom.getPId());
					dtm.addRow(v);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void fillBookType() {
		try {
			List<User> listqiantai = usdao.list(new User());
			User us = null;
			us = new User();
			us.setQId("请选择...");
			this.jComboBox1.addItem(us);
			if (listqiantai.size() != 0) {
				for (int i = 0; i < listqiantai.size(); i++) {
					us = listqiantai.get(i);
					this.jComboBox1.addItem(us);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	// End of variables declaration//GEN-END:variables

}