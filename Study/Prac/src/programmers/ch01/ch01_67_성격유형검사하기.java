package programmers.ch01;

public class ch01_67_성격유형검사하기 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] type = new int[4];
        String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};
        for(int i=0; i<choices.length; i++){
            choices[i] -= 4;
        }
        for(int i=0; i<survey.length; i++){
            if(survey[i].charAt(0)=='R' || survey[i].charAt(0)=='T'){
                if(survey[i].charAt(0)=='R'){
                    type[0] += choices[i];
                }else{
                    type[0] += -1 * choices[i];
                }
            }else if(survey[i].charAt(0)=='C' || survey[i].charAt(0)=='F'){
                if(survey[i].charAt(0)=='C'){
                    type[1] += choices[i];
                }else{
                    type[1] += -1 * choices[i];
                }
            }else if(survey[i].charAt(0)=='J' || survey[i].charAt(0)=='M'){
                if(survey[i].charAt(0)=='J'){
                    type[2] += choices[i];
                }else{
                    type[2] += -1 * choices[i];
                }
            }else{
                if(survey[i].charAt(0)=='A'){
                    type[3] += choices[i];
                }else{
                    type[3] += -1 * choices[i];
                }
            }
        }
        for(int i=0; i<type.length; i++){
            if(type[i]<1){
                answer += types[2 * i];
            }else{
                answer += types[2 * i + 1];
            }
        }
        return answer;
    }
}
