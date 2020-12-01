
package estancias.servicios;

import estancias.entidades.Casas;
import java.util.ArrayList;
import java.util.List;

public class CasaDAO extends Conexion {
    public List<Casas> listarCasas() throws Exception {
        try {
            //Armo el sql
            String sql = "SELECT id_casa, calle, numero"
                    + "  FROM casas ";
       
            //Consulto la base de datos
            consultarBase(sql);
            //Recorro el resultados de la consulta
            Casas casa = null;
            List<Casas> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casas();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casas.add(casa);
            }
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error de sistema");
        } finally {
            desconectarBase();
        }
    }
}
