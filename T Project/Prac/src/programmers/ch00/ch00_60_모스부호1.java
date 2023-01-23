package programmers.ch00;

public class ch00_60_모스부호1 {
    public String solution(String letter) {
        String answer = "";
        String[] str = letter.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(".-")){
                answer = answer + "a";
            }else if(str[i].equals("-...")){
                answer = answer + "b";
            }else if(str[i].equals("-.-.")){
                answer = answer + "c";
            }else if(str[i].equals("-..")){
                answer = answer + "d";
            }else if(str[i].equals(".")){
                answer = answer + "e";
            }else if(str[i].equals("..-.")){
                answer = answer + "f";
            }else if(str[i].equals("--.")){
                answer = answer + "g";
            }else if(str[i].equals("....")){
                answer = answer + "h";
            }else if(str[i].equals("..")){
                answer = answer + "i";
            }else if(str[i].equals(".---")){
                answer = answer + "j";
            }else if(str[i].equals("-.-")){
                answer = answer + "k";
            }else if(str[i].equals(".-..")){
                answer = answer + "l";
            }else if(str[i].equals("--")){
                answer = answer + "m";
            }else if(str[i].equals("-.")){
                answer = answer + "n";
            }else if(str[i].equals("---")){
                answer = answer + "o";
            }else if(str[i].equals(".--.")){
                answer = answer + "p";
            }else if(str[i].equals("--.-")){
                answer = answer + "q";
            }else if(str[i].equals(".-.")){
                answer = answer + "r";
            }else if(str[i].equals("...")){
                answer = answer + "s";
            }else if(str[i].equals("-")){
                answer = answer + "t";
            }else if(str[i].equals("..-")){
                answer = answer + "u";
            }else if(str[i].equals("...-")){
                answer = answer + "v";
            }else if(str[i].equals(".--")){
                answer = answer + "w";
            }else if(str[i].equals("-..-")){
                answer = answer + "x";
            }else if(str[i].equals("-.--")){
                answer = answer + "y";
            }else{
                answer = answer + "z";
            }
        }
        return answer;
    }
}
