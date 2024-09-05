import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private static List<Funcionario> ListaFuncionario = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        ListaFuncionario.add(funcionario);
    }
    public static List<Funcionario> GetListaFuncionarios() {
        return ListaFuncionario;
    }

    public static Funcionario buscar(int matricula) {

        for(Funcionario temp : ListaFuncionario) {
             if (temp.getMatricula() == matricula) { 
                 return temp;
            }
        }
        return null; //Retorna nulo se a matrícula não existir na lista  de funcionários
    }
}    
    

