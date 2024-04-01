/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoremanagement.frames;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JOptionPane;
import static bookstoremanagement.MainPage.TKTable;
import bookstoremanagement.model.Frontend.FormThemSua.ThemSuaTaiKhoanForm;
import bookstoremanagement.model.Backend.TaiKhoan.QuanLyTaiKhoanBUS;
import bookstoremanagement.model.Backend.TaiKhoan.TaiKhoan;

public class editTK extends javax.swing.JFrame {
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    /**
     * Creates new form editTK
     */
    public editTK() {
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

        pnlEditTK = new javax.swing.JPanel();
        pnlTenTK = new javax.swing.JPanel();
        txtTenTK = new javax.swing.JTextField();
        lblTenTK = new javax.swing.JLabel();
        pnlMaNV = new javax.swing.JPanel();
        txtMaNV = new javax.swing.JTextField();
        lblMaNV = new javax.swing.JLabel();
        ChonMaNV = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlMatKhau = new javax.swing.JPanel();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        pnlMaQuyen = new javax.swing.JPanel();
        txtMaQuyen = new javax.swing.JTextField();
        lblMaQuyen = new javax.swing.JLabel();
        ChonMaQuyen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlSua = new javax.swing.JPanel();
        lblSua = new javax.swing.JLabel();
        pnlHuy = new javax.swing.JPanel();
        lblHuy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEditTK.setBackground(new java.awt.Color(255, 255, 255));

        txtTenTK.setEditable(false);
        txtTenTK.setToolTipText("Không được đổi tên đăng nhập");

        lblTenTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenTK.setText("Tên tài khoản");

        javax.swing.GroupLayout pnlTenTKLayout = new javax.swing.GroupLayout(pnlTenTK);
        pnlTenTK.setLayout(pnlTenTKLayout);
        pnlTenTKLayout.setHorizontalGroup(
            pnlTenTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTenTKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTenTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenTK)
                    .addGroup(pnlTenTKLayout.createSequentialGroup()
                        .addComponent(lblTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTenTKLayout.setVerticalGroup(
            pnlTenTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTenTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenTK, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        lblMaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaNV.setText("Mã nhân viên");

        ChonMaNV.setBackground(new java.awt.Color(204, 204, 204));
        ChonMaNV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChonMaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChonMaNVMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChonMaNVMouseReleased(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ChonMaNVLayout = new javax.swing.GroupLayout(ChonMaNV);
        ChonMaNV.setLayout(ChonMaNVLayout);
        ChonMaNVLayout.setHorizontalGroup(
            ChonMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChonMaNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChonMaNVLayout.setVerticalGroup(
            ChonMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChonMaNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMaNVLayout = new javax.swing.GroupLayout(pnlMaNV);
        pnlMaNV.setLayout(pnlMaNVLayout);
        pnlMaNVLayout.setHorizontalGroup(
            pnlMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaNVLayout.createSequentialGroup()
                .addGroup(pnlMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMaNVLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMaNVLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChonMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlMaNVLayout.setVerticalGroup(
            pnlMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaNVLayout.createSequentialGroup()
                .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChonMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        lblMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        javax.swing.GroupLayout pnlMatKhauLayout = new javax.swing.GroupLayout(pnlMatKhau);
        pnlMatKhau.setLayout(pnlMatKhauLayout);
        pnlMatKhauLayout.setHorizontalGroup(
            pnlMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMatKhauLayout.createSequentialGroup()
                        .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMatKhau))
                .addContainerGap())
        );
        pnlMatKhauLayout.setVerticalGroup(
            pnlMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        pnlMaQuyen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaQuyenActionPerformed(evt);
            }
        });
        pnlMaQuyen.add(txtMaQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 30));

        lblMaQuyen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaQuyen.setText("Mã quyền");
        pnlMaQuyen.add(lblMaQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 79, 16));

        ChonMaQuyen.setBackground(new java.awt.Color(204, 204, 204));
        ChonMaQuyen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChonMaQuyen.setForeground(new java.awt.Color(204, 204, 204));
        ChonMaQuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChonMaQuyenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChonMaQuyenMouseReleased(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ChonMaQuyenLayout = new javax.swing.GroupLayout(ChonMaQuyen);
        ChonMaQuyen.setLayout(ChonMaQuyenLayout);
        ChonMaQuyenLayout.setHorizontalGroup(
            ChonMaQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChonMaQuyenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ChonMaQuyenLayout.setVerticalGroup(
            ChonMaQuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChonMaQuyenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlMaQuyen.add(ChonMaQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 30, 30));

        pnlSua.setBackground(new java.awt.Color(0, 204, 204));
        pnlSua.setPreferredSize(new java.awt.Dimension(80, 24));
        pnlSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSuaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlSuaMouseReleased(evt);
            }
        });

        lblSua.setBackground(new java.awt.Color(255, 255, 255));
        lblSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSua.setForeground(new java.awt.Color(255, 255, 255));
        lblSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSua.setText("Sửa");

        javax.swing.GroupLayout pnlSuaLayout = new javax.swing.GroupLayout(pnlSua);
        pnlSua.setLayout(pnlSuaLayout);
        pnlSuaLayout.setHorizontalGroup(
            pnlSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlSuaLayout.setVerticalGroup(
            pnlSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
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
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlHuyLayout.setVerticalGroup(
            pnlHuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEditTKLayout = new javax.swing.GroupLayout(pnlEditTK);
        pnlEditTK.setLayout(pnlEditTKLayout);
        pnlEditTKLayout.setHorizontalGroup(
            pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditTKLayout.createSequentialGroup()
                .addGroup(pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditTKLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlTenTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditTKLayout.createSequentialGroup()
                        .addContainerGap(90, Short.MAX_VALUE)
                        .addComponent(pnlSua, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditTKLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditTKLayout.createSequentialGroup()
                        .addGroup(pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlMaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        pnlEditTKLayout.setVerticalGroup(
            pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditTKLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTenTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlEditTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSua, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlEditTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlEditTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        GetInput();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

    private void ChonMaNVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaNVMousePressed
        changecolor(ChonMaNV,new Color(60,63,65));
    }//GEN-LAST:event_ChonMaNVMousePressed

    private void ChonMaNVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaNVMouseReleased
        changecolor(ChonMaNV,new Color(204,204,204));
        new ChonNVForm().setVisible(true);
    }//GEN-LAST:event_ChonMaNVMouseReleased

    private void txtMaQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaQuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaQuyenActionPerformed

    private void ChonMaQuyenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaQuyenMousePressed
        changecolor(ChonMaQuyen,new Color(60,63,65));
    }//GEN-LAST:event_ChonMaQuyenMousePressed

    private void ChonMaQuyenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChonMaQuyenMouseReleased
        changecolor(ChonMaQuyen,new Color(204,204,204));
        new ChonMaQuyenForm().setVisible(true);
    }//GEN-LAST:event_ChonMaQuyenMouseReleased

    private void pnlSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuaMousePressed
        changecolor(pnlSua,new Color(0,163,163));
    }//GEN-LAST:event_pnlSuaMousePressed

    private void pnlSuaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuaMouseReleased
        changecolor(pnlSua,new Color(0,204,204));

        ThemSuaTaiKhoanForm.btnSuaMouseClicked();

        //        setTableCellAlignment(JLabel.CENTER,pTable);
    }//GEN-LAST:event_pnlSuaMouseReleased

    private void pnlHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseClicked

    }//GEN-LAST:event_pnlHuyMouseClicked

    private void pnlHuyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMousePressed
        changecolor(pnlHuy,new Color(221,0,0));
    }//GEN-LAST:event_pnlHuyMousePressed

    private void pnlHuyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHuyMouseReleased
        changecolor(pnlHuy,new Color(255,0,0));
        this.dispose();
    }//GEN-LAST:event_pnlHuyMouseReleased
    public void GetInput(){
        
        String tenTK = "";
               tenTK =  (String)TKTable.getValueAt(TKTable.getSelectedRow(), 1);
        if(tenTK == "")
        {
        JOptionPane.showMessageDialog(null, "Chưa chọn tài khoản nào để sửa");
        }
        else
        {
        SuaTK(tenTK);
        }
    }
    
//    public static void setMaNV()
//    {
//        String text = (String) SubNVTable.getValueAt(SubNVTable.getSelectedRow(), 2);
//        txMaNV.setText(text);
//    }
//    
//    public static void setMaQuyen()
//    {
//        String text = (String) SubQuyenTable.getValueAt(SubQuyenTable.getSelectedRow(), 2);
//        
//        txMaNV.setText(text);
//    }
 
    public static void SuaTK (String tendangnhap)
    {   TaiKhoan tkSua = null;
        QuanLyTaiKhoanBUS qltkBUS = new QuanLyTaiKhoanBUS();
        for (TaiKhoan tk : qltkBUS.getDstk()) {
                if (tk.getTenDangNhap().equals( tendangnhap)) {
                    tkSua = tk;
                }
            }
//            if (spSua == null) {
//                JOptionPane.showMessageDialog(null, "Lỗi, không tìm thấy sản phẩm");
//                this.dispose();
//            }

            
            txtTenTK.setText(tkSua.getTenDangNhap());
            txtMaNV.setText(tkSua.getMaNV());
            txtMatKhau.setText(String.valueOf(tkSua.getMatKhau()));
            txtMaQuyen.setText(tkSua.getMaQuyen());
    }
    
    public static void XoaTK(String matk){
        QuanLyTaiKhoanBUS qltkBUS = new QuanLyTaiKhoanBUS();
           
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn tài khoản " + matk + " ?", 
                        "Chú ý", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    qltkBUS.delete(matk);
                   
                }
            
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
            java.util.logging.Logger.getLogger(editTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editTK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChonMaNV;
    private javax.swing.JPanel ChonMaQuyen;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblHuy;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMaQuyen;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblSua;
    private javax.swing.JLabel lblTenTK;
    private javax.swing.JPanel pnlEditTK;
    private javax.swing.JPanel pnlHuy;
    private javax.swing.JPanel pnlMaNV;
    private javax.swing.JPanel pnlMaQuyen;
    private javax.swing.JPanel pnlMatKhau;
    private javax.swing.JPanel pnlSua;
    private javax.swing.JPanel pnlTenTK;
    public static javax.swing.JTextField txtMaNV;
    public static javax.swing.JTextField txtMaQuyen;
    public static javax.swing.JTextField txtMatKhau;
    public static javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}
