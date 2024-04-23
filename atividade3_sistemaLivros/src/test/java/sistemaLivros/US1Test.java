package sistemaLivros;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * US1: O sistema deve ter a funcionalidade de pesquisar livros com base no título.
 * @author João Matheus Villarim
 */
public class US1Test {
    
    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void pesquisaLivroTest() {
        String expected = "Resultados da pesquisa 'O Estrangeiro':\n"
            + "1. O Estrangeiro - Albert Camus";
        String actual = biblioteca.getResultadosPesquisaLivro("O Estrangeiro");
        Assert.assertEquals(expected, actual);
    }

}
