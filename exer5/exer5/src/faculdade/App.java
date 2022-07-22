package faculdade;



public class App {
    public static void main(String[] args) throws Exception {
     Aluno objetAluno = new Aluno();
     objetAluno.matricula= 54;
     objetAluno.nome= "Gabriel";
     objetAluno.nota01= 60;
     objetAluno.nota02= 60;
     objetAluno.notatrabalho= 60;
     double media = objetAluno.media();
     System.out.println(media);
     double media_final = objetAluno.media_final();
     System.out.println(media_final);
     System.out.println(objetAluno.nome+objetAluno.matricula+""+media);
    }
}
