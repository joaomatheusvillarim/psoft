package sistemaLivros;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * US4: Caso o livro não exista no sistema, deve-se mostrar uma mensagem na 
 * tela que o livro não existe.
 * @author João Matheus Villarim
 */
public class US4Test {
    
    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void pesquisaLivroInexistenteTest() {
        String expected = "Livro não existe no sistema!";
        String actual = biblioteca.getResultadosPesquisaLivro("Use a Cabeça Java");
        Assert.assertEquals(expected, actual);
    }

}
