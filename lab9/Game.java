

public class Game {
    
    // Instance data
    Team[] teams = new Team[2];
    int[] goals = new int[2];

    // Constructor
    public Game(Team team1, Team team2, int goal1, int goal2) {
        this.teams[0] = team1;
        this.teams[1] = team2;

        this.goals[0] = goal1;
        this.goals[1] = goal2;
    }

    // Accessors
    public Team[] getTeams(){
        return this.teams;
    }

    // Get team point method
    public int getTeamPoint(int ID){
        if (teams[0].getID() == ID){
            if (goals[0] > goals[1]){
                return 3;
            }
            else if (goals[0] == goals[1]){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if (teams[1].getID() == ID){
            if (goals[1] > goals[0]){
                return 3;
            }
            else if (goals[1] == goals[0]){
                return 1;
            }
            else {
                return 0;
            }
        }
        else{
            return 0;
        }
    }

    // To String method
    public String toString(){
        String output = "";
        output += this.teams[0].getName() + " vs. " + this.teams[1].getName() + ": " + this.goals[0] + "-" + this.goals[1];
        
        return output;
    }
}
