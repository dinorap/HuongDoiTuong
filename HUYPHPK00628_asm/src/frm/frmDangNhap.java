package frm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmDangNhap extends javax.swing.JFrame {
 public static int MaNhanVien=0;
 public static int ex=0;
 
    /**
     * Creates new form frmRegister
     */
    public frmDangNhap() {
        initComponents();
        // đặt vị trí xuất hiện 
           this.setLocation(500, 250);
           //tạo file lưu mật khẩu
           File file = new File("luumk.txt");
  
            // if file doesnt exists, then create it
         String tendangnhap="",matkhau="";
  
            FileReader fw;
        try {
            fw = new FileReader(file);
                BufferedReader bw = new BufferedReader(fw);
            try {
                tendangnhap=  bw.readLine();
                     matkhau=  bw.readLine();
                       bw.close();
            } catch (IOException ex) {
            }

        } catch (FileNotFoundException ex) {
            System.out.println("không tìm thấy file lưu mk");
        }

         txtUserName.setText(tendangnhap);
         txtPassword.setText(matkhau);
         if(!tendangnhap.equals("")){
              chkbNhoMatKhau.setSelected(rootPaneCheckingEnabled);
              System.out.println("checked lưu mật khẩu");
         }else
             System.out.println("đã bỏ checkbox lưu mật khẩu\n\n");
    }
    @SuppressWarnings("unchecked")//tắt cảnh báo
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        pnlRegisterInfo = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        chkbNhoMatKhau = new javax.swing.JCheckBox();
        btnĐangKy = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnlCopyright = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập Đăng Ký");
        setResizable(false);

        pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        lblRegisterTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblRegisterTitle.setText("QUẢN LÝ NHÂN SỰ TRƯỜNG ĐẠI HỌC PHENIKAA");

        lblUserName.setText("Tên đăng nhập");

        lblPassword.setText("Mật khẩu");

        chkbNhoMatKhau.setForeground(new java.awt.Color(102, 153, 255));
        chkbNhoMatKhau.setText("Nhớ Mật Khẩu");

        btnĐangKy.setForeground(new java.awt.Color(255, 153, 51));
        btnĐangKy.setText("Quên mật khẩu");
        btnĐangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnĐangKyActionPerformed(evt);
            }
        });

        btnDangNhap.setForeground(new java.awt.Color(255, 153, 51));
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stakeholder.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
        pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);
        pnlRegisterInfoLayout.setHorizontalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addComponent(lblPassword)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName)
                    .addComponent(txtPassword)
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addComponent(chkbNhoMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addComponent(btnĐangKy)
                        .addGap(18, 18, 18)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        pnlRegisterInfoLayout.setVerticalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegisterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addComponent(chkbNhoMatKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnĐangKy)
                            .addComponent(btnDangNhap)))
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        jLabel1.setText("Liên Hệ admin để được cấp quyền truy cập cao hơn");

        javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
        pnlCopyright.setLayout(pnlCopyrightLayout);
        pnlCopyrightLayout.setHorizontalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );
        pnlCopyrightLayout.setVerticalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 389, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnlCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//bt quên mật khảu
    private void btnĐangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnĐangKyActionPerformed
        frm.frmquenmk frmDK=new frmquenmk();
        frmDK.show();
        this.dispose();
    }//GEN-LAST:event_btnĐangKyActionPerformed
    public static int quyen;
    public static String ten = "", user = "";
    //bt đăng nhập
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed

        String strUsername = txtUserName.getText().trim();
        String strPassword = String.valueOf(txtPassword.getPassword()).trim();//lấy mật khẩu thành chuỗi bỏ khoáng trắng đầu cuối
        String cautruyvan="select * from Users where TenDangNhap= '"+strUsername+"' and Password= '"+strPassword+"'";
        ResultSet rs= Menu.OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        String luumk="",luutdn="";
        if(chkbNhoMatKhau.isSelected())
        {
            luutdn  =strUsername;
            luumk=strPassword;
            System.out.println("lưu mật khẩu");
        }
        else
        {
            luutdn  ="";
            luumk="";
            System.out.println("không lưu mật khẩu");
        }
        try {
            File file = new File("luumk.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(luutdn+"\n"+luumk);
            bw.close();
            if( chkbNhoMatKhau.isSelected())
            System.out.println("lưu phiên đăng nhập thành công");
        } catch (IOException e) {
        }

        if(KiemTra(strUsername, strPassword)){
            quyen = 0;

            try {
                if (rs.next()) {
                    quyen = rs.getInt("Quyen");
                    MaNhanVien = rs.getInt("MaNhanVien");
                }
            } catch (SQLException ex) {
            }

            // Nếu quyền của người dùng là 1 thì mở frm.frmTrangChu, ngược lại mở frm.frmUser
            if (quyen == 1) {
                Menu.OPEN.frmTC.show();
                this.dispose();
            } else if(quyen != 1&&quyen != 0) {
                frmUser frmU = new frmUser();
                frmU.show();
                this.dispose();
            }

            this.dispose();
        } else {
            ThongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

//kiểm tra lấy thông tin theo điều kiện
    private boolean KiemTra(String tdn, String mk) {
        boolean kq = false;

        String cautruyvan = "select * from Users where TenDangNhap COLLATE SQL_Latin1_General_CP1_CS_AS = '" + tdn + "' and Password COLLATE SQL_Latin1_General_CP1_CS_AS = '" + mk + "'";
//        System.out.println(cautruyvan);
        ResultSet rs = Menu.OPEN.connection.ExcuteQueryGetTable(cautruyvan);

        try {
            if (rs.next()) {
                kq = true;
                quyen = rs.getInt("Quyen");
                ten = rs.getString("TenNhanVien");
                user = rs.getString("UserName");
                System.out.println(" " + quyen);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập");
        }

        return kq;
    }


    public static void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    //tạo giao diện đăng nhập;
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmDangNhap().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnĐangKy;
    private javax.swing.JCheckBox chkbNhoMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlCopyright;
    private javax.swing.JPanel pnlRegisterInfo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
