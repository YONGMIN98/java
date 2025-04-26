package ArrayStudy;

public class Array {
    public static void main(String[] args){
        int[]  score; //배열 score 선언(참조변수 선언)
        score = new int[5]; //배열의 생성(int 저장공간은 5)

        score[3] = 100;
        System.out.println(score[0]);//저장된값 없으므로 0출력
        System.out.println(score[1]);//저장된값 없으므로 0출력
        System.out.println(score[2]);//저장된값 없으므로 0출력
        System.out.println(score[3]);//100을 저장했으니 100출력
        System.out.println(score[4]);//저장된값 없으므로 0출력
    }
}
