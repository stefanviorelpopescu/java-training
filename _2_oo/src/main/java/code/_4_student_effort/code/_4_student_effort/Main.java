package code._4_student_effort;

import second_challenge.Actor;
import second_challenge.Film;
import second_challenge.Studio;

public class Main {

  public void printStudiosWithActorName(Studio[] studios, String actorName) {
    for (Studio studio : studios) {
    found_actor:
    for (Film film : studio.getFilme())
      for (Actor actor : film.getActori())
        if (actor.getNume().equals(actorName)) {
          System.out.print(studio.getNume());
          break found_actor;
        }
    }
    System.out.println();
  }

  public void printFilmsWithActorAge(Film[] filme, Integer age) {
    for (Film film : filme) {
      for (Actor actor : film.getActori())
        if (actor.getVarsta() >= age) {
          System.out.print(film.getNume());
          break;
        }
    }
    System.out.println();
  }

  public void printStudiosWithTwoMovies(Studio[] studios) {
    for (Studio studio : studios) {
      if (studio.hasTwoMovies())
        System.out.print(studio.getNume());
    }
    System.out.println();
  }

  public static void main(String[] args) {

  }
}
