//https://www.hackerrank.com/challenges/one-month-preparation-kit-mini-max-sum/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one&h_r=next-challenge&h_v=zen
// 2022-09-05

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    class Result {
        public static ArrayList<Long> sums = new ArrayList<>();
        public static void miniMaxSum(List<Integer> arr) {
            for (int i = 0; i < 5; i++) {
                long sum = 0;
                for (int j = 0; j < 5; j++) {
                    sum += arr.get(j);
                }
                sum -= arr.get(i);
                sums.add(i, sum);
            }
            Collections.sort(sums);
        }
    }
     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        System.out.println(Result.sums.get(0) + " " + Result.sums.get(4));

        bufferedReader.close();

    }
}