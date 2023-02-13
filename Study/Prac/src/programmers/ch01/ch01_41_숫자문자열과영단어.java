package programmers.ch01;

public class ch01_41_숫자문자열과영단어 {
    public int solution(String numbers) {
        int answer = 0;
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
            }else if(numbers.indexOf("0")==0){
                answer = answer * 10;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("1")==0){
                answer = (answer * 10) + 1;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("2")==0){
                answer = (answer * 10) + 2;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("3")==0){
                answer = (answer * 10) + 3;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("4")==0){
                answer = (answer * 10) + 4;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("5")==0){
                answer = (answer * 10) + 5;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("6")==0){
                answer = (answer * 10) + 6;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("7")==0){
                answer = (answer * 10) + 7;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("8")==0){
                answer = (answer * 10) + 8;
                numbers = numbers.substring(1);
            }else if(numbers.indexOf("9")==0){
                answer = (answer * 10) + 9;
                numbers = numbers.substring(1);
            }
        }
        return answer;
    }
}
