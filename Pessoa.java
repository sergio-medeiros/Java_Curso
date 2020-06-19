public class Pessoa{
    private String Nome;
    private String Cargo;
    private double Salario;

    public Pessoa(String no, String ca, double sa){
        Nome = no;
        Cargo = ca;
        Salario = sa;
    }
    public void setNome(String no){
        Nome = no;
    }
    public String getNome(){
        return Nome;
    }
    public void setCargo(String ca){
        Cargo = ca;
    }
    public String getCargo(){
        return Cargo;
    }
    public void SetSalario(double sa){
        Salario = sa;
    }
    public double getSalario(){
        return Salario;
    }
    public String imprimir(){
        return Nome+" "+Cargo+" "+Salario;
    }
    public void setAumento(double sal){
        Salario = Salario + (Salario * (sal/100));
    }
}