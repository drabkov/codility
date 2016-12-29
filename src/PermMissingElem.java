class PermMissingElem {
  public int solution(int[] A) {
        java.util.Arrays.sort(A);
        if (A.length < 1 || A[0] != 1) return 1;
            int missing = 1;
            for(int i = 0; i < A.length; i++) {
                if (A[i] != missing) {
                    return missing;
            }
            missing++;
        }
        return A[A.length-1]+1;
    }
}


