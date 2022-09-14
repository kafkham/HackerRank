//https://www.hackerrank.com/challenges/one-month-preparation-kit-plus-minus/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
// 2022-09-05

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class PlusMinus {

    class Result {
        public static double pos = 0;
        public static double neg = 0;
        public static double zee = 0;

        public static void plusMinus(List<Integer> arr) {

            for (Integer integer : arr) {
                if (integer > 0) {
                    pos += 1;
                } else if (integer < 0) {
                    neg += 1;
                } else {
                    zee += 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.println(df.format(Result.pos/n));
        System.out.println(df.format(Result.neg/n));
        System.out.println(df.format(Result.zee/n));

        bufferedReader.close();
    }
}
