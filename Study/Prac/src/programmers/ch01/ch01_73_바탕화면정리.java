package programmers.ch01;

public class ch01_73_바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0] = wallpaper.length;
        answer[1] = wallpaper[0].length();
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    if(answer[0]>i){
                        answer[0] = i;
                    }
                    if(answer[1]>j){
                        answer[1] = j;
                    }
                    if(answer[2]<=i){
                        answer[2] = i+1;
                    }
                    if(answer[3]<=j){
                        answer[3] = j+1;
                    }
                }
            }
        }
        return answer;
    }
}