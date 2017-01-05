class TapeEquilibrium {
    public int solution(int[] A) {
         int r = -1, s = 0, t = 0, d = 0;

        for(int B : A)
            t += B;

        for(int i = 0; i < A.length - 1; i++){
            s += A[i];
            d = Math.abs(s - (t - s));

            if(r == -1 || r > d)
                r = d;

            d = 0;
        }

        return r;
    }
}
