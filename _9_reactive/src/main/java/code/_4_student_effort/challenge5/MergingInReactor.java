package code._4_student_effort.challenge5;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class MergingInReactor {
    private static final List<String> words1 = Arrays.asList(
            "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    private static final List<String> words2 = Arrays.asList(
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
        System.out.println("Merge flux with interleave");
        Flux<String> flux1 = Flux.fromIterable(words1).delayElements(Duration.ofMillis(50));
        Flux<String> flux2 = Flux.fromIterable(words2).delayElements(Duration.ofMillis(30));

        mergeFluxWithInterleave(flux1, flux2).subscribe(System.out::println);

        System.out.printf("%nMerge flux without interleave%n");
        mergeFluxWithNoInterleave(Flux.fromIterable(words1), Flux.fromIterable(words2)).subscribe(System.out::println);

        System.out.printf("%nMerge monos to create a flux%n");
        createFluxFromMultipleMono(Mono.just("alpha"), Mono.just("the")).subscribe(System.out::println);
    }

    // Merge flux1 and flux2 values with interleave
    // An interesting thing to note is that, opposed to concat (lazy subscription), the sources are subscribed eagerly.
    static Flux<String> mergeFluxWithInterleave(Flux<String> flux1, Flux<String> flux2) {
        return flux1.mergeWith(flux2);
    }
    // https://www.baeldung.com/reactor-combine-streams for up and down classes
    // Merge flux1 and flux2 values with no interleave (flux1 values and then flux2 values)
    static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1, Flux<String> flux2) {
        return flux1.concatWith(flux2);
    }

    // Create a Flux containing the value of mono1 then the value of mono2
    static Flux<String> createFluxFromMultipleMono(Mono<String> mono1, Mono<String> mono2) {
        return Flux.concat(mono1, mono2);
    }
}
