import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Animal> ListaAnimal = new ArrayList<>();

    public static void cadastrar(Animal animal) {
        ListaAnimal.add(animal);
    }

    public static List<Animal> GetListaAnimais() {
        return ListaAnimal;
    }

    public static Animal buscar(int especie) {

        for (Animal temp : ListaAnimal) {
            if (temp.getId() == especie) {
                return temp;
            }
        }
        return null; // Retorna nulo se a matrícula não existir na lista de funcionários
    }

    public static void excluir(Animal av) {
        ListaAnimal.remove(av);
    }
}
