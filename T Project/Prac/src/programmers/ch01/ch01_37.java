package programmers.ch01;

public class ch01_37 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int tmp = 0;
        String tmp1 = "";
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                tmp = (arr1[i] % 2) + (arr2[i] % 2);
                arr1[i] = arr1[i] / 2;
                arr2[i] = arr2[i] / 2;
                if(tmp>0){
                    tmp1 = "#" + tmp1;
                }else{
                    tmp1 = " " + tmp1;
                }
            }
            answer[i] = tmp1;
            tmp1 = "";
        }
        return answer;
    }
}
