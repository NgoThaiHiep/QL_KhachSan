package UI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import DAO.KhachHang_DAO;
import DAO.Phong_DAO;
import Entity.KhachHang;
import Entity.Phong;
import connectDB.ConnectDB;



public class khachhangform extends JFrame  implements ActionListener{

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnclear2;
    private JLabel lblMaKhachHang;
    private JLabel lblTenKhachHang;
    private JLabel lblCCCD;
    private JLabel lblQuocTich;
    private JLabel lblGioiTinh;
    private JLabel lblTuoi;
    private JLabel lblSDT;
    private JLabel lblMaPhong;
    private JLabel lblTitle;
    private JLabel lblNu;
    private JPanel jPanel11;
    private JPanel pWest;
    private JPanel jPanel4;
    private JScrollPane jScrollPane2;
    private JTable tableKhachhang;
    private JTextField txtCCCD;
    private JCheckBox chkNu;
    private JTextField  txtMaKH;
    private JComboBox<String>  cboMaPhongKH;
    private JTextField txtQuocTich;
    private JTextField txtSDT;
    private JTextField txtTenKH;
    private JTextField txtTuoi;
    private JButton btnSua;
    private JButton btnThem;
    private JButton btnLoc;
    private JButton btnXoa;
	private KhachHang_DAO KhachHang_DAO;
	private Phong_DAO phong_dao;
	private JButton btnThoat;
	
	
    // End of variables declaration//GEN-END:variables
    /**
     * Creates new form khachhangform
     */
    public khachhangform() {
        initComponents();
       setLocationRelativeTo(null);
        hienThiDanhSachKhachHang();
    }
   
     
     public void hienThiDanhSachKhachHang() {
        String colTieuDe1[] = new String[]{"Mã Khách Hàng", "Tên Khách Hàng", "CCCD","Quốc Tịch","Giới tính","Tuổi", "Số Điện Thoại", "Mã Phòng"};
        ArrayList<KhachHang> dskh = KhachHang_DAO.getAlltbKhachHang();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dskh.size(); i++) {

            row = new Object[8];

            // GÁN GIÁ TRỊ
            row[0] = dskh.get(i).getMaKH();
            row[1] = dskh.get(i).getTenKH();
            row[2] = dskh.get(i).getCccd();
            row[3] = dskh.get(i).getQuocTich();
            row[4] = dskh.get(i).isGioiTinh() ?"Nữ" :  "Nam";
            row[5] = dskh.get(i).getTuoi();
            row[6] = dskh.get(i).getSoDienThoai();
            row[7] = dskh.get(i).getPhong().getMaPhong();

            model.addRow(row);
        }
        
        //    }catch(ArrayIndexOutOfBoundsException ex){

        tableKhachhang.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	try {
			ConnectDB.getInstance().connect();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	KhachHang_DAO = new KhachHang_DAO();
    	phong_dao = new Phong_DAO();
    	
        jPanel4 = new JPanel();
        pWest = new JPanel();
        lblMaKhachHang = new JLabel();
        lblTenKhachHang = new JLabel();
        lblCCCD = new JLabel();
        lblQuocTich = new JLabel();
        lblGioiTinh = new JLabel();
        lblTuoi = new JLabel();
        lblSDT = new JLabel();
        lblMaPhong = new JLabel();
         txtMaKH = new JTextField();
        txtTenKH = new JTextField();
        txtCCCD = new JTextField();
        txtQuocTich = new JTextField();
        chkNu = new JCheckBox();
        lblNu = new JLabel("Nữ");
        txtTuoi = new JTextField();
        txtSDT = new JTextField();
        cboMaPhongKH = new JComboBox<String>();
        btnThem = new JButton();
        btnSua = new JButton();
        btnXoa = new JButton();
        btnLoc = new JButton();
        btnThoat = new JButton();
        btnclear2 = new JButton();
        jPanel11 = new JPanel();
        lblTitle = new JLabel();
        jScrollPane2 = new JScrollPane();
        tableKhachhang = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        pWest.setBorder(BorderFactory.createTitledBorder("Thông Tin Khách Hàng"));
        lblMaKhachHang.setText("Mã Khách Hàng");
        lblTenKhachHang.setText("Tên Khách Hàng");
        lblCCCD.setText("CCCD");
        lblQuocTich.setText("Quốc Tịch");
        lblGioiTinh.setText("Giới Tính");
        lblTuoi.setText("Tuổi ");
        lblSDT.setText("Số Điện Thoại");
        
        lblMaPhong.setText("Mã Phòng");
        pWest.add(lblNu);
        lblNu.setBounds(170, 193, 200, 20);
        
        ArrayList<Phong> dsphong = phong_dao.getAlltbPhong();
        for (Phong p : dsphong) {
			cboMaPhongKH.addItem(p.getMaPhong());
		}
        


        btnThem.setIcon(new ImageIcon(getClass().getResource("/qlksk17/THEM.png"))); // NOI18N
        btnThem.setText("Thêm");
     
        btnSua.setIcon(new ImageIcon(getClass().getResource("/qlksk17/SUA.png"))); // NOI18N
        btnSua.setText("Sửa");
        

        btnXoa.setIcon(new ImageIcon(getClass().getResource("/qlksk17/XOA.png"))); // NOI18N
        btnXoa.setText("Xóa");
        

        btnLoc.setIcon(new ImageIcon(getClass().getResource("/qlksk17/LOC.png"))); // NOI18N
        btnLoc.setText("Lọc");
        
        btnThoat.setIcon(new ImageIcon(getClass().getResource("/qlksk17/THOAT.png"))); // NOI18N
        btnThoat.setText("Thoát");
        
        
        btnclear2.setIcon(new ImageIcon(getClass().getResource("/qlksk17/CLEAR.png"))); // NOI18N
        btnclear2.setText("Clear");
        

      

        GroupLayout jPanel12Layout = new GroupLayout(pWest);
        pWest.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnXoa)
                                .addComponent(btnThem))
                            .addGap(6, 6, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSua, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLoc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnclear2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnThoat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(21, 21, 21)
                            
                            )
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaKhachHang)
                            .addComponent(lblTenKhachHang)
                            .addComponent(lblCCCD)
                            .addComponent(lblQuocTich)
                            .addComponent(lblGioiTinh)
                            .addComponent(lblTuoi)
                            .addComponent(lblSDT)
                            .addComponent(lblMaPhong)
                         
                            )
                        .addGap(18, 18, 18)
                        
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuocTich, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent( txtMaKH, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            
                            .addComponent(txtTuoi, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addComponent( cboMaPhongKH, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    	)  
                    )
                	.addContainerGap(36, Short.MAX_VALUE))
           
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                   .addComponent(lblMaKhachHang)
                   
                    .addComponent( txtMaKH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKhachHang)
                    .addComponent(txtTenKH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCCD)
                    .addComponent(txtCCCD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuocTich)
                    .addComponent(txtQuocTich, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(chkNu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                   
                		)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTuoi)
                    .addComponent(txtTuoi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT)
                    .addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhong)
                    .addComponent( cboMaPhongKH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnclear2))
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnLoc)
                    .addComponent(btnThoat))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("QUẢN LÝ KHÁCH HÀNG");

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tableKhachhang.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKhachhangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableKhachhang);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pWest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 637, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pWest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        btnThem.addActionListener(this);
        btnXoa.addActionListener(this);
        btnSua.addActionListener(this);
        btnLoc.addActionListener(this);
        btnThoat.addActionListener(this);
        cboMaPhongKH.addActionListener(this);
        btnclear2.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		
		if(obj.equals(btnclear2)) {
			clearn();
		}if(obj.equals(btnThem)) {
			them();
		}
		if(obj.equals(btnXoa)) {
			xoa() ;
		}
		
		if(obj.equals(btnSua)) {
			sua();
		}
		if(obj.equals(btnLoc)) {
			locTheoMaPhong();
		}
		if(obj.equals(btnThoat)) {
			thoat() ;
		}
		if(obj.equals(cboMaPhongKH)) {
			hienThiDanhSachKhachHang();
		}
	}
	  private KhachHang createform() {
	    	String ma = txtMaKH.getText();
	    	String ten = txtTenKH.getText();
	    	String cccd = txtCCCD.getText();
	    	String quoctich = txtQuocTich.getText();
	    	boolean gt = chkNu.isSelected();
	    	int tuoi = Integer.parseInt(txtTuoi.getText());
	    	String sdt = txtSDT.getText();
	    	Phong p = new Phong(cboMaPhongKH.getSelectedItem()+"");
	    	return new KhachHang(ma, ten, cccd, quoctich, gt, tuoi, sdt, p);
	    	
	    }
	 private void them() {
       
              KhachHang kh =  createform();
              KhachHang_DAO.addClient(kh);
              phong_dao.updateTinhTrang("Đã được đặt", cboMaPhongKH.getSelectedItem()+"");
              hienThiDanhSachKhachHang();
          }
    private void xoa() {
      
            String ma = txtMaKH.getText();
            KhachHang_DAO.DeleteNV(ma);
            hienThiDanhSachKhachHang();
         }
    private void sua() {
      
        	KhachHang kh = createform();
        	KhachHang_DAO.update(kh);
            hienThiDanhSachKhachHang();
           
        }
   
  
    private void thoat() {
      
        btnThoat.setToolTipText("Click để thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương"
            + " trình không", "Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }

    private void clearn() {
     
         txtMaKH.setText("");
        txtTenKH.setText("");
        txtCCCD.setText("");
        txtQuocTich.setText("");
        chkNu.setText("");
        txtTuoi.setText("");
        txtSDT.setText("");
         
         txtMaKH.requestFocus();

    }
    private void locTheoMaPhong() {
    	 ArrayList<KhachHang> dskh = KhachHang_DAO.getAlltbKhachHang();
    	 String maPhong = cboMaPhongKH.getSelectedItem()+"";
    	 String colTieuDe1[] = new String[]{"Mã Khách Hàng", "Tên Khách Hàng", "CCCD","Quốc Tịch","Giới tính","Tuổi", "Số Điện Thoại", "Mã Phòng"};
         

         DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

         Object[] row;

         for (int i = 0; i < dskh.size(); i++) {
        	 if(dskh.get(i).getPhong().getMaPhong().equals(maPhong)) {
        		 
        		 row = new Object[8];
        		 
        		 // GÁN GIÁ TRỊ
        		 row[0] = dskh.get(i).getMaKH();
        		 row[1] = dskh.get(i).getTenKH();
        		 row[2] = dskh.get(i).getCccd();
        		 row[3] = dskh.get(i).getQuocTich();
        		 row[4] = dskh.get(i).isGioiTinh() ?"Nữ" :  "Nam";
        		 row[5] = dskh.get(i).getTuoi();
        		 row[6] = dskh.get(i).getSoDienThoai();
        		 row[7] = dskh.get(i).getPhong().getMaPhong();
        		 
        		 model.addRow(row);
        	 }
         }
         
         //    }catch(ArrayIndexOutOfBoundsException ex){

         tableKhachhang.setModel(model);

    	 
    }

    private void tableKhachhangMouseClicked(java.awt.event.MouseEvent evt) {
        int row = tableKhachhang.getSelectedRow();
        TableModel model = tableKhachhang.getModel();
         txtMaKH.setText(model.getValueAt(row, 0).toString());
        txtTenKH.setText(model.getValueAt(row, 1).toString());
        txtCCCD.setText(model.getValueAt(row, 2).toString());
        txtQuocTich.setText(model.getValueAt(row, 3).toString());
        chkNu.setSelected(model.getValueAt(row, 4).toString() == "Nữ" ? true : false);
        txtTuoi.setText(model.getValueAt(row, 5).toString());
        txtSDT.setText(model.getValueAt(row, 6).toString());
         cboMaPhongKH.setSelectedItem(model.getValueAt(row, 7).toString());
    }

   
    public static void main(String args[]) {
      
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new khachhangform().setVisible(true);
            }
        });
    }


	
   

}