class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0)
                continue;

            String sub = s.substring(0, len);
            boolean ok = true;

            for (int j = len; j < n; j += len) {
                if (!s.substring(j, j + len).equals(sub)) {
                    ok = false;
                    break;
                }
            }

            if (ok)
                return true;
        }

        return false;
    }
}