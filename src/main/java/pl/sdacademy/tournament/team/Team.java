package pl.sdacademy.tournament.team;

import java.util.List;

public class Team {
    private String name;
    private Person coach;
    private List<Person> players;

    public Team(String name, Person coach, List<Person> players) {
        this.name = name;
        this.coach = coach;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public Person getCoach() {
        return coach;
    }

    public List<Person> getPlayers() {
        return players;
    }
}
