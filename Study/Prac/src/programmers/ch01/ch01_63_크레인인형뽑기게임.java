package programmers.ch01;

import java.util.ArrayList;

public class ch01_63_크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> intArr = new ArrayList<>();
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1]!=0){
                    intArr.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    if(intArr.size()>1 && intArr.get(intArr.size()-1).equals(intArr.get(intArr.size()-2))){
                        intArr.remove(intArr.size()-1);
                        intArr.remove(intArr.size()-1);
                        answer += 2;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
