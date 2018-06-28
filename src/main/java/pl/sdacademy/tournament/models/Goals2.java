
package pl.sdacademy.tournament.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Goals2 {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("minute")
    @Expose
    private Integer minute;
    @SerializedName("score1")
    @Expose
    private Integer score1;
    @SerializedName("score2")
    @Expose
    private Integer score2;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("owngoal")
    @Expose
    private Boolean owngoal;
    @SerializedName("penalty")
    @Expose
    private Boolean penalty;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Goals2() {
    }

    /**
     * 
     * @param minute
     * @param owngoal
     * @param score2
     * @param name
     * @param score1
     * @param penalty
     * @param offset
     */
    public Goals2(String name, Integer minute, Integer score1, Integer score2, Integer offset, Boolean owngoal, Boolean penalty) {
        super();
        this.name = name;
        this.minute = minute;
        this.score1 = score1;
        this.score2 = score2;
        this.offset = offset;
        this.owngoal = owngoal;
        this.penalty = penalty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Boolean getOwngoal() {
        return owngoal;
    }

    public void setOwngoal(Boolean owngoal) {
        this.owngoal = owngoal;
    }

    public Boolean getPenalty() {
        return penalty;
    }

    public void setPenalty(Boolean penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("minute", minute).append("score1", score1).append("score2", score2).append("offset", offset).append("owngoal", owngoal).append("penalty", penalty).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minute).append(owngoal).append(score2).append(name).append(score1).append(penalty).append(offset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Goals2) == false) {
            return false;
        }
        Goals2 rhs = ((Goals2) other);
        return new EqualsBuilder().append(minute, rhs.minute).append(owngoal, rhs.owngoal).append(score2, rhs.score2).append(name, rhs.name).append(score1, rhs.score1).append(penalty, rhs.penalty).append(offset, rhs.offset).isEquals();
    }

}
