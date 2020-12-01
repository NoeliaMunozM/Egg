
package estancias.servicios;

import estancias.entidades.Familias;
import java.util.ArrayList;
import java.util.List;


public class FamiliaDAO extends Conexion {
    
    public List<Familias> listarFamilias() throws Exception {
        try {
            //Armo el sql
            String sql = "SELECT id_familia, nombre, edad_minima, edad_maxima, num_hijos, email"
                    + "  FROM familias ";
       
            //Consulto la base de datos
            consultarBase(sql);
            //Recorro el resultados de la consulta
            Familias familia = null;
            List<Familias> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familias();
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familias.add(familia);
            }
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        } finally {
            desconectarBase();
        }
    }
}
