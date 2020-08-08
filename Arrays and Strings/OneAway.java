public class OneAway {
    static int min(int x, int y, int z) {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;

    }

    // O(n^2) complexity
    static int editDist(String str1, String str2, int m, int n) {
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return editDist(str1, str2, m - 1, n - 1);

        return 1 + min(editDist(str1, str2, m, n - 1), editDist(str1, str2, m - 1, n),
                editDist(str1, str2, m - 1, n - 1));

    }

    // O(n) complexity
    static boolean editDist(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (Math.abs(m - n) > 1)
            return false;
        int count = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (count == 1)
                    return false;
                if (m > n)
                    i++;
                else if (m < n)
                    j++;
                else {
                    i++;
                    j++;
                }
                count++;
            } else {
                i++;
                j++;
            }
        }
        if (i < m || j < n)
            count++;
        return count == 1;

    }

    public static void main(String[] args) {

    }
}