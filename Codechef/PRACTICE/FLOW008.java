import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW008 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine().trim());
 
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(in.readLine().trim());
            solve(N);
        }
    }
 
    private static void solve(int N) {
        if (N < 10) {
            System.out.println("What an obedient servant you are!");
        } else {
            System.out.println(-1);
        }
    }
}