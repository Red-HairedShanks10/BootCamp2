import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //store match data in a list of Match objects by calling the readMatchesFromFile()
        List<Match> matches = readMatchesFromFile("C:\\Users\\Marco\\Desktop\\BootCamp2\\JAVA\\SoccerLeague\\src\\input.txt");

        //create a League instance
        League league = new League();
        //call processMatches to process matchData from txt file
        league.processMatches(matches);
        //call the printRankingTable
        league.printRankingTable();
    }

    //this method reads match data from a file returns a list of Match objects
    private static List<Match> readMatchesFromFile(String filename) {
        List<Match> matches = new ArrayList<>();

        //try block
        //uses BufferedReader to read lines from the file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            //for each line use the parseMatch() to convert line into a Match object
            while ((line = br.readLine()) != null) {
                String[] matchData = line.split(",");
                matches.add(parseMatch(matchData));
            }
        } catch (IOException e) {//catch any IO exception that may occur
            e.printStackTrace();
        }

        return matches;
    }

    //this method focuses on converting a line of a match into a Match object
    //uses a comma as a delimiter to split the two teams and their scores
    private static Match parseMatch(String[] matchData) {

        //if each match data is not formatted correctly display invalid format error message
        if (matchData.length != 2) {
            System.err.println("Invalid match data format: " + Arrays.toString(matchData));
            return null;
        }

        //split to get each team's name and score
        // then store these properties as unique data array for each team
        String[] team1Data = matchData[0].trim().split("\\s+", 2);
        String[] team2Data = matchData[1].trim().split("\\s+", 2);

        //if each teams data is not formatted correctly display invalid format error message
        if (team1Data.length != 2 || team2Data.length != 2) {
            System.err.println("Invalid team data format: " + Arrays.toString(matchData));
            return null;
        }

        //store team name
        String team1 = team1Data[0];
        String team2 = team2Data[0];

        int score1;
        int score2;

        try {
            //store each teams score as Integer object
            score1 = Integer.parseInt(team1Data[1]);
            score2 = Integer.parseInt(team2Data[1]);
        } catch (NumberFormatException e) {//catch any  NumberFormat exception
            System.err.println("Invalid score format: " + Arrays.toString(matchData));
            return null;
        }

        //return a Match object once done
        return new Match(team1, score1, team2, score2);
    }


}
