
package estancias;

import estancias.servicios.FamiliaServicio;

public class Estancias {

    public static void main(String[] args) {
        
        FamiliaServicio familiaServ = new FamiliaServicio();

        try {
            familiaServ.imprimirFamilias();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }
    

