package consulta;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {
        
        Consulta paci = new Consulta();
        paci.setNomeDoPaciente("Carlos Fernando");
        paci.setDataDeNascimento("01/01/2000");
        paci.setConvenio(true);
        System.out.println("Nome Paciente: " + paci.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci.getDataDeNascimento());
        System.out.println("Convenio: " + paci.getConvenio() + "\n");
        
        Consulta paci2 = new Consulta();
        paci2.setNomeDoPaciente("Ana Clara");
        paci2.setDataDeNascimento("22/11/2004");
        paci2.setConvenio(false);
        System.out.println("Nome Paciente: " + paci2.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci2.getDataDeNascimento());
        System.out.println("Convenio: " + paci2.getConvenio() + "\n");
        
        Consulta paci3 = new Consulta("","25/02/2002");
        paci3.setConvenio(true);
        System.out.println("Nome Paciente: " + paci3.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci3.getDataDeNascimento());
        System.out.println("Convenio: " + paci3.getConvenio() + "\n");
        
        Consulta paci4 = new Consulta("Claudia Raia","");
        paci.setConvenio(true);
        System.out.println("Nome Paciente: " + paci4.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci4.getDataDeNascimento());
        System.out.println("Convenio: " + paci4.getConvenio() + "\n");   
    }
}
