import br.nom.marcos.wolfgang.desktop.bingo.controller.Sorteador;

/**
 * Created by Wolfgang on 05/11/2015.
 */
public class Starter {
    public static void main(String[] args){
        Sorteador sorteador = new Sorteador();
        for(int i = 0; i < 11; i++)
            System.out.println(sorteador.sortearNumero());
    }
}
