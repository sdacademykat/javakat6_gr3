
package pl.sdacademy.tournament.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Round {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("matches")
    @Expose
    private List<Match> matches = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Round() {
    }

    /**
     * 
     * @param matches
     * @param name
     */
    public Round(String name, List<Match> matches) {
        super();
        this.name = name;
        this.matches = matches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("matches", matches).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(matches).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Round) == false) {
            return false;
        }
        Round rhs = ((Round) other);
        return new EqualsBuilder().append(matches, rhs.matches).append(name, rhs.name).isEquals();
    }

}
