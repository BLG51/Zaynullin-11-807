public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"ab", "abc", "abcd", "abc"};
        char[][] syms = new char[][]{{'a', 'b', 'c'}, {'c', 'b', 'e'}};
        String[] symsStr = new String[syms.length];
        for (int i = 0; i < syms.length; i++) {
            symsStr[i] = "";
            for (int j = 0; j < syms[i].length; j++) {
                symsStr[i] += syms[i][j];
            }
        }
        strChk(strs, symsStr);
    }

    public static void strChk(String[] strs, String[] symsStr) {
        for (int i = 0; i < strs.length - 1; i++) {
            String str = strs[i];
            for (int j = 0; j < symsStr.length; j++) {
                int ind1 = 0;
                char l1 = str.charAt(ind1);
                int ind2 = 0;
                char l2 = symsStr[j].charAt(ind2);
                while (l1 != l2 && ind2 < symsStr[j].length()) {
                    ind2++;
                }
                if (ind2 == symsStr[j].length()) break;
                boolean flag = true;
                //System.out.println(str.length() + " " + ind1);
                while (l1 == l2 && ind1 < str.length() - 1 && ind2 < symsStr[j].length() - 1) {
                    l1 = str.charAt(++ind1);
                    l2 = symsStr[j].charAt(++ind2);
                    if (l1 != l2) {
                        flag = false;
                        break;
                    }
                }
                if ((ind1 == str.length() - 1 || ind2 == symsStr[j].length() - 1) && flag) {

                    String str2 = strs[i + 1];
                    int count = 0;
                    for (int k = 0; k < str2.length(); k++) {
                        for (int l = 0; l < symsStr[j].length(); l++) {
                            if (str2.charAt(k) == symsStr[j].charAt(l)) count++;
                        }
                    }
                    if (count <= 2) {
                        System.out.println("MALO");
                        return;
                    }
                }
            }

        }
        System.out.println("NORMALNO");
    }
}
