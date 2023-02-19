package programmers.ch01;

public class ch01_62_키패드누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        hand = hand.equals("left")?"L":"R";
        int[] rHand = {3, 2};
        int[] lHand = {3, 0};
        int[] input = new int[2];
        int t1 = 0;
        int t2 = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1){
                answer += "L";
                lHand[0] = 0;
                lHand[1] = 0;
            }else if(numbers[i]==2){
                input[0] = 0;
                input[1] = 1;
                t1 = Math.abs(input[0] - lHand[0]) + Math.abs(input[1] - lHand[1]);
                t2 = Math.abs(input[0] - rHand[0]) + Math.abs(input[1] - rHand[1]);
                if(t1<t2){
                    answer += "L";
                    lHand[0] = 0;
                    lHand[1] = 1;
                }else if(t2<t1){
                    answer += "R";
                    rHand[0] = 0;
                    rHand[1] = 1;
                }else{
                    answer += hand;
                    if(hand.equals("L")){
                        lHand[0] = 0;
                        lHand[1] = 1;
                    }else{
                        rHand[0] = 0;
                        rHand[1] = 1;
                    }
                }
            }else if(numbers[i]==3){
                answer += "R";
                rHand[0] = 0;
                rHand[1] = 2;
            }else if(numbers[i]==4){
                answer += "L";
                lHand[0] = 1;
                lHand[1] = 0;
            }else if(numbers[i]==5){
                input[0] = 1;
                input[1] = 1;
                t1 = Math.abs(input[0] - lHand[0]) + Math.abs(input[1] - lHand[1]);
                t2 = Math.abs(input[0] - rHand[0]) + Math.abs(input[1] - rHand[1]);
                System.out.print(t1 + "," +t2);
                if(t1<t2){
                    answer += "L";
                    lHand[0] = 1;
                    lHand[1] = 1;
                }else if(t2<t1){
                    answer += "R";
                    rHand[0] = 1;
                    rHand[1] = 1;
                }else{
                    answer += hand;
                    if(hand.equals("L")){
                        lHand[0] = 1;
                        lHand[1] = 1;
                    }else{
                        rHand[0] = 1;
                        rHand[1] = 1;
                    }
                }
            }else if(numbers[i]==6){
                answer += "R";
                rHand[0] = 1;
                rHand[1] = 2;
            }else if(numbers[i]==7){
                answer += "L";
                lHand[0] = 2;
                lHand[1] = 0;
            }else if(numbers[i]==8){
                input[0] = 2;
                input[1] = 1;
                t1 = Math.abs(input[0] - lHand[0]) + Math.abs(input[1] - lHand[1]);
                t2 = Math.abs(input[0] - rHand[0]) + Math.abs(input[1] - rHand[1]);
                if(t1<t2){
                    answer += "L";
                    lHand[0] = 2;
                    lHand[1] = 1;
                }else if(t2<t1){
                    answer += "R";
                    rHand[0] = 2;
                    rHand[1] = 1;
                }else{
                    answer += hand;
                    if(hand.equals("L")){
                        lHand[0] = 2;
                        lHand[1] = 1;
                    }else{
                        rHand[0] = 2;
                        rHand[1] = 1;
                    }
                }
            }else if(numbers[i]==9){
                answer += "R";
                rHand[0] = 2;
                rHand[1] = 2;
            }else{
                input[0] = 3;
                input[1] = 1;
                t1 = Math.abs(input[0] - lHand[0]) + Math.abs(input[1] - lHand[1]);
                t2 = Math.abs(input[0] - rHand[0]) + Math.abs(input[1] - rHand[1]);
                if(t1<t2){
                    answer += "L";
                    lHand[0] = 3;
                    lHand[1] = 1;
                }else if(t2<t1){
                    answer += "R";
                    rHand[0] = 3;
                    rHand[1] = 1;
                }else{
                    answer += hand;
                    if(hand.equals("L")){
                        lHand[0] = 3;
                        lHand[1] = 1;
                    }else{
                        rHand[0] = 3;
                        rHand[1] = 1;
                    }
                }
            } 
        }
        return answer;
    }
}
