/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoremanagement.frames;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FileDialog;
import bookstoremanagement.model.Frontend.FormThemSua.ThemSuaSachForm;
import bookstoremanagement.MainPage;
/**
 *
 * @author songnguyen
 */
public class addForm extends javax.swing.JFrame {

    /**
     * Creates new form addForm
     */
    public addForm() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAddForm = new javax.swing.JPanel();
        pnlMaSach = new javax.swing.JPanel();
        txtMaSach = new javax.swing.JTextField();
        lblMaSach = new javax.swing.JLabel();
        pnlTenSach = new javax.swing.JPanel();
        txtTenSach = new javax.swing.JTextField();
        lblTenSach = new javax.swing.JLabel();
        pnlTheLoai = new javax.swing.JPanel();
        txtTheLoai = new javax.swing.JTextField();
        lblTheLoai = new javax.swing.JLabel();
        pnlTacGia = new javax.swing.JPanel();
        txtTacGia = new javax.swing.JTextField();
        lblTacGia = new javax.swing.JLabel();
        pnlNamXB = new javax.swing.JPanel();
        txtNamXB = new javax.swing.JTextField();
        lblNamXB = new javax.swing.JLabel();
        pnlSoLuong = new javax.swing.JPanel();
        txtSoLuong = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        pnlGiaNhap = new javax.swing.JPanel();
        txtGiaNhap = new javax.swing.JTextField();
        lblGiaNhap = new javax.swing.JLabel();
        pnlGiaBan = new javax.swing.JPanel();
        txtGiaBan = new javax.swing.JTextField();
        lblGiaBan = new javax.swing.JLabel();
        pnlTrangThai = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        pnlThem = new javax.swing.JPanel();
        lblThem = new javax.swing.JLabel();
        pnlHuy = new javax.swing.JPanel();
        lblHuy = new javax.swing.JLabel();

        pnlAddForm.setBackground(new java.awt.Color(255, 255, 255));

        txtMaSach.setEditable(false);

        lblMaSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaSach.setText("Mã sách");

        javax.swing.GroupLayout pnlMaSachLayout = new javax.swing.GroupLayout(pnlMaSach);
        pnlMaSach.setLayout(pnlMaSachLayout);
        pnlMaSachLayout.setHorizontalGroup(
            pnlMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSach)
                    .addGroup(pnlMaSachLayout.createSequentialGroup()
                        .addComponent(lblMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMaSachLayout.setVerticalGroup(
            pnlMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSachActionPerformed(evt);
            }
        });

        lblTenSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenSach.setText("Tên sách");

        javax.swing.GroupLayout pnlTenSachLayout = new javax.swing.GroupLayout(pnlTenSach);
        pnlTenSach.setLayout(pnlTenSachLayout);
        pnlTenSachLayout.setHorizontalGroup(
            pnlTenSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTenSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTenSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addGroup(pnlTenSachLayout.createSequentialGroup()
                        .addComponent(lblTenSach)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTenSachLayout.setVerticalGroup(
            pnlTenSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTenSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTheLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTheLoai.setText("Thể loại");

        javax.swing.GroupLayout pnlTheLoaiLayout = new javax.swing.GroupLayout(pnlTheLoai);
        pnlTheLoai.setLayout(pnlTheLoaiLayout);
        pnlTheLoaiLayout.setHorizontalGroup(
            pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTheLoai)
                    .addGroup(pnlTheLoaiLayout.createSequentialGroup()
                        .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 146, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTheLoaiLayout.setVerticalGroup(
            pnlTheLoaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTheLoaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTacGiaActionPerformed(evt);
            }
        });

        lblTacGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTacGia.setText("Tác giả");

        javax.swing.GroupLayout pnlTacGiaLayout = new javax.swing.GroupLayout(pnlTacGia);
        pnlTacGia.setLayout(pnlTacGiaLayout);
        pnlTacGiaLayout.setHorizontalGroup(
            pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addGroup(pnlTacGiaLayout.createSequentialGroup()
                        .addComponent(lblTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTacGiaLayout.setVerticalGroup(
            pnlTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblNamXB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNamXB.setText("Năm xuất bản");

        javax.swing.GroupLayout pnlNamXBLayout = new javax.swing.GroupLayout(pnlNamXB);
        pnlNamXB.setLayout(pnlNamXBLayout);
        pnlNamXBLayout.setHorizontalGroup(
            pnlNamXBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNamXBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNamXBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamXB)
                    .addGroup(pnlNamXBLayout.createSequentialGroup()
                        .addComponent(lblNamXB)
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlNamXBLayout.setVerticalGroup(
            pnlNamXBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNamXBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNamXB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        lblSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSoLuong.setText("Số lượng");

        javax.swing.GroupLayout pnlSoLuongLayout = new javax.swing.GroupLayout(pnlSoLuong);
        pnlSoLuong.setLayout(pnlSoLuongLayout);
        pnlSoLuongLayout.setHorizontalGroup(
            pnlSoLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSoLuongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSoLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuong)
                    .addGroup(pnlSoLuongLayout.createSequentialGroup()
                        .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSoLuongLayout.setVerticalGroup(
            pnlSoLuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSoLuongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSoLuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblGiaNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGiaNhap.setText("Giá nhập (nghìn)");

        javax.swing.GroupLayout pnlGiaNhapLayout = new javax.swing.GroupLayout(pnlGiaNhap);
        pnlGiaNhap.setLayout(pnlGiaNhapLayout);
        pnlGiaNhapLayout.setHorizontalGroup(
            pnlGiaNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiaNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGiaNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGiaNhap)
                    .addGroup(pnlGiaNhapLayout.createSequentialGroup()
                        .addComponent(lblGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlGiaNhapLayout.setVerticalGroup(
            pnlGiaNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGiaNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGiaNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaNhap)
                .addContainerGap())
        );

        lblGiaBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGiaBan.setText("Giá bán (nghìn)");

        javax.swing.GroupLayout pnlGiaBanLayout = new javax.swing.GroupLayout(pnlGiaBan);
        pnlGiaBan.setLayout(pnlGiaBanLayout);
        pnlGiaBanLayout.setHorizontalGroup(
            pnlGiaBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiaBanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGiaBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGiaBan)
                    .addGroup(pnlGiaBanLayout.createSequentialGroup()
                        .addComponent(lblGiaBan)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlGiaBanLayout.setVerticalGroup(
            pnlGiaBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGiaBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGiaBan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaBan)
                .addContainerGap())
        );

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTrangThai.setText("Trạng thái");

        cboTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hiện", "Ẩn" }));
        cboTrangThai.setMinimumSize(new java.awt.Dimension(64, 22));
        cboTrangThai.setPreferredSize(new java.awt.Dimension(64, 22));
        cboTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTrangThaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTrangThai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlThem.setBackground(new java.awt.Color(0, 204, 204));
        pnlThem.setPreferredSize(new java.awt.Dimension(80, 24));
        pnlThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlThemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlThemMouseReleased(evt);
            }
        });

        lblThem.setBackground(new java.awt.Color(255, 255, 255));
        lblThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblThem.setForeground(new java.awt.Color(255, 255, 255));
        lblThem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThem.setText("Thêm");

        javax.swing.GroupLayout pnlThemLayout = new javax.swing.GroupLayout(pnlThem);
        pnlThem.setLayout(pnlThemLayout);
        pnlThemLayout.setHorizontalGroup(
            pnlThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThemLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlThemLayout.setVerticalGroup(
            pnlThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        pnlHuy.setBackground(new java.awt.Color(255, 0, 0));
        pnlHuy.setPreferredSize(new java.awt.Dimension(80, 24));
        pnlHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHuyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHuyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlHuyMouseReleased(evt);
            }
        });

        lblHuy.setBackground(new java.awt.Color(255, 255, 255));
        lblHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHuy.setForeground(new java.awt.Color(255, 255, 255));
        lblHuy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHuy.setText("Hủy");

        javax.swing.GroupLayout pnlHuyLayout = new javax.swing.GroupLayout(pnlHuy);
        pnlHuy.setLayout(pnlHuyLayout);
        pnlHuyLayout.setHorizontalGroup(
            pnlHuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHuyLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlHuyLayout.setVerticalGroup(
            pnlHuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlAddFormLayout = new javax.swing.GroupLayout(pnlAddForm);
        pnlAddForm.setLayout(pnlAddFormLayout);
        pnlAddFormLayout.setHorizontalGroup(
            pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddFormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddFormLayout.createSequentialGroup()
                        .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddFormLayout.createSequentialGroup()
                                .addComponent(pnlSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(pnlGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddFormLayout.createSequentialGroup()
                                .addComponent(pnlTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlAddFormLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddFormLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlAddFormLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(pnlGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAddFormLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlAddFormLayout.createSequentialGroup()
                        .addComponent(pnlMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlAddFormLayout.setVerticalGroup(
            pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddFormLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddFormLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGiaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(pnlAddFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAddForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAddForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTrangThaiActionPerformed

    private void pnlHuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseReleased
        changecolor(pnlHuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_pnlHuyMouseReleased

    private void pnlHuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMousePressed
        changecolor(pnlHuy,new Color(221,0,0));
    }//GEN-LAST:event_pnlHuyMousePressed

    private void pnlHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseClicked

    }//GEN-LAST:event_pnlHuyMouseClicked

    private void pnlThemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMouseReleased
        changecolor(pnlThem,new Color(0,204,204));

        ThemSuaSachForm.btnThemMouseClicked();

        //        setTableCellAlignment(JLabel.CENTER,pTable);
    }//GEN-LAST:event_pnlThemMouseReleased

    private void pnlThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlThemMousePressed
        changecolor(pnlThem,new Color(0,163,163));
    }//GEN-LAST:event_pnlThemMousePressed

    private void txtTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSachActionPerformed

    private void txtTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTacGiaActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap;
    private javax.swing.JLabel lblHuy;
    private javax.swing.JLabel lblMaSach;
    private javax.swing.JLabel lblNamXB;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTenSach;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JLabel lblThem;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnlAddForm;
    private javax.swing.JPanel pnlGiaBan;
    private javax.swing.JPanel pnlGiaNhap;
    private javax.swing.JPanel pnlHuy;
    private javax.swing.JPanel pnlMaSach;
    private javax.swing.JPanel pnlNamXB;
    private javax.swing.JPanel pnlSoLuong;
    private javax.swing.JPanel pnlTacGia;
    private javax.swing.JPanel pnlTenSach;
    private javax.swing.JPanel pnlTheLoai;
    private javax.swing.JPanel pnlThem;
    private javax.swing.JPanel pnlTrangThai;
    public static javax.swing.JTextField txtGiaBan;
    public static javax.swing.JTextField txtGiaNhap;
    public static javax.swing.JTextField txtMaSach;
    public static javax.swing.JTextField txtNamXB;
    public static javax.swing.JTextField txtSoLuong;
    public static javax.swing.JTextField txtTacGia;
    public static javax.swing.JTextField txtTenSach;
    public static javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
