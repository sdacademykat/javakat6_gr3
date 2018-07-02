package pl.sdacademy.tournament.group.providers;

import com.google.gson.Gson;
import pl.sdacademy.tournament.group.Group;
import pl.sdacademy.tournament.group.GroupPhase;
import pl.sdacademy.tournament.group.GroupPhaseDataProvider;
import pl.sdacademy.tournament.models.Match;
import pl.sdacademy.tournament.models.MatchToday;
import pl.sdacademy.tournament.models.Round;
import pl.sdacademy.tournament.team.Person;
import pl.sdacademy.tournament.team.Team;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Mateusz Grabarski on 28.06.2018.
 */
public class JsonGroupPhaseDataProvider implements GroupPhaseDataProvider {

    @Override
    public GroupPhase getGroupPhase() {
        MatchToday matchToday = new Gson().fromJson(getJsonFromFile(), MatchToday.class);

        List<Group> groups = getAllGroups(matchToday.getRounds());

        for (Group group : groups) {
            addMatchesForGroup(group, matchToday.getRounds());
        }

        return new GroupPhase(groups);
    }

    private void addMatchesForGroup(Group group, List<Round> rounds) {
        for (Round round : rounds) {
            for (Match match : round.getMatches()) {
                if (match.getGroup().equals(group)) {
                    // TODO: 28.06.2018 add match
                }
            }
        }
    }

    private List<Group> getAllGroups(List<Round> rounds) {
        List<String> groupNames = new ArrayList<>();

        for (Round round : rounds) {
            groupNames.addAll(round.getMatches().stream()
                    .map(Match::getGroup)
                    .collect(Collectors.toList()));
        }

        Set<String> groupsSet = new HashSet<>(groupNames);

        List<Group> groups = new ArrayList<>();

        for (String s : groupsSet) {
            if (s != null) {
                List<Team> teams = getAllTeamsFromGroup(s, rounds);
                groups.add(new Group(s, teams));
            }
        }

        return groups;
    }

    private List<Team> getAllTeamsFromGroup(String groupName, List<Round> rounds) {
        Map<String, Team> teams = new HashMap<>();

        for (Round round : rounds) {
            for (Match match : round.getMatches()) {
                if (match.getGroup() != null &&
                        match.getGroup().equals(groupName)) {
                    teams.put(match.getTeam1().getName(), new Team(match.getTeam1().getName(), new Person("firstName", "laseName", LocalDate.of(1990, 1, 1)), Collections.emptyList()));
                    teams.put(match.getTeam2().getName(), new Team(match.getTeam2().getName(), new Person("firstName", "laseName", LocalDate.of(1990, 1, 1)), Collections.emptyList()));
                }
            }
        }

        return new ArrayList<>(teams.values());
    }

    private List<Match> getAllMatchesForGroup(Round round) {
        return null;
    }

    private String getJsonFromFile() {
        try {
            Path paths = Paths.get("data.json");
            List<String> strings = Files.readAllLines(paths);
            StringBuilder builder = new StringBuilder();
            strings.forEach(s -> builder.append(s));
            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}