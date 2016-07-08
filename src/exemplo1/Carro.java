package exemplo1;

public class Carro {
    
    private int id;
    private Modelo modelo;
    private String placa;
    private int ano;
    private int km;
        
    public Carro(){}
    
    public Carro(int id, Modelo modelo, String placa, int ano, int km){
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.km = km;
        
    }

    @Override
    public String toString() {
        return "Carro:\n"
                + "id=" + this.id + ":"
                + "\nModelo: " + this.modelo.getNome()
                + "\nMarca: " + this.modelo.getMarca().getNome()
                + "\nAno: " + this.ano
                + "\nKM: " + this.km
                + "\nPlaca: " + this.placa;
    }
  
    public int getKm(){
        return this.km;
    }
    public void setKm(int Km){
        this.km = km;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
