package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    AfishaFilm film1 = new AfishaFilm("Film1");
    AfishaFilm film2 = new AfishaFilm("Film2");
    AfishaFilm film3 = new AfishaFilm("Film3");
    AfishaFilm film4 = new AfishaFilm("Film4");
    AfishaFilm film5 = new AfishaFilm("Film5");
    AfishaFilm film6 = new AfishaFilm("Film6");
    AfishaFilm film7 = new AfishaFilm("Film7");
    AfishaFilm film8 = new AfishaFilm("Film8");
    AfishaFilm film9 = new AfishaFilm("Film9");
    AfishaFilm film10 = new AfishaFilm("Film10");
    Manager man = new Manager(5);

    @BeforeEach
    public void setup() {
        man.add(film1);
        man.add(film2);
        man.add(film3);
        man.add(film4);
        man.add(film5);
        man.add(film6);
        man.add(film7);
        man.add(film8);
        man.add(film9);
        man.add(film10);
    }

    @Test
    public void AddFilms() {
        AfishaFilm[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        AfishaFilm[] actual = man.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ReversedFilms() {

        AfishaFilm[] expected = {film10, film9, film8, film7, film6};
        AfishaFilm[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ReversedMaxFilms() {
        Manager man = new Manager();
        man.add(film1);
        man.add(film2);
        man.add(film3);
        man.add(film4);
        man.add(film5);
        man.add(film6);
        man.add(film7);
        man.add(film8);
        man.add(film9);
        man.add(film10);

        AfishaFilm[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        AfishaFilm[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
