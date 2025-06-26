public class pairsum {

    static int pair(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans; // Return the count of pairs found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int x = 6;

        int result = pair(arr, x);
        System.out.println("Number of pairs with sum " + x + ": " + result);
    }
}
