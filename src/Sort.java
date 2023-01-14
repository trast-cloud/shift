public class Sort {
    public static int[] StartSortInt(int[] ArrFile1, int[] ArrFile2, int lenFile1, int lenFile2, boolean bDesc){
        int[] arrAsc    = new int[lenFile1 + lenFile2];
        int[] arrDesc   = new int[lenFile1 + lenFile2];
        int[] arrResult = new int[lenFile1 + lenFile2];
        int a = 0, b = 0, r = 0, idx = 0, index = 0, iDesc = arrResult.length - 1;

        while (a < ArrFile1.length && b < ArrFile2.length) {
            if (ArrFile1[a] <= ArrFile2[b])
                arrAsc[r++] = ArrFile1[a++];
            else
                arrAsc[r++] = ArrFile2[b++];
        }

        while (a < lenFile1) {
            arrAsc[r++] = ArrFile1[a++];
        }

        while (b < lenFile2) {
            arrAsc[r++] = ArrFile2[b++];
        }

        if (bDesc) {
            while (iDesc >= 0) {
                arrDesc[idx++] = arrAsc[iDesc--];
            }
            for (int i = 0; i < arrResult.length; i++) {
                arrResult[i] = arrDesc[index++];
            }
        }
        else {
            for (int i = 0; i < arrResult.length; i++) {
                arrResult[i] = arrAsc[index++];
            }
        }

        return arrResult;
    }
}
