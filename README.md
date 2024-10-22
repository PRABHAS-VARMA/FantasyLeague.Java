# FantasyLeague.Java

# Abstraction
The Player class abstracts the common behavior that all types of players will have (like displaying their stats in this case). The specific details (whether it’s a Batsman’s runs or a Bowler’s wickets) are left to the subclasses to define.

# Encapsulation
Private fields like runsScored and wicketsTaken are protected, ensuring that these values can only be accessed or modified via controlled methods (getRunsScored(), setRunsScored()).


# Inheritance

The Batsman and Bowler classes inherit from the Player class, gaining common functionality (getting the player's name) while adding their own specific stats.

