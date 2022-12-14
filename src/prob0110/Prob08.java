package prob0110;// 정수 내림차순으로 배치하기
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴

import java.util.Arrays;
import java.util.Comparator;

class Prob08 {
    public long solution(long n) {
//        n을 String배열에 넣은 후 reverseorder해서 다시 ParseLong
//        String.join 함수로 String[] -> String
        String[] strArr = (n + "").split("");
        Arrays.sort(strArr, Comparator.reverseOrder());
        long answer = Long.parseLong(String.join("", strArr));
        return answer;
    }

    public long solution2(long n) {
//        sol 2 성능 더 좋음
//        char[] 오름차순 Arrays.sort 하고 StringBuffer로 내림차순 reverse
        char[] charArr = Long.toString(n).toCharArray();
        Arrays.sort(charArr);
        StringBuffer rev = new StringBuffer(String.valueOf(charArr));
        return Long.parseLong(rev.reverse().toString());
    }
}


// join 함수 - 배열 요소마다 추가하고 싶은 문자와 함께 문자열로 변환
// char 배열 문자열로 변환할 때 Arrays.toString()