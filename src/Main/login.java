/*
 * login.java
 *
 * Created on __DATE__, __TIME__
 */

package Main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import AllDao.UserDao;

import model.User;
import util.StringUtil;

/**
 *
 * @author  __USER__
 */
public class login extends javax.swing.JFrame {
	UserDao userdao = new UserDao();

	/** Creates new form login */
	public login() {
		initComponents();
		JLabel jLabel99 = new JLabel();
		Dimension size = this.jDesktopPane1.getSize();
		//		jLabel2.setBounds(0, 40, 1020, 640);
		jLabel99.setSize(this.jDesktopPane1.getSize());
		jLabel99.setText("<html><img width=" + size.width + " height="
				+ size.height + " src='"
				+ this.getClass().getResource("/Main/images/hotel.jpg")
				+ "'></html>");
		jDesktopPane1.add(jLabel99, new Integer(Integer.MIN_VALUE));
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
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jDesktopPane1 = new javax.swing.JDesktopPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/user.png"))); // NOI18N
		jLabel1.setText("\u7f16\u53f7\uff1a");

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/password.png"))); // NOI18N
		jLabel2.setText("\u5bc6\u7801\uff1a");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Main/images/login.png"))); // NOI18N
		jButton1.setText("\u767b\u5f55");
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
										.addGap(112, 112, 112)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel1)
														.addComponent(jLabel2))
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
																jPasswordField1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																104,
																Short.MAX_VALUE))
										.addContainerGap(123, Short.MAX_VALUE))
						.addComponent(jDesktopPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 400,
								Short.MAX_VALUE).addGroup(
								layout.createSequentialGroup().addGap(141, 141,
										141).addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										121,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(138, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addComponent(
												jDesktopPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												125, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(34, 34, 34)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addGap(33, 33, 33)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												36,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		loginActionPerformed(evt);
	}

	private void loginActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String QId = this.jTextField1.getText();
		String QPwd = new String(this.jPasswordField1.getPassword());
		if (StringUtil.isEmpty(QId)) {
			JOptionPane.showMessageDialog(null, "用户名不能为空！");
		}
		if (StringUtil.isEmpty(QPwd)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
		}

		User user = new User(QId, QPwd);
		try {
			User currentUser = userdao.login(user);
			if (currentUser != null) {
				JOptionPane.showMessageDialog(null, "登陸成功！ ");
				this.dispose();
				Mainf mf = new Mainf(QId);
				mf.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(null, "用戶名或密碼錯誤！ ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new login().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}