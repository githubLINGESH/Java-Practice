class arrsot {
    public static void main(String[] args) {
        int[] a = {3, 1, 1};
        arrsot obj = new arrsot();
        int[] sortedArray = obj.sorting(a);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public int[] sorting(int[] a) {
        if (a.length <= 1) {
            return a;
        }

        int p = (a.length + 1) / 2;
        int[] l = new int[a.length];
        int[] r = new int[a.length];
        int c = 0; // Initialize c

        for (int i = 0; i < a.length; i++) {
            if (a[i] < p) {
                l[i] = a[i];
            } else if (a[i] == p) {
                c = a[i]; // Update c
            } else {
                r[i] = a[i];
            }
        }

        int[] sortedL = sorting(l);
        int[] sortedR = sorting(r);

        int[] sorted = new int[a.length];
        System.arraycopy(sortedL, 0, sorted, 0, sortedL.length);
        sorted[sortedL.length] = c;
        System.arraycopy(sortedR, 0, sorted, sortedL.length + 1, sortedR.length);

        return sorted;
    }
}
