public class LocalInstance {
    String team;   // Instance variable
    String league; // Instance variable

    void league(String teamName, String leagueName) {
        this.team = teamName;
        this.league = leagueName;
    }

    void display() {
        System.out.println("Choosing Team through Instance variable:");
        System.out.println("League Name = " + league);
        System.out.println("Team Name = " + team + "\n");
    }

    public static void main(String[] args) {
        LocalInstance choice1 = new LocalInstance();
        choice1.league("Real Madrid", "La Liga");
        choice1.display();

        String team_2 = "Liverpool";
        String league_2 = "Premier League";

        System.out.println("Choosing Team through Local variable:");
        System.out.println("League Name = " + league_2);
        System.out.println("Team Name = " + team_2);
    }
}
