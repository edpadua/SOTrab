/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BarbeiroAdormecido;

/**
 *
 Classe que representa um cliente da barbearia
 */
public class Cliente extends Thread {
private int id; //Identificador do cliente
private int cadeira; //Cadeira que o cliente senta na espera
private int status; //


BarbeiroTela barbeiroTel;

public Cliente (int id) {
      this.id = id;
}

    //Setters e Getters de atributos
    public void setBarbeiroTel(BarbeiroTela barbeiro) {
        this.barbeiroTel = barbeiro;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCadeira() {
        return cadeira;
    }

    public void setCadeira(int cadeira) {
        this.cadeira = cadeira;
    }

//Ações executadas ao cliente sair da barbearia
private void saidaCliente( String imagem ){
    //Atualiza o jlabel específico de acordo o número de clientes na saída  
    switch (barbeiroTel.getNClientesSaindo())
             {
              case 0:
      	          barbeiroTel.AtualizarJlabel23("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel23( imagem );
                  break;
              case 1:
      	          barbeiroTel.AtualizarJlabel24("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel24( imagem );
                  break;
              case 2:
                  barbeiroTel.AtualizarJlabel25("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel25( imagem );
                  break;
              case 3:
                  barbeiroTel.AtualizarJlabel26("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel26( imagem );
                  break;
              case 4:
                  barbeiroTel.AtualizarJlabel27("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel27( imagem );
                  break;
              case 5:
                  barbeiroTel.AtualizarJlabel28("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel28( imagem );
                  break;
              case 6:
                  barbeiroTel.AtualizarJlabel29("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel29( imagem );
                  break;
              case 7:
                  barbeiroTel.AtualizarJlabel30("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel30( imagem );
                  break;
              case 8:
                  barbeiroTel.AtualizarJlabel31("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel31( imagem );
                  break;
              case 9:
                  barbeiroTel.AtualizarJlabel32("Cliente"+this.id, true);
                  barbeiroTel.ImagemJlabel32( imagem );
                  break;


             }

             barbeiroTel.setNClientesSaindo(barbeiroTel.getNClientesSaindo()+1);
}


//Ações executadas enquanto o cliente corta o cabelo
private void cortarCabelo() {


    //Mudar status para 2 ( cortando o cabelo )
    this.setStatus(2);
    barbeiroTel.AtualizarJlabel38("Cliente" + this.id, true);

    //Tirar a exibição do jlabel que representa o cliente na espera
    switch (this.getCadeira())
             {
              case 1:
      	         barbeiroTel.AtualizarJlabel13("Cliente"+this.id, false);

                 break;
              case 2:
                 barbeiroTel.AtualizarJlabel14("Cliente"+this.id, false);

                 break;
              case 3:
                 barbeiroTel.AtualizarJlabel15("Cliente"+this.id, false);

                 break;
              case 4:
                  barbeiroTel.AtualizarJlabel16("Cliente"+this.id, false);
                 
                  break;
              case 5:
                  barbeiroTel.AtualizarJlabel17("Cliente"+this.id, false);

                  break;
              case 6:
                  barbeiroTel.AtualizarJlabel18("Cliente"+this.id, false);

                  break;
              case 7:
                   barbeiroTel.AtualizarJlabel19("Cliente"+this.id, false);

                   break;
              case 8:
                   barbeiroTel.AtualizarJlabel20("Cliente"+this.id, false);

                   break;
              case 9:
                  barbeiroTel.AtualizarJlabel21("Cliente"+this.id, false);

                  break;
              case 10:
                   barbeiroTel.AtualizarJlabel22("Cliente"+this.id, false);

                   break;
             }
             //
    //Atraso
    try {
            Thread.sleep((5000));


    }
    catch(Exception e) {
     
   
    }
   
     
}

    @Override
//Execução do thread cliente
public void run() {
    //Iniciar com status 0 (entrada da barbearia)
    this.setStatus(0);
  
    System.out.println("cliente");
   
    //Aguardar
    System.out.println("espera "+barbeiroTel.getEsperar());
    while( barbeiroTel.getEsperar()==false )
    {
         System.out.println("");
         
    }
    
    System.out.println("waiting");
   
        //Atualizar mutex P
        BarbeiroAdormecido.mutex.P();
        //Ir para espera se existem cadeiras livres
         
        if ( (BarbeiroAdormecido.waiting < barbeiroTel.getNcadeiras()) ) {
             System.out.println("esperando");
            //Mudar status do cliente para esperando
            this.setStatus(1);
            BarbeiroAdormecido.waiting++;
            //Exibir Jlabel representando o cliente
            switch (BarbeiroAdormecido.waiting)
             {
              case 1:
                 
      	         barbeiroTel.AtualizarJlabel13("Cliente"+this.id, true);
                 this.setCadeira(BarbeiroAdormecido.waiting);
                 break;
              case 2:
                 barbeiroTel.AtualizarJlabel14("Cliente"+this.id, true);
                 this.setCadeira(BarbeiroAdormecido.waiting);
                 break;
              case 3:
                 barbeiroTel.AtualizarJlabel15("Cliente"+this.id, true);
                 this.setCadeira(BarbeiroAdormecido.waiting);
                 break;
              case 4:
                  barbeiroTel.AtualizarJlabel16("Cliente"+this.id, true);
                  this.setCadeira(BarbeiroAdormecido.waiting);
                  break;
              case 5:
                  barbeiroTel.AtualizarJlabel17("Cliente"+this.id, true);
                  this.setCadeira(BarbeiroAdormecido.waiting);
                  break;
              case 6:
                  barbeiroTel.AtualizarJlabel18("Cliente"+this.id, true);
                  this.setCadeira(BarbeiroAdormecido.waiting);
                  break;
              case 7:
                   barbeiroTel.AtualizarJlabel19("Cliente"+this.id, true);
                   this.setCadeira(BarbeiroAdormecido.waiting);
                   break;
              case 8:
                   barbeiroTel.AtualizarJlabel20("Cliente"+this.id, true);
                   this.setCadeira(BarbeiroAdormecido.waiting);
                   break;
              case 9:
                  barbeiroTel.AtualizarJlabel21("Cliente"+this.id, true);
                  this.setCadeira(BarbeiroAdormecido.waiting);
                  break;
              case 10:
                   barbeiroTel.AtualizarJlabel22("Cliente"+this.id, true);
                   this.setCadeira(BarbeiroAdormecido.waiting);
                   break;
             }
            //Atualizar semáforo clientes V
            BarbeiroAdormecido.clientes.V();
            //Atualizar semáforo mutex V
            BarbeiroAdormecido.mutex.V();
            //Atualizar semáforo barbeiros P
            BarbeiroAdormecido.barbeiros.P();
           
            //Atualizar Jlabels que exibem valores dos semáforos

            barbeiroTel.AtualizarJlabel42(String.valueOf(BarbeiroAdormecido.clientes.getValue()), true);
           
            barbeiroTel.AtualizarJlabel44(String.valueOf(BarbeiroAdormecido.mutex.getValue()), true);

            //Cliente é atendido
            cortarCabelo();

           
        }
        else {
            //Se não há cadeiras livres, o cliente vai embora e é mostrado na saída

           this.saidaCliente("/BarbeiroAdormecido/resources/cliente2.PNG");
         
             //Atualizar semáforo mutex V
            BarbeiroAdormecido.mutex.V();

            //Atraso
            try {
                Thread.sleep((2000));
             }
                catch(Exception e) {

             }
          
           //Atualizar Jlabels que exibem valores dos semáforos
           barbeiroTel.AtualizarJlabel42(String.valueOf(BarbeiroAdormecido.clientes.getValue()), true);
          
           barbeiroTel.AtualizarJlabel44(String.valueOf(BarbeiroAdormecido.mutex.getValue()), true);
        }
      }
    
}