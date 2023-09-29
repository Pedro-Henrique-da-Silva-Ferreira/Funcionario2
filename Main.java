import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionarios serão registrados?");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Funcionario #" + i + 1 + ":");

            System.out.print("Id:");
            Integer id = sc.nextInt();
            while (hasId(funcionarios, id)){
                System.out.println("Esse id ja existe, tente novamente.");
                id = sc.nextInt();
            }

            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario:");
            Double salario = sc.nextDouble();

            Funcionario fun = new Funcionario(nome,id,salario);

            funcionarios.add(fun);

        }

        System.out.println("Id do funcionario que tera aumento.");
        int idSalario = sc.nextInt();

        Funcionario fun = funcionarios.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);

       // Integer pos = posicao(funcionarios,idSalario);

        if(fun == null){
            System.out.println("Esse id nao existe");
        }
        else{
            System.out.println("Qual a porcentagem:");
            double porcentagem = sc.nextDouble();
            fun.salarioAumento(porcentagem);
        }

        System.out.println("Lista");
        for (Funcionario f: funcionarios) {
            System.out.println(f);
        }

        sc.close();
    }

    public static Integer posicao(List<Funcionario> fun, int id){
        for(int i = 0; i < fun.size(); i++){
            if(fun.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> funcionarios, int id){
    Funcionario fun = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return fun != null;
    }
}