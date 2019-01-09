package view;

//import control.Carta;
import control.Par;
import dao.NewHibernateUtil;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import model.SessionManipulacao;

public class Principal extends javax.swing.JFrame {
    
    DefaultTableModel dtmPar;
    Par[] vetorPar;
    JFileChooser fileImgA;
    JFileChooser fileImgB;
    JFileChooser fileAudio;
    int idAutoIncrement=1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIdPar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnImagemA = new javax.swing.JButton();
        btnAudioA = new javax.swing.JButton();
        txtDirImagemA = new javax.swing.JTextField();
        txtDirAudioA = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        lblContPares = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnImagemB = new javax.swing.JButton();
        txtDirImagemB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIDB = new javax.swing.JTextField();
        btnAudioB = new javax.swing.JButton();
        txtDirAudioB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema cadastro de imagens - jogo da memoria");

        tblPar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CATEGORIA", "AUDIO DIR", "IMG DIR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPar);
        if (tblPar.getColumnModel().getColumnCount() > 0) {
            tblPar.getColumnModel().getColumn(0).setResizable(false);
            tblPar.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblPar.getColumnModel().getColumn(1).setResizable(false);
            tblPar.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblPar.getColumnModel().getColumn(2).setResizable(false);
            tblPar.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblPar.getColumnModel().getColumn(3).setResizable(false);
            tblPar.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblPar.getColumnModel().getColumn(4).setResizable(false);
            tblPar.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jLabel1.setText("ID Par:");

        txtIdPar.setEditable(false);
        txtIdPar.setEnabled(false);

        jLabel2.setText("NOME:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--CATEGORIA--", "TRADICIONAL", "FRUTAS", "CALCULOS", "ESPORTES" }));

        btnImagemA.setText("IMAGEM A");
        btnImagemA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemAActionPerformed(evt);
            }
        });

        btnAudioA.setText("AUDIO");
        btnAudioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioAActionPerformed(evt);
            }
        });

        txtDirImagemA.setEditable(false);
        txtDirImagemA.setEnabled(false);

        txtDirAudioA.setEditable(false);
        txtDirAudioA.setEnabled(false);

        btnNovo.setMnemonic('n');
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setMnemonic('s');
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("ALTERAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        lblContPares.setText("Total: 0 - Lutador: 0 - Tradicional: 0 - Esportes: 0 - Frutas: 0 - Calculos: 0 - Especial: 0");

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnImagemB.setText("IMAGEM B");
        btnImagemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemBActionPerformed(evt);
            }
        });

        txtDirImagemB.setEditable(false);
        txtDirImagemB.setEnabled(false);

        jLabel3.setText("IDA:");

        txtIDA.setEditable(false);
        txtIDA.setEnabled(false);

        jLabel4.setText("IDB:");

        txtIDB.setEditable(false);
        txtIDB.setEnabled(false);

        btnAudioB.setText("AUDIO");
        btnAudioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioBActionPerformed(evt);
            }
        });

        txtDirAudioB.setEditable(false);
        txtDirAudioB.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAudioA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirAudioA))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContPares)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImagemA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImagemB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirImagemB)
                            .addComponent(txtDirImagemA)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAudioB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirAudioB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblContPares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtIDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtIdPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImagemA)
                    .addComponent(txtDirImagemA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImagemB)
                    .addComponent(txtDirImagemB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAudioA)
                    .addComponent(txtDirAudioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAudioB)
                    .addComponent(txtDirAudioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        jogoDeBotoes('N');
        limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(camposObrigatorios()) saveOrUpdate('S');
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        jogoDeBotoes('A');
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int value = JOptionPane.showConfirmDialog(Principal.this, "Atenção", "Deletar?", JOptionPane.YES_NO_OPTION);
        if(value==0){
            deletarPar();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jogoDeBotoes('C');
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblParMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParMouseClicked
        int linha;
        linha=tblPar.getSelectedRow();
        if(linha>=0){
            //Prossiga
            jogoDeBotoes('E');
            preencherCarta();
        }else JOptionPane.showMessageDialog(Principal.this, "Selecione um registro da tabela");
    }//GEN-LAST:event_tblParMouseClicked

    private void btnImagemAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemAActionPerformed
        carregarPath('A'); 
    }//GEN-LAST:event_btnImagemAActionPerformed

    private void btnImagemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemBActionPerformed
        carregarPath('B');
    }//GEN-LAST:event_btnImagemBActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(camposObrigatorios()) saveOrUpdate('S');
            jogoDeBotoes('N');
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void btnAudioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioAActionPerformed
        carregarPath('C');
    }//GEN-LAST:event_btnAudioAActionPerformed

    private void btnAudioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAudioBActionPerformed
        carregarPath('D');
    }//GEN-LAST:event_btnAudioBActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        initPadroes();
    }
    
    public void initPadroes(){
        dtmPar = (DefaultTableModel)tblPar.getModel();
        carregarTabelaPares();
        jogoDeBotoes('C');
        limparCampos();
    }
    
    private void limparCampos(){
        txtIdPar.setText("");
        txtIDA.setText("");
        txtIDB.setText("");
        txtNome.setText("");
        txtDirImagemA.setText("");
        txtDirImagemB.setText("");
        txtDirAudioA.setText("");
        txtDirAudioB.setText("");
    }
    
    private void carregarPath(char opc){
        //A - Imagem A
        //B - Imagem B
        //C - Sound A
        //D - Sound B
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try{
                switch (opc) {
                    case 'A':
                        txtDirImagemA.setText(arquivo.getAbsolutePath());
                        break;
                    case 'B':
                        txtDirImagemB.setText(arquivo.getAbsolutePath());
                        break;
                    case 'C':
                        txtDirAudioA.setText(arquivo.getAbsolutePath());
                        break;
                    case 'D':
                        txtDirAudioB.setText(arquivo.getAbsolutePath());
                        break;
                    default:break;
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
                ex.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }     
    }
    
    private void jogoDeBotoes(char opc){
        //S - Salvar
        //N - Novo
        //A - Atualizar
        //C - Cancelar
        //E - Escolher/Selecionar
        switch (opc) {
            case 'S':
            case 'A':
            case 'C':
            case 'D':
                //O Usuario Clicou em Salvar/Alterar ou Cancelar
                btnSalvar.setEnabled(false);
                btnNovo.setEnabled(true);
                btnAtualizar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnDeletar.setEnabled(false);
                habilitarCampos(false);
                break;
            case 'N':
                //O Usuario Clicou em Novo
                btnSalvar.setEnabled(true);
                btnNovo.setEnabled(false);
                btnAtualizar.setEnabled(false);
                btnCancelar.setEnabled(true);
                btnDeletar.setEnabled(false);
                habilitarCampos(true);
                txtNome.grabFocus();
                break;
            default:
                //O Usuario Clicou em uma linha da tabela
                btnSalvar.setEnabled(false);
                btnNovo.setEnabled(false);
                btnAtualizar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnDeletar.setEnabled(true);
                habilitarCampos(true);
                break;
        }
    }
     
    private void habilitarCampos(boolean choice){
        txtNome.setEnabled(choice);
        cbxCategoria.setEnabled(choice);
        btnImagemA.setEnabled(choice);
        btnImagemB.setEnabled(choice);
        btnAudioA.setEnabled(choice);
        btnAudioB.setEnabled(choice);
    }
     
    private void carregarTabelaPares(){
        Session s = null;
        try{
            s=NewHibernateUtil.getSessionFactory().getCurrentSession();
            s.beginTransaction();
            
            Query q = s.createQuery("From Par");
            List l = q.list();
            Iterator i = l.iterator();
            
            dtmPar.setNumRows(0);
            
            Par par;
            
            vetorPar = new Par[l.size()];
            
            int cont=0;
            
            int[] vetorCont = new int[4];
            
            while(i.hasNext()){
                par=(Par)i.next();
                vetorPar[cont]=par;
                cont++;
                dtmPar.addRow(par.getPar());
                
                switch(par.getCategoria()){
                    case "TRADICIONAL": vetorCont[0]+=1; break;
                    case "ESPORTES": vetorCont[1]+=1; break;
                    case "FRUTAS": vetorCont[2]+=1; break;
                    case "CALCULOS": vetorCont[3]+=1; break;
                    default:break;
                }
            }
            
            if(vetorPar.length>0) idAutoIncrement = vetorPar[cont-1].getIdB();
            
            lblContPares.setText("Total/Especial: " + cont + 
                " - Tradicional: " + vetorCont[0] + 
                " - Esportes: " + vetorCont[1] + 
                " - Frutas: " + vetorCont[2] + 
                " - Calculos: " + vetorCont[3]
            );
            
        }catch(HibernateException ex){
            JOptionPane.showMessageDialog(Principal.this, ex);
        }finally{
            s.getTransaction().commit();
        }
    }
    
    public boolean camposObrigatorios(){
        String erro = "O(s) Campo(s): ";
        boolean retorno = true;
        if(txtNome.getText().trim().isEmpty()){
            erro+="nome, ";
            retorno =false;
        }
        if(cbxCategoria.getSelectedIndex()==0){
            erro+="categoria, ";
            retorno =false;
        }
        if(!txtDirImagemA.getText().trim().isEmpty()){
            if(!txtDirImagemA.getText().substring(txtDirImagemA.getText().length()-4, txtDirImagemA.getText().length()).equals(".png")){
                erro+="Imagem A não é valida (Apenas .png), ";
                retorno=false;
            }
        }
        if(!txtDirImagemB.getText().trim().isEmpty()){
            if(!txtDirImagemB.getText().substring(txtDirImagemB.getText().length()-4, txtDirImagemB.getText().length()).equals(".png")){
                erro+="Imagem B não é valida (Apenas .png), ";
                retorno=false;
            }
        }
        if(!txtDirAudioA.getText().trim().isEmpty()){
            if(!txtDirAudioA.getText().substring(txtDirAudioA.getText().length()-4, txtDirAudioA.getText().length()).equals(".mp3")){
                erro+="Audio não é valido (Apenas .mp3), ";
                retorno=false;
            }
        }
        
        if(!txtDirAudioB.getText().trim().isEmpty()){
            if(!txtDirAudioB.getText().substring(txtDirAudioB.getText().length()-4, txtDirAudioB.getText().length()).equals(".mp3")){
                erro+="Audio não é valido (Apenas .mp3), ";
                retorno=false;
            }
        }
        
        erro = erro.substring(0, (erro.length()-2));
        erro+=" estão vazios ou incorretos!";
        if(!retorno)JOptionPane.showMessageDialog(Principal.this, erro);
        return retorno;
    }
    
    private void copyFile(String input, char opc, int id) throws IOException{
        File arquivoOrigem = new File(input);
        
        File arquivoDestino;
        if(opc=='A'){
            arquivoDestino = new File("C:/xampp/htdocs/memoria/audio/"+id+".mp3");
        }else{
            arquivoDestino = new File("C:/xampp/htdocs/memoria/img/"+id+".png");
        }
        
        if (arquivoDestino.exists())arquivoDestino.delete();
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel = new FileInputStream(arquivoOrigem).getChannel();
            destinationChannel = new FileOutputStream(arquivoDestino).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),destinationChannel);
        }catch(IOException ex){
            ex.printStackTrace();
        }finally {
            if (sourceChannel != null && sourceChannel.isOpen())sourceChannel.close();
            if (destinationChannel != null && destinationChannel.isOpen())destinationChannel.close();
       }
    }

    private void saveOrUpdate(char opc) {
        //S- Salvar
        //A- Atualizar
        SessionManipulacao s = new SessionManipulacao();
        if (opc == 'S') {
            try{
                Par p = new Par(txtNome.getText(), cbxCategoria.getSelectedItem().toString(), (idAutoIncrement+1), (idAutoIncrement+2));
                s.save(p, Principal.this);
                if(txtDirImagemA.getText()!=null)copyFile(txtDirImagemA.getText(), 'I', (idAutoIncrement+1));
                if(txtDirImagemB.getText()!=null)copyFile(txtDirImagemB.getText(), 'I', (idAutoIncrement+2));
                if(txtDirAudioA.getText()!=null)copyFile(txtDirAudioA.getText(), 'A', (idAutoIncrement+1));
                if(txtDirAudioA.getText()!=null)copyFile(txtDirAudioA.getText(), 'A', (idAutoIncrement+2));
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(Principal.this, ex);
                JOptionPane.showMessageDialog(Principal.this, "Falha ao cadastrar carta!");
            }
        }else{
            try{
                Par p = new Par(txtNome.getText(), cbxCategoria.getSelectedItem().toString(), Integer.valueOf(txtIDA.getText()), Integer.valueOf(txtIDB.getText()));
                p.setId(Integer.valueOf(txtIdPar.getText()));
                
                s.update(p, this);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(Principal.this, ex);
                JOptionPane.showMessageDialog(Principal.this, "Falha ao atualizar cliente!");
            }
        }
        carregarTabelaPares();
        limparCampos();
        jogoDeBotoes(opc);
    }
    
    private void preencherCarta(){
        txtIdPar.setText(dtmPar.getValueAt(tblPar.getSelectedRow(), 0).toString());
        
        Par p = new Par();
        for(int cont=0; cont<vetorPar.length; cont++){
            if(Integer.valueOf(txtIdPar.getText()).equals(vetorPar[cont].getId())){
                p=vetorPar[cont];
                break;
            }
        }        
        
        txtIDA.setText(String.valueOf(p.getIdA()));
        txtIDB.setText(String.valueOf(p.getIdB()));
        txtNome.setText(p.getTitulo());
        txtDirImagemA.setText("img/"+p.getIdA()+".png");
        txtDirImagemB.setText("img/"+p.getIdB()+".png");
        
        cbxCategoria.setSelectedItem(p.getCategoria());
    }
    
    private void deletarPar() {
        SessionManipulacao s = new SessionManipulacao();
        try{
            Par p = new Par();
            File arquivoDestino;
            
            p.setId(Integer.valueOf(txtIdPar.getText()));
            p.setCategoria(cbxCategoria.getSelectedItem().toString());
            p.setTitulo(txtNome.getText());
            
            s.delete(p, Principal.this);
            
            arquivoDestino = new File("C:/xampp/htdocs/memoria/img/"+p.getIdA()+".png");
            if (arquivoDestino.exists())arquivoDestino.delete();
            
            arquivoDestino = new File("C:/xampp/htdocs/memoria/img/"+p.getIdB()+".png");
            if (arquivoDestino.exists())arquivoDestino.delete();
            
            arquivoDestino = new File("C:/xampp/htdocs/memoria/audio/"+p.getId()+".mp3");
            if (arquivoDestino.exists())arquivoDestino.delete();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(Principal.this, ex);
            ex.printStackTrace();
            JOptionPane.showMessageDialog(Principal.this, "Falha ao deletar carta!");
        }
        carregarTabelaPares();
        limparCampos();
        jogoDeBotoes('D');
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAudioA;
    private javax.swing.JButton btnAudioB;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnImagemA;
    private javax.swing.JButton btnImagemB;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblContPares;
    private javax.swing.JTable tblPar;
    private javax.swing.JTextField txtDirAudioA;
    private javax.swing.JTextField txtDirAudioB;
    private javax.swing.JTextField txtDirImagemA;
    private javax.swing.JTextField txtDirImagemB;
    private javax.swing.JTextField txtIDA;
    private javax.swing.JTextField txtIDB;
    private javax.swing.JTextField txtIdPar;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    
}