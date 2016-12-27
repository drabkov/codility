class BinaryGap {
    public int solution(int N) {
        String str = Integer.toString(N, 2);
    
        int j = str.length()-1;
        while(str.charAt(j) == '0'){    
            j--;
        }
        str = str.substring(0, j);
        
        String[] arr = str.split("1");
        
        int maxGap = 0;
        for (int i=0;i<arr.length;i++) {
            if(maxGap < arr[i].length()){
                maxGap = arr[i].length();
            }
        }
        return maxGap;
    }
}

