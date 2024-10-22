abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void displayStats();
}

class Batsman extends Player {
    private int runsScored; 

    public Batsman(String name, int runsScored) {
        super(name); 
        this.runsScored = runsScored;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    @Override
    public void displayStats() {
        System.out.println(getName() + " is a Batsman with " + runsScored + " runs.");
    }
}

class Bowler extends Player {
    private int wicketsTaken;  
    public Bowler(String name, int wicketsTaken) {
        super(name); 
        this.wicketsTaken = wicketsTaken;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    @Override
    public void displayStats() {
        System.out.println(getName() + " is a Bowler with " + wicketsTaken + " wickets.");
    }
}

public class Main {
    public static void main(String[] args) {
        Player batsman = new Batsman("Virat Kohli", 12000);
        batsman.displayStats(); 

        Batsman specificBatsman = new Batsman("Rohit Sharma", 9000);
        specificBatsman.setRunsScored(9500); 
        System.out.println(specificBatsman.getName() + " now has " + specificBatsman.getRunsScored() + " runs.");

        Player bowler = new Bowler("Jasprit Bumrah", 200);
        bowler.displayStats(); 

        Bowler specificBowler = new Bowler("Mitchell Starc", 250);
        specificBowler.setWicketsTaken(260); 
        System.out.println(specificBowler.getName() + " now has " + specificBowler.getWicketsTaken() + " wickets.");
    }
}
