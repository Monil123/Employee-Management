/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AA
 */
public class updateform_form3 extends javax.swing.JFrame {
    
    int y=0;
    int z=0;
    int x=0;
    int w=0;

     static Connection con45;
     
    public static void connect() throws ClassNotFoundException, SQLException
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/employee";
		String user="root";
		String pass="monil";
                con45=DriverManager.getConnection(url,user,pass);
    }
    catch(Exception e){}}
    /**
     * Creates new form updateform_form3
     */
    public updateform_form3() 
    {   
         initComponents();
         b.setEditable(false);
         c.setEditable(false);
         d.setEditable(false);
         e.setEditable(false);
         f.setEditable(false);   
         this.setTitle("UPDATE EMPLOYEE");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JComboBox();
        e = new javax.swing.JTextField();
        f = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("EMPLOYEE NUMBER :");

        a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aFocusLost(evt);
            }
        });

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Employee No :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Employee Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Employee Department :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Employee Designation :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Employee Salary :");

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        update.setText("UPDATE DETAILS");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bFocusLost(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cFocusLost(evt);
            }
        });
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        d.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DIRECTOR", "CEO", "DBA", "MANAGER", "SALES MAN", " " }));
        d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dFocusLost(evt);
            }
        });

        e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eFocusLost(evt);
            }
        });

        f.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HR", "PRODUCTION", "R&D", "MANAGEMENT", "TECHNICAL", "FINANCE" }));
        f.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fFocusLost(evt);
            }
        });
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(back)
                                        .addGap(18, 18, 18)
                                        .addComponent(clear)))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d, javax.swing.GroupLayout.Alignment.TRAILING, 0, 152, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(f, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(search))
                                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(clear)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        int m=0;
        b.setEditable(false);
        int empno=0,sal=0;
        String ename=null,desig=null,dep=null;
        try{
            int h=0;
        connect();
        int x=Integer.parseInt(a.getText());
        PreparedStatement pst=con45.prepareStatement("select * from emp where empno=?");
        pst.setInt(1,x);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
               h=1;
               empno=rs.getInt(1);
               ename=rs.getString(2);
               desig=rs.getString(3);
               sal=rs.getInt(4);
               dep=rs.getString(5);
        }
        if(h==0)
        {
            a.setText("");
            JOptionPane.showMessageDialog(this,"Employee No. not found");
            a.grabFocus();
        }
        else
        {
            b.grabFocus();
            b.setText(Integer.toString(empno));
            c.setText(ename);
            switch (desig)
                {
                    case "DIRECTOR":m=0;
                        break;
                    case "CEO":m=1;
                        break;
                    case "DBA":m=2;
                        break;
                    case "MANAGER":m=3;
                        break;  
                    case "SALES MAN":m=4;
                        break; 
                }
                d.setSelectedIndex(m);
                e.setText(Integer.toString(sal));
                m=0;
            switch (dep)
                {
                    case "HR":m=0;
                        break;
                    case "PRODUCTION":m=1;
                        break;
                    case "R&D":m=2;
                        break;
                    case "MANAGEMENT":m=3;
                        break;  
                    case "TECHNICAL":m=4;
                        break; 
                    case "FINANCE":m=5;
                        break;    
                }
                f.setSelectedIndex(m);
                c.setEditable(true);
                d.setEditable(true);
                e.setEditable(true);
                f.setEditable(true);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         this.dispose();
         new form1().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
                 a.setText("");
                 b.setText("");
                 c.setText("");
                 d.setSelectedIndex(0);
                 e.setText("");
                 f.setSelectedIndex(0); 
                 b.setEditable(false);
                 c.setEditable(false);
                 d.setEditable(false);
                 e.setEditable(false);
                 f.setEditable(false);
                 a.grabFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    try
    {
    String p1=b.getText();
              String q1=c.getText();
              String r1=d.getSelectedItem().toString();
              String s1= e.getText();
              String t1=f.getSelectedItem().toString();        
    connect();
    int y=0;
    int p=Integer.parseInt(b.getText());
    String q=c.getText();
    String r=d.getSelectedItem().toString();
    int s= Integer.parseInt(e.getText());
    String t=f.getSelectedItem().toString();
    
    PreparedStatement pst=con45.prepareStatement("update emp set empno=?,ename=?,designation=?,salary=?,department=? where empno=?");
    pst.setInt(1, p);
    pst.setString(2, q);
    pst.setString(3, r);
    pst.setInt(4, s);
    pst.setString(5, t);
    pst.setInt(6,p);
     y=pst.executeUpdate();
    if(y==0)
    {
        JOptionPane.showMessageDialog(this,"Data Updation Failed");
    }
    else
    {
        JOptionPane.showMessageDialog(this,"Data Updated Successfully");
                b.setText("");
                c.setText("");
                d.setSelectedIndex(0);
                e.setText("");
                f.setSelectedIndex(0);
    }
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bFocusLost

        String p1=b.getText();
        int flag=0;
        for(int j=0;j<p1.length();j++)
        {
            if(!(Character.isDigit(p1.charAt(j))))
            {
                flag=1;
                break;
            }
        }
        if(p1.equals(""))
        {
            y=1;
            JOptionPane.showMessageDialog(this,"Employee no. can't be empty");
            b.grabFocus();
        }
        else if(flag==1)
        {
            y=1;
            JOptionPane.showMessageDialog(this,"Employee No. should be numeric only");
            b.setText("");
            b.grabFocus();
        }
        else
        {
            y=0;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bFocusLost

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cFocusLost

        if(y!=1)
        {
            String q1=c.getText();
            int flag=0;
            for(int j=0;j<q1.length();j++)
            {
                if((Character.isDigit(q1.charAt(j))))
                {
                    flag=1;
                    break;
                }
            }
            if(q1.equals(""))
            {
                z=1;
                JOptionPane.showMessageDialog(this,"Employee name can't be left blank");
                c.grabFocus();
            }
            else if(flag==1)
            {
                c.setText(q1);
                z=1;
                JOptionPane.showMessageDialog(this,"employee name can't have digits");
                c.grabFocus();
            }
            else
            {
                z=0;
            }
        }
    }//GEN-LAST:event_cFocusLost

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dFocusLost

        if((z!=1)&&(y!=1))
        {
           x=1;
            }
            else
            {    
                x=0;
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_dFocusLost

    private void eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eFocusLost

        String p1=e.getText();
        int flag=0;
        if((y!=1)&&(z!=1)&&(x!=1))
        {
            for(int j=0;j<p1.length();j++)
            {
                if(!(Character.isDigit(p1.charAt(j))))
                {
                    flag=1;
                    break;
                }
            }
            if(p1.equals(""))
            {
                w=1;
                JOptionPane.showMessageDialog(this,"Employee salary can't be empty");
                e.grabFocus();
            }
            else if(flag==1)
            {
                w=1;
                JOptionPane.showMessageDialog(this,"Employee Salary should be numeric only");
                e.setText(p1);
                e.grabFocus();
            }
            else
            {
                w=0;
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_eFocusLost

    private void fFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fFocusLost

        if((z!=1)&&(y!=1)&&(x!=1)&&(w!=1))
        {
            String hh=f.getSelectedItem().toString();
            if(hh.equals("<Department>"))
            {
                JOptionPane.showMessageDialog(this,"Select the department");
                f.grabFocus();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fFocusLost

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void aFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aFocusLost

        String j=a.getText();
        int flag=0;
        for(int i=0;i<j.length();i++)
        {
            if(!(Character.isDigit(j.charAt(i))))
            {
                flag=1;
                break;
            }
        }
        if(j.equals(""))
                {        
                     JOptionPane.showMessageDialog(this,"Enter Employee no.");
                    a.grabFocus();
                }
        else if(flag==1)
        {
            a.setText("");
            JOptionPane.showMessageDialog(this,"Alphabets not allowed");
            a.grabFocus();
        }
        // TODO addyour handling code here:
    }//GEN-LAST:event_aFocusLost

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
            java.util.logging.Logger.getLogger(updateform_form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateform_form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateform_form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateform_form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new updateform_form3().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JButton back;
    private javax.swing.JTextField c;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox d;
    private javax.swing.JTextField e;
    private javax.swing.JComboBox f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
