public class Group {
    
    // Instance Data
    private String name;
    private int groupSize;
    private int numberOfTeams;
    private Team[] teams;
    private Game[][] games;
    private int[] points;

    // constructor 
    public Group(String name, int groupSize){
        this.name = name;
        this.groupSize = groupSize;
        this.numberOfTeams = 0;
        this.teams = new Team[groupSize];
        this.games = new Game[groupSize][groupSize - 1];
        this.points = new int[groupSize]; 
    }

    // Accessors
    public String getName(){
        return this.name;
    }
    
    public Team getTeam(int id){
        if(this.TeamExist(id)){
            for (Team team : this.teams){
                if (team != null) {
                    if (team.getID() == id){
                        return team;
                    }
                }
            }
        }
        return null;
    }

    public int getGroupSize(){
        return this.groupSize;
    }

    public int getNumberOfTeams(){
        return this.numberOfTeams;
    }

    // Team Exist Method
    public boolean TeamExist(int ID){
        for (int i = 0; i < this.groupSize; i++){
            if (this.teams[i] != null) {
                if (this.teams[i].getID() == ID) {
                    return true;
                }
            }
        }
        return false;
    }

    // Add team to the group
    public void addTeam(Team team){
        if (!TeamExist(team.getID())){
            this.teams[this.numberOfTeams] = team;
            this.numberOfTeams += 1;
        }        
    }

    // Add Game
    public void addGame(Game game){
        boolean playedBefore = false;
        boolean addedBefore = false;
        
        // Check if the provided games teams is in the group
        if (this.TeamExist(game.getTeams()[0].getID()) && this.TeamExist(game.getTeams()[1].getID())){
            for (int i = 0; i < this.groupSize; i++){

                // If we reach one of the teams row enter the loop to update it's games
                if(game.getTeams()[0] == (this.teams[i]) || game.getTeams()[1] == (this.teams[i])){
                    for (int j = 0; j < this.groupSize - 1; j++){
                        
                        // Check if the game is not null
                        if(this.games[i][j] != null){

                            // Cheking if the game exists or not
                            if ((this.games[i][j].getTeams()[0] == game.getTeams()[0] && this.games[i][j].getTeams()[1] == game.getTeams()[1]) || 
                            (this.games[i][j].getTeams()[0] == game.getTeams()[1] && this.games[i][j].getTeams()[1] == game.getTeams()[0])){
                                playedBefore = true;
                            }
                        }
                    }

                    // If the game does not exist
                    if(!playedBefore) {
                        addedBefore = false;
                        for (int j = 0; j < this.groupSize - 1; j++){
                            
                            // Check to see if we have added the game already or not
                            if (!addedBefore){
                                if(this.games[i][j] == null){
                                    this.games[i][j] = game;
                                }
                                this.points[i] += game.getTeamPoint(this.teams[i].getID());
                                addedBefore = true;
                            }
                        }
                    }
                }
            }

            // If the game exists
            if(playedBefore){
                System.out.println("Already a game between the teams exists!\n");
            }
        }
    }
    

    // To String
    public String toString(){

        int[] point2 = new int[this.groupSize];
        for (int i = 0; i < this.groupSize; i++){
            point2[i] = this.points[i];
        }

        int counter = 1;
        int max = -1;
        String output = "";
        
        output += "=".repeat(33) + "\n=\t Group " + this.getName() + " Standings \t=\n" + "=".repeat(33) + "\n";
        for (int j = 0; j < this.groupSize; j++){

            for (int i = 0; i < this.groupSize; i++) {
                if(point2[i] > max) {
                    max = point2[i];
                }           
            }
    
            for (int i = 0; i < this.groupSize; i++){
                if (point2[i] == max && this.teams[i] != null) {
                output += (counter++) + ".\t" + this.teams[i].getName() + "\t(" + this.teams[i].getID() + ")\t" + point2[i] + "\n";
                point2[i] = -2;
                max = -1;
                }
            }
        }

        output += "=".repeat(33) + "\n";
        return output;

    }
}
