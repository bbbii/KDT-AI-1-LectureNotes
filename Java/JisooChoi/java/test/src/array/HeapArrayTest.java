package array;

public class HeapArrayTest {
    public static void main(String[] args) {
        final int START = 0;
        final int ALLOC_ARRAY_NUMBER = 5;

        // Heap에 할당된 메모리 변경 금지를 요청한 것이고
        // 내부에 배치하는 것에는 영향을 받지 않기 떄문이다.
        final int[] numberArray = new int[ALLOC_ARRAY_NUMBER];
        // 아래와 같이 새로운 메모리를 할당해서 전달하는 것을 막고 있다.
        // 조금 풀어보자면 객체를 상수화 하느냐
        // 객체 내부의 값을 상수화 하느냐의 관점으로 봐야한다.
        // 현재 관점은 객체를 상수화하였기 때문에 다른 객체 대입이 막히는 모습이다.
        // numberArray = new int[8];

        for(int i = START; i < ALLOC_ARRAY_NUMBER; i++){
            numberArray[i] = i + 1;
            // printf의 경우 format을 출력한다는 뜻으로 printf 이다.
            // format의 %d의 경우 정수형(int)
            // %s의 경우(String)인데 필요없다. java는 +가 되니까욥 ~
            // %f의 경우엔 (float, double)등을 처리한다.

            // printf("numberArray[%d] = %d\n", i, numberArray[i])
            // 위 케이스에서 첫 번째 %d와 두 번째 %d가 보인다.
            // 첫 번째는 ', i'가 대응해서 i 값이 %d를 대체하게 된다.
            // 두 번째는 ', numberArray[i]'가 대응해서
            // numberArray[i]에 해당하는 배열 값이 %d를 대체한다.
            System.out.printf("numberArray[%d] = %d\n", i, numberArray[i]);
            // System.out.println("numberArray[" + i + "] = " +numberArray[i]);
        }

        System.out.println();

        for(final int num: numberArray){
            System.out.println("numberArray elem: "+num);
        }
    }
}
