
package dogexcercise;

import java.util.ArrayList;
import java.util.List;

public class Team {
    
    private String sport;
    private List<Person> roster = new ArrayList();

    public Team() {
    }

    public Team(String sport) {
        this.sport = sport;
    }

    
    public Team(String sport, List<Person> list) {
        this.sport = sport;
        roster = list;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<Person> getRoster() {
        return roster;
    }

    public void setRoster(List<Person> roster) {
        this.roster = roster;
    }
    
    public void setPlayer(List<Person> players){
        roster = players;
    }
    
    public List<Person> getPlayers(){
        return roster;
    }
    
    
    
}
