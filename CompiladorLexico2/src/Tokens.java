
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Tokens extends javax.swing.JFrame {
    
    private final ImageIcon icone;
    
    public Tokens() {
        initComponents();
        icone = new ImageIcon("src/icones/table.png");
        this.setIconImage(icone.getImage());
        this.setLocationRelativeTo(null);
    }
    
    public void setToken(TokenGetSet t) {
        
        DefaultTableModel modeloTok = (DefaultTableModel) TabelaTokens.getModel();
        
        for (int i = 0; i < t.getCodigo().size(); i++) {
            
            modeloTok.addRow(new Object[]{t.getLinha().get(i), t.getCodigo().get(i), t.getToken().get(i)});
        }
        if (t.getErr() != null) {
            ErroGetSet err = t.getErr();
            DefaultTableModel modeloErr = (DefaultTableModel) TabelaErro.getModel();
            for (int i = 0; i < err.getErro().size(); i++) {
                
                modeloErr.addRow(new Object[]{err.getLinha().get(i), err.getErro().get(i)});
                  TabelaPainel.setSelectedIndex(1);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabelaPainel = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaTokens = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaErro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela");

        TabelaTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linha", "Código", "Token"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTokens.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TabelaTokens);

        TabelaPainel.addTab("Tabela", jScrollPane2);

        TabelaErro.setBackground(new java.awt.Color(255, 0, 0));
        TabelaErro.setForeground(new java.awt.Color(255, 255, 255));
        TabelaErro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linha", "Erro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaErro);
        if (TabelaErro.getColumnModel().getColumnCount() > 0) {
            TabelaErro.getColumnModel().getColumn(0).setPreferredWidth(100);
            TabelaErro.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        TabelaPainel.addTab("Erros", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabelaPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabelaPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tokens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tokens().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaErro;
    private javax.swing.JTabbedPane TabelaPainel;
    private javax.swing.JTable TabelaTokens;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
