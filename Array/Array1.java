package ArrayStudy;

public class Array1 {
    public static void main(String[] args){
        int[] arr = new int[5];//배열의 크기가 5인 배열 생성

        for(int i=0; i<arr.length; i++){//배열크기를 수정하고 잊어먹을 수 있으므로 상수5 대신 코드를 간편하게 하기위해 arr.length를 사용
            System.out.println("arr["+i+"] ="+arr[i]);
        }
    }
}
