package consulta;

/**
 *
 * @author Lucas
 */
public class Consulta {
    
    private String nomeDoPaciente;
    private String dataDeNascimento;
    private String profissao;
    private boolean convenio;
    
    public Consulta(){}

    public Consulta(String nomeDoPaciente, String dataDeNascimento, String profissao) {
        if(nomeDoPaciente.equals("")){
           this.nomeDoPaciente = "Sem preenchimento";
        }else{
           this.nomeDoPaciente = nomeDoPaciente;
        }
        
        if(dataDeNascimento.equals("")){
           this.dataDeNascimento = "Sem preenchimento";
        }else{
           this.dataDeNascimento = dataDeNascimento;
        }
        
        this.profissao = profissao;
        
    }
    
    public String getConvenio(){
        if(this.convenio){
           return "Sim";
        }else{
           return "Nao";
        }      
    }

    public String getNomeDoPaciente() {
        return nomeDoPaciente;
    }

    public void setNomeDoPaciente(String nomeDoPaciente) {
        if(nomeDoPaciente.equals("")){
            this.nomeDoPaciente = "Sem preenchimento";
        }else{
            this.nomeDoPaciente = nomeDoPaciente;
        }
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        if(dataDeNascimento.equals("")){
            this.dataDeNascimento = "Sem preenchimento";
        }else{
            this.dataDeNascimento = dataDeNascimento;
        }
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        if(profissao.equals(" ")){
           this.profissao = "Sem preenchimento";
        }else{
           this.profissao = profissao;
        }
    }

    public boolean isConvenio() {
        
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }
}
