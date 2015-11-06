import java.util.LinkedList;
import java.util.Random;

/**
 * Responsável por sortear os números do bingo de maneira pseudo-randômica.
 */
public class Sorteador {
    public static final int LIMITE_NUMEROS = 75;
    private LinkedList<Integer> lstNumerosSorteados;
    private Random gerador;

    public Sorteador() {
        this.lstNumerosSorteados = new LinkedList<Integer>();
        this.gerador = new Random();
    }

    /**
     * Sorteia números do bingo respeitando o limite imposto por Sorteador.LIMITE_NUMEROS.
     * Este método garante que não serão sorteados números repetidos.
     * @return O número sorteado ou 0 caso não haja mais números a serem sorteados
     */
    public int sortearNumero() {
        if (lstNumerosSorteados.size() < LIMITE_NUMEROS) {
            int numeroSorteado = gerador.nextInt(LIMITE_NUMEROS) + 1;
            if (lstNumerosSorteados.contains(numeroSorteado))
                return sortearNumero();
            else {
                lstNumerosSorteados.add(numeroSorteado);
                return numeroSorteado;
            }
        } else {
            System.err.println("Não há mais números a serem sorteados!");
            return 0;
        }
    }
}
