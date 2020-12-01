
package estancias.servicios;

import estancias.entidades.Familias;
import java.util.List;

public class FamiliaServicio {
    
    private FamiliaDAO dao = new FamiliaDAO();
    
    public void imprimirFamilias()throws Exception{
        
      try{
        
        //Listamos las familias
        List<Familias> familias = dao.listarFamilias();
                
        //Imprimimos las familias
        if (familias.isEmpty()){
           throw new Exception("No existen familias para imprimir");  
        }else{
          for (Familias f : familias){
              
            System.out.println(f.getId());
            System.out.println(f.getNombre());
            System.out.println(f.getEdad_minima());
            System.out.println(f.getEdad_maxima());
            System.out.println(f.getNum_hijos());
            System.out.println(f.getEmail());
          }  
        }  
      
      }catch(Exception e){
        e.printStackTrace();
        throw new Exception("Error de sistema");   
      } 
    }
    
}
