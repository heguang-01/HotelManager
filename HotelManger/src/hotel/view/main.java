/*
 * main.java
 *
 * Created on __DATE__, __TIME__
 */

package hotel.view;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class main extends javax.swing.JFrame {

	/** Creates new form main */
	public main() {
		initComponents();
		this.setLocationRelativeTo(null);
		// 设置最大化
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		table = new javax.swing.JDesktopPane();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		edit = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		add_household = new javax.swing.JMenuItem();
		out = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenu6 = new javax.swing.JMenu();
		jMenuItem9 = new javax.swing.JMenuItem();
		outAccountManger = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jMenu1.setText("\u83dc\u5355");

		jMenu3.setText("\u67e5\u8be2\u7f16\u8f91");

		jMenuItem1.setText("\u67e5\u8be2\u623f\u5ba2\u4fe1\u606f");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem1);

		jMenuItem2.setText("\u67e5\u8be2\u5ba2\u623f\u72b6\u6001");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem2);

		edit.setText("\u67e5\u8be2\u7f16\u8f91\u5ba2\u623f\u4fe1\u606f");
		edit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				editActionPerformed(evt);
			}
		});
		jMenu3.add(edit);

		jMenuItem4.setText("\u6dfb\u52a0\u5ba2\u623f\u4fe1\u606f");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem4);

		jMenu1.add(jMenu3);

		jMenu4.setText("\u5165\u9000\u623f\u7ba1\u7406");

		add_household.setText("\u5165\u4f4f\u7ba1\u7406");
		add_household.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				add_householdActionPerformed(evt);
			}
		});
		jMenu4.add(add_household);

		out.setText("\u9000\u623f\u7ba1\u7406");
		out.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				outActionPerformed(evt);
			}
		});
		jMenu4.add(out);

		jMenu1.add(jMenu4);

		jMenu5.setText("\u9000\u8ba2\u623f\u7ba1\u7406");

		jMenuItem7.setText("\u9884\u8ba2\u7ba1\u7406");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem7);

		jMenuItem8.setText("\u9000\u8ba2\u7ba1\u7406");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem8);

		jMenu1.add(jMenu5);

		jMenu6.setText("\u6536\u94f6\u7ba1\u7406");

		jMenuItem9.setText("\u5165\u8d26\u7ba1\u7406");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem9);

		outAccountManger.setText("\u51fa\u8d26\u7ba1\u7406");
		outAccountManger.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				outAccountMangerMousePressed(evt);
			}
		});
		outAccountManger.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				outAccountMangerActionPerformed(evt);
			}
		});
		jMenu6.add(outAccountManger);

		jMenu1.add(jMenu6);

		jMenuItem3.setText("\u4fee\u6539\u8d44\u6599");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuBar1.add(jMenu1);
		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(table,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(table,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 279,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		addGuestRoom addGuestRoom = new addGuestRoom();
		addGuestRoom.setVisible(true);
		this.table.add(addGuestRoom);
	}

	private void outAccountMangerActionPerformed(java.awt.event.ActionEvent evt) {
		outAccountManger outAccountManger = new outAccountManger();
		outAccountManger.setVisible(true);
		this.table.add(outAccountManger);
	}

	private void outAccountMangerMousePressed(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		inAccountManger inAccountManger = new inAccountManger();
		inAccountManger.setVisible(true);
		this.table.add(inAccountManger);
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		usManger usManger = new usManger();
		usManger.setVisible(true);
		this.table.add(usManger);
	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
		BookManger bookManger = new BookManger();
		bookManger.setVisible(true);
		this.table.add(bookManger);
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		editData editData = new editData();
		editData.setVisible(true);
		editAdmin editadmin = new editAdmin();
		editadmin.setVisible(true);
		this.table.add(editadmin);
	}

	private void editActionPerformed(java.awt.event.ActionEvent evt) {
		queryGuestRoomInfo queryGuestRoomInfo = new queryGuestRoomInfo();
		queryGuestRoomInfo.setVisible(true);
		this.table.add(queryGuestRoomInfo);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		queryGuestRoomState queryGuestRoomState = new queryGuestRoomState();
		queryGuestRoomState.setVisible(true);
		this.table.add(queryGuestRoomState);
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		queryTenantInfo queryTenantInfo = new queryTenantInfo();
		queryTenantInfo.setVisible(true);
		this.table.add(queryTenantInfo);
	}

	private void outActionPerformed(java.awt.event.ActionEvent evt) {
		outGuestManger outGuestManger = new outGuestManger();
		outGuestManger.setVisible(true);
		this.table.add(outGuestManger);
	}

	private void add_householdActionPerformed(ActionEvent evt) {
		addHousehold addHousehold = new addHousehold();
		addHousehold.setVisible(true);
		this.table.add(addHousehold);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem add_household;
	private javax.swing.JMenuItem edit;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JMenuItem out;
	private javax.swing.JMenuItem outAccountManger;
	private javax.swing.JDesktopPane table;
	// End of variables declaration//GEN-END:variables

}