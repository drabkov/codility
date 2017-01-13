class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int newArray[] = new int[A.length];
        //перемещаем элемент на к позиций, учитывая длину массива
        for (int i = 0; i < A.length; i++) {
            newArray[(i + K) % A.length] = A[i];
        }
        System.arraycopy(newArray, 0, A, 0, A.length);
        return newArray;
    }
}
