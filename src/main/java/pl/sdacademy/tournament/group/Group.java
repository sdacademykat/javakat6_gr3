package pl.sdacademy.tournament.group;

import pl.sdacademy.tournament.match.Match;
import pl.sdacademy.tournament.team.Team;

import java.util.*;
import java.util.stream.Collectors;

public class Group {
    private String name;
    private List<Team> teams;
    private Map<Integer, List<Match>> matchesByRound;

    public Group(String name, List<Team> teams) {
        this.name = name;
        if (teams.size() != 4) {
            throw new RuntimeException("Nieprawidłowa liczba drużyn");
        }
        this.teams = teams;
        this.matchesByRound = new HashMap<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setMatchesForRound(int round, List<Match> matches) {
        matchesByRound.put(round, matches);
    }

    public List<Match> getMatches(int round) {
        return matchesByRound.get(round);
    }

    public List<Match> getAllMatches() {
        return matchesByRound.values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        List<GroupTeamStatistics> groupTeamsStats = teams.stream()
                .map(team -> new GroupTeamStatistics(team, getMatchesForTeam(team)))
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(groupTeamsStats);
        StringBuilder stringBuilder = new StringBuilder(GroupTeamStatistics.GROUP_TEAM_STATS_HEADER);
        groupTeamsStats.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    public List<Match> getMatchesForTeam(Team team) {
        return getAllMatches().stream()
                .filter(m -> m.getTeam1() == team
                        || m.getTeam2() == team)
                .collect(Collectors.toList());
    }

    public void addMatch(Match match) {
        for (Integer round : matchesByRound.keySet()) {
            boolean isMatchInRound = isMatchInGroup(matchesByRound.get(round), match);
            if (!isMatchInRound) {
                List<Match> matchesInRound = new ArrayList<>(matchesByRound.get(round));
                matchesInRound.add(match);
                matchesByRound.put(round, matchesInRound);
            }
        }
    }

    private boolean isMatchInGroup(List<Match> matchesFromRound, Match matchToAdd) {
        for (Match match : matchesFromRound) {
            if (isTeamInMatch(match, matchToAdd.getTeam1()) &&
                    isTeamInMatch(match, matchToAdd.getTeam2())) {
                return true;
            }
        }
        return false;
    }

    private boolean isTeamInMatch(Match match, Team team) {
        return match.getTeam1().equals(team) || match.getTeam2().equals(team);
    }
}
