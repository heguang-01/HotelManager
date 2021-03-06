/*
 * usManger.java
 *
 * Created on __DATE__, __TIME__
 */

package hotel.view;

import hotel.dao.YuDingDao;
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
public class usManger extends javax.swing.JInternalFrame {

	DbUtil dbUtil = new DbUtil();
	YuDingDao bookDao = new YuDingDao();

	/** Creates new form usManger */
	public usManger() {
		initComponents();
		String name = null;
		this.fillTable(name);
		this.setLocation(200, 50);//设置窗口位置
	}

	/**
	 * 填充表格数据
	 * @param name
	 */
	public void fillTable(String name) {
		DefaultTableModel dtm = (DefaultTableModel) usMangerTable.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet re = bookDao.findUsInfo(con, name);
			while (re.next()) {
				Vector v = new Vector();
				//添加每一行的数据
				v.add(re.getString("id"));
				v.add(re.getString("name"));
				v.add(re.getString("phone"));
				v.add(re.getString("checkTime"));
				v.add(re.getString("state"));
				v.add(re.getString("creditTime"));
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

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		usMangerTable = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		id = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		state = new javax.swing.JTextField();
		edit = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		name = new javax.swing.JTextField();
		search = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);

		jLabel1.setText("\u9884\u8ba2\u4fe1\u606f");

		usMangerTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null } }, new String[] {
						"编号", "姓名", "联系电话", "预订入住时间", "状态", "创建时间" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		usMangerTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				usMangerTableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(usMangerTable);

		jLabel3.setText("\u9000\u8ba2");

		jLabel4.setText("\u7f16\u53f7");

		id.setEditable(false);

		jLabel5.setText("\u72b6\u6001");

		state.setEditable(false);
		state.setText("\u9000\u8ba2");

		edit.setText("\u9000\u8ba2");
		edit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				editActionPerformed(evt);
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
										.addContainerGap()
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(jLabel3)
														.add(
																jPanel1Layout
																		.createParallelGroup(
																				org.jdesktop.layout.GroupLayout.TRAILING)
																		.add(
																				edit)
																		.add(
																				jPanel1Layout
																						.createSequentialGroup()
																						.add(
																								jLabel4)
																						.addPreferredGap(
																								org.jdesktop.layout.LayoutStyle.UNRELATED)
																						.add(
																								id,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								116,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																						.add(
																								18,
																								18,
																								18)
																						.add(
																								jLabel5)
																						.add(
																								18,
																								18,
																								18)
																						.add(
																								state,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								187,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(557, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.add(jLabel3)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.UNRELATED)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jLabel4)
														.add(
																id,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jLabel5)
														.add(
																state,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED,
												27, Short.MAX_VALUE).add(edit)));

		jLabel2.setText("\u59d3\u540d");

		search.setText("\u67e5\u8be2");
		search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.add(
																				jScrollPane1,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				968,
																				Short.MAX_VALUE))
														.add(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.add(
																				jPanel1,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				20,
																				20,
																				20)
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								layout
																										.createSequentialGroup()
																										.add(
																												jLabel2)
																										.addPreferredGap(
																												org.jdesktop.layout.LayoutStyle.UNRELATED)
																										.add(
																												name,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																												163,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												org.jdesktop.layout.LayoutStyle.UNRELATED)
																										.add(
																												search))
																						.add(
																								jLabel1))
																		.add(
																				668,
																				668,
																				668)))
										.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(
				layout.createSequentialGroup().add(11, 11, 11).add(
						layout.createParallelGroup(
								org.jdesktop.layout.GroupLayout.BASELINE).add(
								jLabel2).add(name,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(search)).addPreferredGap(
						org.jdesktop.layout.LayoutStyle.UNRELATED).add(jLabel1)
						.addPreferredGap(
								org.jdesktop.layout.LayoutStyle.RELATED).add(
								jScrollPane1,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								138,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(
								org.jdesktop.layout.LayoutStyle.UNRELATED).add(
								jPanel1,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void editActionPerformed(java.awt.event.ActionEvent evt) {
		if("".equals(this.id.getText()) || this.id.getText() == null){
			JOptionPane.showMessageDialog(null, "请选择需要退订的信息");
		}
		int id = Integer.parseInt(this.id.getText());
		Connection con = null;
		try {
			con = dbUtil.getCon();
			int result = bookDao.uodateUsState(con, id);
			if(result != 0){
				JOptionPane.showMessageDialog(null, "退订成功");
				this.id.setText("");
				String name = "";
				this.fillTable(name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void usMangerTableMousePressed(java.awt.event.MouseEvent evt) {
		int row = usMangerTable.getSelectedRow();
		this.id.setText(usMangerTable.getValueAt(row, 0).toString());
	}

	private void searchActionPerformed(java.awt.event.ActionEvent evt) {
		this.fillTable(this.name.getText());
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton edit;
	private javax.swing.JTextField id;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField name;
	private javax.swing.JButton search;
	private javax.swing.JTextField state;
	private javax.swing.JTable usMangerTable;
	// End of variables declaration//GEN-END:variables

}