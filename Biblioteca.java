public class Biblioteca{
    private String Titulo;
    private String Autor;
    private int Ano;
    private String Categoria;
    private String Posicao;
    private boolean Status;

    public Biblioteca(String Titulo, String Autor, int Ano, String Categoria, String Posicao, boolean Status){
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.Ano=Ano;
        this.Categoria=Categoria;
        this.Posicao=Posicao;
        this.Status=Status;
    }
    //Recebe dados
    public void setTitulo(String Titulo){
        this.Titulo= Titulo;
    }
    public void setAutor(String Autor){
        this.Autor= Autor;
    }
    public void setAno(int Ano){
        this.Ano= Ano;
    }
    public void setCategoria(String Categoria){
        this.Categoria= Categoria;
    }
    public void setPosicao(String Posicao){
        this.Posicao= Posicao;
    }
    public void setStatus(boolean Status){
        this.Status= Status;
    }
    //Recebe consulta;
    public String getTitulo(){
        return this.Titulo;
    }
    public String getAutor(){
        return this.Autor;
    }
    public int getAno(){
        return this.Ano;
    }
    public String getCategoria(){
        return this.Categoria;
    }
    public String getPosicao(){
        return this.Posicao;
    }
    public boolean getStatus(){
        return this.Status;
    }
    public String imprimir(){
        return this.Titulo+" "+this.Autor+" "+this.Ano+" "+this.Categoria+" "+this.Posicao+" "+this.Status;
    }

}