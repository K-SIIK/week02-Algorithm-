// 하샤드 수
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다

class Prob12 {
    public boolean solution(int x) {
//        sol 1 성능 더 좋음
        int sum = 0;
        int temp = x;
        while (temp != 0) {
            sum += temp%10;
            temp /= 10;
        }

        if (x % sum == 0) return true;
        else return false;
//        return x % sum == 0;

//        sol 2
//        char[] str = (x + "").toCharArray();
//        int sum = 0;
//        for (char c : str) {
//            sum += c - '0';
//        }
//        if (x % sum == 0) return true;
//        else return false;
    }
}