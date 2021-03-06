/*
 * BookRoom.java
 *
 * Created on __DATE__, __TIME__
 */

package Main;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.StringUtil;
import AllDao.BookRoomDao;
import AllDao.IspreDao;
import model.BookRoomModel;
import model.OuthotelModel;

/**
 *
 * @author  __USER__
 */
public class BookRoom extends javax.swing.JInternalFrame {

	BookRoomDao bookromdao = new BookRoomDao();
	IspreDao ispredao = new IspreDao();

	/** Creates new form BookRoom */
	public BookRoom() {
		initComponents();
	}

	public BookRoom(String QID) {
		initComponents();

		ImageIcon icon = new ImageIcon("/Main/images/hotel.jpg");// 读取图标
		this.setFrameIcon(icon);

		jLabel2.setText(QID);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();

		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/qiantai.png"))); // NOI18N
		jLabel1.setText("\u524d\u53f0\u7f16\u53f7\uff1a");

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/user.png"))); // NOI18N
		jLabel3.setText("\u4f4f\u6237\u59d3\u540d\uff1a");

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/phone.png"))); // NOI18N
		jLabel4.setText("\u7535\u8bdd\u53f7\u7801\uff1a");

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/rili.png"))); // NOI18N
		jLabel5.setText("\u9884\u8fbe\u65e5\u671f\uff1a");

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/roomnum.png"))); // NOI18N
		jLabel6.setText("\u9884\u7ea6\u623f\u95f4\u53f7\uff1a");

		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/confirm.png"))); // NOI18N
		jButton1.setText("\u786e\u8ba4\u9884\u7ea6");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setText("jLabel2");

		jLabel7.setForeground(new java.awt.Color(204, 0, 0));
		jLabel7
				.setText("\u6ce8\uff1a\u9884\u8fbe\u65e5\u671f\u683c\u5f0f2018-01-04");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup().addGap(181, 181,
										181).addComponent(jButton1)
										.addContainerGap(218, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel6)
																										.addGap(
																												10,
																												10,
																												10))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel1)
																														.addComponent(
																																jLabel3))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jTextField5,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																124,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField3,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																114,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGap(
																												34,
																												34,
																												34)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel5,
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel4,
																																javax.swing.GroupLayout.Alignment.TRAILING))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jTextField1)
																														.addComponent(
																																jTextField4,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																119,
																																javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addComponent(
																								jLabel2)))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				313,
																				313,
																				313)
																		.addComponent(
																				jLabel7)))
										.addGap(31, 31, 31)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addContainerGap(33, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(jLabel2))
										.addGap(31, 31, 31)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
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
														.addComponent(jLabel3))
										.addGap(52, 52, 52)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6)
														.addComponent(jLabel5)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(19, 19, 19).addComponent(
												jLabel7)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

		String qid = this.jLabel2.getText();
		String kid = this.jTextField5.getText();
		String name = this.jTextField3.getText();
		String tel = this.jTextField4.getText();
		String riqi = this.jTextField1.getText();

		String sjhmzz = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

		if (StringUtil.isEmpty(name)) {
			JOptionPane.showMessageDialog(null, "请输入预约人名字！ ");
			return;
		}
		if (StringUtil.isEmpty(tel)) {
			JOptionPane.showMessageDialog(null, "请输入联系号码！ ");
			return;
		}
		if (tel.length() != 11) {
			JOptionPane.showMessageDialog(null, "手机号码应该11位！ ");
			return;
		} else {
			Pattern p = Pattern.compile(sjhmzz);
			Matcher m = p.matcher(tel);
			boolean isMatch = m.matches();
			if (isMatch == false) {
				JOptionPane.showMessageDialog(null, "请输入正确的联系号码！ ");
				return;
			}
		}
		if (StringUtil.isEmpty(kid)) {
			JOptionPane.showMessageDialog(null, "预约房间号不能为空！ ");
			return;
		}

		String szm = kid.substring(0, 1);
		if (!szm.equals("K")) {
			JOptionPane.showMessageDialog(null, "输入房间号错误 ");
			return;
		}
		if (StringUtil.isEmpty(riqi)) {
			JOptionPane.showMessageDialog(null, "预达日期不能为空！ ");
			return;
		}

		BookRoomModel bk = new BookRoomModel(kid);
		List<BookRoomModel> bokroom = ispredao.list(bk);

		if (bokroom.size() > 0) {
			JOptionPane.showMessageDialog(null, "该房间已经被预约！ ");
			return;
		}

		Date date;
		BookRoomModel bokrom;
		try {

			date = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(
					riqi).getTime());
			bokrom = new BookRoomModel(qid, kid, name, tel, date);
			int addNum = bookromdao.add(bokrom);
			if (addNum == 1) {
				JOptionPane.showMessageDialog(null, "预约成功！");
				this.jTextField5.setText("");
				this.jTextField1.setText("");
				this.jTextField4.setText("");
				this.jTextField3.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "预约失败！");
			}
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "预约1失败！");
		}

	}

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}