package ch02;


import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class lotto {
    public static void main(String[] args) {
        // 로또 번호를 저장할 Set 생성
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        // 6개의 고유한 로또 번호 생성
        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(45) + 1; // 1부터 45까지의 숫자 생성
            lottoNumbers.add(number); // Set에 추가 (중복은 자동으로 무시됨)
        }

        // 결과 출력
        System.out.println("추출된 로또 번호: " + lottoNumbers);
    }
}