package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;



public class MENUFORM extends JFrame implements ActionListener {
	 private JButton btnPhong;
	    private JButton btnKhachHang;
	    private JButton btnDichVu;
	    private JButton btnHoaDon;
	    
	    private JLabel lbltitle;
	    private JPanel jPanel1;
	    // End of variables declaration//GEN-END:variables
    /**
     * Creates new form MENUFORM
     */
    public MENUFORM() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new JPanel();
        btnDichVu = new JButton();
        btnPhong = new JButton();
        btnKhachHang = new JButton();
        btnHoaDon = new JButton();
        lbltitle = new JLabel();

        

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
		

        btnDichVu.setBackground(new java.awt.Color(255, 255, 255));
        btnDichVu.setIcon(new ImageIcon(getClass().getResource("/qlksk17/sssssasasas.png"))); // NOI18N
        btnDichVu.setText("Dịch Vụ");
        
      
        btnPhong.setBackground(new java.awt.Color(255, 255, 255));
        btnPhong.setIcon(new ImageIcon(getClass().getResource("/qlksk17/qqqqq.png"))); // NOI18N
        btnPhong.setText("Phòng");
     

        btnKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnKhachHang.setIcon(new ImageIcon(getClass().getResource("/qlksk17/if_profile_3018530 (1).png"))); // NOI18N
        btnKhachHang.setText("Khách Hàng");
        
      

        btnHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        btnHoaDon.setIcon(new ImageIcon(getClass().getResource("/qlksk17/âsasasasasa.png"))); // NOI18N
        btnHoaDon.setText("Hóa Đơn");
        
     

        lbltitle.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48));
        lbltitle.setText("HOTEL  MANAGE");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btnPhong, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHoaDon, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)          
                            )
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btnKhachHang, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDichVu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltitle, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbltitle)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        //.addComponent(jButtonnhanvien)
                        .addComponent(btnHoaDon)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDichVu)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhachHang)
                    .addComponent(btnPhong))

                )
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        btnPhong.addActionListener(this);
        btnKhachHang.addActionListener(this);
        btnDichVu.addActionListener(this);
        btnHoaDon.addActionListener(this);
    }// </editor-fold>//GEN-END:initComponents


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj  = e.getSource();
		if(obj.equals(btnPhong)) {
			  phongform pf = new phongform();
		        pf.setVisible(true);
		        pf.pack();
		        pf.setLocationRelativeTo(null);
		        pf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if(obj.equals(btnKhachHang)) {
			khachhangform khf = new khachhangform();
	        khf.setVisible(true);
	        khf.pack();
	        khf.setLocationRelativeTo(null);
	        khf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
		}
		if(obj.equals(btnDichVu)) {
			 DichVuform dvf = new DichVuform();
		        dvf.setVisible(true);
		        dvf.pack();
		        dvf.setLocationRelativeTo(null);
		        dvf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if(obj.equals(btnHoaDon)) {
			 hoadonform hdf = new hoadonform();
		        hdf.setVisible(true);
		        hdf.pack();
		        hdf.setLocationRelativeTo(null);
		        hdf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUFORM().setVisible(true);
            }
        });
    }


   
}