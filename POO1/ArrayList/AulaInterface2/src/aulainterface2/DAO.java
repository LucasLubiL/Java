package aulainterface2;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public interface DAO {
    
    public void salvar(ArrayList dados);
    public ArrayList selecionar(ArrayList dados);
    public void deletar(int chavePrimaria, String rotulo);
    public void alterar(String dados);
    

    
}
