import java.util.*;

public class League {
    private Map<String, Integer> teamScores;
    // Constructor initializes the League with an empty map for team scores
    //...when an instance of League is created
    public League() {
        this.teamScores = new HashMap<>();
    }

    //this method takes the List of Match object as input
    //iterates through each match to update scores for both teams
    public void processMatches(List<Match> matches) {
        for (Match match : matches) {
            updateScores(match.getTeam1(), match.getScore1(), match.getTeam2(), match.getScore2());
         //   updateScores(match.getTeam2(), match.getScore2(), match.getTeam1(), match.getScore1());
        }
    }

    //this method will sort and print the final rankings of the table
    public void printRankingTable() {
        //create a list of Map.Entry objects from the teamScores map
        List<Map.Entry<String, Integer>> sortedTeams = new ArrayList<>(teamScores.entrySet());

        //Using custom comparator for sorting teams based on points...
        //....and tie-break if there is one
        Collections.sort(sortedTeams, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> team1, Map.Entry<String, Integer> team2) {
                int pointsComparison = team2.getValue().compareTo(team1.getValue());

                //**TIE--BREAKER**//
                // If points are the same, compare alphabetically
                if (pointsComparison == 0) {
                    return team1.getKey().compareTo(team2.getKey());
                }

                return pointsComparison;
            }
        });

        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedTeams) {
            System.out.println(rank + ". " + entry.getKey() + " " + entry.getValue());
            rank++;
        }
    }

    //this method updates team scores based on match results
    //takes in two teams and their scores
    private void updateScores(String team1, int score1, String team2, int score2) {

        int points1 = 0;
        int points2 = 0;

        //determine the right points to give based on the final score
        if (score1 > score2) {
            points1 = 3;
        } else if (score1 == score2) {
            points1 = 1;
            points2 = 1;
        } else {
            points2 = 3;
        }

        // Update team scores in the teamScores map
        teamScores.put(team1, teamScores.getOrDefault(team1, 0) + points1);
        teamScores.put(team2, teamScores.getOrDefault(team2, 0) + points2);
    }
}
