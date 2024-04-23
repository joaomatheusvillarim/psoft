package sistemaLivros;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * US5: Os usuários não podem reservar um livro que já está reservado. Caso 
 * seja feita a tentativa, uma mensagem de indisponibilidade deve ser mostrada
 * na tela.
 * @author João Matheus Villarim
 */
public class US5Test {
    
    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        biblioteca.cadastraUsuario("João Matheus Villarim");
        biblioteca.tentativaReservaLivro(3, 0);
    }

    @Test
    public void reservarLivroIndisponivelTest() {
        String expected = "Livro indisponível!";
        String actual = biblioteca.tentativaReservaLivro(3, 0);
        Assert.assertEquals(expected, actual);
    }
}
