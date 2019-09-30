public class IntArray {
    private int[] array;

    public IntArray(int n) {
        array = new int[n];
    }

    public IntArray(int n, int k) {
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = k;
        }
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int a) {
        array[i] = a;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int size() {
        return array.length;
    }

    public IntArray compound(IntArray intArr) {
        IntArray array = new IntArray(size()+intArr.size());
        int j = 0;
        for (int i = 0; i < size(); i++) {
            array.set(j++,get(i));
        }
        for (int i = 0; i < intArr.size(); i++) {
            array.set(j++,get(i));
        }
        return array;
    }

    public IntArray intersection(IntArray intArr) {
        int[] arr = new int[size()+intArr.size()];
        int size = 0;
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < intArr.size(); j++) {
                if (get(i) == intArr.get(j)) {
                    arr[size++] = get(i);
                }
            }
        }
        IntArray array = new IntArray(size);
        for (int i = 0; i < size; i++) {
            set(i,arr[i]);
        }
        return array;
    }

    @Override
    public String toString(){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str =+ array[i] + ", ";
        }
        String str2 ="";
        for (int i = 0; i < str.length()-2; i++) {
            str2 += str.charAt(i);
        }
        str2 += "]";
        return str2;
    }

    public boolean equals(IntArray intArr){
        if (size() != intArr.size()) return false;
        for (int i = 0; i < size(); i++) {
            if (get(i) != intArr.get(i)) return false;
        }
        return true;
    }
}
