package org.corgi.refactoring.chapter3.assertion;

import java.util.Random;

public class Main {

    private static final Random random = new Random(1234);

    /*
    * Java 명령어 기본값은 어서션 비활성화로, 어서션을 활성화하려면 java 명령어 실행 시
    * -ea(Enable Assertion) 옵션을 지정해야 함 => java -ea Main || java -enableassertions Main
    * 반대로 어서션을 비활성화하려면 java -da Main || java -disableassertions Main 수행
    * IntelliJ VM Option에 -ea 추가할 경우, 올바르지 않은 조건이 Assertion에 걸리면 AssertionError를 출력
    */
    public static void main(String[] args) {

        execute(10);
        execute(10);
        execute(10);
        execute(10);
        execute(10);
    }


    public static void execute(int length) {

        int[] data = new int[length];

        for (int i=0; i<data.length; i++) {
            data[i] = random.nextInt(data.length);
        }

        SortSample sorter = new SortSample(data);
        System.out.println("BEFORE : " + sorter);

        sorter.sort();
        System.out.println("AFTER : " + sorter);
    }
}
