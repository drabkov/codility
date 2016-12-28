class OddOccurrencesInArray {
    public int solution(int [] A){
        int i;
        int res = 0;
        for (i = 0; i < A.length; i++) {
            res = res ^ A[i];
        }
        return res;
    }
}
