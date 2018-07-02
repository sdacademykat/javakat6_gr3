package pl.sdacademy.tournament;

import pl.sdacademy.tournament.group.GroupPhase;
import pl.sdacademy.tournament.group.GroupPhaseDataProvider;
import pl.sdacademy.tournament.group.providers.FixedGroupPhaseDataProvider;
import pl.sdacademy.tournament.group.providers.JsonGroupPhaseDataProvider;

public class Main {
    public static void main(String[] args) {

        GroupPhaseDataProvider groupPhaseDataProvider = new FixedGroupPhaseDataProvider();
        GroupPhase groupPhase = groupPhaseDataProvider.getGroupPhase();

        GroupPhaseDataProvider json = new JsonGroupPhaseDataProvider();
        json.getGroupPhase();

        while (!groupPhase.isFinished()) {
            groupPhase.generateNextRoundMatches();
            System.out.println("Dodano runde: " + groupPhase.getCurrentRound());
        }
    }
}
