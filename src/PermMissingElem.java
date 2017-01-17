class PermMissingElem {
  public int solution(int[] A) {
        
        java.util.Arrays.sort(A);
        //если в массиве нет элементов или первый не равен 1, возвращаем 1
        if (A.length < 1 || A[0] != 1) return 1;
        
        //в отсортированном массиве ищем отсутствующий элемент
        int missing = 1;
        for(int i = 0; i < A.length; i++) {
            if (A[i] != missing) {
                return missing;
            }
            missing++;
        }
        //не нашли возвращаем последний +1
        return A[A.length-1]+1;
    }
}


