package consulta;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
        
        Consulta paci = new Consulta();
        paci.setNomeDoPaciente("Carlos Fernando");
        paci.setDataDeNascimento("01/01/2000");
        paci.setProfissao("Analista de Sistemas");
        paci.setConvenio(true);
        System.out.println("Nome Paciente: " + paci.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci.getDataDeNascimento());
        System.out.println("Convenio: " + paci.getConvenio());
        System.out.println("Profissao: " + paci.getProfissao() + "\n");
        
        Consulta paci2 = new Consulta();
        paci2.setNomeDoPaciente("Ana Clara");
        paci2.setDataDeNascimento("22/11/2004");
        paci2.setProfissao("Desenvolvedora Java");
        paci2.setConvenio(false);
        System.out.println("Nome Paciente: " + paci2.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci2.getDataDeNascimento());
        System.out.println("Convenio: " + paci2.getConvenio());
        System.out.println("Profissao: " + paci2.getProfissao() + "\n");
        
        Consulta paci3 = new Consulta("","25/02/2002","Gestor de Vendas");
        paci3.setConvenio(true);
        System.out.println("Nome Paciente: " + paci3.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci3.getDataDeNascimento());
        System.out.println("Convenio: " + paci3.getConvenio());
        System.out.println("Profissao: " + paci3.getProfissao() + "\n");
        
        Consulta paci4 = new Consulta("Karla Costa","","Social Media");
        paci4.setConvenio(false);
        System.out.println("Nome Paciente: " + paci4.getNomeDoPaciente());
        System.out.println("Data de Nascimento: " + paci4.getDataDeNascimento());
        System.out.println("Convenio: " + paci4.getConvenio());   
        System.out.println("Profissao: " + paci4.getProfissao() + "\n");
    }
}
