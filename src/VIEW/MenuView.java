package VIEW;

import DAO.ConexionDAO;
import java.awt.Component;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class MenuView extends javax.swing.JFrame {

    Connection con = new ConexionDAO().connectDB();

    public MenuView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultafinal = new javax.swing.JButton();
        refolio = new javax.swing.JButton();
        rmcancelados = new javax.swing.JButton();
        cancelados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        decancel = new com.toedter.calendar.JDateChooser();
        hastacancel = new com.toedter.calendar.JDateChooser();
        deconsul = new com.toedter.calendar.JDateChooser();
        hastaconsul = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        numcheque = new javax.swing.JTextField();
        numcheq = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        idfactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        consultafinal.setText("Facturas");
        consultafinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultafinalActionPerformed(evt);
            }
        });

        refolio.setText("Re-Ordenar nuncheque");
        refolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refolioActionPerformed(evt);
            }
        });

        rmcancelados.setText("Remover no facturados");
        rmcancelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmcanceladosActionPerformed(evt);
            }
        });

        cancelados.setText("Cheques no facturados");
        cancelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceladosActionPerformed(evt);
            }
        });

        jLabel1.setText("Desde");

        jLabel3.setText("Hasta");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("Consultar cheques ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        numcheq.setText("Numcheque");

        jButton2.setText("Re-Oredenar folioFacturas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Factura");

        jButton3.setText("Consultar facturas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(4, 4, 4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hastacancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(decancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cancelados, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rmcancelados, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refolio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numcheq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deconsul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultafinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hastaconsul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelados)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refolio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hastacancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rmcancelados))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numcheq)
                                    .addComponent(idfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(consultafinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deconsul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hastaconsul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rmcanceladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmcanceladosActionPerformed
        delcancelados();
    }//GEN-LAST:event_rmcanceladosActionPerformed

    private void refolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refolioActionPerformed
        refolio();
    }//GEN-LAST:event_refolioActionPerformed

    private void consultafinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultafinalActionPerformed
        queryfinal();
    }//GEN-LAST:event_consultafinalActionPerformed

    private void canceladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceladosActionPerformed
        cancelados();
    }//GEN-LAST:event_canceladosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chequesconsulta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        foliofacturas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        facturasconsulta();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelados;
    private javax.swing.JButton consultafinal;
    private com.toedter.calendar.JDateChooser decancel;
    private com.toedter.calendar.JDateChooser deconsul;
    private com.toedter.calendar.JDateChooser hastacancel;
    private com.toedter.calendar.JDateChooser hastaconsul;
    private javax.swing.JTextField idfactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numcheq;
    private javax.swing.JTextField numcheque;
    private javax.swing.JButton refolio;
    private javax.swing.JButton rmcancelados;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    public String cancelados() {

        SimpleDateFormat dateFormatde = new SimpleDateFormat("yyyy/MM/dd");
        String decanceldate = dateFormatde.format(decancel.getDate());

        SimpleDateFormat dateFormathast = new SimpleDateFormat("yyyy/MM/dd");
        String hastacanceldate = dateFormathast.format(hastacancel.getDate());

        String sql = "select * from cheques where cancelado = 1\n"
                + "and fecha >='" + decanceldate + "' \n"
                + "AND fecha <='" + hastacanceldate + "'";
        System.out.println(sql);
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            // Obtenha metadados
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Crie um array para os nomes das colunas
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = rsmd.getColumnName(i);
            }

            // Crie o modelo da tabela com os nomes das colunas
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            table.setModel(model);

            // Adicione linhas à tabela
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                tableColumn.setMinWidth(100);
            }

            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < table.getRowCount(); row++) {
                    TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                    Component c = table.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    if (preferredWidth >= maxWidth) {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth(preferredWidth);
            }

            table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

        } catch (SQLException ex) {
            System.err.println("Erro ao executar a consulta: " + ex.getMessage());
        }
        return sql;

    }

    public void delcancelados() {
        SimpleDateFormat dateFormatde = new SimpleDateFormat("yyyy-MM-dd");
        String dermcanceldate = dateFormatde.format(decancel.getDate());

        SimpleDateFormat dateFormathast = new SimpleDateFormat("yyyy-MM-dd");
        String hastarmcanceldate = dateFormathast.format(hastacancel.getDate());

        String sql = "DELETE FROM cheques \n"
                + "WHERE cancelado = 1\n"
                + "and fecha >='" + dermcanceldate + "' \n"
                + "AND fecha <='" + hastarmcanceldate + "'";

        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            st.executeUpdate();
            cancelados();

        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void queryfinal() {
        SimpleDateFormat dateFormatde = new SimpleDateFormat("yyyy-MM-dd");
        String deconsuldate = dateFormatde.format(deconsul.getDate());

        SimpleDateFormat dateFormathast = new SimpleDateFormat("yyyy-MM-dd");
        String hastaconsuldate = dateFormathast.format(hastaconsul.getDate());

        String sql = "Select\n"
                + "    \n"
                + "'001' as estab ,\n"
                + "    '001' as ptoEmi,\n"
                + "    Fact.folio as secuencial, CONVERT(varchar, Fact.fecha, 103) as fechaEmision, \n"
                + "    Cli.idtipocliente as tipoIdentificacionComprador,\n"
                + "    Replace(Cli.nombre,',',' ') as razonSocialComprador, \n"
                + "    LEN(LTRIM(Fact.idcliente)) as 'Char_Count',\n"
                + "    Fact.idcliente as identificacionComprador, \n"
                + "    CAST((Fact.subtotal-Fact.propina) as NUMERIC(5,2)) as totalSinImpuestos,\n"
                + "    Mov.descuento as totalDescuento, CAST(Fact.total as NUMERIC(5,2)) as total, \n"
                + "    '2' as codigoimpuesto, '4' as codigoPorcentaje,\n"
                + "    '0.00' as descuentoAdicional, CAST(Fact.impuesto as NUMERIC(5,2)) as valor, \n"
                + "    CAST(Fact.propina as NUMERIC(5,2)) as propina,\n"
                + "    Total=CAST((Fact.total) as NUMERIC(5,2)), \n"
                + "    case \n"
                + "	 when c.numcheque is not NULL AND c.efectivo <> '0,00' then '1'\n"
                + "     when c.numcheque is not NULL AND c.tarjeta <> '0,00' then '19' \n"
                + "	 when c.numcheque is not NULL AND c.otros <> '0,00' then '20'\n"
                + "	 else '20'   \n"
                + "    END as formaPago,\n"
                + "	CAST(Fact.total as NUMERIC(5,2)) as total17, \n"
                + "    Mov.idproducto as codigoPrincipal, Replace(Mov.descripcion,',',' ') as descripcion,\n"
                + "    CAST(Mov.cantidad as NUMERIC(5,1)) as cantidad, '0.00' as descuento, \n"
                + "    CAST(Mov.precio as NUMERIC(5,2)) as precioUnitario,\n"
                + "    precioTotalSinImpuesto=CAST((cantidad*precio) as NUMERIC(5,2)), \n"
                + "    '2' as codigoImpuestoLinea, '4' as codigoPorcentajeLinea,\n"
                + "    '15' as tarifaLinea, valorimpuesto=CAST((Mov.precio*Mov.cantidad)*15/100 as NUMERIC(5,2)), \n"
                + "    Replace(Cli.direccion,',','CC.LA ESPANOLA URB LA JOYA') as direccion, \n"
                + "    Cli.telefono1 as telefono, Replace(Cli.email,' ','cajajoya.global@gmail.com') as email,\n"
                + "    'PATA-LAJOYA S.A.' as nombre_local,\n"
                + "    '0993298263001' as ruc_local\n"
                + "    from facturasmovtos as Mov\n"
                + "	left join (select * , substring(Left(\n"
                + "             SubString(nota, PatIndex('%[0-9.-]%', nota), 8000), \n"
                + "             PatIndex('%[^0-9.-]%', SubString(nota, PatIndex('%[0-9.-]%', nota), 8000) + 'X')-1), 2, 50) as fnumcheque from facturas) Fact on Mov.idfactura = Fact.idfactura\n"
                + "    left JOIN cheques c ON   c.numcheque = Fact.fnumcheque\n"
                + "	--LEFT JOIN facturas as Fact on Mov.idfactura = Fact.idfactura\n"
                + "    LEFT JOIN clientes as Cli on Fact.idcliente = Cli.idcliente\n"
                + "	 WHERE\n"
                + "     (Fact.fecha BETWEEN CONVERT(datetimeoffset, '" + deconsuldate + " 00:00:00') \n"
                + "     AND CONVERT(datetimeoffset, '" + hastaconsuldate + " 00:00:00'))\n"
                + "    AND Fact.subtotal != 0\n"
                + "           order by Mov.idfactura";
        System.out.println(sql);
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            // Obtenha metadados
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Crie um array para os nomes das colunas
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = rsmd.getColumnName(i);
            }

            // Crie o modelo da tabela com os nomes das colunas
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            table.setModel(model);

            // Adicione linhas à tabela
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                tableColumn.setMinWidth(100);
            }

            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < table.getRowCount(); row++) {
                    TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                    Component c = table.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    if (preferredWidth >= maxWidth) {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth(preferredWidth);
            }

            table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

        } catch (SQLException ex) {
            System.err.println("Erro ao executar a consulta: " + ex.getMessage());
        }
    }

    public void refolio() {
        SimpleDateFormat dateFormatde = new SimpleDateFormat("yyyy/MM/dd");
        String decanceldate = dateFormatde.format(decancel.getDate());

        String sql = "DECLARE @fecha date = '" + decanceldate + "';\n"
                + "DECLARE @numcheque int = " + numcheque.getText() + ";\n"
                + "SELECT @numcheque = numcheque\n"
                + "FROM cheques\n"
                + "WHERE numcheque = @numcheque;\n"
                + "WITH CTE AS (\n"
                + "    SELECT\n"
                + "        *,\n"
                + "        ROW_NUMBER() OVER (ORDER BY numcheque) + (@numcheque - 1) AS NewFolio\n"
                + "    FROM\n"
                + "        cheques\n"
                + "    WHERE\n"
                + "        numcheque >= @numcheque and  fecha >= @fecha)\n"
                + "UPDATE CTE\n"
                + "SET numcheque = NewFolio;\n"
                + "UPDATE folios\n"
                + "SET ultimofolio = (SELECT TOP 1 numcheque FROM cheques order by cheques.numcheque desc)";
        System.out.println(sql);
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("Erro ao executar a consulta: " + ex.getMessage());
        }

    }

    private void chequesconsulta() {

        SimpleDateFormat dateFormatde = new SimpleDateFormat("yyyy-MM-dd");
        String deconsuldate = dateFormatde.format(decancel.getDate());

        SimpleDateFormat dateFormathast = new SimpleDateFormat("yyyy-MM-dd");
        String hastaconsuldate = dateFormathast.format(hastacancel.getDate());

        String sql = "Select * from cheques WHERE fecha >= '" + deconsuldate + "' AND fecha <= '" + hastaconsuldate + "';";
        System.out.println(sql);
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            // Obtenha metadados
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Crie um array para os nomes das colunas
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = rsmd.getColumnName(i);
            }

            // Crie o modelo da tabela com os nomes das colunas
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            table.setModel(model);

            // Adicione linhas à tabela
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                tableColumn.setMinWidth(100);
            }

            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < table.getRowCount(); row++) {
                    TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                    Component c = table.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    if (preferredWidth >= maxWidth) {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth(preferredWidth);
            }

            table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

        } catch (SQLException ex) {
            System.err.println("Erro ao executar a consulta: " + ex.getMessage());
        }

    }

    private void foliofacturas() {
        String sql = "Declare @idfactura int  = " + idfactura.getText() + " -- <--SUBSTITUIR POR EL ID DESEADO\n"
                + "DECLARE @fecha date= (SELECT fecha\n"
                + "FROM facturas\n"
                + "WHERE idfactura = @idfactura);\n"
                + "DECLARE @serie int = (SELECT serie\n"
                + "FROM facturas\n"
                + "WHERE idfactura = @idfactura);\n"
                + "DECLARE @folio int;\n"
                + "SELECT @folio = folio\n"
                + "FROM facturas\n"
                + "WHERE idfactura = @idfactura and fecha >= @fecha;\n"
                + "WITH CTE AS (\n"
                + "    SELECT\n"
                + "        *,\n"
                + "        ROW_NUMBER() OVER (ORDER BY folio) + (@folio - 1) AS NewFolio\n"
                + "    FROM\n"
                + "        facturas\n"
                + "    WHERE\n"
                + "        folio >= @folio and fecha > @fecha)\n"
                + "UPDATE CTE\n"
                + "SET folio = NewFolio;\n"
                + "UPDATE foliosfacturas\n"
                + "SET ultimofolio = (SELECT TOP 1 folio FROM facturas order by facturas.idfactura desc)\n"
                + "WHERE @serie = foliosfacturas.serie;\n"
                + "select *from foliosfacturas";

        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

        } catch (SQLException error) {

        }

    }

    private void facturasconsulta() {
        String sql = "select * from facturas;";
        System.out.println(sql);
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            // Obtenha metadados
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Crie um array para os nomes das colunas
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = rsmd.getColumnName(i);
            }

            // Crie o modelo da tabela com os nomes das colunas
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            table.setModel(model);

            // Adicione linhas à tabela
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                tableColumn.setMinWidth(100);
            }

            for (int column = 0; column < table.getColumnCount(); column++) {
                TableColumn tableColumn = table.getColumnModel().getColumn(column);
                int preferredWidth = tableColumn.getMinWidth();
                int maxWidth = tableColumn.getMaxWidth();

                for (int row = 0; row < table.getRowCount(); row++) {
                    TableCellRenderer cellRenderer = table.getCellRenderer(row, column);
                    Component c = table.prepareRenderer(cellRenderer, row, column);
                    int width = c.getPreferredSize().width + table.getIntercellSpacing().width;
                    preferredWidth = Math.max(preferredWidth, width);

                    if (preferredWidth >= maxWidth) {
                        preferredWidth = maxWidth;
                        break;
                    }
                }

                tableColumn.setPreferredWidth(preferredWidth);
            }

            table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

        } catch (SQLException ex) {
            System.err.println("Erro ao executar a consulta: " + ex.getMessage());
        }
    }

}
