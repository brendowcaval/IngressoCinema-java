
package ingressocinema;


public class Filme extends IngressoVIP{
           
           
           
           public String nome1="007 - SEM TEMPO PARA MORRER";
           public String diretor1="Diretor: Cary Fukunaga";
           public String descrition1="Sinopse: James Bond deixa o MI6 e se muda para a Jamaica,"
          + " mas um antigo amigo aparece e pede sua ajuda para encontrar um cientista desaparecido."
          + " Bond mergulha no caso e percebe que a busca é, na verdade, uma corrida para salvar o mundo.";
           public String genero1="Gênero: Ação/Aventura";
           public String duration1="Duração: 2h43min";
           public boolean filme3d;
           
       String acessoLanchonete(){
                 return"(FILME 3D)";
            }
           
       public boolean getFilme3d(){
       return true;
       }    
       
       public void setFilme3d(boolean filme3d){
        this.filme3d=filme3d;
       }
       
       public String getNome1(){
       return nome1;
       }    
       
       public void setNome1(String nome1){
        this.nome1=nome1;
       }
       
       public String getDiretor1(){
        return diretor1;
       }
       
       public void setDiretor1(String diretor1){
         this.diretor1=diretor1;
       }
       
       public String getDescrition1(){
       return descrition1;
       }
       
       public void setDescrition1(String descrition1){
         this.descrition1=descrition1;
       }
       
       public String getGenero1(){
        return genero1;
       }
       
       public void setGenero1(String genero1){
           this.genero1=genero1;
       
       }
       
       public String getDuration1(){
       return duration1;
       }
       
       public void setDuration1(String duration1 ){
         this.duration1=duration1;
       }
       
       
       
       
        
       
           
          
           
           
           
           
           
           
          
           
           
           
           
        
       
    
    
    
}
