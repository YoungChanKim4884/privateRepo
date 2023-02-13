package programmers.ch00;

public class ch00_81_캐릭터의좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                answer[0] = answer[0] - 1;
            }else if(keyinput[i].equals("right")){
                answer[0] = answer[0] + 1;
            }else if(keyinput[i].equals("up")){
                answer[1] = answer[1] + 1;
            }else if(keyinput[i].equals("down")){
                answer[1] = answer[1] - 1;
            }
            if(answer[0]<-(board[0]/2)){
                answer[0] = -(board[0]/2);
            }else if(answer[0]>board[0]/2){
                answer[0] = board[0]/2;
            }
            if(answer[1]<-(board[1]/2)){
                answer[1] = -(board[1]/2);
            }else if(answer[1]>board[1]/2){
                answer[1] = board[1]/2;
            }
        }
        return answer;
    }
}
