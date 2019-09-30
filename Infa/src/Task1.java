public class Task1 {
    public static void main(String[] args) {
        String[][] strs = new String[][]{{"ab", "abc"}, {"abcd", "abc"}};
        arrCheck(strs);
    }

    private static boolean arrCheck(String[][] strs) {
        int k = 0;
        for (int j = 0; j < strs[0].length; j++) {
            int i;
            for (i = 0; i < strs.length; i++) {
                int ii;
                for (ii = i + 1; ii < strs.length; ii++) {
                    int min = Math.min(strs[i][j].length(), strs[ii][j].length());
                    int l;
                    for (l = 0; l < min; l++) {
                        if (strs[i][j].charAt(l) != strs[ii][j].charAt(l)) {
                            break;
                        }
                    }
                    if (l < min) break;
                }
                if (ii < strs.length) break;
            }
            if (i < strs.length) break;
            k++;
            int kk = 0;
            for (i = 0; i < strs.length; i++) {
                for (int m = 0; m < strs[i][j].length(); m++) {
                    if (strs[i][j].charAt(m) == ('a') || strs[i][j].charAt(m) == ('e') || strs[i][j].charAt(m) == ('i') || strs[i][j].charAt(m) == ('o') || strs[i][j].charAt(m) == ('y') || strs[i][j].charAt(m) == ('u')) {
                        kk++;
                        if (kk > 2) break;
                    } //все гласные тут
                }
                if (kk <= 2) return false;
            }
            if (k > 2) break;
        }
        return (k == 2);
    }
}

