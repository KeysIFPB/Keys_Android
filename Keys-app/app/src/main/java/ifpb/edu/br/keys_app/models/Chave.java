package ifpb.edu.br.keys_app.models;

/**
 * Created by Mateus on 01/04/2017.
 */

public class Chave {
    private int id;
    private String sala;
    private boolean situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Chave{" +
                "id=" + id +
                ", sala='" + sala + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}