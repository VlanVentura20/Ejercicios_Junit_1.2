import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	
	GeneradorIp miGeneradorIp;
	
	@BeforeEach
	void setUp() throws Exception {
		miGeneradorIp = new GeneradorIp();
	}
	
	@RepeatedTest(1000)
    void testGenerarNumero() {
        int numero = miGeneradorIp.generarNumero(0, 255);

        assertTrue(numero >= 0 && numero <= 255);
    }

    @Test
    void testGeneraIp() {
        String ip = miGeneradorIp.generarIp();

        String[] partes = ip.split("\\.");

        assertNotEquals("0", partes[0]);
        assertNotEquals("0", partes[3]);
    }

}
