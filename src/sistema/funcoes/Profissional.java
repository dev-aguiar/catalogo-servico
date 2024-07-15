package sistema.funcoes;

public class Profissional{
    private String nome;
    private String cidade;
    private String estado;
    private String servico;
    private String instagram;
    private long contato;

    public Profissional(String nome, String cidade, String estado, String servico, String instagram, long contato) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.servico = servico;
        this.instagram = instagram;
        this.contato = contato;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getServico() {
        return this.servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getInstagram() {
        return this.instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public long getContato() {
        return this.contato;
    }

    public void setContato(long contato) {
        this.contato = contato;
    }

    

    @Override
    public String toString() {
        return "\nNome = " + getNome() +
                "\nCidade = " + getCidade() +
                "\nEstado = " + getEstado() +
                "\nServiço = " + getServico() +
                "\nInstagram = " + getInstagram() +
                "\nContato = " + getContato() + "\n";
    }

}