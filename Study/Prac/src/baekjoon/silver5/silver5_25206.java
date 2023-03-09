package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class silver5_25206 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String grade;
        double credit, creditSum = 0, gradePoint, sum = 0;
        while(true) {
        	try {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				credit = Double.parseDouble(st.nextToken());
				grade = st.nextToken();
				if(grade.equals("A+")) {
					gradePoint = 4.5;
				}else if(grade.equals("A0")) {
					gradePoint = 4.0;
				}else if(grade.equals("B+")) {
					gradePoint = 3.5;
				}else if(grade.equals("B0")) {
					gradePoint = 3.0;
				}else if(grade.equals("C+")) {
					gradePoint = 2.5;
				}else if(grade.equals("C0")) {
					gradePoint = 2.0;
				}else if(grade.equals("D+")) {
					gradePoint = 1.5;
				}else if(grade.equals("D0")) {
					gradePoint = 1.0;
				}else{
					gradePoint = 0.0;
				}
				if(!(grade.equals("P"))) {
					creditSum += credit;
					sum += credit * gradePoint;
				}
			} catch (Exception e) {
				break;
			}
        }
        bw.write(sum / creditSum + "");
        bw.flush();
	}
}
