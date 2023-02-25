package programmers.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ch01_71_신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportCnt = new int[id_list.length];
        ArrayList<String> reportId = new ArrayList<>();
        
        // 한 유저가 동일 유저를 신고한 경우를 제외
        List<String> reports = new ArrayList<>(new HashSet<>(Arrays.asList(report)));
        // ArrayList<String> reports = new ArrayList<>();
        // reports.add(report[0]);
        // int cnt = 0;
        // for(int i=1; i<report.length; i++){
        //     for(int j=0; j<reports.size(); j++){
        //         if(report[i].equals(reports.get(j))){
        //             cnt++;
        //             break;
        //         }
        //     }
        //     if(cnt==0){
        //         reports.add(report[i]);
        //     }else{
        //         cnt = 0;
        //     }
        // }
        
        for(int i=0; i<reports.size(); i++){
            String[] str = reports.get(i).split(" ");
            for(int j=0; j<id_list.length; j++){
                if(str[1].equals(id_list[j])){
                    reportCnt[j]++;
                    break;
                }
            }
        }
        for(int i=0; i<reportCnt.length; i++){
            if(reportCnt[i]>=k){
                reportId.add(id_list[i]);
            }
        }
        for(int i=0; i<reports.size(); i++){
            String[] str = reports.get(i).split(" ");
            for(int j=0; j<reportId.size(); j++){
                if(str[1].equals(reportId.get(j))){
                    for(int l=0; l<id_list.length; l++){
                        if(str[0].equals(id_list[l])){
                            answer[l]++;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return answer;
    }
}