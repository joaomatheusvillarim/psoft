package sistemaLivros;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * US3: Os usuários devem ser capazes de selecionar um livro e reservá-lo,
 * inserindo o número de identificação do usuário e o identificador do livro.
 * @author João Matheus Villarim
 */
public class US3Test {

    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void exibeLivrosDisponiveisCasoComReservasFeitasTest() {
        String expected = "Livros disponíveis:\n"
        + "1. O Estrangeiro - Albert Camus\n"
        + "2. A Metamorfose - Franz Kafka\n"
        + "3. O Capital - Karl Marx\n"
        + "4. Capitães da Areia - Jorge Amado\n"
        + "5. Viagem Solitária - João W. Nery\n"
        + "6. Eu e Outras Poesias - Augusto dos Anjos";
        biblioteca.cadastraUsuario("João Matheus Villarim");
        biblioteca.tentativaReservaLivro(6, 0);
        String actual = biblioteca.exibeLivrosDisponiveis();
        Assert.assertEquals(expected, actual);
       }

}
