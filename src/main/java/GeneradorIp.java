import java.util.Random;

public class GeneradorIp {

    private Random random = new Random();

    public int generarNumero(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public String generarIp() {
        return generarNumero(0, 255) + "." + generarNumero(0, 255) + "." + generarNumero(0, 255) + "." + generarNumero(0, 255);
    }
}