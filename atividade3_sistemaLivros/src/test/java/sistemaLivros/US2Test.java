package sistemaLivros;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * US2: O sistema deve exibir uma lista de livros disponíveis.
 * @author João Matheus Villarim
 */
public class US2Test {

    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void exibeLivrosDisponiveisCasoSemReservasFeitasTest() {
        String expected = "Livros disponíveis:\n"
            + "1. O Estrangeiro - Albert Camus\n"
            + "2. A Metamorfose - Franz Kafka\n"
            + "3. O Capital - Karl Marx\n"
            + "4. Capitães da Areia - Jorge Amado\n"
            + "5. Viagem Solitária - João W. Nery\n"
            + "6. Eu e Outras Poesias - Augusto dos Anjos\n"
            + "7. Alguma Poesia - Carlos Drummond de Andrade";
       String actual = biblioteca.exibeLivrosDisponiveis();
       Assert.assertEquals(expected, actual);
    }
    
}
