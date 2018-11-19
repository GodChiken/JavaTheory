package com.kbh.desk.theory.advanced.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LazyEvaluation {
    public static void main(String[] args) {
        // 메모리에는 이미 올라가 있음
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 계산 결과값은 이미 Optional에 담겨있어서, 꺼내서 출력만 함 (메모리 오버헤드가 적음)
        imperativeStyle(numbers).ifPresent(System.out::println);

        // 출력시점에 메모리에 access해서 코드조각을 모두 수행 (메모리 오버헤드가 큼)
        functionalStyle(numbers).ifPresent(System.out::println);
    }

    // numbers에 access하여 메모리 사용
    private static Optional<Integer> imperativeStyle(List<Integer> numbers) {
        for (final Integer number : numbers) {
            if (number > 3) {
                final Integer newNumber = number * 2;
                if (newNumber > 10) {
                    return Optional.of(newNumber);
                }
            }
        }
        return Optional.empty();
    }

    // 코드 조각만 들고있고, 다른 메모리 사용은 없음 (promise 상태라고도 함)
    private static Optional<Integer> functionalStyle(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number > 3)
                .map(number -> number * 2)
                .filter(number -> number > 10)
                .findFirst();
    }
}
