package code._4_student_effort.challenge1;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FluxInReactorMain {
    public static void main(String[] args) {

        fooBarFluxFromValues().subscribe(System.out::println);
        System.out.println();

        emptyFlux().subscribe(System.out::println);
        System.out.println();

        fooBarFluxFromList().subscribe(System.out::println);
        System.out.println();

        counter().subscribe(System.out::println);
        System.out.println();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        errorFlux().subscribe(System.out::println);
        System.out.println();
    }

    static Flux<String> emptyFlux() {
        return Flux.empty();
    }

    // Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    static Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

    // Create a Flux from a List that contains 2 values "foo" and "bar"
    static Flux<String> fooBarFluxFromList() {
        return Flux.fromIterable(Arrays.asList("foo", "bar"));
    }

    // Create a Flux that emits an IllegalStateException
    static Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException("Ceva descriere la eroare aici?"));
    }

    // Create a Flux that emits increasing values from 0 to 9 each 100ms
    static Flux<Long> counter() {
        List<Long> longs = new ArrayList<Long>();
        for (long i = 0; i < 10; i++) {
            longs.add(i);
        }

        return Flux.fromIterable(longs).delayElements(Duration.ofMillis(100)).cache();
    }
}
