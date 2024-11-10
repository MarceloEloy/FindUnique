import java.util.Arrays;

public class EncontrarUnico {
    public static double findUniq(double arr[]) {
        double result = 0.0;
        if (arr.length % 2 != 0) {
            double[] slice1 = new double[(arr.length) / 2];
            double[] slice2 = new double[(arr.length) / 2];
            for (int i = 0; i < (arr.length) / 2; i++) {

                slice1[i] = arr[i];
            }
            for (int i = 0; i < (arr.length) / 2; i++) {
                int pos = arr.length / 2 + i + 1;
                slice2[i] = arr[pos];
            }
            for (int i = 0; i < (arr.length) / 2; i++) {
                boolean diff = slice2[i] == slice1[i];
                if (!diff) {
                    diff = slice2[i] == arr[arr.length / 2];
                    if (!diff) {
                        result = slice2[i];
                        break;
                    } else {
                        result = slice1[i];
                        break;
                    }
                }
            }
            if (result == 0) {
                result = arr[arr.length / 2];
            }
        } else{
            arr = Arrays.stream(arr).sorted().toArray();
            if (arr[0] != arr[1]){
                result = arr[0];
            }
            else{
                result = arr[arr.length -1];
            }
        }
        return result;
    }
}


