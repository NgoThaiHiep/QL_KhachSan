/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import DAO.DichVu_DAO;
import DAO.Phong_DAO;
import Entity.DichVu;
import Entity.Phong;
import connectDB.ConnectDB;


public class phongform extends JFrame implements ActionListener{

    /**
     * Creates new form phongform
     */
	  // Variables declaration - do not modify//GEN-BEGIN:variables
    private  JButton btnClearPhong;
    private  JLabel lblTitle;
    private  JLabel lblMaPhong;
    private  JLabel lblTenPhong;
    private  JLabel lblLoaiPhong;
    private  JLabel lblGiaPhong;
    private  JLabel lblChuThich;
    private  JLabel lblTinhTrang;
   
    private  JLabel lblMaDichVu;
    private  JPanel jpnNouth;
    private  JPanel pnWest;
    private  JPanel pnPhong;
    private  JScrollPane ScrollPhong;
    private  JTable tablePhong;
    private  JTextField txtCHUTHICHP;
    private  JTextField txtGIAPHONG;
    private JComboBox<String> cboLoaiPhong;
    private JComboBox<String> cboMADVP;
    private JTextField txtMaPhong;
    private JTextField txtTENPHONG;
    private JComboBox<String> cboTinhTrang;
    private JButton btnSua;
    private JButton btnThem;
    private JButton btnLoc;
    private JButton btnXoa;
    // End of variables declaration//GEN-END:variables
	private Phong_DAO phong_dao;
	private DichVu_DAO dichvu_dao;
	private JButton btnThoat;
    
    public phongform() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        hienThiDanhSachPhong();
    }
   
    
    public void hienThiDanhSachPhong() {
        String colTieuDe1[] = new String[]{"Mã Phòng", "Tên Phòng", "Loại Phòng", "Giá Phòng", "Chú Thích", "Tình Trạng", "Mã Dịch Vụ"};
        ArrayList<Phong> dsp = phong_dao.getAlltbPhong();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dsp.size(); i++) {

            row = new Object[7];

            // GÁN GIÁ TRỊ
            row[0] = dsp.get(i).getMaPhong();
            row[1] = dsp.get(i).getTenPhong();
            row[2] = dsp.get(i).getLoaiPhong();
            row[3] = dsp.get(i).getGiaPhong();
            row[4] = dsp.get(i).getChuThich();
            row[5] = dsp.get(i).getTinhTrang();
            row[6] = dsp.get(i).getMaDichVu().getMaDichVu();

            model.addRow(row);
        }
        
        //}catch(ArrayIndexOutOfBoundsException ex){

        tablePhong.setModel(model);

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
    	
    	phong_dao  = new Phong_DAO();
    	dichvu_dao = new DichVu_DAO();
        pnPhong = new JPanel();
        jpnNouth =  new JPanel();
        lblTitle = new JLabel();
        ScrollPhong = new JScrollPane();
        tablePhong = new JTable();
        pnWest = new JPanel();
        lblMaPhong = new JLabel();
        lblTenPhong = new JLabel();
        lblLoaiPhong = new JLabel();
        lblGiaPhong = new JLabel();
        lblChuThich = new JLabel();
        lblTinhTrang = new JLabel();
        txtMaPhong = new JTextField();
        txtTENPHONG = new JTextField();
        cboLoaiPhong = new JComboBox<String>();
        txtGIAPHONG = new JTextField();
        txtCHUTHICHP = new JTextField();
        cboTinhTrang = new JComboBox<String>();
        btnThem = new JButton();
        btnSua = new JButton();
        btnXoa = new JButton();
        btnLoc = new JButton();
        btnThoat = new JButton();
       
        lblMaDichVu = new JLabel();
      
        cboMADVP = new JComboBox<String>();
        btnClearPhong = new JButton();

       

        pnPhong.setBackground(new java.awt.Color(51, 204, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("QUẢN LÝ PHÒNG");

        GroupLayout jpnNouthLayout = new GroupLayout(jpnNouth);
        jpnNouth.setLayout(jpnNouthLayout);
        jpnNouthLayout.setHorizontalGroup(
            jpnNouthLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jpnNouthLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(155, 155, 155))
        );
        jpnNouthLayout.setVerticalGroup(
            jpnNouthLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jpnNouthLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        tablePhong.setModel(new DefaultTableModel(
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
        cboLoaiPhong.addActionListener(this);
        
        tablePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	tablePhongMouseClicked(evt);
            }
        });
        
       
        ScrollPhong.setViewportView(tablePhong);

        pnWest.setBorder(BorderFactory.createTitledBorder("Thông Tin Phòng"));
        lblMaPhong.setText("Mã Phòng");
        lblTenPhong.setText("Tên Phòng");
        lblLoaiPhong.setText("Loại Phòng");
        lblGiaPhong.setText("Giá Phòng");
        lblChuThich.setText("Chú Thích");
        lblTinhTrang.setText("Tình Trạng");
        
        cboTinhTrang.addItem("Phòng trống");
        cboTinhTrang.addItem("Đã được đặt");
        
        cboLoaiPhong.addItem("VIP Đôi");
        cboLoaiPhong.addItem("VIP Đơn");
        cboLoaiPhong.addItem("Thường Đôi");
        cboLoaiPhong.addItem("Thường Đơn");
        
        
        ArrayList<DichVu> dsdv = dichvu_dao.getAlltbDichVu();
    	
        for (DichVu dv : dsdv) {
        	  cboMADVP.addItem(dv.getMaDichVu()+"");;
		}
      
      
        lblMaDichVu.setText("Mã Dịch Vụ");
        
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
        
        
       

        btnClearPhong.setIcon(new ImageIcon(getClass().getResource("/qlksk17/CLEAR.png"))); // NOI18N
        btnClearPhong.setText("Clear");

        GroupLayout pnWestLayout = new GroupLayout(pnWest);
        pnWest.setLayout(pnWestLayout);
        pnWestLayout.setHorizontalGroup(
            pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnWestLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnWestLayout.createSequentialGroup()
                        .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa)
                            .addComponent(btnThem))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSua, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLoc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnClearPhong, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThoat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(21, 21, 21)
                        
                        )
                    .addGroup(pnWestLayout.createSequentialGroup()
                        .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaPhong)
                            .addComponent(lblTenPhong)
                            .addComponent(lblLoaiPhong)
                            .addComponent(lblGiaPhong)
                            .addComponent(lblChuThich)
                            .addComponent(lblTinhTrang)
                            .addComponent(lblMaDichVu))
                        .addGap(71, 71, 71)
                        .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaPhong, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(txtTENPHONG)
                            .addComponent(cboLoaiPhong)
                            .addComponent(txtGIAPHONG)
                            .addComponent(txtCHUTHICHP)
                            .addComponent(cboTinhTrang)
                            .addComponent(cboMADVP))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnWestLayout.setVerticalGroup(
            pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnWestLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhong)
                    .addComponent(txtMaPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenPhong)
                    .addComponent(txtTENPHONG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoaiPhong)
                    .addComponent(cboLoaiPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblGiaPhong)
                    .addComponent(txtGIAPHONG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblChuThich)
                    .addComponent(txtCHUTHICHP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblTinhTrang)
                    .addComponent(cboTinhTrang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    )
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaDichVu)
                    .addComponent(cboMADVP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnClearPhong))
                .addGap(18, 18, 18)
                .addGroup(pnWestLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnLoc)
                    .addComponent(btnThoat))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        GroupLayout jPanel5Layout = new GroupLayout(pnPhong);
        pnPhong.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnWest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPhong, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jpnNouth, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnNouth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(ScrollPhong, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(pnWest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 1094, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnPhong, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnPhong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        
        btnThem.addActionListener(this);
        btnXoa.addActionListener(this);
        btnSua.addActionListener(this);
        btnLoc.addActionListener(this);
        btnThoat.addActionListener(this);
        btnClearPhong.addActionListener(this);
        cboTinhTrang.addActionListener(this);
        
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj.equals(cboLoaiPhong)) {
			String loai = cboLoaiPhong.getSelectedItem()+"";
		   if(  loai.equals("VIP Đôi")){
			   txtGIAPHONG.setText("1000000");
			   txtGIAPHONG.setEditable(false);
		   }
		   if( loai.equals("VIP Đơn")){
			   txtGIAPHONG.setText("500000");
			   txtGIAPHONG.setEditable(false);
		   }
		   if(loai.equals("Thường Đôi")){
			   txtGIAPHONG.setText("250000");
			   txtGIAPHONG.setEditable(false);
		   }
		  { 
			  if(loai.equals("Thường Đơn"))
			   txtGIAPHONG.setText("200000");
			   txtGIAPHONG.setEditable(false);
		   }
		}
		if(obj.equals(btnClearPhong)) {
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
		if(obj.equals(btnThoat)) {
			thoat() ;
		}
		if(obj.equals(btnLoc)) {
			loc();
			
		}
		if(obj.equals(cboTinhTrang)) {
			hienThiDanhSachPhong();
		}
	}
    private Phong createform() {
    	String ma = txtMaPhong.getText();
    	String ten = txtTENPHONG.getText();
    	String loai = cboLoaiPhong.getSelectedItem()+"";
    	float gia =  Float.parseFloat(txtGIAPHONG.getText());
    	String tt = cboTinhTrang.getSelectedItem()+"";
    	DichVu dv = new DichVu(Integer.parseInt(cboMADVP.getSelectedItem()+""));
    	String ct = txtCHUTHICHP.getText();
    	return new Phong(ma, ten, loai, gia, tt, dv, ct);
    }
	    private void them() {
	        
	    	Phong p = createform();
            phong_dao.create(p);
            hienThiDanhSachPhong();
	    }
	private void xoa() {
	
		String ma = txtMaPhong.getText();  
    	phong_dao.DeleteNV(ma);
    	hienThiDanhSachPhong();
	   }
	private void sua() {
	
	  	Phong p = createform();
	  	phong_dao.update(p);
	  	hienThiDanhSachPhong();
	     
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
	
		txtMaPhong.setText("");
        txtTENPHONG.setText("");
        txtGIAPHONG.setText("");
        txtCHUTHICHP.setText("");
        txtMaPhong.requestFocus();
	
	}
	private void loc() {
		String tt = cboTinhTrang.getSelectedItem()+"";
		 String colTieuDe1[] = new String[]{"Mã Phòng", "Tên Phòng", "Loại Phòng", "Giá Phòng", "Chú Thích", "Tình Trạng", "Mã Dịch Vụ"};
		 ArrayList<Phong> dsp = phong_dao.getAlltbPhong();
		 DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);
	        Object[] row;
		  for (int i = 0; i < dsp.size(); i++) {
			 if(dsp.get(i).getTinhTrang().equals(tt)) {
				 row = new Object[7];
				 
				 // GÁN GIÁ TRỊ
				 row[0] = dsp.get(i).getMaPhong();
				 row[1] = dsp.get(i).getTenPhong();
				 row[2] = dsp.get(i).getLoaiPhong();
				 row[3] = dsp.get(i).getGiaPhong();
				 row[4] = dsp.get(i).getChuThich();
				 row[5] = dsp.get(i).getTinhTrang();
				 row[6] = dsp.get(i).getMaDichVu().getMaDichVu();
				 
				 model.addRow(row);
			 }
		  }
		        
		        //}catch(ArrayIndexOutOfBoundsException ex){

		        tablePhong.setModel(model);

	}

    
    private void tablePhongMouseClicked(java.awt.event.MouseEvent evt) {
       
        int i = tablePhong.getSelectedRow();
        TableModel model = tablePhong.getModel();
        txtMaPhong.setText(model.getValueAt(i, 0).toString());
        txtTENPHONG.setText(model.getValueAt(i, 1).toString());
        cboLoaiPhong.setSelectedItem(model.getValueAt(i, 2).toString());
        txtGIAPHONG.setText(model.getValueAt(i, 3).toString());
        txtCHUTHICHP.setText(model.getValueAt(i, 4).toString());
        cboTinhTrang.setSelectedItem(model.getValueAt(i, 5).toString());
        cboMADVP.setSelectedItem(model.getValueAt(i, 6).toString());
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
            java.util.logging.Logger.getLogger(phongform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(phongform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(phongform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(phongform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phongform().setVisible(true);
            }
        });
    }




  
}
