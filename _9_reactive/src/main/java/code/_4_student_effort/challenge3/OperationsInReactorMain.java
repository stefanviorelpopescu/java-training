package code._4_student_effort.challenge3;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class OperationsInReactorMain {
    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    public static void main(String[] args) {
        System.out.println("All letters in words: ");
        displayingLetters();

        System.out.println("All distinct letters in words");
        findingMissingLetter();

        System.out.println("All distinct letters in word with the missing ones added for full alphabet");
        restoringMissingLetter();
    }

    static void displayingLetters() {
        Flux<String> letters = Flux.fromIterable(words).flatMap(word -> Flux.fromArray(word.split("")))
                .cache();

        letters.subscribe(System.out::println);
    }

    static void findingMissingLetter() {
        Flux<String> sortedLetters = Flux.fromIterable(words).flatMap(word -> Flux.fromArray(word.split("")))
                .sort().distinct().cache();

        sortedLetters.subscribe(System.out::println);
    }

    static void restoringMissingLetter() {

    }
}
