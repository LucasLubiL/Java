package zoológico;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Zoologico {
    
    private ArrayList<String> mamiferos;
    private ArrayList<String> aves;
    private ArrayList<String> peixes;
    
    public Zoologico() {
        this.mamiferos = new ArrayList<>();
        this.aves = new ArrayList<>();
        this.peixes = new ArrayList<>();
    }

    public ArrayList<String> getMamiferos() {
        return mamiferos;
    }

    public void setMamiferos(ArrayList<String> mamiferos) {
        this.mamiferos = mamiferos;
    }

    public ArrayList<String> getAves() {
        return aves;
    }

    public void setAves(ArrayList<String> aves) {
        this.aves = aves;
    }

    public ArrayList<String> getPeixes() {
        return peixes;
    }

    public void setPeixes(ArrayList<String> peixes) {
        this.peixes = peixes;
    }
    
    
}
