/*
 * outAccountManger.java
 *
 * Created on __DATE__, __TIME__
 */

package hotel.view;

import hotel.dao.ZhiChuDao;
import hotel.model.ShouYin;
import hotel.util.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author  __USER__
 */
public class outAccountManger extends javax.swing.JInternalFrame {

	DbUtil dbUtil = new DbUtil();
	ZhiChuDao outAccountDao = new ZhiChuDao();

	/** Creates new form outAccountManger */
	public outAccountManger() {
		initComponents();
		this.fillTable();
		this.setLocation(200, 50);//设置窗口位置
	}

	/**
	 * 填充表格数据
	 * @param name
	 */
	public void fillTable() {
		DefaultTableModel dtm = (DefaultTableModel) outAccountTable.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet re = outAccountDao.outAccount(con);
			while (re.next()) {
				Vector v = new Vector();
				//添加每一行的数据
				v.add(re.getString("id"));
				v.add(re.getString("type"));
				v.add(re.getString("money"));
				v.add(re.getString("remarks"));
				v.add(re.getString("time"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		outAccountTable = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		money = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		remarks = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		type = new javax.swing.JTextField();
		add = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u51fa\u8d26\u7ba1\u7406");

		outAccountTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"编号", "类型", "金额", "备注", "出账时间" }) {
			boolean[] canEdit = new boolean[] { false, true, true, true, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(outAccountTable);

		jLabel1.setText("\u91d1\u989d");

		jLabel2.setText("\u5907\u6ce8");

		jLabel3.setText("\u7c7b\u578b");

		type.setEditable(false);
		type.setText("\u652f\u51fa");

		add.setText("\u6dfb\u52a0");
		add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.add(
																				36,
																				36,
																				36)
																		.add(
																				jPanel1Layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING,
																								false)
																						.add(
																								jPanel1Layout
																										.createSequentialGroup()
																										.add(
																												jLabel3)
																										.add(
																												18,
																												18,
																												18)
																										.add(
																												type))
																						.add(
																								jPanel1Layout
																										.createSequentialGroup()
																										.add(
																												jLabel1)
																										.add(
																												18,
																												18,
																												18)
																										.add(
																												money,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																												163,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
																		.add(
																				18,
																				18,
																				18)
																		.add(
																				jLabel2)
																		.add(
																				18,
																				18,
																				18)
																		.add(
																				remarks,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				175,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.add(
																				387,
																				387,
																				387)
																		.add(
																				add)))
										.addContainerGap(516, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.add(37, 37, 37)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jLabel1)
														.add(
																money,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jLabel2)
														.add(
																remarks,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.add(18, 18, 18)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jLabel3)
														.add(
																type,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.add(28, 28, 28).add(add)
										.addContainerGap(29, Short.MAX_VALUE)));

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jScrollPane1,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016,
				Short.MAX_VALUE).add(
				org.jdesktop.layout.GroupLayout.TRAILING,
				layout.createSequentialGroup().addContainerGap().add(jPanel1,
						org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
						org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				layout.createSequentialGroup().add(jScrollPane1,
						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189,
						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(
								org.jdesktop.layout.LayoutStyle.RELATED, 24,
								Short.MAX_VALUE).add(jPanel1,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void addActionPerformed(java.awt.event.ActionEvent evt) {
		String money = this.money.getText();
		String remarks = this.remarks.getText();
		if("".equals(money) || money == null){
			JOptionPane.showMessageDialog(null, "请输入金额");
			return;
		}
		if(remarks == null || "".equals(remarks)){
			JOptionPane.showMessageDialog(null, "请输入备注");
			return;
		}
		ShouYin cashier = new ShouYin();
		cashier.setMoney(money);
		cashier.setRemarks(remarks);
		cashier.setType(this.type.getText());
		
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int result = outAccountDao.addCashier(con, cashier);
			if(result != 0){
				JOptionPane.showMessageDialog(null,"添加成功");
				this.money.setText("");
				this.remarks.setText("");
				this.fillTable();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton add;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField money;
	private javax.swing.JTable outAccountTable;
	private javax.swing.JTextField remarks;
	private javax.swing.JTextField type;
	// End of variables declaration//GEN-END:variables

}