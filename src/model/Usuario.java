
package model;


public class Usuario {
    
    private int id;
    private String username;
    private String senha;
    private String perfil;
    private String curso;
    private String email;
    private String cpf;
    private String telefone;
    private String cep;
    private String bairro;
    private String Unidade_Federal;
    private String data_nascimento;
    private String pai;
    private String mae;
    private String rg;
    private String cnpj;
    private String qualificacao;
    private String data_inicio;
    private String data_termino;
    private String razao;

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }
   
    
    public String getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_termino() {
        return data_termino;
    }

    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }

    public Usuario(int id, String username, String senha, String perfil, String curso, String email, String cpf, String telefone, String cep, String bairro, String Unidade_Federal, String data_nascimento, String pai, String mae, String rg, String cnpj, String qualificacao, String data_inicio, String data_termino, String razao) {
        this.id = id;
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
        this.curso = curso;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cep = cep;
        this.bairro = bairro;
        this.Unidade_Federal = Unidade_Federal;
        this.data_nascimento = data_nascimento;
        this.pai = pai;
        this.mae = mae;
        this.rg = rg;
        this.cnpj = cnpj;
        this.qualificacao = qualificacao;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.razao = razao;
    }

   
   
    
    
    
   
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
   
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

  
    public Usuario(){
        
    }

     

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUnidade_Federal() {
        return Unidade_Federal;
    }

    public void setUnidade_Federal(String Unidade_Federal) {
        this.Unidade_Federal = Unidade_Federal;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

   
    
    
}
