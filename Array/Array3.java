package ArrayStudy;

public class Array3 {
    public static void main(String[] args){
        int[] score = {10,20,30,40,50};

        for(int i=0; i<5; i++){//이번엔 조건을 상수로 표현햇지만 score.length 로 표현해도 좋음!
            System.out.println(score[i]);
        }
    }
}
