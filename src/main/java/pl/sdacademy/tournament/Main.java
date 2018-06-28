package pl.sdacademy.tournament;

import pl.sdacademy.tournament.group.Group;
import pl.sdacademy.tournament.group.GroupPhase;
import pl.sdacademy.tournament.group.GroupPhaseDataProvider;
import pl.sdacademy.tournament.group.providers.FixedGroupPhaseDataProvider;
import pl.sdacademy.tournament.match.Match;
import pl.sdacademy.tournament.team.Person;
import pl.sdacademy.tournament.team.Team;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        GroupPhaseDataProvider groupPhaseDataProvider = new FixedGroupPhaseDataProvider();
        GroupPhase groupPhase = groupPhaseDataProvider.getGroupPhase();

        while (!groupPhase.isFinished()) {
            groupPhase.generateNextRoundMatches();
            System.out.println("Dodano runde: " + groupPhase.getCurrentRound());
        }
    }
}
