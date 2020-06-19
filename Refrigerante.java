public class Refrigerante{
    private String Nome;
    private double Preco;
    private int    QtdEstoque;

    //construtor
    public Refrigerante(String Nome, double Preco, int QtdEstoque){
        this.Nome       = Nome;
        this.Preco      = Preco;
        this.QtdEstoque = QtdEstoque;
    }
    //Recebe valor
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setPreco(double Preco){
        this.Preco = Preco;
    }
    public void setQtdEstoque(String QtdEstoque){
        this.QtdEstoque = QtdEstoque;
    }
    //Consulta
    public String getNome(){
        return this.Nome;
    }
    public double getPreco(){
        return this.Preco;
    }
    public int getPreco(){
        return this.Preco;
    }
    //Calculo do Estoque
    public void TiraEstoque(){
        this.QtdEstoque--;
    }
}