/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tryproject;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author m17
 */
public class new_entry extends javax.swing.JFrame {

    /**
     * Creates new form new_entry
     */
    String q;
    public new_entry() {
        initComponents();
        String pp="gh";
        try {
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "qwerty");
            Statement s=(Statement)con.createStatement();
            ResultSet rs;
            rs = s.executeQuery("Select * from organization");
            while(rs.next()){
                pp = rs.getString("Org_Name");
            }
            
        }catch (Exception e) {
        }
        host.setText(pp);
        String p = "ad";
        int cnt = 0;
        try {
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "qwerty");
            Statement s=(Statement)con.createStatement();
            ResultSet rs;
            rs = s.executeQuery("Select * from patient");
            cnt = 0;
            while(rs.next()){
                p = rs.getString("Reg_No");
                cnt++;
            }
            
        }catch (Exception e) {
        }
        q = "" + cnt + "";
        Reg_No.setText(q);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        int screenWidth = dimension.width;
        int screenHeight = dimension.height;
        setSize(dimension);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon(getClass().getResource("/tryproject/bkground.jpg")));
        add(background);
        background.setLayout(new FlowLayout());
        Date date = new Date();
        jLabel2.setText(date.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        host = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Reg_No = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Type_Of_Ward = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Disease = new javax.swing.JTextField();
        Entry_Date = new javax.swing.JTextField();
        Bed_Number = new javax.swing.JTextField();
        Initial_Charge = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        host.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        host.setForeground(new java.awt.Color(255, 255, 0));
        host.setText("D.M.H. Hospital");
        getContentPane().add(host);
        host.setBounds(410, 40, 240, 41);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 153));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(890, 50, 345, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Regestration Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 130, 180, 22);

        Reg_No.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reg_No.setForeground(new java.awt.Color(0, 204, 0));
        Reg_No.setText("num");
        getContentPane().add(Reg_No);
        Reg_No.setBounds(580, 130, 60, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 170, 100, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 210, 80, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Disease");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 250, 100, 22);

        Gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(51, 102, 0));
        Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(Gender);
        Gender.setBounds(580, 290, 100, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 290, 100, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Entry Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(320, 340, 110, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Type of Ward");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 380, 130, 22);

        Type_Of_Ward.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Type_Of_Ward.setForeground(new java.awt.Color(51, 102, 0));
        Type_Of_Ward.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General Ward", "ICU" }));
        getContentPane().add(Type_Of_Ward);
        Type_Of_Ward.setBounds(580, 380, 140, 28);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Bed Number");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 440, 120, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Initial Charge");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 480, 130, 22);

        Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(Name);
        Name.setBounds(580, 170, 160, 30);

        Age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Age.setForeground(new java.awt.Color(0, 204, 0));
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });
        getContentPane().add(Age);
        Age.setBounds(580, 210, 120, 30);

        Disease.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Disease.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(Disease);
        Disease.setBounds(580, 250, 190, 28);

        Entry_Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Entry_Date.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(Entry_Date);
        Entry_Date.setBounds(580, 340, 130, 28);

        Bed_Number.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bed_Number.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(Bed_Number);
        Bed_Number.setBounds(580, 440, 110, 28);

        Initial_Charge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Initial_Charge.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(Initial_Charge);
        Initial_Charge.setBounds(580, 480, 110, 28);

        Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 102, 102));
        Add.setText("Add Patient");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(400, 530, 120, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 530, 100, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        try {
            String sql;
            Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "qwerty");
            Statement s=(Statement)con.createStatement();
            String name,age,dis,gen,e_date,ward_type,bed_num;
            String init_charge;
            name = Name.getText();
            age = Age.getText();
            dis = Disease.getText();
            gen = Gender.getSelectedItem().toString();
            e_date = Entry_Date.getText();
            ward_type = Type_Of_Ward.getSelectedItem().toString();
            bed_num = Bed_Number.getText();
//            System.out.println(q + bed_num+ward_type);
            init_charge = Initial_Charge.getText();
            sql ="INSERT INTO patient VALUES('"+q+"','"+name+"','"+age+"','"+gen+"','"+dis+"','"+e_date+"',NULL)";
            s.executeUpdate(sql);
            sql = "Update bed set Status = 'occupied' where Bed_No = '"+bed_num+"'";
            s.executeUpdate(sql);
            sql = "Insert into track values('"+q+"','"+e_date+"','"+ward_type+"','"+bed_num+"')";
            s.executeUpdate(sql);
            sql = "Insert into charges values('"+q+"','"+init_charge+"','0','0','0','"+init_charge+"')";
            s.executeUpdate(sql);
            
            
           // System.out.println(s);
        } catch (Exception e) {
        }
        
        
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame,"Information of Patient is added");
        setVisible(false);
        new homepage().setVisible(true);
    }//GEN-LAST:event_AddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new homepage().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Bed_Number;
    private javax.swing.JTextField Disease;
    private javax.swing.JTextField Entry_Date;
    private javax.swing.JComboBox Gender;
    private javax.swing.JTextField Initial_Charge;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Reg_No;
    private javax.swing.JComboBox Type_Of_Ward;
    private javax.swing.JLabel host;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
