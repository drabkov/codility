class FrogJmp {
    public int solution(int X, int Y, int D) {
        //лягушка прыг скок, ceil ближайшее целое
        return (int)Math.ceil((Y - X) / (double)D);
    }
}
