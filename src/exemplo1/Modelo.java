package exemplo1;

public class Modelo {
   
    private int id;
    private String nome;
    private Marca marca;

    public Modelo() {
    }
   
    public Modelo(int id, String nome, Marca marca) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", nome=" + nome + ", marca=" + marca + '}';
    }
    
    
    
    
}
