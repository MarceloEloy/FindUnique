import java.io.FilterOutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] x = new double[6];
        x[0] = 1.0;
        x[1] = 3.0;
        x[2] = 1.0;
        x[3] = 1.0;
        x[4] = 1.0;
        x[5] = 1.0;
        System.out.println(EncontrarUnico.findUniq(x));
    }
}
