import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConexaoBancoTest {

    @Test
    public void testeSingleton() {
        ConexaoBanco c1 = ConexaoBanco.getInstance();
        ConexaoBanco c2 = ConexaoBanco.getInstance();

        assertSame(c1, c2);
    }
}