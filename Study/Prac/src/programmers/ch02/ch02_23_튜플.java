package programmers.ch02;

public class ch02_23_튜플 {
    public int[] solution(String s) {
        s = s.substring(2, s.length()-2);
        String[] str = s.split("\\},\\{");
        int[] answer = new int[str.length];
        String[][] strArr = new String[str.length][];
        for(int i=0; i<str.length; i++){
            String[] arr = str[i].split(",");
            strArr[arr.length-1] = arr;
        }
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<strArr.length; i++){
            for(int j=0; j<strArr[i].length; j++){
                for(int k=0; k<answer.length; k++){
                    if(Integer.parseInt(strArr[i][j])==answer[k]){
                        cnt1++;
                    }
                }
                if(cnt1==0){
                    answer[cnt2] = Integer.parseInt(strArr[i][j]);
                    cnt2++;
                    break;
                }else{
                    cnt1 = 0;
                }
            }
        }
        return answer;
    }
}
