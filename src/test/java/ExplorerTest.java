import org.example.Arquivo;
import org.example.Assunto;
import org.example.Pasta;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ExplorerTest {

    @Test
    public void deveRetornarPastaAssunto() {
        Pasta pasta1 = new Pasta("P1");
        Arquivo arq1 = new Arquivo("A1", "pdf");
        pasta1.addExplorer(arq1);

        Pasta pasta2 = new Pasta("P2");
        Arquivo arq2 = new Arquivo("A2", "pdf");
        pasta2.addExplorer(arq2);

        Pasta pasta3 = new Pasta("P3");
        pasta3.addExplorer(pasta1);
        pasta3.addExplorer(pasta2);

        Assunto assunto = new Assunto();
        assunto.setNome(pasta3);

        assertEquals("Pasta: P3\n" + "Pasta: P1\n" +
                "Arquivo: A1 - extensao: pdf\n" + "Pasta: P2\n" +
                "Arquivo: A2 - extensao: pdf\n", assunto.getNome());
    }

    @Test
    public void deveRetornarExecacaoAssuntosemPasta() {
        try {
            Assunto assunto = new Assunto();
            assunto.getNome();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Assunto sem pasta", e.getMessage());
        }
    }
}
