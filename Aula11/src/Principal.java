public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Fulano", "xaulincabeçadeporco@gmail.com");

        System.out.println();
        System.out.println(p1.toString());

        Aluno a1 = new Aluno("Gabriel", "piracanjuba@gmail.com", "123456-78");

        System.out.println(a1.toString());

        p1.setNome("Jorge Matheus");
        a1.setNome("Xaulinzada");

        a1.setRgm("41290840");
        // Pessoa não possui rgm. Logo a linha abaixo não pode ser executado
        // p1.setRgm("38284383")

        Professor prof1 = new Professor("Jeraldo", "jeraldinhosenior@gmail.com", "654321");

        System.out.println(prof1.toString());

        Bolsista b1 = new Bolsista("Nobinari", "nobinari@gmail.com", "555555", "Integral");
        System.out.println( b1.toString());
    }
}
