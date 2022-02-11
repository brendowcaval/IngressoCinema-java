
package ingressocinema;

public class Ingresso {
             
             private String texto;
             public Filme filme;
             public float ingresso1=24.00f;
             public float ingresso2=12.00f;
             public String seção1="Horário da seção: 13:00";
             
             
           
            String acessoLanchonete(){
                 return"* Compre um ingresso VIP";
                
            }
             
             public void tiposingresso(){
                System.out.println("TIPOS DE INGRESSO: ");
             }
             
            public Filme getFilme(){
             return filme;
            }
            public void setFilme(Filme filme){
              this.filme =filme;
            }
            
            public float getIngresso1(){
            return ingresso1;
            }
            
            public void setIngresso1(){
            this.ingresso1=ingresso1;
            }
            
            public float getIngresso2(){
            return ingresso2;
            }
            
            public void setIngresso2(){
             this.ingresso2=ingresso2;
            }
            
            public String getSeção1(){
            return seção1;
            }
            public void setSeção1(){
             this.seção1=seção1;
            }
}
