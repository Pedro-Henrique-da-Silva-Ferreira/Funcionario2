public class Funcionario {

    private String nome;
    private Integer id;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer id, Double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double salarioAumento(double porcentagem){
       return salario += salario * porcentagem/100;
    }

    @Override
    public String toString() {
        return  "Nome:'" + nome + '\'' +
                ", id:" + id +
                ", salario:" + String.format("%.2f", salario);
    }
}
