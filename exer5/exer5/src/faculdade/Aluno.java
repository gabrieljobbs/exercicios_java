package faculdade;
public class Aluno {

    public int matricula;
    public int nota01,nota02,notatrabalho;
    public String nome;

public double media() {
    double x = ((nota01+nota02)*2.5+notatrabalho*2)/7;
    return x;




}
public double media_Final(){
    double y=media();
    if (y <2.5|| y>=5);
        return 0;
    
}


}