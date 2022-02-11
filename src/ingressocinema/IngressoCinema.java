// aluno: brendow 
// cesmac
// professor: carlos
package ingressocinema;


public class IngressoCinema {

   
    public static void main(String[] args) {
        
        Filme c=new Filme();
        Ingresso ingresso=new Ingresso();
        MenuController a= new MenuController();
        IngressoVIP vp = new IngressoVIP();
          
   
        a.apresentaçao();
        a.selecionarfilme();
        System.out.println(c.getFilme3d());
        System.out.println(c.getNome1());
        System.out.println(c.getDescrition1());
        System.out.println(c.getDiretor1());
        System.out.println(c.getGenero1());
        System.out.println(c.getDuration1());
        System.out.println(ingresso.getSeção1());
        ingresso.tiposingresso();
        lanchonete(ingresso);
        lanchonete(vp);
        lanchonete(c);
        System.out.print("* Inteira:");
        System.out.println(ingresso.getIngresso1());
        System.out.print("* Meia:");
        System.out.println(ingresso.getIngresso2());
        a.ingresso();
        a.resultado();
       
        
            
      }
      static void lanchonete(Ingresso ingrss){
                 System.out.println(ingrss.acessoLanchonete());
            }
}
