/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atweb_csdl;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FormQLLop extends javax.swing.JFrame {
    Vector<NhanVien> nhanVien = new Vector();
    private final String maNV;
    private boolean change = false,add = false;
    private ConnectDB conn = new ConnectDB();
    private DefaultTableModel tableModel = new DefaultTableModel();
    Home h = new Home();
    /**
     * Creates new form FormQLLop
     */
    
    
    public FormQLLop(Vector<NhanVien> nv, String user) {       
        initComponents();
        this.maNV = user;
        jLabel_inThongTinTenNV.setText(this.maNV);
        setResizable(false);
        setLocationRelativeTo(this);
        layTTLop();
        khoaThongTinLop();
        this.nhanVien = nv;
    }
    
    private void layTTLop(){
        Connection connect = ConnectDB.SQLConnect();//KT ket noi
        String sql;
        if(maNV.equals("NV01")){
            sql = "SELECT LP.MALOP, LP.TENLOP,LP.MANV, NV.HOTEN, (SELECT COUNT(MALOP) FROM SINHVIEN SV) AS SLSV "
                    + " FROM NHANVIEN NV, LOP LP" + " WHERE NV.MANV = LP.MANV";
        }else{
            sql = "SELECT LP.MALOP, LP.TENLOP,LP.MANV, NV.HOTEN, (SELECT COUNT(MALOP) FROM SINHVIEN SV) AS SLSV "
                    + "FROM NHANVIEN NV, LOP LP WHERE NV.MANV = LP.MANV AND NV.MANV = '" + this.maNV + "'";
        }
        duaDulieuLen(sql);        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_MHQLL = new javax.swing.JLabel();
        jLabel_inThongTinTenNV = new javax.swing.JLabel();
        jLabel_trove = new javax.swing.JLabel();
        jPanel_ThongTin = new javax.swing.JPanel();
        jScrollPane_TTL = new javax.swing.JScrollPane();
        jTable_TTL = new javax.swing.JTable();
        jLabel_ML = new javax.swing.JLabel();
        jTextField_ML = new javax.swing.JTextField();
        jLabel_TL = new javax.swing.JLabel();
        jTextField_TL = new javax.swing.JTextField();
        jToggleButton_them = new javax.swing.JToggleButton();
        jToggleButton_xoa = new javax.swing.JToggleButton();
        jToggleButton_chinhsua = new javax.swing.JToggleButton();
        jToggleButton_huy = new javax.swing.JToggleButton();
        jToggleButton_luu = new javax.swing.JToggleButton();
        jTextField_timkiem = new javax.swing.JTextField();
        jToggleButton_timkiem = new javax.swing.JToggleButton();
        jLabel_MNV = new javax.swing.JLabel();
        jTextField_MNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel_MHQLL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_MHQLL.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MHQLL.setText("QUẢN LÝ LỚP");

        jLabel_inThongTinTenNV.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel_inThongTinTenNV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_inThongTinTenNV.setText("in thông tin QL");

        jLabel_trove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_trove.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_trove.setText("X");
        jLabel_trove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_troveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_inThongTinTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309)
                .addComponent(jLabel_MHQLL, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_trove)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_inThongTinTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MHQLL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_trove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel_ThongTin.setBackground(new java.awt.Color(204, 204, 255));

        jTable_TTL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable_TTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Lớp", "Tên Lớp", "Sỉ số"
            }
        ));
        jTable_TTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTLMouseClicked(evt);
            }
        });
        jScrollPane_TTL.setViewportView(jTable_TTL);

        jLabel_ML.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_ML.setText("MÃ LỚP:");

        jLabel_TL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_TL.setText("TÊN LỚP:");

        jToggleButton_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jToggleButton_them.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_themActionPerformed(evt);
            }
        });

        jToggleButton_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/del.png"))); // NOI18N
        jToggleButton_xoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_xoaActionPerformed(evt);
            }
        });

        jToggleButton_chinhsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jToggleButton_chinhsua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton_chinhsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_chinhsuaActionPerformed(evt);
            }
        });

        jToggleButton_huy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        jToggleButton_huy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_huyActionPerformed(evt);
            }
        });

        jToggleButton_luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jToggleButton_luu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_luuActionPerformed(evt);
            }
        });

        jToggleButton_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jToggleButton_timkiem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_timkiemActionPerformed(evt);
            }
        });

        jLabel_MNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_MNV.setText("MANV:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thêm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Xóa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sửa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LƯU");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HỦY");

        javax.swing.GroupLayout jPanel_ThongTinLayout = new javax.swing.GroupLayout(jPanel_ThongTin);
        jPanel_ThongTin.setLayout(jPanel_ThongTinLayout);
        jPanel_ThongTinLayout.setHorizontalGroup(
            jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane_TTL, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                                .addComponent(jLabel_ML, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ML, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_TL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_TL, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton_them, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToggleButton_chinhsua, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ThongTinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton_luu, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton_huy, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73))))
        );
        jPanel_ThongTinLayout.setVerticalGroup(
            jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                                        .addComponent(jToggleButton_them, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ThongTinLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jToggleButton_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)))
                                .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_ML, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ML, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                                .addComponent(jToggleButton_chinhsua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_TL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_TL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_MNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton_luu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_huy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel_ThongTinLayout.createSequentialGroup()
                        .addGroup(jPanel_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane_TTL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void hienThongTinLop(){
        jTextField_ML.setEnabled(true);
        jTextField_TL.setEnabled(true);
        jTextField_MNV.setEnabled(true);
    }
    
    private void khoaThongTinLop(){
        jTextField_ML.setEnabled(false);
        jTextField_TL.setEnabled(false);
        jTextField_MNV.setEnabled(false);
        jToggleButton_luu.setEnabled(false);
        jToggleButton_huy.setEnabled(false);
    }
    
    private void reset(){
        add=false;
        change=false;
        jTextField_ML.setText("");
        jTextField_TL.setText("");
        jTextField_MNV.setText(h.getMaNVFromDatabase(new NhanVien().getTenDN()));
        jToggleButton_chinhsua.setEnabled(false);
        jToggleButton_xoa.setEnabled(false);
        jToggleButton_luu.setEnabled(false);
        jToggleButton_huy.setEnabled(false);
        jToggleButton_them.setEnabled(true);
    }
    
    private void setTenDN(String ma){
        Connection connect = null;
        connect = conn.SQLConnect();//KT ket noi
        String sql = "SELECT * FROM LOP WHERE MANV = '" + ma +"'";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                jTextField_ML.setText(rs.getString("MALOP").trim());
                jTextField_TL.setText(rs.getString("TENLOP").trim());
                jTextField_TL.setText(rs.getString("MANV").trim());
            }
            ps.close();
            rs.close();
            connect.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private boolean kiemTraRong(){
        if(jTextField_ML.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã lớp kìa!");
            return false;
        }
        else if(jTextField_TL.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên lớp kìa!");
            return false;
        }
        else if(jTextField_MNV.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Chi duoc nhap ma nv "+new NhanVien().getMaNV()+" !");
            return false;
        }
        return true;
    }
    
    private boolean kiemTraTrung(){
        
        Connection connect = conn.SQLConnect();//KT ket noi
        String sql = "SELECT * FROM LOP";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                if(rs.getString("MALOP").toString().trim().equals(jTextField_ML.getText()))
                {
                    JOptionPane.showMessageDialog(this, "Mã lớp này có rồi nhập cái khác đi!");
                    return false;
                }
                else if(rs.getString("TENLOP").toString().trim().equals(jTextField_TL.getText()))
                {
                    JOptionPane.showMessageDialog(this, "Tên lớp này có rồi nhập cái khác đi");
                    return false;
                }
            }
            ps.close();
            rs.close();
            connect.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        return true;
    }
    
    private int kiemTraTonTai(String maL)
    {
        Connection connect = conn.SQLConnect();//KT ket noi
        int tonTai = 0;
        String sql = "SELECT * FROM LOP WHERE MALOP = '" + maL /*+"' AND TENLOP = N'"+ tl */+"'";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                tonTai = 1;
            }
            rs.close();
            ps.close();
            connect.close();
        } catch (Exception e) {
             System.out.println(e);
        }
        return tonTai;
    }
    
    private void ThemLop(String ML, String TL, String mnv){
        Connection connect = conn.SQLConnect();//KT ket noi
        String sql="INSERT INTO LOP (MALOP,TENLOP,MANV) "
                  + " VALUES ('"+ML+"',N'"+TL+"','"+mnv+"')";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
           
            ps.executeUpdate();
            ps.close();
            connect.close();
            
        } catch (Exception e){ 
            e.printStackTrace();
        }
    }
    
    private void suaLop(String ML , String TL, String mnv){
        Connection connect = conn.SQLConnect();//KT ket noi
        
        String sql="UPDATE LOP SET LOP.TENLOP = N'"+TL+"' WHERE LOP.MALOP = '"+ML+"' AND LOP.MANV = '"+mnv+"'";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
            
            ps.executeUpdate();
            ps.close();
            connect.close();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void xoaLop(String ML){
        Connection connect = conn.SQLConnect();//KT ket noi
        String sql="DELETE FROM LOP WHERE MALOP='"+ML+"'";
        try {
            PreparedStatement ps = connect.prepareStatement(sql);
           
            ps.executeUpdate();
            ps.close();
            connect.close();
            
        } catch (Exception e){ 
            System.out.println(e);
        }
    }
    
    private void jToggleButton_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_themActionPerformed
        // TODO add your handling code here:
        reset();
        add=true;
        hienThongTinLop();
        jToggleButton_them.setEnabled(false);
        jToggleButton_luu.setEnabled(true);
        jToggleButton_huy.setEnabled(true);
    }//GEN-LAST:event_jToggleButton_themActionPerformed

    private void jToggleButton_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_xoaActionPerformed

        int kt = 0;
        if(jTextField_ML.getText().equals("") && jTextField_TL.getText().equals("") && jTextField_MNV.getText().equals(""))
        {
            kt = 1;
            JOptionPane.showMessageDialog(this, "Chọn lớp muốn xóa!");
        }
        else if( kt != 1)
        {
            int click = JOptionPane.showConfirmDialog(null , "XOÁ LỚP NÀY? " ,"Thông báo",2);
            if(click == JOptionPane.YES_OPTION)
            {
                xoaLop(jTextField_ML.getText());
                JOptionPane.showMessageDialog(this, "Bay màu!"); 
                reset();
                this.layTTLop();
                khoaThongTinLop();
                jToggleButton_chinhsua.setEnabled(true);
                jToggleButton_xoa.setEnabled(true);
            }
            else if( click ==JOptionPane.CANCEL_OPTION)
            {
                reset();
                jToggleButton_chinhsua.setEnabled(true);
                jToggleButton_xoa.setEnabled(true);
                return;
            }   
        }
    }//GEN-LAST:event_jToggleButton_xoaActionPerformed

    private void jToggleButton_chinhsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_chinhsuaActionPerformed

        int kt = 0;
        if(jTextField_ML.getText().equals("") && jTextField_TL.getText().equals("") && jTextField_MNV.getText().equals(""))
        {
            kt = 1;
            JOptionPane.showMessageDialog(this, "Chọn lop muốn sửa!");
        }
        else if( kt != 1)
        {
            add=false;
            change=true;
            hienThongTinLop();
            jTextField_ML.setEnabled(false);
            jTextField_MNV.setEnabled(false);
            jToggleButton_them.setEnabled(false);
            jToggleButton_xoa.setEnabled(false);
            jToggleButton_chinhsua.setEnabled(false);
            jToggleButton_luu.setEnabled(true);
            jToggleButton_huy.setEnabled(true);
        }   
    }//GEN-LAST:event_jToggleButton_chinhsuaActionPerformed

    private void jToggleButton_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_huyActionPerformed
        // TODO add your handling code here
        reset();
        jToggleButton_chinhsua.setEnabled(true);
        jToggleButton_xoa.setEnabled(true);
       
        khoaThongTinLop();
        layTTLop();
    }//GEN-LAST:event_jToggleButton_huyActionPerformed
    
    private void jToggleButton_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_luuActionPerformed
        
        String ml = jTextField_ML.getText();
        String tl = jTextField_TL.getText();
        String manv = jTextField_MNV.getText();
        
        try {
            if(add == true){
                if(kiemTraRong() == true && kiemTraTrung() == true ){
                    int click = JOptionPane.showConfirmDialog(null , "THÊM LỚP NÀY? " ,"Thông báo",2);
                    if(click == JOptionPane.YES_OPTION)
                    {
                        ThemLop(ml.toUpperCase(), tl.toUpperCase(), manv.toUpperCase());
                        JOptionPane.showMessageDialog(this, "Thêm LOP ok á!");
                        reset();
                        this.layTTLop();
                        khoaThongTinLop();
                        jToggleButton_chinhsua.setEnabled(true);
                        jToggleButton_xoa.setEnabled(true);
                    }
                    else if( click ==JOptionPane.CANCEL_OPTION)
                    {
                        return;
                    }
                }
            }
            else
            if(change == true){
                if(kiemTraRong() == true && kiemTraTonTai(ml)== 1 ){
                    int click = JOptionPane.showConfirmDialog(null , "SỬA LỚP NÀY? " ,"Thông báo",2);
                    if(click == JOptionPane.YES_OPTION)
                    {
                        suaLop(ml.toUpperCase(), tl.toUpperCase(), manv.toUpperCase());
                        JOptionPane.showMessageDialog(this, "Cập nhật LỚP ok á!");
                        reset();
                        this.layTTLop();
                        khoaThongTinLop();
                        jToggleButton_chinhsua.setEnabled(true);
                        jToggleButton_xoa.setEnabled(true);
                    }
                    else if(click == JOptionPane.CANCEL_OPTION)
                    {
                        return;
                    }
                }
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jToggleButton_luuActionPerformed

    private void jTable_TTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTLMouseClicked
        // TODO add your handling code here:
        int i = jTable_TTL.getSelectedRow();
        tableModel = (DefaultTableModel)jTable_TTL.getModel();
        jTextField_ML.setText(tableModel.getValueAt(i,0).toString());
        jTextField_TL.setText(tableModel.getValueAt(i, 1).toString());
        jTextField_MNV.setText(tableModel.getValueAt(i, 2).toString());
        
        setTenDN(tableModel.getValueAt(i,0).toString());
    }//GEN-LAST:event_jTable_TTLMouseClicked

    private void jToggleButton_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_timkiemActionPerformed
        // TODO add your handling code here:
        
        String sql = "SELECT * FROM LOP WHERE MALOP LIKE '%"+jTextField_timkiem.getText()
                +"%' AND LOP.MANV LIKE '%"+jTextField_MNV.getText()
                +"%' OR TENLOP like N'%"+jTextField_timkiem.getText()
                +"%' AND LOP.MANV LIKE '%"+jTextField_MNV.getText()
                +"%'";
        duaDulieuLen(sql);
        jTextField_timkiem.setText("");
        
    }//GEN-LAST:event_jToggleButton_timkiemActionPerformed
    
    
    private void jLabel_troveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_troveMouseClicked
        // TODO add your handling code here:
        dispose(); 
        NhanVien nv = new NhanVien();
        Home home = new Home(h.getTenNV(),h.getMatKhauNV());
        home.setVisible(true);
    }//GEN-LAST:event_jLabel_troveMouseClicked
    
    private void duaDulieuLen(String sql)
    {
        String []colsName = {"Mã Lớp", "Tên Lớp","Mã Nhân viên"};
        tableModel.setColumnIdentifiers(colsName); 
        tableModel.setRowCount(0);
        
        Vector vt ;
        Connection connect = null;
        connect = conn.SQLConnect();//KT ket noi
        try
        {
            PreparedStatement ps = connect.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                vt = new Vector();
                vt.add(rs.getString("MALOP"));// lấy dữ liệu Mã Lớp
                vt.add(rs.getString("TENLOP"));
                vt.add(rs.getString("MANV"));
                tableModel.addRow(vt);
            }
            jTable_TTL.setModel(tableModel); 
            tableModel.fireTableDataChanged();
            
            //ẩn column TENDN
            int i = jTable_TTL.getSelectedRow();
            jTable_TTL.getColumnModel().getColumn(2).setMinWidth(0);
            jTable_TTL.getColumnModel().getColumn(2).setMaxWidth(0);
            
            ps.close();
            rs.close();
            connect.close();
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_MHQLL;
    private javax.swing.JLabel jLabel_ML;
    private javax.swing.JLabel jLabel_MNV;
    private javax.swing.JLabel jLabel_TL;
    private javax.swing.JLabel jLabel_inThongTinTenNV;
    private javax.swing.JLabel jLabel_trove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_ThongTin;
    private javax.swing.JScrollPane jScrollPane_TTL;
    private javax.swing.JTable jTable_TTL;
    private javax.swing.JTextField jTextField_ML;
    private javax.swing.JTextField jTextField_MNV;
    private javax.swing.JTextField jTextField_TL;
    private javax.swing.JTextField jTextField_timkiem;
    private javax.swing.JToggleButton jToggleButton_chinhsua;
    private javax.swing.JToggleButton jToggleButton_huy;
    private javax.swing.JToggleButton jToggleButton_luu;
    private javax.swing.JToggleButton jToggleButton_them;
    private javax.swing.JToggleButton jToggleButton_timkiem;
    private javax.swing.JToggleButton jToggleButton_xoa;
    // End of variables declaration//GEN-END:variables

}
