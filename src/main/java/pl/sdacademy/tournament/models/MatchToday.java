
package pl.sdacademy.tournament.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MatchToday {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rounds")
    @Expose
    private List<Round> rounds = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MatchToday() {
    }

    /**
     * 
     * @param name
     * @param rounds
     */
    public MatchToday(String name, List<Round> rounds) {
        super();
        this.name = name;
        this.rounds = rounds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("rounds", rounds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(rounds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MatchToday) == false) {
            return false;
        }
        MatchToday rhs = ((MatchToday) other);
        return new EqualsBuilder().append(name, rhs.name).append(rounds, rhs.rounds).isEquals();
    }

}
