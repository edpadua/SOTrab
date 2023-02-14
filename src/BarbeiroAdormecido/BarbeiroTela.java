/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BarbeiroTela.java
 *
 * Created on May 10, 2012, 1:42:22 PM
 */

package BarbeiroAdormecido;

/**
 * Classe principal que define a tela do problema do barbeiro adormecido

 */
public class BarbeiroTela extends javax.swing.JFrame {


    int cont; //guarda a contagem de clientes que chegam a barbearia
    Cliente cli[]=new Cliente [10]; //vetor de que representa os clientes que chegam a barbearia
    Barbeiro barb; // variável que representa o barbeiro
    String Texto1="";
    String UltimoCliente;
    int Nclientes; //Número de clientes que entram na barbearia
    int Ncadeiras; //Número de cadeiras da barbearia
    int NClientesSaindo; //Número de clientes que sai da barbearia
    boolean esperar=false; // Indica se os clientes entraram e estão esperando pelo atendimento
    boolean chamarCliente=false;

    static BarbeiroInfo  InfoTela=new BarbeiroInfo();


    public BarbeiroTela() {
         //Inicialização dos componentes
         initComponents();
         barb = new Barbeiro(1);
         barb.setBarbeiroTel(this);

         this.NClientesSaindo=0;
         this.jLabel3.setVisible(false);
         this.jLabel4.setVisible(false);
         this.jLabel5.setVisible(false);
         this.jLabel6.setVisible(false);
         this.jLabel7.setVisible(false);
         this.jLabel8.setVisible(false);
         this.jLabel9.setVisible(false);
         this.jLabel10.setVisible(false);
         this.jLabel11.setVisible(false);
         this.jLabel12.setVisible(false);
         this.jLabel13.setVisible(false);
         this.jLabel14.setVisible(false);
         this.jLabel15.setVisible(false);
         this.jLabel16.setVisible(false);
         this.jLabel17.setVisible(false);
         this.jLabel18.setVisible(false);
         this.jLabel19.setVisible(false);
         this.jLabel20.setVisible(false);
         this.jLabel21.setVisible(false);
         this.jLabel22.setVisible(false);
         this.jLabel23.setVisible(false);
         this.jLabel24.setVisible(false);
         this.jLabel25.setVisible(false);
         this.jLabel26.setVisible(false);
         this.jLabel27.setVisible(false);
         this.jLabel28.setVisible(false);
         this.jLabel29.setVisible(false);
         this.jLabel30.setVisible(false);
         this.jLabel31.setVisible(false);
         this.jLabel32.setVisible(false);
         this.jLabel38.setVisible(false);
         this.jLabel40.setVisible(false);
         this.jButton2.setEnabled(false);
         this.jButton3.setEnabled(false);
       
    }

    //Setters e Getters de atributos

    public int getNclientes() {
        return Nclientes;
    }

    public void setNclientes(int Nclientes) {
        this.Nclientes = Nclientes;
    }

 
    public String getUltimoCliente() {
        return UltimoCliente;
    }

    public void setUltimoCliente(String UltimoCliente) {
        this.UltimoCliente = UltimoCliente;
    }

    public int getNcadeiras() {
        return Ncadeiras;
    }

    public boolean getChamarCliente() {
        return chamarCliente;
    }

    public void setChamarCliente(boolean chamarCliente) {
        this.chamarCliente = chamarCliente;
    }

    public boolean getEsperar() {
        return esperar;
    }

    public void setEsperar(boolean esperar) {
        this.esperar = esperar;
    }

    public int getNClientesSaindo() {
        return NClientesSaindo;
    }

    public void setNClientesSaindo(int NClientesSaindo) {
        this.NClientesSaindo = NClientesSaindo;
    }


    /* Metodos de atualização dos Jlabels, define o texto e visibilidade pelos parâmentros
       String s e boolean visivel respectivamente
    */

    public void AtualizarJlabel3( String s, boolean visivel ) {
         this.jLabel3.setVisible(visivel);
         this.jLabel3.setText(s);
    }

    public void AtualizarJlabel4( String s, boolean visivel ) {
         this.jLabel4.setVisible(visivel);
         this.jLabel4.setText(s);
    }

    public void AtualizarJlabel5( String s, boolean visivel ) {
         this.jLabel5.setVisible(visivel);
         this.jLabel5.setText(s);
    }

    public void AtualizarJlabel6( String s, boolean visivel ) {
         this.jLabel6.setVisible(visivel);
         this.jLabel6.setText(s);
    }

    public void AtualizarJlabel7( String s, boolean visivel ) {
         this.jLabel7.setVisible(visivel);
         this.jLabel7.setText(s);
    }

     public void AtualizarJlabel8( String s, boolean visivel ) {
         this.jLabel8.setVisible(visivel);
         this.jLabel8.setText(s);
    }

    public void AtualizarJlabel9( String s, boolean visivel ) {
         this.jLabel9.setVisible(visivel);
         this.jLabel9.setText(s);
    }

    public void AtualizarJlabel10( String s, boolean visivel ) {
         this.jLabel10.setVisible(visivel);
         this.jLabel10.setText(s);
    }

     public void AtualizarJlabel11( String s, boolean visivel ) {
         this.jLabel11.setVisible(visivel);
         this.jLabel11.setText(s);
    }

    public void AtualizarJlabel12( String s, boolean visivel ) {
         this.jLabel12.setVisible(visivel);
         this.jLabel12.setText(s);
    }

    public void AtualizarJlabel13( String s, boolean visivel ) {
         this.jLabel13.setVisible(visivel);
         this.jLabel13.setText(s);
    }

    public void AtualizarJlabel14( String s, boolean visivel ) {
         this.jLabel14.setVisible(visivel);
         this.jLabel14.setText(s);
    }

    public void AtualizarJlabel15( String s, boolean visivel ) {
         this.jLabel15.setVisible(visivel);
         this.jLabel15.setText(s);
    }

     public void AtualizarJlabel16( String s, boolean visivel ) {
         this.jLabel16.setVisible(visivel);
         this.jLabel16.setText(s);
    }

    public void AtualizarJlabel17( String s, boolean visivel ) {
         this.jLabel17.setVisible(visivel);
         this.jLabel17.setText(s);
    }

    public void AtualizarJlabel18( String s, boolean visivel ) {
         this.jLabel18.setVisible(visivel);
         this.jLabel18.setText(s);
    }

    public void AtualizarJlabel19( String s, boolean visivel ) {
         this.jLabel19.setVisible(visivel);
         this.jLabel19.setText(s);
    }

    public void AtualizarJlabel20( String s, boolean visivel ) {
         this.jLabel20.setVisible(visivel);
         this.jLabel20.setText(s);
    }
    
    public void AtualizarJlabel21( String s, boolean visivel ) {
         this.jLabel21.setVisible(visivel);
         this.jLabel21.setText(s);
    }
    
    public void AtualizarJlabel22( String s, boolean visivel ) {
         this.jLabel22.setVisible(visivel);
         this.jLabel22.setText(s);
    }

    public void AtualizarJlabel23( String s, boolean visivel ) {
         this.jLabel23.setVisible(visivel);
         this.jLabel23.setText(s);
    }

    public void AtualizarJlabel24( String s, boolean visivel ) {
         this.jLabel24.setVisible(visivel);
         this.jLabel24.setText(s);
    }

    public void AtualizarJlabel25( String s, boolean visivel ) {
         this.jLabel25.setVisible(visivel);
         this.jLabel25.setText(s);
    }

    public void AtualizarJlabel26( String s, boolean visivel ) {
         this.jLabel26.setVisible(visivel);
         this.jLabel26.setText(s);
    }

    public void AtualizarJlabel27( String s, boolean visivel ) {
         this.jLabel27.setVisible(visivel);
         this.jLabel27.setText(s);
    }

    public void AtualizarJlabel28( String s, boolean visivel ) {
         this.jLabel28.setVisible(visivel);
         this.jLabel28.setText(s);
    }

    public void AtualizarJlabel29( String s, boolean visivel ) {
         this.jLabel29.setVisible(visivel);
         this.jLabel29.setText(s);
    }
    public void AtualizarJlabel30( String s, boolean visivel ) {
         this.jLabel30.setVisible(visivel);
         this.jLabel30.setText(s);
    }

    public void AtualizarJlabel31( String s, boolean visivel ) {
         this.jLabel31.setVisible(visivel);
         this.jLabel31.setText(s);
    }
    public void AtualizarJlabel32( String s, boolean visivel ) {
         this.jLabel32.setVisible(visivel);
         this.jLabel32.setText(s);
    }

    public void AtualizarJlabel38( String s, boolean visivel ) {
         this.jLabel38.setVisible(visivel);
         this.jLabel38.setText(s);
    }

    public void AtualizarJlabel42( String s, boolean visivel ) {
         this.jLabel42.setVisible(visivel);
         this.jLabel42.setText(s);
    }

    

    public void AtualizarJlabel44( String s, boolean visivel ) {
         this.jLabel44.setVisible(visivel);
         this.jLabel44.setText(s);
    }

    public void AtualizarJlabel45( String s, boolean visivel ) {
         this.jLabel45.setVisible(visivel);
         this.jLabel45.setText(s);
    }

    //Metodos para atualizar a imagem de Jlabels pelo parâmetros String imagem que define o nome do arquivo

    public void ImagemJlabel23( String imagem )  {
         
         this.jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
    
    public void ImagemJlabel24( String imagem )  {
         
         this.jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
     
    public void ImagemJlabel25( String imagem )  {
         
         this.jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
    
    public void ImagemJlabel26( String imagem )  {
         
         this.jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
    
    public void ImagemJlabel27( String imagem )  {
         
         this.jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
     
    public void ImagemJlabel28( String imagem )  {
         
         this.jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
    
    public void ImagemJlabel29( String imagem )  {
         
         this.jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
    
    public void ImagemJlabel30( String imagem )  {
         
         this.jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
    
    public void ImagemJlabel31( String imagem )  {
         
         this.jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
     
     public void ImagemJlabel32( String imagem )  {
         
         this.jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }
    
    public void ImagemJlabel37( String imagem )  {

         this.jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagem)));
    }

    
    // Atualiza botão jButton3 ( reiniciar )
    

     public void AtualizarjButton3( boolean enable ) {
        this.jButton3.setEnabled(true);
    }

    // Retorna o texto do Jlabel38 ( cliente sendo atendido )

    String getJlabel38text(){

        return this.jLabel38.getText();
    }


     // Deixar jlabels que representam os clientes na entrada da barbearia invisíveis
     public void AtualizarEntrada( ) {
        
      	          this.jLabel3.setVisible(false);
                  this.jLabel4.setVisible(false);
                  this.jLabel5.setVisible(false);
                  this.jLabel6.setVisible(false);
                  this.jLabel7.setVisible(false);
                  this.jLabel8.setVisible(false);
                  this.jLabel9.setVisible(false);
                  this.jLabel10.setVisible(false);
                  this.jLabel11.setVisible(false);
                  this.jLabel12.setVisible(false);



     }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1000, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextField1.setName("jTextField1"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Número de Clientes");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Número de Cadeiras");
        jLabel2.setName("jLabel2"); // NOI18N

        jButton1.setText("Play");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setName("jTextField2"); // NOI18N

        jButton2.setText("Entrar na Barbearia");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel33.setText("Entrada");
        jLabel33.setName("jLabel33"); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel34.setText("Cadeiras");
        jLabel34.setName("jLabel34"); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel36.setText("Barbeiro");
        jLabel36.setName("jLabel36"); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel35.setText("Indo Embora");
        jLabel35.setName("jLabel35"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(169, 551));
        jPanel1.setMinimumSize(new java.awt.Dimension(169, 551));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel10.setText("Cliente7");
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel9.setText("Cliente6");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel3.setText("Cliente0");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel12.setText("Cliente9");
        jLabel12.setName("jLabel12"); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel11.setText("Cliente8");
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel4.setText("Cliente1");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel5.setText("Cliente2");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel6.setText("Cliente4");
        jLabel6.setName("jLabel7"); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel7.setText("Cliente5");
        jLabel7.setName("jLabel8"); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel8.setText("Cliente3");
        jLabel8.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(169, 551));
        jPanel2.setMinimumSize(new java.awt.Dimension(169, 551));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(169, 551));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel22.setText("Cliente8");
        jLabel22.setName("jLabel22"); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel16.setText("Cliente7");
        jLabel16.setName("jLabel16"); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel15.setText("Cliente4");
        jLabel15.setName("jLabel15"); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel14.setText("Cliente2");
        jLabel14.setName("jLabel14"); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel13.setText("Cliente0");
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel18.setText("Cliente3");
        jLabel18.setName("jLabel18"); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel19.setText("Cliente6");
        jLabel19.setName("jLabel19"); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel20.setText("Cliente0");
        jLabel20.setName("jLabel20"); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel21.setText("Cliente9");
        jLabel21.setName("jLabel21"); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel17.setText("Cliente5");
        jLabel17.setName("jLabel17"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 255, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(169, 551));
        jPanel5.setMinimumSize(new java.awt.Dimension(169, 551));
        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(169, 551));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/barbeiro.JPG"))); // NOI18N
        jLabel37.setName("jLabel37"); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel38.setText("jLabel38");
        jLabel38.setName("jLabel38"); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel45.setText("Dormindo");
        jLabel45.setName("jLabel45"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel45)
                        .addComponent(jLabel38)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addGap(36, 36, 36))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setMaximumSize(new java.awt.Dimension(169, 551));
        jPanel3.setMinimumSize(new java.awt.Dimension(169, 551));
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(169, 551));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel25.setText("Cliente4");
        jLabel25.setName("jLabel25"); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel24.setText("Cliente7");
        jLabel24.setName("jLabel24"); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel23.setText("Cliente8");
        jLabel23.setName("jLabel23"); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel28.setText("Cliente3");
        jLabel28.setName("jLabel28"); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel29.setText("Cliente6");
        jLabel29.setName("jLabel29"); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel26.setText("Cliente2");
        jLabel26.setName("jLabel26"); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel27.setText("Cliente0");
        jLabel27.setName("jLabel27"); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel32.setText("Cliente5");
        jLabel32.setName("jLabel32"); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel30.setText("Cliente0");
        jLabel30.setName("jLabel30"); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BarbeiroAdormecido/resources/cliente2.PNG"))); // NOI18N
        jLabel31.setText("Cliente9");
        jLabel31.setName("jLabel31"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(40, 40, 40))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                            .addContainerGap()))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setName("jPanel4"); // NOI18N

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("0");
        jLabel44.setName("jLabel44"); // NOI18N

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("0");
        jLabel42.setName("jLabel42"); // NOI18N

        jLabel39.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel39.setText("Semáforo Clientes");
        jLabel39.setName("jLabel39"); // NOI18N

        jLabel41.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel41.setText("Mutex");
        jLabel41.setName("jLabel41"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel39)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel41))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel44)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton3.setText("Reiniciar");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial Black", 1, 12));
        jLabel40.setForeground(new java.awt.Color(255, 51, 0));
        jLabel40.setText("Valores inválidos");
        jLabel40.setName("jLabel40"); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setName("jPanel6"); // NOI18N

        jLabel43.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("O Barbeiro Adormecido");
        jLabel43.setName("jLabel43"); // NOI18N
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel43MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel43)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel33))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     // Ações executadas fechar o jForm
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
         this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Ações executadas ao pressionar jButton1 ( Play )
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //Verifica se texto no jTextField1 ou jTextField2 está vazio se, um deles tiver não inicia
         if(!(jTextField1.getText().equals(""))&&!(jTextField2.getText().equals(""))){
         //Desabilitar jButton1
         jButton1.setEnabled(false);

         //Guardar dados de entrada
         Nclientes=Integer.parseInt(jTextField1.getText());
         Ncadeiras=Integer.parseInt(jTextField2.getText());
         
         //Verificar intervalo de valores da entrada
         if((Nclientes<=10)&&(Ncadeiras<=10)&&(Nclientes>=0)&&(Ncadeiras>=0)){
            //Habilitar jbutton2 ( Entrar na barbearia )
            this.jLabel40.setVisible(false);
            this.jButton2.setEnabled(true);
            //Iniciar a execução do thread barbeiro
            barb.start();
        
         //Inicializar o vetor de clientes
         for(cont=0;cont<Nclientes;cont++){
             cli[cont]=new Cliente(cont);
             cli[cont].setBarbeiroTel(this);
         }
        

         String Cliente="";
         //Iniciar a execução dos threads clientes
         for(cont=0;cont<Nclientes;cont++){
             cli[cont].start();

             Cliente="Cliente"+String.valueOf(cont);
            
            
            //Controlar visibilidade dos jlables que representam cada cliente
            switch (cont)
             {
              case 0:
      	          this.jLabel3.setVisible(true);break;
              case 1:
      	         this.jLabel4.setVisible(true); break;
              case 2:
                 this.jLabel5.setVisible(true); break;
              case 3:
                this.jLabel6.setVisible(true); break;
              case 4:
                  this.jLabel7.setVisible(true); break;
              case 5:
                   this.jLabel8.setVisible(true); break;
              case 6:
                  this.jLabel9.setVisible(true);  break;
              case 7:
                   this.jLabel10.setVisible(true); break;
              case 8:
                   this.jLabel11.setVisible(true); break;
              case 9:
                  this.jLabel12.setVisible(true); break;


             }

         }

         

         }
         else{
              //exibir uma mensagem informando valores de entrada inválidos
              this.jLabel40.setVisible(true);
         }

         }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    // Ações executadas ao pressionar jButton2 ( Entrar na barbearia )
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Atualizar o status para espera
        this.setEsperar(true);
        System.out.println(this.getEsperar());
        //Habilitar jButton3 ( reiniciar )
        this.jButton3.setEnabled(true);
        //Tornar jLabels da entrada invisíveis
        this.AtualizarEntrada( );
        
        //Desabilitar jButton2
        this.jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Ações executadas ao pressionar jButton3 ( Reiniciar )
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            //Criar uma nova janela
            BarbeiroAdormecido.Barbeiro();
            //Parar a execução do thread do barbeiro
            this.barb.stop();
            //Tornar a nova janela visível
            new BarbeiroTela().setVisible(true);
            //Terminar a janela corrente
            this.dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel43MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseReleased
        // TODO add your handling code here:
         InfoTela.setVisible(true);
    }//GEN-LAST:event_jLabel43MouseReleased


    
    /**
    * 
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarbeiroTela().setVisible(true);
                InfoTela.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
