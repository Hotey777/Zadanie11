package ru.netology.afisha;

public class Manager {

    private AfishaFilm[] films = new AfishaFilm[0];
    private int maxFilms;

    public  Manager() {
        maxFilms = 10;
    }
    public  Manager(int quantity) {
        maxFilms = quantity;
    }
    public void add(AfishaFilm film) {
        AfishaFilm[] tmp = new AfishaFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public AfishaFilm[] findAll() {
        return films;
        }

    public AfishaFilm[] findLast() {
        int resultLength;
        if (maxFilms < films.length) {
            resultLength = maxFilms;
        } else {
            resultLength = films.length;
        }

         AfishaFilm[] result = new AfishaFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 -i];
        }
        return result;
    }
}