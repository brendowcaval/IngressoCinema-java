
package ingressocinema;

import java.util.Scanner;

public class MenuController {
            
        
          Scanner scan = new Scanner(System.in);
           public Filme filme;
           public String filme2="DUNA";
           public String filme3="VENOM: TEMPO DE CARNIFICINA";
           public int watch;
           public int valor;
           public int valor2,valor3;
           Filme f=new Filme();
           Ingresso ingresso=new Ingresso();
    
          
           
         public void apresentaçao(){
              System.out.println("   * CINEMA MACEIÓ \n  ");
              System.out.println(" NOSSA PROGRAMAÇÃO: \n ");
         }
    
        public void selecionarfilme(){
             
       System.out.printf("[1]007 - SEM TEMPO PARA MORRER%n[2]%s%n[3]%s%n",filme2,filme3);
         
       System.out.print("SELECIONE SEU FILME: ");
           watch=scan.nextInt();
           
           if(watch == 1){
               System.out.println("Filme selecionado:007 - SEM TEMPO PARA MORRER");
                watch--;
             }if(watch==2){
                System.out.println("Filme selecionado:DUNA");
                watch--;
             }if(watch==3){
               System.out.println("Filme selecionado:VENOM: TEMPO DE CARNIFICINA");
                watch++;
             }    
        
        }
         
        
        public void ingresso(){
             String[] ingressos=new String[5];
           
           ingressos[0]="Comprar inteira:24R$";
           ingressos[1]="Comprar meia:12R$";
           ingressos[2]="Comprar mais de um ingresso";
           ingressos[3]="Comprar ingresso VIP";
           ingressos[4]="Sair";
           System.out.println("COMPRA DE INGRESSO: ");
           System.out.println("[0]Comprar inteira\n[1]Comprar meia\n[2]Comprar mais de um ingresso\n"
            + "[3]Comprar Ingresso VIP\n[4]Sair");
            
           valor=scan.nextInt();
        }
        
         public void resultado(){
              if(valor==0){
               System.out.println("Você gastou 24 reais.");
               System.out.println("Tenha um bom filme!");
           }
           else if(valor==1){
               System.out.println("Você gastou 12 reais.");
               System.out.println("Tenha um bom filme!");
           }
           else if(valor==2){
                System.out.println("Quantos ingressos você deseja?");
                valor2=scan.nextInt();
                System.out.printf("%d ingressos saindo... tenha um bom filme!",valor2);
           }
           else if(valor==3){
             
                System.out.println("[1]inteira - R$48\n[2]meia R$24\n");
                
           }
           else if(valor==4){
                System.out.println("Obrigado pela visita, tenha um bom dia!");
           }
              
              if(valor==3){
                String[] ingressovp=new String[5];
                ingressovp[1]="[1]inteira - R$48";
                ingressovp[2]="[2]meia - R$24";
               
                valor3=scan.nextInt();
               }
              
              if(valor3==1){
              System.out.println("você gastou 48 reais.");
               System.out.println("Filme 3D: true() false()");
                f.filme3d=scan.hasNextBoolean();
              }
              else if(valor3==2){
              System.out.println("você gastou 24 reais.");
              System.out.println("Filme 3D: true() false()");
               f.filme3d=scan.hasNextBoolean();
              }
               
              if(f.filme3d==true){
                System.out.println("volte sempre!");
              }
              else if(f.filme3d==false){
                System.out.println("volte sempre!");
              }
              
            }
         
        
  }
    


