//https://www.hackerrank.com/challenges/one-month-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one
//2022-09-05

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {
    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {

            String newTime;
            String hour = s.substring(0,2);
            String timeNoHour = s.substring(2, s.length() - 2);
            int intHour = Integer.parseInt(hour);
            boolean isAM = s.contains("A");

            if (isAM) {
                if (intHour == 12) {
                    newTime = "00" + timeNoHour;
                }
                else {
                    newTime = s.substring(0, s.length() - 2);
                }
            }
            else {
                if (intHour == 12) {
                    newTime = s.substring(0, s.length() - 2);
                }
                else {
                    newTime = (intHour + 12) + timeNoHour;
                }
            }
            return  newTime;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}
