import org.omg.CosNaming.IstringHelper;

class MIU {

    public static void main(String[] args) {
        System.out.println(isEvenSubset(18, 12));
        System.out.println(isEvenSubset(18, 32));

        System.out.println(isTwinoid(new int[] { 1, 2, 4, 5, 5 }));
        System.out.println(isTwinoid(new int[] { 1, 2, 4, 4, 5 }));
        System.out.println(isTwinoid(new int[] { 1, 3, 4, 4, 5 }));
        System.out.println(isTwinoid(new int[] {}));
        System.out.println(isTwinoid(new int[] { 1, 2, 4, 4, 5 }));
        System.out.println(isTwinoid(new int[] { 1, 2, 4, 4, 4 }));
        System.out.println(isTwinoid(new int[] { 1, 3, 3, 4, 4 }));

        System.out.println(isBalanced(new int[] { 2, -2, 5, -5 }));
        System.out.println(isBalanced(new int[] { 2, -2, 2, 2 }));
        System.out.println(isBalanced(new int[] { 2, -2, 3, 2 }));
        System.out.println(isBalanced(new int[] { 0, 2, -2 }));
        System.out.println(isBalanced(new int[] { 0, 2, -2, -3 }));
    }

    static int isBalanced(int[] a) {

        if (a.length < 0) {
            return 0;
        }

        boolean valid = false;

        for (int e : a) {
            valid = false;
            for (int s : a) {

                if (e + s == 0) {
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                return 0;
            }
        }
        if (valid) {
            return 1;
        } else {
            return 0;
        }

    }

    static int isEvenSubset(int m, int n) {

        if (m < 1) {
            return 0;
        }
        if (n < 1) {
            return 0;
        }

        for (int i = 2; i < m; i++) {

            if (m % i == 0 && i % 2 == 0) {

                if (n % i != 0) {

                    return 0;
                }
            }

        }

        return 1;

    }

    static int isTwinoid(int[] a) {

        if (a.length < 1) {
            return 0;
        }

        int check = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) {

                check++;

            }

        }

        if (check == 1) {
            return 1;
        } else {
            return 0;
        }

    }
}