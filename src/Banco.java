import java.util.List;

public class Banco {

    public String nome;
    private List<Conta> listaContas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }
}