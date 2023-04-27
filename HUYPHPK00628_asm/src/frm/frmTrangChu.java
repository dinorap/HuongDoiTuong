package frm;

import java.awt.Color;
import Menu.OPEN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmTrangChu extends javax.swing.JFrame {
    /**
     * Creates new form frmTrangChu
     */
    public frmTrangChu() {
        initComponents();
    }
    int tam = 0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        tbljpanel = new javax.swing.JTabbedPane();
        jTabbedPaneNhanVien = new javax.swing.JTabbedPane();
        jPanelNhanVien = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lblTenNhanVien_NhanVien = new javax.swing.JLabel();
        lblMaNhanVien_NhanVien = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtTenNhanVien_NhanVien = new javax.swing.JTextField();
        txtMaNhanVien_NhanVien = new javax.swing.JTextField();
        rbtnNam_NhanVien = new javax.swing.JRadioButton();
        rbtnNu_NhanVien = new javax.swing.JRadioButton();
        cbbNgaySinh_NhanVien = new javax.swing.JComboBox<>();
        cbbThangSinh_NhanVien = new javax.swing.JComboBox<>();
        cbbNamSinh_NhanVien = new javax.swing.JComboBox<>();
        cbbNgayVaoLam_NhanVien = new javax.swing.JComboBox<>();
        cbbNamVaoLam_NhanVien = new javax.swing.JComboBox<>();
        cbbThangVaoLam_NhanVien = new javax.swing.JComboBox<>();
        txtLuong = new javax.swing.JTextField();
        lblSDT_NhanVien1 = new javax.swing.JLabel();
        lblDiaChi_NhanVien = new javax.swing.JLabel();
        lblSDT_NhanVien = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtChuThich_NhanVien = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        btnThem_NhanVien = new javax.swing.JButton();
        btnSua_NhanVien = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        txtTimKiem_NhanVien = new javax.swing.JTextField();
        rbtnTimKiemTenNhanVien_NhanVien = new javax.swing.JRadioButton();
        rbtnTimKiemMaNhanVien_NhanVien = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnXoa_NhanVien = new javax.swing.JButton();
        btnReset_NhanVien = new javax.swing.JButton();
        txtDiaChi_NhanVien = new javax.swing.JTextField();
        txtSoDT_NhanVien = new javax.swing.JTextField();
        cbbChucVu_NhanVien = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblNhanVien_NhanVien = new javax.swing.JTable();
        jPanelTaiKhoan = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblTaiKhoan_TaiKhoan = new javax.swing.JTable();
        btnThem_TaiKhoan = new javax.swing.JButton();
        btnXoa_TaiKhoan = new javax.swing.JButton();
        btnSua_TaiKhoan = new javax.swing.JButton();
        btnReset_TaiKhoan = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtUser_TaiKhoan = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cbbQuyen_TaiKhoan = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtChuThich_TaiKhoan = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        txtPassword_TaiKhoan = new javax.swing.JPasswordField();
        jLabel55 = new javax.swing.JLabel();
        txtMaNhanVien_TaiKhoan = new javax.swing.JTextField();
        cbbTenNhanVien_TaiKhoan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jPanelChucVu = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblChucVu_ChucVu = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtTenChucVu_ChucVu = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtChuThich_ChucVu = new javax.swing.JTextArea();
        btnThem_ChucVu = new javax.swing.JButton();
        btnSua_ChucVu = new javax.swing.JButton();
        btnReset_ChucVu = new javax.swing.JButton();
        txtMaChucVu_ChucVu = new javax.swing.JTextField();
        btnReset_ChucVu1 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblNhanVien_ChucVu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanelThongKe = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        JLuong = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jsex = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jadr = new javax.swing.JLabel();
        jdob = new javax.swing.JLabel();
        jhvt = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtdow = new javax.swing.JTextField();
        txtnote = new javax.swing.JTextField();
        txtma = new javax.swing.JTextField();
        txtluong = new javax.swing.JTextField();
        jdt = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jdow = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jcsex = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanelMe = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanelDangXuat = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản Lý Nhân Sự Phenikaa");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbljpanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tbljpanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tbljpanel.setToolTipText("");
        tbljpanel.setAlignmentX(10.0F);
        tbljpanel.setAlignmentY(10.0F);
        tbljpanel.setAutoscrolls(true);
        tbljpanel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbljpanel.setName(""); // NOI18N

        jTabbedPaneNhanVien.setAlignmentX(10.0F);
        jTabbedPaneNhanVien.setAlignmentY(10.0F);
        jTabbedPaneNhanVien.setAutoscrolls(true);
        jTabbedPaneNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelNhanVien.setBackground(new java.awt.Color(204, 204, 255));
        jPanelNhanVien.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelNhanVienComponentShown(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));

        lblTenNhanVien_NhanVien.setText("Tên Nhân Viên");

        lblMaNhanVien_NhanVien.setText("Mã Nhân Viên");

        jLabel45.setText("Ngày Sinh");

        jLabel46.setText("Giới Tính");

        jLabel47.setText("Ngày Vào Làm");

        txtMaNhanVien_NhanVien.setEditable(false);

        buttonGroup1.add(rbtnNam_NhanVien);
        rbtnNam_NhanVien.setText("Nam");

        buttonGroup1.add(rbtnNu_NhanVien);
        rbtnNu_NhanVien.setText("Nữ");

        cbbThangSinh_NhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangSinh_NhanVienItemStateChanged(evt);
            }
        });

        cbbNamVaoLam_NhanVien.setAutoscrolls(true);

        cbbThangVaoLam_NhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangVaoLam_NhanVienItemStateChanged(evt);
            }
        });

        lblSDT_NhanVien1.setText("Lương");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(lblTenNhanVien_NhanVien))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(cbbNgayVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbbThangVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbNamVaoLam_NhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(cbbNgaySinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbbThangSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                                .addComponent(rbtnNam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76)))
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbtnNu_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbNamSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtTenNhanVien_NhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaNhanVien_NhanVien, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(lblSDT_NhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLuong)
                        .addGap(19, 19, 19))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNhanVien_NhanVien)
                    .addComponent(txtMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien_NhanVien)
                    .addComponent(txtTenNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbNgaySinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbThangSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbNamSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnNam_NhanVien)
                        .addComponent(rbtnNu_NhanVien)))
                .addGap(16, 16, 16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(cbbNgayVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNamVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbThangVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT_NhanVien1)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblDiaChi_NhanVien.setText("Địa Chỉ");

        lblSDT_NhanVien.setText("Số ĐT");

        txtChuThich_NhanVien.setColumns(20);
        txtChuThich_NhanVien.setRows(5);
        jScrollPane8.setViewportView(txtChuThich_NhanVien);

        jLabel51.setText("Chú Thích");

        jLabel52.setText("Chức Vụ");

        btnThem_NhanVien.setText("Thêm");
        btnThem_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_NhanVienActionPerformed(evt);
            }
        });

        btnSua_NhanVien.setText("Sửa");
        btnSua_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_NhanVienActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Tìm Kiếm");

        txtTimKiem_NhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_NhanVienKeyReleased(evt);
            }
        });

        rbtnTimKiemTenNhanVien_NhanVien.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(rbtnTimKiemTenNhanVien_NhanVien);
        rbtnTimKiemTenNhanVien_NhanVien.setText("Tên Nhân Viên");

        rbtnTimKiemMaNhanVien_NhanVien.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(rbtnTimKiemMaNhanVien_NhanVien);
        rbtnTimKiemMaNhanVien_NhanVien.setText("Mã Nhân Viên");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-24.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setIconTextGap(1);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(rbtnTimKiemTenNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnTimKiemMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTimKiem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTimKiemTenNhanVien_NhanVien)
                    .addComponent(rbtnTimKiemMaNhanVien_NhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(78, 78, 78))
        );

        btnXoa_NhanVien.setText("Xóa");
        btnXoa_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_NhanVienActionPerformed(evt);
            }
        });

        btnReset_NhanVien.setText("Reset");
        btnReset_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_NhanVienActionPerformed(evt);
            }
        });

        cbbChucVu_NhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDiaChi_NhanVien)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                            .addComponent(lblSDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiaChi_NhanVien)
                    .addComponent(txtSoDT_NhanVien)
                    .addComponent(cbbChucVu_NhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnThem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnXoa_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addComponent(btnSua_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbbChucVu_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel52)))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDiaChi_NhanVien)
                                    .addComponent(txtDiaChi_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSDT_NhanVien)
                                    .addComponent(txtSoDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSua_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(btnXoa_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReset_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel51))
                                .addGap(10, 10, 10))
                            .addComponent(jScrollPane8))))
                .addContainerGap())
        );

        tblNhanVien_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh ", "Giới Tính", "Ngày Vào Làm", "Chức Vụ", "Địa Chỉ", "Số ĐT", "Lương", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien_NhanVien.setToolTipText("");
        tblNhanVien_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVien_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblNhanVien_NhanVien);

        javax.swing.GroupLayout jPanelNhanVienLayout = new javax.swing.GroupLayout(jPanelNhanVien);
        jPanelNhanVien.setLayout(jPanelNhanVienLayout);
        jPanelNhanVienLayout.setHorizontalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addGroup(jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        jPanelNhanVienLayout.setVerticalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneNhanVien.addTab("Nhân Viên", jPanelNhanVien);

        jPanelTaiKhoan.setBackground(new java.awt.Color(204, 204, 255));
        jPanelTaiKhoan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelTaiKhoanComponentShown(evt);
            }
        });

        tblTaiKhoan_TaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "ID", "Mã Nhân Viên ", "Tên Nhân Viên ", "User", "Password", "Quyền", "Chú Thích"
            }
        ));
        tblTaiKhoan_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaiKhoan_TaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblTaiKhoan_TaiKhoan);
        if (tblTaiKhoan_TaiKhoan.getColumnModel().getColumnCount() > 0) {
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(0).setMinWidth(30);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(0).setMaxWidth(30);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(2).setMinWidth(90);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        btnThem_TaiKhoan.setText("Thêm ");
        btnThem_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_TaiKhoanActionPerformed(evt);
            }
        });

        btnXoa_TaiKhoan.setText("Xóa");
        btnXoa_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_TaiKhoanActionPerformed(evt);
            }
        });

        btnSua_TaiKhoan.setText("Sửa");
        btnSua_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_TaiKhoanActionPerformed(evt);
            }
        });

        btnReset_TaiKhoan.setText("Reset");
        btnReset_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReset_TaiKhoanMouseClicked(evt);
            }
        });
        btnReset_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_TaiKhoanActionPerformed(evt);
            }
        });

        jLabel18.setText("Tên Nhân Viên");

        jLabel21.setText("User");

        jLabel22.setText("Password");

        jLabel23.setText("Quyền");

        cbbQuyen_TaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel24.setText("Chú Thích");

        txtChuThich_TaiKhoan.setColumns(20);
        txtChuThich_TaiKhoan.setRows(5);
        jScrollPane9.setViewportView(txtChuThich_TaiKhoan);

        jLabel55.setText("Mã Nhân Viên");

        txtMaNhanVien_TaiKhoan.setEditable(false);

        cbbTenNhanVien_TaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("ID");

        txtID.setEditable(false);

        javax.swing.GroupLayout jPanelTaiKhoanLayout = new javax.swing.GroupLayout(jPanelTaiKhoan);
        jPanelTaiKhoan.setLayout(jPanelTaiKhoanLayout);
        jPanelTaiKhoanLayout.setHorizontalGroup(
            jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel41))
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                    .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoanLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbbQuyen_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtMaNhanVien_TaiKhoan)
                                                .addComponent(txtUser_TaiKhoan)
                                                .addComponent(txtPassword_TaiKhoan)
                                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoanLayout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addComponent(cbbTenNhanVien_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                    .addComponent(btnThem_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78)
                                    .addComponent(btnXoa_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                    .addComponent(btnSua_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReset_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanelTaiKhoanLayout.setVerticalGroup(
            jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaNhanVien_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cbbTenNhanVien_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cbbQuyen_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_TaiKhoan)
                            .addComponent(btnXoa_TaiKhoan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua_TaiKhoan)
                            .addComponent(btnReset_TaiKhoan))))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPaneNhanVien.addTab("Tài Khoản", jPanelTaiKhoan);

        jPanelChucVu.setBackground(new java.awt.Color(204, 204, 255));
        jPanelChucVu.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelChucVu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelChucVuComponentShown(evt);
            }
        });

        tblChucVu_ChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Chức Vụ", "Tên Chức Vụ", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChucVu_ChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChucVu_ChucVuMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblChucVu_ChucVu);
        if (tblChucVu_ChucVu.getColumnModel().getColumnCount() > 0) {
            tblChucVu_ChucVu.getColumnModel().getColumn(0).setMinWidth(30);
            tblChucVu_ChucVu.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblChucVu_ChucVu.getColumnModel().getColumn(0).setMaxWidth(30);
            tblChucVu_ChucVu.getColumnModel().getColumn(1).setMinWidth(90);
            tblChucVu_ChucVu.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblChucVu_ChucVu.getColumnModel().getColumn(1).setMaxWidth(90);
        }

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));

        jLabel25.setText("Mã Chức Vụ");

        jLabel26.setText("Tên Chức Vụ");

        jLabel27.setText("Ghi Chú");

        txtChuThich_ChucVu.setColumns(20);
        txtChuThich_ChucVu.setRows(5);
        jScrollPane13.setViewportView(txtChuThich_ChucVu);

        btnThem_ChucVu.setText("Thêm");
        btnThem_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_ChucVuActionPerformed(evt);
            }
        });

        btnSua_ChucVu.setText("Sửa");
        btnSua_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_ChucVuActionPerformed(evt);
            }
        });

        btnReset_ChucVu.setText("Xóa");
        btnReset_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_ChucVuActionPerformed(evt);
            }
        });

        txtMaChucVu_ChucVu.setEditable(false);

        btnReset_ChucVu1.setText("Reset");
        btnReset_ChucVu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_ChucVu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThem_ChucVu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane13)
                        .addComponent(txtTenChucVu_ChucVu)
                        .addComponent(txtMaChucVu_ChucVu))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnSua_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnReset_ChucVu)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset_ChucVu1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );

        jPanel20Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnReset_ChucVu, btnReset_ChucVu1, btnSua_ChucVu, btnThem_ChucVu});

        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtMaChucVu_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtTenChucVu_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_ChucVu)
                    .addComponent(btnSua_ChucVu)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReset_ChucVu1)
                        .addComponent(btnReset_ChucVu)))
                .addGap(16, 16, 16))
        );

        jPanel20Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnReset_ChucVu, btnReset_ChucVu1, btnSua_ChucVu, btnThem_ChucVu});

        tblNhanVien_ChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblNhanVien_ChucVu);
        if (tblNhanVien_ChucVu.getColumnModel().getColumnCount() > 0) {
            tblNhanVien_ChucVu.getColumnModel().getColumn(0).setMinWidth(30);
            tblNhanVien_ChucVu.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblNhanVien_ChucVu.getColumnModel().getColumn(0).setMaxWidth(30);
            tblNhanVien_ChucVu.getColumnModel().getColumn(1).setMinWidth(90);
            tblNhanVien_ChucVu.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblNhanVien_ChucVu.getColumnModel().getColumn(1).setMaxWidth(90);
            tblNhanVien_ChucVu.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel7.setText("Chức Vụ");

        jLabel8.setText("Nhân Viên");

        javax.swing.GroupLayout jPanelChucVuLayout = new javax.swing.GroupLayout(jPanelChucVu);
        jPanelChucVu.setLayout(jPanelChucVuLayout);
        jPanelChucVuLayout.setHorizontalGroup(
            jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChucVuLayout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChucVuLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(571, 571, 571))
                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelChucVuLayout.setVerticalGroup(
            jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jTabbedPaneNhanVien.addTab("Chức Vụ", jPanelChucVu);

        tbljpanel.addTab("Nhân Viên   ", new javax.swing.ImageIcon(getClass().getResource("/images/teamwork.png")), jTabbedPaneNhanVien); // NOI18N

        jPanelThongKe.setBackground(new java.awt.Color(204, 204, 255));
        jPanelThongKe.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelThongKeComponentShown(evt);
            }
        });

        JLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane19.setViewportView(JLuong);
        if (JLuong.getColumnModel().getColumnCount() > 0) {
            JLuong.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanelThongKeLayout = new javax.swing.GroupLayout(jPanelThongKe);
        jPanelThongKe.setLayout(jPanelThongKeLayout);
        jPanelThongKeLayout.setHorizontalGroup(
            jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanelThongKeLayout.setVerticalGroup(
            jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThongKeLayout.createSequentialGroup()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 257, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Thống Kê", jPanelThongKe);

        tbljpanel.addTab("Bảng Lương", new javax.swing.ImageIcon(getClass().getResource("/images/payroll.png")), jTabbedPane7); // NOI18N

        jPanel5.setAlignmentX(100.0F);
        jPanel5.setPreferredSize(new java.awt.Dimension(1500, 631));
        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentShown(evt);
            }
        });

        jsex.setText("Giới tính");

        jLabel10.setText("Mã nhân viên :");

        jadr.setText("Địa chỉ");

        jdob.setText("Ngày tháng năm sinh");

        jhvt.setText("Họ và tên");

        txtma.setEditable(false);

        txtluong.setEditable(false);

        jdt.setText("Số điện thoại");

        btnsave.setText("Lưu");
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jdow.setText("Ngày vào làm");

        jLabel16.setText("Note");

        jLabel17.setText("Lương");

        jLabel19.setText("Chức Vụ");

        txtChucVu.setEditable(false);

        jcsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jButton1.setText("Đổi Mật Khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jhvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdob, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jsex, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jadr, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jdt, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jdow, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdow, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnote, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcsex, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(884, 884, 884)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnsave, jButton1});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jhvt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdob, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsex, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcsex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jadr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnote, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnsave))
                .addContainerGap())
        );

        tbljpanel.addTab("Thông Tin    ", new javax.swing.ImageIcon(getClass().getResource("/images/nhanvien.png")), jPanel5); // NOI18N

        jPanelMe.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMe.setForeground(new java.awt.Color(0, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Phần Mềm Quản Lý Nhân Sự Trường Đại Học Phenikaaa");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("Các thành viên tham gia thiết kế :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 255));
        jLabel29.setText("Đinh Minh Phương");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setText("Phạm Anh Tuấn");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 255));
        jLabel37.setText("Nguyễn Quang Linh");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setText("Giảng Viên hướng dẫn dự án");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setText("Thầy Trần Đăng Hoan");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_323302423_608935774372636_4924459483491189966_n.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_1img_20230129_005934.jpg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tuan.jpg"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setText("Thông tin liên Hệ:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 255));
        jLabel39.setText("Zalo: 0397646666");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 255));
        jLabel40.setText("Facebook: https://www.facebook.com/profile.php?id=100027577594516");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 255));
        jLabel42.setText("Email: dminhphuong97@gmail.com");

        javax.swing.GroupLayout jPanelMeLayout = new javax.swing.GroupLayout(jPanelMe);
        jPanelMe.setLayout(jPanelMeLayout);
        jPanelMeLayout.setHorizontalGroup(
            jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeLayout.createSequentialGroup()
                .addGap(0, 474, Short.MAX_VALUE)
                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMeLayout.createSequentialGroup()
                                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelMeLayout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(514, 514, 514))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeLayout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(497, 497, 497))))))
        );
        jPanelMeLayout.setVerticalGroup(
            jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(12, 12, 12)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanelMeLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel29)))
                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMeLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel37))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addGap(9, 9, 9)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel37.getAccessibleContext().setAccessibleDescription("");
        jLabel37.getAccessibleContext().setAccessibleParent(tbljpanel);

        tbljpanel.addTab("Giới Thiệu   ", new javax.swing.ImageIcon(getClass().getResource("/images/info (1).png")), jPanelMe, ""); // NOI18N

        jPanelDangXuat.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDangXuatComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1636, Short.MAX_VALUE)
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        tbljpanel.addTab("đăng Xuất ", new javax.swing.ImageIcon(getClass().getResource("/images/logout (1).png")), jPanelDangXuat, ""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbljpanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbljpanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//hàm tìm kiếm nhân viên
    public void TimKiemNhanVien() {
        String wheretk = "";
        if (rbtnTimKiemMaNhanVien_NhanVien.isSelected()) {
            if (txtTimKiem_NhanVien.getText().equals("")) {
                wheretk = "MaNhanVien like N'%" + "%'";// tìm kiếm toàn bộ các nhân viên
            } else {
                wheretk = "MaNhanVien= " + txtTimKiem_NhanVien.getText();
            }
        } else if (rbtnTimKiemTenNhanVien_NhanVien.isSelected()) {
            wheretk = "TenNhanVien like N'%" + txtTimKiem_NhanVien.getText() + "%'";
        }
        String cautruyvan = "";
        cautruyvan = "select * from NhanVien where " + wheretk;
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Ngày Vào Làm", "Chức Vụ", "Dịa Chỉ", "SDT", "Lương", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);//tạo bảng
        tblNhanVien_NhanVien.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[11];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("NgaySinh");
                if (rs.getInt("GioiTinh") == 1) {
                    item[4] = "Nam";
                } else {
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("NgayVaoLam");
                item[6] = rs.getString("ChucVu");
                item[7] = rs.getString("DiaChi");
                item[8] = rs.getString("SoDT");
                item[9] = rs.getString("Luong");
                item[10] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //đóng bằng x
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmDangNhap frmDN = new frmDangNhap();
        frmDN.show();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    //reset các thông tin trên textbox
    public void ResNhanVien() {
        txtMaNhanVien_NhanVien.setText("");
        txtTenNhanVien_NhanVien.setText("");
        cbbNgaySinh_NhanVien.setSelectedItem("25");
        cbbThangSinh_NhanVien.setSelectedItem("12");
        cbbNamSinh_NhanVien.setSelectedItem("1996");
        cbbNgayVaoLam_NhanVien.setSelectedItem("25");
        cbbThangVaoLam_NhanVien.setSelectedItem("12");
        cbbNamVaoLam_NhanVien.setSelectedItem("1996");
        txtDiaChi_NhanVien.setText("");
        txtSoDT_NhanVien.setText("");
        txtChuThich_NhanVien.setText("");
        txtLuong.setText("");
        cbbChucVu_NhanVien.setSelectedIndex(0);
        rbtnNam_NhanVien.setSelected(true);
        rbtnNu_NhanVien.setSelected(false);

    }
    //chức năng khi mở frmTrangChu
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            String ten = "";
            String cautruyvan = "select * from NhanVien where MaNhanVien = '" + frmDangNhap.MaNhanVien + "'";
            ResultSet rs = Menu.OPEN.connection.ExcuteQueryGetTable(cautruyvan);
            if (rs.next()) {
                ten = rs.getString("TenNhanVien");
                ThongBao("Chào Mừng Admin " + ten, "Admin", 1);
            } else {
                System.out.println("Không tìm thấy nhân viên có mã " + frmDangNhap.MaNhanVien);
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(frmUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened
//frm đăng xuất
    private void jPanelDangXuatComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDangXuatComponentShown
        frmDangNhap frmdn = new frmDangNhap();
        frmdn.show();
        this.dispose();
    }//GEN-LAST:event_jPanelDangXuatComponentShown
//frm bảng lương
    private void jPanelThongKeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelThongKeComponentShown
        layluong();
    }//GEN-LAST:event_jPanelThongKeComponentShown
// chức vụ
    private void jPanelChucVuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelChucVuComponentShown
        layDuLieuChucVu();
    }//GEN-LAST:event_jPanelChucVuComponentShown
// reset chức vụ
    private void btnReset_ChucVu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_ChucVu1ActionPerformed
        txtMaChucVu_ChucVu.setText("");
        txtTenChucVu_ChucVu.setText("");
        txtChuThich_ChucVu.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_btnReset_ChucVu1ActionPerformed
//xóa chức vụ
    private void btnReset_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_ChucVuActionPerformed
        String MaChucVu = txtMaChucVu_ChucVu.getText();
        if (!MaChucVu.equals("")) {
            // Tìm mã chức vụ của chức vụ sẽ bị xóa
            int maChucVu = Integer.parseInt(MaChucVu);

            // Xóa chức vụ đó
            String cautruyvan = "delete ChucVu where MaChucVu=" + MaChucVu;
            OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã xóa chức vụ có mã " + maChucVu);

            // Tìm các chức vụ có mã lớn hơn mã chức vụ đã xóa
            cautruyvan = "select * from ChucVu where MaChucVu > " + maChucVu;
            ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);

            // Giảm mã của các chức vụ đó đi 1 đơn vị
            try {
                while (rs.next()) {
                    int maCu = rs.getInt("MaChucVu");
                    int maMoi = maCu - 1;
                    cautruyvan = "update ChucVu set MaChucVu=" + maMoi + " where MaChucVu=" + maCu;
                    OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
                }
                System.out.println("Đã cập nhật mã chức vụ thành công");
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }

            layDuLieuChucVu();
        } else {
            ThongBao("Bạn chưa nhập mã chức vụ", "Lỗi khi cố muốn xóa mà không thèm nhập mã", 2);
        }
    }//GEN-LAST:event_btnReset_ChucVuActionPerformed
//sửa chức vụ
    private void btnSua_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_ChucVuActionPerformed
        String MaChucVu, TenChucVu, GhiChu;
        MaChucVu = txtMaChucVu_ChucVu.getText();
        TenChucVu = txtTenChucVu_ChucVu.getText();
        GhiChu = txtChuThich_ChucVu.getText();

        // Kiểm tra tên chức vụ mới có trùng với các tên chức vụ đã có trong cơ sở dữ liệu hay không
        String cautruyvan_kiemtra = "SELECT * FROM ChucVu WHERE TenChucVu=N'" + TenChucVu + "'";
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan_kiemtra);

        try {
            if (rs.next()) {
                // Tên chức vụ mới đã tồn tại, không thể sửa được
                ThongBao("Tên chức vụ này đã tồn tại, không thể sửa được.", "Lỗi", 2);
            } else {
                // Tên chức vụ mới chưa tồn tại, có thể sửa thông tin chức vụ
                String cautruyvan = "UPDATE ChucVu SET TenChucVu=N'" + TenChucVu + "', GhiChu=N'" + GhiChu + "' WHERE MaChucVu=" + MaChucVu;
                System.out.println(cautruyvan);

                OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
                System.out.println("Đã Sửa Thành Công");
                layDuLieuChucVu();
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnSua_ChucVuActionPerformed
//thêm chức vụ
    private void btnThem_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_ChucVuActionPerformed
        String TenChucVu, GhiChu;

        TenChucVu = txtTenChucVu_ChucVu.getText();
        GhiChu = txtChuThich_ChucVu.getText();

        // Lấy mã chức vụ cuối cùng và tăng giá trị lên 1 để tạo mã chức vụ mới
        String cautruyvan = "SELECT TOP 1 MaChucVu FROM ChucVu ORDER BY MaChucVu DESC";
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        int newMaChucVu = 1;
        try {
            if (rs.next()) {
                newMaChucVu = rs.getInt("MaChucVu") + 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        // Kiểm tra xem Tên chức vụ đã tồn tại trong cơ sở dữ liệu chưa
        cautruyvan = "SELECT COUNT(*) as count FROM ChucVu WHERE TenChucVu = N'" + TenChucVu + "'";
        rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        int count = 0;
        try {
            if (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        // Nếu Tên chức vụ đã tồn tại thì thông báo lỗi, không thực hiện câu lệnh thêm dữ liệu
        if (count > 0) {
            ThongBao("Tên chức vụ đã tồn tại trong cơ sở dữ liệu.", "Lỗi", 2);
        } else {
            cautruyvan = "INSERT INTO ChucVu (MaChucVu, TenChucVu, GhiChu) VALUES ("
                    + newMaChucVu + ", N'" + TenChucVu + "', N'" + GhiChu + "')";
            System.out.println(cautruyvan);
            OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
            layDuLieuChucVu();
        }
    }//GEN-LAST:event_btnThem_ChucVuActionPerformed
//lấy thông tin chức vụ lên textbox khi ấn vào 
    private void tblChucVu_ChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChucVu_ChucVuMouseClicked
        int viTriDongVuaBam = tblChucVu_ChucVu.getSelectedRow();
        txtMaChucVu_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenChucVu_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 2).toString());
        txtChuThich_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 3).toString());
        layDuLieuNhanVienofChucVu(txtMaChucVu_ChucVu.getText());
    }//GEN-LAST:event_tblChucVu_ChucVuMouseClicked
//hiện thông tin tài khoản lên bảng
    private void jPanelTaiKhoanComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelTaiKhoanComponentShown
        layDuLieuTaiKhoan();
        cbbQuyen_TaiKhoan.setModel(LayDuLieucbb("Quyen", "TenQuyen", "MaQuyen"));
        cbbTenNhanVien_TaiKhoan.setModel(LayDuLieucbb("NhanVien", "TenNhanVien", "MaNhanVien"));
    }//GEN-LAST:event_jPanelTaiKhoanComponentShown
//sửa tài khoản
    private void btnSua_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_TaiKhoanActionPerformed
        String ID, MaNhanVien, TenDangNhap, Password, Quyen, ChuThich;
        ID = txtID.getText();
        MaNhanVien = GetCbbSelected(cbbTenNhanVien_TaiKhoan);
        TenDangNhap = txtUser_TaiKhoan.getText();
        Password = String.valueOf(txtPassword_TaiKhoan.getPassword()).trim();
        Quyen = GetCbbSelected(cbbQuyen_TaiKhoan);
        ChuThich = txtChuThich_TaiKhoan.getText();
        String cautruyvan = "update  Users set MaNhanVien=" + MaNhanVien
                + " ,TenDangNhap='" + TenDangNhap + "' ,Password= '" + Password + "' ,Quyen=" + Quyen
                + ",ChuThich= N'" + ChuThich + "'Where ID=" + ID;
        boolean kiemtra = true;
        if (kiemtra) {
            OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Sửa Thành Công tài khoản có id=" + ID);
        } else {
            ThongBao("Không thể Sửa tài Khoản với Tên đăng nhập là =" + TenDangNhap, "lỗi", 2);
        }
        layDuLieuTaiKhoan();
    }//GEN-LAST:event_btnSua_TaiKhoanActionPerformed
//xóa tài khoản
    private void btnXoa_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_TaiKhoanActionPerformed
        String ID = txtID.getText();
        if (!ID.equals("")) {
            String cautruyvan = "delete Users where ID=" + ID;
            Menu.OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("đã xóa");
            layDuLieuTaiKhoan();
        } else {
            ThongBao("bạn chưa nhập ID", "lỗi khi cố muốn xóa mà không thèm nhập mã", 2);
        }
    }//GEN-LAST:event_btnXoa_TaiKhoanActionPerformed
//thêm tài khoản
    private void btnThem_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_TaiKhoanActionPerformed
        String MaNhanVien, TenDangNhap, Password, Quyen, ChuThich;

        MaNhanVien = GetCbbSelected(cbbTenNhanVien_TaiKhoan);
        TenDangNhap = txtUser_TaiKhoan.getText();
        Password = String.valueOf(txtPassword_TaiKhoan.getPassword()).trim();
        Quyen = GetCbbSelected(cbbQuyen_TaiKhoan);
        ChuThich = txtChuThich_TaiKhoan.getText();
        String cautruyvan = "insert into Users values(" + MaNhanVien
                + " ,'" + TenDangNhap + "' , '" + Password + "' ," + Quyen
                + ", N'" + ChuThich + "')";
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (kiemtra) {
            OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
        }
        layDuLieuTaiKhoan();
    }//GEN-LAST:event_btnThem_TaiKhoanActionPerformed
//lấy thông tin tài khoản lên textbox
    private void tblTaiKhoan_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaiKhoan_TaiKhoanMouseClicked

        int viTriDongVuaBam = tblTaiKhoan_TaiKhoan.getSelectedRow();
        txtID.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 1).toString());
        txtMaNhanVien_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 2).toString());
        txtUser_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 4).toString());
        txtPassword_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 5).toString());
        txtChuThich_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 7).toString());
        setSelectedCombobox(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 3).toString(), cbbTenNhanVien_TaiKhoan);
        setSelectedCombobox(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 6).toString(), cbbQuyen_TaiKhoan);
    }//GEN-LAST:event_tblTaiKhoan_TaiKhoanMouseClicked
//hiện thông tin nhân viên 
    private void jPanelNhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelNhanVienComponentShown
        rbtnTimKiemTenNhanVien_NhanVien.setSelected(true);
        rbtnNam_NhanVien.setSelected(true);
        layDuLieuNhanVien();
        cbbChucVu_NhanVien.setModel(LayDuLieucbb("ChucVu", "TenChucVu", "MaChucVu"));
        for (int i = 1; i < 32; i++) {
            cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThangSinh_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 2022; i > 1950; i--) {
            cbbNamSinh_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 32; i++) {
            cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThangVaoLam_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 2023; i > 1950; i--) {
            cbbNamVaoLam_NhanVien.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_jPanelNhanVienComponentShown
// nút reset nhân viên
    private void btnReset_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_NhanVienActionPerformed
        ResNhanVien();
    }//GEN-LAST:event_btnReset_NhanVienActionPerformed
// nút xóa nv và toàn bộ tài khoản của nhân viên đó
    private void btnXoa_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_NhanVienActionPerformed
        String MaNhanVien = txtMaNhanVien_NhanVien.getText();
        if (!MaNhanVien.equals("")) {
            String cautruyvan = "delete NhanVien where MaNhanVien=" + MaNhanVien;
            String cautruyvan1 = "delete Users where MaNhanVien=" + MaNhanVien; 
            Menu.OPEN.connection.ExcuteQueryUpdateDB(cautruyvan1);
            Menu.OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("đã xóa");
            layDuLieuNhanVien();
            ResNhanVien();
            layluong();
            ThongBao("Xóa thành công","Thành công",1);
        } else {
            ThongBao("bạn chưa nhập mã nhân viên", "lỗi khi cố xóa nhân viên mà chưa click chuột vô anh ấy", 2);
        }
    }//GEN-LAST:event_btnXoa_NhanVienActionPerformed
//tìm kiếm nv
    private void txtTimKiem_NhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_NhanVienKeyReleased
        TimKiemNhanVien();
    }//GEN-LAST:event_txtTimKiem_NhanVienKeyReleased
//nút sửa nv
    private void btnSua_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_NhanVienActionPerformed
        String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, NgayVaoLam, ChucVu, DiaChi, SoDT, Luong, GhiChu;
        MaNhanVien = txtMaNhanVien_NhanVien.getText();
        if (rbtnNam_NhanVien.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        ChucVu = GetCbbSelected(cbbChucVu_NhanVien);
        TenNhanVien = txtTenNhanVien_NhanVien.getText();
        String ngay, thang, nam;
        ngay = cbbNgaySinh_NhanVien.getSelectedItem().toString();
        thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
        nam = cbbNamSinh_NhanVien.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        String ngayv, thangv, namv;
        ngayv = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
        thangv = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
        namv = cbbNamVaoLam_NhanVien.getSelectedItem().toString();
        NgayVaoLam = namv + "-" + thangv + "-" + ngayv;
        DiaChi = txtDiaChi_NhanVien.getText();
        SoDT = txtSoDT_NhanVien.getText();
        Luong = txtLuong.getText();
        GhiChu = txtChuThich_NhanVien.getText();
        String cautruyvan = "update NhanVien set TenNhanVien=" + "N'" + TenNhanVien
                + "',NgaySinh='" + NgaySinh + "',GioiTinh=" + GioiTinh
                + ",NgayVaoLam='" + NgayVaoLam + "',ChucVu="
                + ChucVu + ",DiaChi=N'" + DiaChi + "',SoDT='" + SoDT + "',Luong='" + Luong + "',GhiChu=N'" + GhiChu + "'where MaNhanVien=" + MaNhanVien;
        boolean kiemtra = KiemTraNhapNhanVien(1);
        if (kiemtra) {
            OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            ThongBao("Sửa thành công","Thành công",1);
        } else {
            ThongBao("Không thể sửa Nhân Viên", "lỗi", 2);
        }
        layDuLieuNhanVien();
        layluong();
    }//GEN-LAST:event_btnSua_NhanVienActionPerformed
//nút thêm nv và tự động thêm tài khoản tương ứng
    private void btnThem_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_NhanVienActionPerformed
        String TenNhanVien, NgaySinh, GioiTinh, NgayVaoLam, ChucVu, DiaChi, SoDT, Luong, GhiChu;
        txtMaNhanVien_NhanVien.getText();
        if (rbtnNam_NhanVien.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        ChucVu = GetCbbSelected(cbbChucVu_NhanVien);
        TenNhanVien = txtTenNhanVien_NhanVien.getText();
        String ngay, thang, nam;
        ngay = cbbNgaySinh_NhanVien.getSelectedItem().toString();
        thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
        nam = cbbNamSinh_NhanVien.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        String ngayv, thangv, namv;
        ngayv = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
        thangv = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
        namv = cbbNamVaoLam_NhanVien.getSelectedItem().toString();
        NgayVaoLam = namv + "-" + thangv + "-" + ngayv;
        DiaChi = txtDiaChi_NhanVien.getText();
        SoDT = txtSoDT_NhanVien.getText();
        Luong = txtLuong.getText();
        GhiChu = txtChuThich_NhanVien.getText();
        String cautruyvan = "insert into NhanVien values(" + "N'" + TenNhanVien
                + "','" + NgaySinh + "'," + GioiTinh + ",'" + NgayVaoLam + "',"
                + ChucVu + ",N'" + DiaChi + "','" + SoDT + "',N'" + Luong + "',N'" + GhiChu + "' )";

        boolean kiemtra = KiemTraNhapNhanVien(0);
        if (kiemtra) {
            OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
            String cautruyvan2 = "SELECT TOP 1 MaNhanVien FROM NhanVien ORDER BY MaNhanVien DESC";
            ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan2);
            int NewMa = 0;
            try {
                if (rs.next()) {
                    NewMa = rs.getInt("MaNhanVien");
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            String TenDangNhap = "user" + NewMa;
            String Password = "user" + NewMa;
            int Quyen = 2;
            String ChuThich = "";
            // Tạo câu truy vấn thêm tài khoản mới vào database
            String cautruyvan1 = "INSERT INTO Users (MaNhanVien, TenDangNhap, Password, Quyen, ChuThich) VALUES ('" + NewMa + "', N'" + TenDangNhap + "', N'" + Password + "', '" + Quyen + "', N'" + ChuThich + "')";
            boolean kiemtra1 = true;
            if (kiemtra1) {
                OPEN.connection.ExcuteQueryUpdateDB(cautruyvan1);
                ThongBao("Thêm thành công","Thành công",1);
            } else {
                ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
            }
        } else {
            System.out.println("Thất Bại");
        }
        layluong();
        layDuLieuNhanVien();
    }//GEN-LAST:event_btnThem_NhanVienActionPerformed
//combo box tháng vào làm
    private void cbbThangVaoLam_NhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangVaoLam_NhanVienItemStateChanged
        String thang = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
        }
        tam = 1;
        switch (thang) {
            case "4":
            case "6":
            case "9":
            case "11":
                cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
                for (int i = 1; i < 31; i++) {
                    cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
                }
                if (Integer.parseInt(thanght) < 31) {
                    cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
                }
                break;
            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            case "12":
            case "10":
                cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
                for (int i = 1; i < 32; i++) {
                    cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
                }
                if (Integer.parseInt(thanght) < 32) {
                    cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
                }
                break;
            default:
                cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
                for (int i = 1; i < 29; i++) {
                    cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
                }
                if (Integer.parseInt(thanght) < 29) {
                    cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
                }
                break;
        }
    }//GEN-LAST:event_cbbThangVaoLam_NhanVienItemStateChanged
//cbb ngày thay đổi theo tháng
    private void cbbThangSinh_NhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangSinh_NhanVienItemStateChanged
        String thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgaySinh_NhanVien.getSelectedItem().toString();
        }
        tam = 1;

        if (!thang.equals("4") && !thang.equals("6") && !thang.equals("9") && !thang.equals("11"))
            if (thang.equals("1") || thang.equals("3") || thang.equals("5")
                    || thang.equals("7") || thang.equals("8") || thang.equals("12") || thang.equals("10")) {

                cbbNgaySinh_NhanVien.setModel(cbbmodel);
                for (int i = 1; i < 32; i++) {
                    cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
                }
                if (Integer.parseInt(thanght) < 32) {
                    cbbNgaySinh_NhanVien.setSelectedItem(thanght);
                }
            } else {
                cbbNgaySinh_NhanVien.setModel(cbbmodel);
                for (int i = 1; i < 29; i++) {
                    cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
                }
                if (Integer.parseInt(thanght) < 29) {
                    cbbNgaySinh_NhanVien.setSelectedItem(thanght);
                }
            }
        else {
            cbbNgaySinh_NhanVien.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
            }
            if (Integer.parseInt(thanght) < 31) {
                cbbNgaySinh_NhanVien.setSelectedItem(thanght);
            }
        }
    }//GEN-LAST:event_cbbThangSinh_NhanVienItemStateChanged
// lưu thông tin cá nhân
    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, NgayVaoLam, DiaChi, SoDT, GhiChu;
        MaNhanVien = txtma.getText();
        TenNhanVien = txtten.getText();
        NgaySinh = "";
        NgayVaoLam = "";
        boolean isValidDate = true;

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            if (txtdob.getText().matches("^\\d{4}-\\d{2}-\\d{2}$")) { // Check if date format is correct
                Date dob = dateFormat.parse(txtdob.getText());
                NgaySinh = dateFormat.format(dob);

            } else {
                throw new ParseException("Invalid date format", 0);
            }

            if (txtdow.getText().matches("^\\d{4}-\\d{2}-\\d{2}$")) { // Check if date format is correct
                Date dow = dateFormat.parse(txtdow.getText());
                NgayVaoLam = dateFormat.format(dow);

            } else {
                throw new ParseException("Invalid date format", 0);
            }
        } catch (ParseException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
            isValidDate = false;

            if (txtdob.getText().isEmpty() || !txtdob.getText().matches("^\\d{4}-\\d{2}-\\d{2}$")) {
                ThongBao("Định Dạng Ngày Tháng của Ngày Sinh Sai", "Lỗi", 2);
                jdob.setForeground(Color.red);
            } else {
                jdob.setForeground(Color.black);
            }
            if (txtdow.getText().isEmpty() || !txtdow.getText().matches("^\\d{4}-\\d{2}-\\d{2}$")) {
                jdow.setForeground(Color.red);
                ThongBao("Định Dạng Ngày Tháng của Ngày Vào Làm Sai", "Lỗi", 2);
            } else {
                jdow.setForeground(Color.black);
            }

            return;
        }

        if (isValidDate) {
            DiaChi = txtaddress.getText();
            SoDT = txtphone.getText();
            GhiChu = txtnote.getText();
            GioiTinh = jcsex.getSelectedItem().toString().equals("Nam") ? "1" : "0"; // Lấy giá trị giới tính từ combobox
            try {
                String cautruyvan = "UPDATE NhanVien SET TenNhanVien = N'" + TenNhanVien + "', NgaySinh = '" + NgaySinh + "', GioiTinh = " + GioiTinh + ", NgayVaoLam = '" + NgayVaoLam + "', DiaChi = N'" + DiaChi + "', SoDT = '" + SoDT + "', GhiChu = N'" + GhiChu + "' WHERE MaNhanVien = " + MaNhanVien;
                boolean kiemtra = KiemTraNhapNhanVien();
                if (kiemtra) {
                    OPEN.connection.ExcuteQueryUpdateDB(cautruyvan);
                    System.out.println("Đã sửa Thành Công");
                    ThongBao("Đã sửa Thành Công", "Thành Công", 2);
                } else {

                }
                layDuLieuNhanVien();
                layluong();
            } catch (Exception ex) {
                System.out.println("Lỗi: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnsaveMouseClicked

//hiển thị dũ liệu cá nhân
    private void jPanel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentShown
        layDuLieuNguoiDung();        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5ComponentShown
//nút đổi mk
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmDangNhap.ex = 2;
        frm.frmDoimk frmDK = new frmDoimk();
        frmDK.show();
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblNhanVien_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVien_NhanVienMouseClicked
        int viTriDongVuaBam = tblNhanVien_NhanVien.getSelectedRow();
        txtMaNhanVien_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenNhanVien_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 2).toString());
        txtDiaChi_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 7).toString());
        txtSoDT_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 8).toString());
        txtLuong.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 9).toString());
        txtChuThich_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 10).toString());
        setSelectedCombobox(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 6).toString(), cbbChucVu_NhanVien);
        String gioitinh = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 4).toString();
        if (gioitinh.equals("Nam")) {
            rbtnNam_NhanVien.setSelected(true);
            rbtnNu_NhanVien.setSelected(false);
        } else {
            rbtnNu_NhanVien.setSelected(true);
            rbtnNam_NhanVien.setSelected(false);
        }
        String ngaysinh = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 3).toString();
        System.out.println("" + ngaysinh);
        String strngay, strthang, strnam;
        strngay = ngaysinh.substring(8, 10);
        strthang = ngaysinh.substring(5, 7);
        strnam = ngaysinh.substring(0, 4);
        int ngay, thang, nam;
        ngay = Integer.parseInt(strngay);
        thang = Integer.parseInt(strthang);
        nam = Integer.parseInt(strnam);
        cbbNgaySinh_NhanVien.setSelectedItem(String.valueOf(ngay));
        cbbThangSinh_NhanVien.setSelectedItem(String.valueOf(thang));
        cbbNamSinh_NhanVien.setSelectedItem(String.valueOf(nam));
        String ngayVaoLam = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 5).toString();
        System.out.println("" + ngayVaoLam);
        String strngayv, strthangv, strnamv;
        strngayv = ngayVaoLam.substring(8, 10);
        strthangv = ngayVaoLam.substring(5, 7);
        strnamv = ngayVaoLam.substring(0, 4);
        int ngayv, thangv, namv;
        ngayv = Integer.parseInt(strngayv);
        thangv = Integer.parseInt(strthangv);
        namv = Integer.parseInt(strnamv);
        cbbNgayVaoLam_NhanVien.setSelectedItem(String.valueOf(ngayv));
        cbbThangVaoLam_NhanVien.setSelectedItem(String.valueOf(thangv));
        cbbNamVaoLam_NhanVien.setSelectedItem(String.valueOf(namv));
    }//GEN-LAST:event_tblNhanVien_NhanVienMouseClicked

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnReset_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset_TaiKhoanActionPerformed

    private void btnReset_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReset_TaiKhoanMouseClicked
        txtID.setText("");
        txtMaNhanVien_TaiKhoan.setText("");
        txtUser_TaiKhoan.setText("");
        txtChuThich_TaiKhoan.setText("");
        txtPassword_TaiKhoan.setText("");
        cbbTenNhanVien_TaiKhoan.setSelectedIndex(0);
        cbbQuyen_TaiKhoan.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnReset_TaiKhoanMouseClicked
    public boolean KiemTraNhapNhanVien() {
        String TenNhanVien, DiaChi, SoDT;
        String ThongBao = "";
        boolean kiemtra;
        kiemtra = false;
        TenNhanVien = txtten.getText();
        SoDT = txtphone.getText();
        DiaChi = txtaddress.getText();

        if (TenNhanVien.equals("")) {
            ThongBao += "Bạn chưa nhập Tên Nhân Viên\n";
            jhvt.setForeground(Color.red);
        }
        if (DiaChi.equals("")) {
            jadr.setForeground(Color.red);
            ThongBao += "Bạn chưa nhập Địa Chỉ\n";
        }
        if (SoDT.equals("")) {
            jdt.setForeground(Color.red);
            ThongBao += "Bạn chưa nhập Số ĐT \n";
        }

// Kiểm tra ngày vào làm
        if (ThongBao.equals("")) {
            kiemtra = true;
            jhvt.setForeground(Color.black);
            jdt.setForeground(Color.black);
            jadr.setForeground(Color.black);
            jdob.setForeground(Color.black);
            jdow.setForeground(Color.black);
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "Lỗi nhập liệu", 2);
        }

        return kiemtra;

    }

    public void layDuLieuNguoiDung() {

        String cautruyvan = "select * from NhanVien INNER JOIN ChucVu ON NhanVien.ChucVu = ChucVu.MaChucVu where MaNhanVien = '" + frmDangNhap.MaNhanVien + "'";
        ResultSet rs = Menu.OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        // Hiển thị thông tin nhân viên lên form chính
        try {
            if (rs.next()) {
                txtma.setText(rs.getString("MaNhanVien"));
                txtten.setText(rs.getString("TenNhanVien"));
                txtdob.setText(rs.getString("NgaySinh"));
                txtaddress.setText(rs.getString("DiaChi"));
                txtphone.setText(rs.getString("SoDT"));
                txtdow.setText(rs.getString("NgayVaoLam"));
                txtnote.setText(rs.getString("GhiChu"));
                txtluong.setText(rs.getString("Luong"));
                jcsex.setSelectedItem(rs.getInt("GioiTinh") == 1 ? "Nam" : "Nữ");
                txtChucVu.setText(rs.getString("TenChucVu"));
            }
        } catch (SQLException ex) {
        }
    }

    public boolean KiemTraNhapNhanVien(int ts) {
        String Luong, TenNhanVien, DiaChi, SDT;
        boolean kiemtra;
        kiemtra = false;
        Luong = txtLuong.getText();
        TenNhanVien = txtTenNhanVien_NhanVien.getText();
        String ThongBao = "";
        DiaChi = txtDiaChi_NhanVien.getText();
        SDT = txtSoDT_NhanVien.getText();
        if (Luong.equals("")) {
            ThongBao += "bạn chưa Nhập Lương\n";
            lblSDT_NhanVien1.setForeground(Color.red);
        } else {
            lblSDT_NhanVien1.setForeground(Color.black);
        }
        if (TenNhanVien.equals("")) {
            ThongBao += "bạn chưa Nhập Tên Nhân Viên\n";
            lblTenNhanVien_NhanVien.setForeground(Color.red);
        } else {
            lblTenNhanVien_NhanVien.setForeground(Color.black);
        }
        if (DiaChi.equals("")) {
            lblDiaChi_NhanVien.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Địa Chỉ\n";
        } else {
            lblDiaChi_NhanVien.setForeground(Color.black);
        }
        if (SDT.equals("")) {
            lblSDT_NhanVien.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Số ĐT \n";
        } else {
            lblSDT_NhanVien.setForeground(Color.black);
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra;
    }
    //chuyển giá trị trong cbb về string
    public String GetCbbSelected(JComboBox cbb) {
        Object[] obj = cbb.getSelectedObjects();
        displayvalueModel item = (displayvalueModel) obj[0];
        return item.displayvalue.toString();

    }

    public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }

    public void setSelectedCombobox(String cbbselected, JComboBox cbb) {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj = cbb.getItemAt(i);
            if (obj != null) {
                displayvalueModel m = (displayvalueModel) obj;
                if (cbbselected.trim().equals(m.displayMember)) {
                    cbb.setSelectedItem(m);
                }
            }
        }
    }

    public void layDuLieuNhanVien() {
        String cautruyvan = "SELECT * FROM NhanVien INNER JOIN ChucVu ON NhanVien.ChucVu = ChucVu.MaChucVu";
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Ngày Vào Làm", "Chức Vụ", "Dịa Chỉ", "SDT", "Lương", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblNhanVien_NhanVien.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[11];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("NgaySinh");
                item[4] = rs.getInt("GioiTinh") == 1 ? "Nam" : "Nữ";
                item[5] = rs.getString("NgayVaoLam");
                item[6] = rs.getString("TenChucVu");
                item[7] = rs.getString("DiaChi");
                item[8] = rs.getString("SoDT");
                item[9] = rs.getString("Luong");
                item[10] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layluong() {
        String cautruyvan = "";
        cautruyvan = "SELECT * FROM NhanVien INNER JOIN ChucVu ON NhanVien.ChucVu = ChucVu.MaChucVu";
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ", "Lương"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        JLuong.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[5];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenChucVu");
                item[4] = rs.getString("Luong");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuTaiKhoan() {
        String cautruyvan = "";
        cautruyvan = "select Users.ID, Users.MaNhanVien, NhanVien.TenNhanVien ,Users.TenDangNhap,Users.Password"
                + ",Quyen.TenQuyen,Users.ChuThich  from Users,NhanVien,Quyen "
                + "where Users.MaNhanVien=NhanVien.MaNhanVien and Users.Quyen=Quyen.MaQuyen";
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT","ID", "Mã Nhân Viên", "Nhân Viên", "Tên Đăng Nhập", "Password", "Quyền", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblTaiKhoan_TaiKhoan.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[8];
                item[0] = c;
                item[1] = rs.getString("ID");
                item[2] = rs.getString("MaNhanVien");
                item[3] = rs.getString("TenNhanVien");
                item[4] = rs.getString("TenDangNhap");
                item[5] = rs.getString("Password");
                item[6] = rs.getString("TenQuyen");
                item[7] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuChucVu() {
        String cautruyvan = "";
        cautruyvan = "select * from ChucVu ";
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Chức Vụ", "Tên Chức Vụ", "Ghi Chú"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblChucVu_ChucVu.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaChucVu");
                item[2] = rs.getString("TenChucVu");
                item[3] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuNhanVienofChucVu(String MaChucVu) {
        String cautruyvan = "";
        cautruyvan = "select * from NhanVien,ChucVu "
                + "where NhanVien.ChucVu=ChucVu.MaChucVu and ChucVu=" + MaChucVu;
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblNhanVien_ChucVu.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenChucVu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public DefaultComboBoxModel LayDuLieucbb(String bang, String Ten, String Ma) {
        String cautruyvan = "select *from " + bang;
        ResultSet rs = OPEN.connection.ExcuteQueryGetTable(cautruyvan);
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                displayvalueModel valueModel = new displayvalueModel(rs.getString(Ten), rs.getString(Ma));
                cbbmodel.addElement(valueModel);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return cbbmodel;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new frmTrangChu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JLuong;
    private javax.swing.JButton btnReset_ChucVu;
    private javax.swing.JButton btnReset_ChucVu1;
    private javax.swing.JButton btnReset_NhanVien;
    private javax.swing.JButton btnReset_TaiKhoan;
    private javax.swing.JButton btnSua_ChucVu;
    private javax.swing.JButton btnSua_NhanVien;
    private javax.swing.JButton btnSua_TaiKhoan;
    private javax.swing.JButton btnThem_ChucVu;
    private javax.swing.JButton btnThem_NhanVien;
    private javax.swing.JButton btnThem_TaiKhoan;
    private javax.swing.JButton btnXoa_NhanVien;
    private javax.swing.JButton btnXoa_TaiKhoan;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cbbChucVu_NhanVien;
    private javax.swing.JComboBox<String> cbbNamSinh_NhanVien;
    private javax.swing.JComboBox<String> cbbNamVaoLam_NhanVien;
    private javax.swing.JComboBox<String> cbbNgaySinh_NhanVien;
    private javax.swing.JComboBox<String> cbbNgayVaoLam_NhanVien;
    private javax.swing.JComboBox<String> cbbQuyen_TaiKhoan;
    private javax.swing.JComboBox<String> cbbTenNhanVien_TaiKhoan;
    private javax.swing.JComboBox<String> cbbThangSinh_NhanVien;
    private javax.swing.JComboBox<String> cbbThangVaoLam_NhanVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelChucVu;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelMe;
    private javax.swing.JPanel jPanelNhanVien;
    private javax.swing.JPanel jPanelTaiKhoan;
    private javax.swing.JPanel jPanelThongKe;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JLabel jadr;
    private javax.swing.JComboBox<String> jcsex;
    private javax.swing.JLabel jdob;
    private javax.swing.JLabel jdow;
    private javax.swing.JLabel jdt;
    private javax.swing.JLabel jhvt;
    private javax.swing.JLabel jsex;
    private javax.swing.JLabel lblDiaChi_NhanVien;
    private javax.swing.JLabel lblMaNhanVien_NhanVien;
    private javax.swing.JLabel lblSDT_NhanVien;
    private javax.swing.JLabel lblSDT_NhanVien1;
    private javax.swing.JLabel lblTenNhanVien_NhanVien;
    private javax.swing.JRadioButton rbtnNam_NhanVien;
    private javax.swing.JRadioButton rbtnNu_NhanVien;
    private javax.swing.JRadioButton rbtnTimKiemMaNhanVien_NhanVien;
    private javax.swing.JRadioButton rbtnTimKiemTenNhanVien_NhanVien;
    private javax.swing.JTable tblChucVu_ChucVu;
    private javax.swing.JTable tblNhanVien_ChucVu;
    private javax.swing.JTable tblNhanVien_NhanVien;
    private javax.swing.JTable tblTaiKhoan_TaiKhoan;
    private javax.swing.JTabbedPane tbljpanel;
    private javax.swing.JTextArea txtChuThich_ChucVu;
    private javax.swing.JTextArea txtChuThich_NhanVien;
    private javax.swing.JTextArea txtChuThich_TaiKhoan;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi_NhanVien;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaChucVu_ChucVu;
    private javax.swing.JTextField txtMaNhanVien_NhanVien;
    private javax.swing.JTextField txtMaNhanVien_TaiKhoan;
    private javax.swing.JPasswordField txtPassword_TaiKhoan;
    private javax.swing.JTextField txtSoDT_NhanVien;
    private javax.swing.JTextField txtTenChucVu_ChucVu;
    private javax.swing.JTextField txtTenNhanVien_NhanVien;
    private javax.swing.JTextField txtTimKiem_NhanVien;
    private javax.swing.JTextField txtUser_TaiKhoan;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtdow;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtnote;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
