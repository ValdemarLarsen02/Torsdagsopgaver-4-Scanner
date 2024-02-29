import java.util.ArrayList;

class Team {
    private String teamName;
    private int teamRank; // Assuming default rank might be 0 or any other appropriate value
    private ArrayList<String> teamMembers;

    // 1.f Creating constructor 
    public Team(String teamName) {
        this.teamName = teamName;
        this.teamRank = 0; 
        this.teamMembers = new ArrayList<>();
    }

    public void setRank(int rank) {
        this.teamRank = rank;
    }

    @Override
    public String toString() {
        return "Hold: " + this.teamName + " Rang: " + this.teamRank;
    }
    
}
