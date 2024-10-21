package codechallenge;
import java.util.Arrays;

public class DataMigration {
    public static int[] solution(int[] sourceArray, int[] destinationArray) {
        int maxLength = 0;
        int startIndex = 0;

        int currentLength = 0;
        int currentStartIndex = 0;

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] != destinationArray[i]) {
                currentLength = 0;
                currentStartIndex = i + 1;
            } else {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = currentStartIndex;
                }
            }
        }

        if (maxLength == 0) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxLength, startIndex};
        }
    }

    public static void main(String[] args) {
        int[] sourceArray = {33531593, 96933415, 28506400, 39457872, 29684716, 86010806};
        int[] destinationArray = {33531593, 96913415, 28506400, 39457872, 29684716, 86010807};

        int[] result = solution(sourceArray, destinationArray);
        System.out.println(Arrays.toString(result));
    }
}
