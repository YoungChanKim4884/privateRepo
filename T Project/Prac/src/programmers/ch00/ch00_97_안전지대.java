package programmers.ch00;

public class ch00_97_안전지대 {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] tmp = new int[board.length][board.length];
        for(int i=0; i<tmp.length; i++){
            for(int j=0; j<tmp.length; j++){
                if(board[i][j]==1){
                    try{
                        tmp[i-1][j-1] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i][j-1] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i+1][j-1] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i-1][j] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i][j] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i+1][j] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i-1][j+1] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i][j+1] = 1;
                    }catch(Exception e){

                    }
                    try{
                        tmp[i+1][j+1] = 1;
                    }catch(Exception e){

                    }
                }
            }
        }
        for(int i=0; i<tmp.length; i++){
            for(int j=0; j<tmp.length; j++){
                if(tmp[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}
