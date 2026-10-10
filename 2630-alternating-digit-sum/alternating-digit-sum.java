class Solution {
    public int alternateDigitSum(int n) {
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;

        int temp = n;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        for (int i = 0; i < count; i++) {
            int digit = n % 10;

            if (i % 2 == 0) {
                sum1 = sum1 + digit;
            } else {
                sum2 = sum2 + digit;
            }

            n = n / 10;
        }

        if (count % 2 == 0) {
    return sum2 - sum1;
} else {
    return sum1 - sum2;
}
    }
}