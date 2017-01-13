class BinaryGap {
    public int solution(int N) {
        //получаем двоичное представление числа
        String str = Integer.toString(N, 2);
    
        //не учитываем финальные нули, нас интересуют только разрывы
        int j = str.length()-1;
        while(str.charAt(j) == '0'){    
            j--;
        }
        str = str.substring(0, j);
        
        //делим на строки, разделитель "1". получаем массив со строками из нулей.  
        String[] arr = str.split("1");
        
        //максимальный разрыв тот у которого больше длина
        int maxGap = 0;
        for (int i=0;i<arr.length;i++) {
            if(maxGap < arr[i].length()){
                maxGap = arr[i].length();
            }
        }
        return maxGap;
    }
}

