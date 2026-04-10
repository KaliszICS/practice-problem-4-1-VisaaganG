public class PracticeProblem {


public static String seriesInclusive(int num) {
    if (num < 1) {
     return "";
    }
    
    String result;
    result = "1";
    int i = 2;

    while (i <= num) {
        result += " " + i;
        i++;
    }

    return result;
}

public static String seriesExclusive(int num) {
     String result = "";
        int i = 0;

        while (i < num) {
            result += i;
            if (i != num - 1) {
                result += " ";
            }
            i++;
        }

        return result;
    }

}
