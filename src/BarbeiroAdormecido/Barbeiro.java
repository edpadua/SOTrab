
package BarbeiroAdormecido;

/**
 *
 Classe que representa o barbeiro
 */
public class Barbeiro extends Thread {

private int id; // identicador do barbeiro

BarbeiroTela barbeiroTel;

    public Barbeiro (int id) {
        this.id = id;
    }
   

    public void setBarbeiroTel(BarbeiroTela tela ) {
        this.barbeiroTel = tela;
    }

    //Controla a exibição dos clientes que saem da barbearia com o parâmetro String imagem
    private void saidaCliente( String imagem ){

    switch (barbeiroTel.getNClientesSaindo())
             {
              case 0:
      	          barbeiroTel.AtualizarJlabel23(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel23( imagem );
                  break;
              case 1:
      	          barbeiroTel.AtualizarJlabel24(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel24( imagem );
                  break;
              case 2:
                  barbeiroTel.AtualizarJlabel25(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel25( imagem );
                  break;
              case 3:
                  barbeiroTel.AtualizarJlabel26(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel26( imagem );
                  break;
              case 4:
                  barbeiroTel.AtualizarJlabel27(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel27( imagem );
                  break;
              case 5:
                  barbeiroTel.AtualizarJlabel28(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel28( imagem );
                  break;
              case 6:
                  barbeiroTel.AtualizarJlabel29(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel29( imagem );
                  break;
              case 7:
                  barbeiroTel.AtualizarJlabel30(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel30( imagem );
                  break;
              case 8:
                  barbeiroTel.AtualizarJlabel31(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel31( imagem );
                  break;
              case 9:
                  barbeiroTel.AtualizarJlabel32(barbeiroTel.getUltimoCliente(), true);
                  barbeiroTel.ImagemJlabel32( imagem );
                  break;


             }
           barbeiroTel.setNClientesSaindo(barbeiroTel.getNClientesSaindo()+1);
}

    //Ações executadas durante o processo de cortar cabelo
    private void cortarCabelo()  {

       //Atualizar a variavel que indica o último cliente atendido
       barbeiroTel.setUltimoCliente(barbeiroTel.getJlabel38text());
       //Exibe mensagem informando que o barbeiro está trabalhando
       barbeiroTel.AtualizarJlabel45("Trabalhando", true);
       //Exibe uma imagem associada a ação de cortar cabelo
       barbeiroTel.ImagemJlabel37("/BarbeiroAdormecido/resources/tesoura.jpg");

       //Atraso
       try {
            Thread.sleep((5000));
       }
       catch(Exception e) {
    
      }

      //Tirar a a visibilidade do Jlabel38
      barbeiroTel.AtualizarJlabel38("", false);
      barbeiroTel.AtualizarjButton3(true);
      //Atualizar a saida da barbearia com o cliente atendido
      this.saidaCliente("/BarbeiroAdormecido/resources/cliente.png");
    

}

    @Override
//Execução do thread barbeiro
public void run() {
   
      //Aguardar os clientes entrarem na barbearia
      while( barbeiroTel.getEsperar()==false ){
           System.out.println("");
      }
     
       
         //Repetir
         while (true) {
                barbeiroTel.AtualizarJlabel45("Dormindo", true);
           
                barbeiroTel.ImagemJlabel37("/BarbeiroAdormecido/resources/barbeiro.JPG");
        
          //Atraso
          try {
            Thread.sleep((5000));
          }
            catch(Exception e) {

          }

          //Atualizar semaforo clientes P()
          BarbeiroAdormecido.clientes.P();
          //Atualizar semaforo mutex P()
          BarbeiroAdormecido.mutex.P();

          //Atualizar exibição dos semáforos nos jlabels
          barbeiroTel.AtualizarJlabel42(String.valueOf(BarbeiroAdormecido.clientes.getValue()), true);
        
          barbeiroTel.AtualizarJlabel44(String.valueOf(BarbeiroAdormecido.mutex.getValue()), true);


          BarbeiroAdormecido.waiting=BarbeiroAdormecido.waiting + 1;

          //Atualizar semaforo barbeiros V()
          BarbeiroAdormecido.barbeiros.V();
          //Atualizar semaforo mutex V()
          BarbeiroAdormecido.mutex.V();


          //Atraso
          try {
            Thread.sleep((5000));
          }
            catch(Exception e) {
    
          }

           //Atualizar exibição dos semáforos nos jlabels
          barbeiroTel.AtualizarJlabel42(String.valueOf(BarbeiroAdormecido.clientes.getValue()), true);
         
          barbeiroTel.AtualizarJlabel44(String.valueOf(BarbeiroAdormecido.mutex.getValue()), true);
           
          cortarCabelo();
         

          barbeiroTel.setChamarCliente(false);
        }
    }
    
}
