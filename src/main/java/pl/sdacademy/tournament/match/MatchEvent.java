package pl.sdacademy.tournament.match;

import pl.sdacademy.tournament.team.Person;

public class MatchEvent {
    private MatchEventType type;
    private Person player;
    private int minute;

    public MatchEvent(MatchEventType type, Person player, int minute) {
        this.type = type;
        this.player = player;
        this.minute = minute;
    }

    public MatchEventType getType() {
        return type;
    }

    public Person getPlayer() {
        return player;
    }

    public int getMinute() {
        return minute;
    }
}
