/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Entidades.Matriz;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis
 */
public class MainApp extends javax.swing.JFrame {

    int cantidadPuntos;
    DefaultTableModel modeloTabla;
    
    public MainApp() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modeloTabla = (DefaultTableModel) this.tablaCoordenadas.getModel();
        this.inputCantidadPuntos.setText("0");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCoordenadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        inputCantidadPuntos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Sx = new javax.swing.JLabel();
        Sx2 = new javax.swing.JLabel();
        Sy = new javax.swing.JLabel();
        S2x = new javax.swing.JLabel();
        S3x2 = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        s2x2 = new javax.swing.JLabel();
        s2x3 = new javax.swing.JLabel();
        Sx2y = new javax.swing.JLabel();
        Sxy = new javax.swing.JLabel();
        S3x3 = new javax.swing.JLabel();
        S3x4 = new javax.swing.JLabel();
        Sy1 = new javax.swing.JLabel();
        Sy2 = new javax.swing.JLabel();
        Sy3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        funcionLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(61, 86, 178));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(61, 86, 178));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCoordenadas.setBackground(new java.awt.Color(204, 204, 204));
        tablaCoordenadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y"
            }
        ));
        tablaCoordenadas.setOpaque(false);
        tablaCoordenadas.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tablaCoordenadas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setText("Cantidad de puntos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));
        jPanel1.add(inputCantidadPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grupo 7.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnHover.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 150, 30));

        Sx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sx.setForeground(new java.awt.Color(230, 230, 230));
        Sx.setText("0");
        jPanel1.add(Sx, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        Sx2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sx2.setForeground(new java.awt.Color(230, 230, 230));
        Sx2.setText("0");
        jPanel1.add(Sx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        Sy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sy.setForeground(new java.awt.Color(230, 230, 230));
        Sy.setText("=");
        jPanel1.add(Sy, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        S2x.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        S2x.setForeground(new java.awt.Color(230, 230, 230));
        S2x.setText("0");
        jPanel1.add(S2x, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        S3x2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        S3x2.setForeground(new java.awt.Color(230, 230, 230));
        S3x2.setText("0");
        jPanel1.add(S3x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        n.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n.setForeground(new java.awt.Color(230, 230, 230));
        n.setText("0");
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        s2x2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s2x2.setForeground(new java.awt.Color(230, 230, 230));
        s2x2.setText("0");
        jPanel1.add(s2x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        s2x3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s2x3.setForeground(new java.awt.Color(230, 230, 230));
        s2x3.setText("0");
        jPanel1.add(s2x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        Sx2y.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sx2y.setForeground(new java.awt.Color(230, 230, 230));
        Sx2y.setText("0");
        jPanel1.add(Sx2y, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        Sxy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sxy.setForeground(new java.awt.Color(230, 230, 230));
        Sxy.setText("0");
        jPanel1.add(Sxy, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        S3x3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        S3x3.setForeground(new java.awt.Color(230, 230, 230));
        S3x3.setText("0");
        jPanel1.add(S3x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        S3x4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        S3x4.setForeground(new java.awt.Color(230, 230, 230));
        S3x4.setText("0");
        jPanel1.add(S3x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        Sy1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sy1.setForeground(new java.awt.Color(230, 230, 230));
        Sy1.setText("0");
        jPanel1.add(Sy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        Sy2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sy2.setForeground(new java.awt.Color(230, 230, 230));
        Sy2.setText("=");
        jPanel1.add(Sy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        Sy3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sy3.setForeground(new java.awt.Color(230, 230, 230));
        Sy3.setText("=");
        jPanel1.add(Sy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 150)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("{");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 150)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("}");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        funcionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        funcionLabel.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(funcionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Función:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 600, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    double sumatoria(double[] array){
        double suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        
        return suma;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        double Sxi , Sxi2 , Sxi3 , Sxi4 , Syi , Sxi2yi , Sxiyi;
        
        this.modeloTabla.getDataVector().removeAllElements();
        
        try {
            cantidadPuntos = (this.inputCantidadPuntos.getText().isEmpty())?0:Integer.parseInt(this.inputCantidadPuntos.getText());
            double[] xi = new double[cantidadPuntos];
            double[] yi = new double[cantidadPuntos];
            
            double[] xi2 = new double[cantidadPuntos] , xi3 = new double[cantidadPuntos];
            double[] xi4 = new double[cantidadPuntos] , xiyi = new double[cantidadPuntos];
            double[] xi2yi = new double[cantidadPuntos];
            
            if (cantidadPuntos == 0) {
                JOptionPane.showMessageDialog(null,"Por favor ingresa un valor mayor a 0");
            }else{
                
                // Asignacion y calculo de puntos
                for (int i = 0; i < cantidadPuntos; i++) {
                    double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de X" + (i+1)));
                    double y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de Y" + (i+1)));

                    xi[i] = x ; // Valor de X
                    yi[i] = y ; // Valor de Y
                    
                                        
                    // Los valores elevados
                    xi2[i] = Math.pow(x, 2);
                    xi3[i] = Math.pow(x, 3);
                    xi4[i] = Math.pow(x, 4);
                    
                    xiyi[i] = x*y;
                    xi2yi[i] = xi2[i] * y;
                    
                    String[] datos = {
                        Double.toString(x),
                        Double.toString(y)
                    };
                    
                    this.modeloTabla.addRow(datos);
                }
            
                // Obtener sumatoria
                Sxi = sumatoria(xi); // Sumatoria de xi
                Sxi2 = sumatoria(xi2); // Sumatoria de xi^2
                Sxi3 = sumatoria(xi3); // Sumatoria de xi^3
                Sxi4 = sumatoria(xi4); // Sumatoria de xi^4
                Sxiyi = sumatoria(xiyi); // Sumatoria de xi*yi
                Sxi2yi = sumatoria(xi2yi); // Sumatoria de xi^2*yi
                Syi = sumatoria(yi);
                
                this.n.setText(Integer.toString(cantidadPuntos));
                this.Sx.setText(Double.toString(Sxi));
                this.Sx2.setText(Double.toString(Sxi2));
                this.Sy1.setText(Double.toString(Syi));
                
                this.S2x.setText(Double.toString(Sxi));
                this.s2x2.setText(Double.toString(Sxi2));
                this.s2x3.setText(Double.toString(Sxi3));
                this.Sxy.setText(Double.toString(Sxiyi));
                
                this.S3x2.setText(Double.toString(Sxi2));
                this.S3x3.setText(Double.toString(Sxi3));
                this.S3x4.setText(Double.toString(Sxi4));
                this.Sx2y.setText(Double.toString(Sxi2yi));
                
                
                 double[][] matrizSistema = {
                {
                    cantidadPuntos,
                    Sxi,
                    Sxi2
                },
                {
                    Sxi,
                    Sxi2,
                    Sxi3
                },
                {
                    Sxi2,
                    Sxi3,
                    Sxi4
                },

            };

            double[][] matrizX = {
                {
                    Syi,
                    Sxi,
                    Sxi2
                },
                {
                    Sxiyi,
                    Sxi2,
                    Sxi3
                },
                {
                    Sxi2yi,
                    Sxi3,
                    Sxi4
                },
            };

            double[][] matrizY = {
                {
                    cantidadPuntos,
                    Syi,
                    Sxi2
                },
                {
                    Sxi,
                    Sxiyi,
                    Sxi3
                },
                {
                    Sxi2,
                    Sxi2yi,
                    Sxi4
                },
            };

            double[][] matrizZ = {
                {
                    cantidadPuntos,
                    Sxi,
                    Syi
                },
                {
                    Sxi,
                    Sxi2,
                    Sxiyi
                },
                {
                    Sxi2,
                    Sxi3,
                    Sxi2yi
                },
            };
            
                double determinanteSistema = calcularDeterminante(matrizSistema);
                double determinanteX = calcularDeterminante(matrizX);
                double determinanteY = this.calcularDeterminante(matrizY);
                double determinanteZ = this.calcularDeterminante(matrizZ);
                
                double Rx , Ry , Rz;

                Rx = determinanteX / determinanteSistema;
                Ry = determinanteY / determinanteSistema;
                Rz = determinanteZ / determinanteSistema;
                
                String funcionMensaje = "";
                funcionMensaje += getTwoDecimals(Double.toString(Rx));
                funcionMensaje += (Ry > 0)?("+"+getTwoDecimals(Double.toString(Ry)) + " X"):(" "+getTwoDecimals(Double.toString(Ry)) + " X") ;
                funcionMensaje += (Rz > 0)?("+"+getTwoDecimals(Double.toString(Rz)) + " X^2"):(" "+getTwoDecimals(Double.toString(Rz)) + " X^2") ;

                System.out.println(funcionMensaje);
                
                this.funcionLabel.setText(funcionMensaje);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sucedio un error con el dato ingresado. Hazlo de nuevo");
            this.modeloTabla.getDataVector().removeAllElements();
            String[] datos = {};
            this.modeloTabla.addRow(datos);
        }
        
        this.inputCantidadPuntos.setText("0");
    }//GEN-LAST:event_jButton1ActionPerformed
     
    double calcularDeterminante(double[][] matriz){
        double resultado = 0;
        
        resultado =((matriz[0][0] * matriz[1][1]* matriz[2][2]) + (matriz[0][1] * matriz[1][2]* matriz[2][0]) +(matriz[2][1] * matriz[1][0]* matriz[0][2])) 
                   -((matriz[0][2] * matriz[1][1]* matriz[2][0])+(matriz[0][0] * matriz[2][1]* matriz[1][2])+(matriz[2][2] * matriz[1][0]* matriz[0][1]));
        
        return resultado;
    }
    
    private static String getTwoDecimals(String valor){
        DecimalFormat df = new DecimalFormat("00.00");
        return df.format(Double.parseDouble(valor));
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel S2x;
    private javax.swing.JLabel S3x2;
    private javax.swing.JLabel S3x3;
    private javax.swing.JLabel S3x4;
    private javax.swing.JLabel Sx;
    private javax.swing.JLabel Sx2;
    private javax.swing.JLabel Sx2y;
    private javax.swing.JLabel Sxy;
    private javax.swing.JLabel Sy;
    private javax.swing.JLabel Sy1;
    private javax.swing.JLabel Sy2;
    private javax.swing.JLabel Sy3;
    private javax.swing.JLabel funcionLabel;
    private javax.swing.JTextField inputCantidadPuntos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel n;
    private javax.swing.JLabel s2x2;
    private javax.swing.JLabel s2x3;
    private javax.swing.JTable tablaCoordenadas;
    // End of variables declaration//GEN-END:variables

}
