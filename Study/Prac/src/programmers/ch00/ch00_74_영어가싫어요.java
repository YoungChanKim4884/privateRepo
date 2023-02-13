package programmers.ch00;

public class ch00_74_영어가싫어요 {
    public long solution(String numbers) {
        long answer = 0;
        while(numbers.length()!=0){
            if(numbers.indexOf("zero")==0){
                answer = answer * 10;
                numbers = numbers.substring(4);
            }else if(numbers.indexOf("one")==0){
                answer = (answer * 10) + 1;
                numbers = numbers.substring(3);
            }else if(numbers.indexOf("two")==0){
                answer = (answer * 10) + 2;
                numbers = numbers.substring(3);
            }else if(numbers.indexOf("three")==0){
                answer = (answer * 10) + 3;
                numbers = numbers.substring(5);
            }else if(numbers.indexOf("four")==0){
                answer = (answer * 10) + 4;
                numbers = numbers.substring(4);
            }else if(numbers.indexOf("five")==0){
                answer = (answer * 10) + 5;
                numbers = numbers.substring(4);
            }else if(numbers.indexOf("six")==0){
                answer = (answer * 10) + 6;
                numbers = numbers.substring(3);
            }else if(numbers.indexOf("seven")==0){
                answer = (answer * 10) + 7;
                numbers = numbers.substring(5);
            }else if(numbers.indexOf("eight")==0){
                answer = (answer * 10) + 8;
                numbers = numbers.substring(5);
            }else if(numbers.indexOf("nine")==0){
                answer = (answer * 10) + 9;
                numbers = numbers.substring(4);
            }
        }
        return answer;
    }
}
