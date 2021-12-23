package athlete;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

@XmlRootElement
public class Athlete {

    private Person person;
    private String nationalTeam;
    private Collection<String> achievements;

    public Athlete() {
    }

    public Athlete(Person person, String nationalTeam, Collection<String> achievements) {
        this.person = person;
        this.nationalTeam = nationalTeam;
        this.achievements = achievements;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNationalTeam() {
        return nationalTeam;
    }

    public void setNationalTeam(String nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    public Collection<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(Collection<String> achievements) {
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "person=" + person +
                ", nationalTeam='" + nationalTeam + '\'' +
                ", achievements=" + achievements +
                '}';
    }
}
