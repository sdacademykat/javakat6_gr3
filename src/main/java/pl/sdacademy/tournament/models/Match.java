
package pl.sdacademy.tournament.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Match {

    @SerializedName("num")
    @Expose
    private Integer num;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("team1")
    @Expose
    private Team1 team1;
    @SerializedName("team2")
    @Expose
    private Team2 team2;
    @SerializedName("score1")
    @Expose
    private Object score1;
    @SerializedName("score2")
    @Expose
    private Object score2;
    @SerializedName("score1i")
    @Expose
    private Object score1i;
    @SerializedName("score2i")
    @Expose
    private Object score2i;
    @SerializedName("goals1")
    @Expose
    private List<Goals1> goals1 = null;
    @SerializedName("goals2")
    @Expose
    private List<Goals2> goals2 = null;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("stadium")
    @Expose
    private Stadium stadium;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("score1et")
    @Expose
    private Object score1et;
    @SerializedName("score2et")
    @Expose
    private Object score2et;
    @SerializedName("score1p")
    @Expose
    private Object score1p;
    @SerializedName("score2p")
    @Expose
    private Object score2p;
    @SerializedName("knockout")
    @Expose
    private Boolean knockout;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Match() {
    }

    /**
     * 
     * @param score2i
     * @param goals2
     * @param goals1
     * @param score2et
     * @param score2
     * @param knockout
     * @param date
     * @param score1i
     * @param city
     * @param timezone
     * @param num
     * @param time
     * @param score1p
     * @param stadium
     * @param score2p
     * @param score1et
     * @param score1
     * @param group
     * @param team1
     * @param team2
     */
    public Match(Integer num, String date, String time, Team1 team1, Team2 team2, Object score1, Object score2, Object score1i, Object score2i, List<Goals1> goals1, List<Goals2> goals2, String group, Stadium stadium, String city, String timezone, Object score1et, Object score2et, Object score1p, Object score2p, Boolean knockout) {
        super();
        this.num = num;
        this.date = date;
        this.time = time;
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.score1i = score1i;
        this.score2i = score2i;
        this.goals1 = goals1;
        this.goals2 = goals2;
        this.group = group;
        this.stadium = stadium;
        this.city = city;
        this.timezone = timezone;
        this.score1et = score1et;
        this.score2et = score2et;
        this.score1p = score1p;
        this.score2p = score2p;
        this.knockout = knockout;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Team1 getTeam1() {
        return team1;
    }

    public void setTeam1(Team1 team1) {
        this.team1 = team1;
    }

    public Team2 getTeam2() {
        return team2;
    }

    public void setTeam2(Team2 team2) {
        this.team2 = team2;
    }

    public Object getScore1() {
        return score1;
    }

    public void setScore1(Object score1) {
        this.score1 = score1;
    }

    public Object getScore2() {
        return score2;
    }

    public void setScore2(Object score2) {
        this.score2 = score2;
    }

    public Object getScore1i() {
        return score1i;
    }

    public void setScore1i(Object score1i) {
        this.score1i = score1i;
    }

    public Object getScore2i() {
        return score2i;
    }

    public void setScore2i(Object score2i) {
        this.score2i = score2i;
    }

    public List<Goals1> getGoals1() {
        return goals1;
    }

    public void setGoals1(List<Goals1> goals1) {
        this.goals1 = goals1;
    }

    public List<Goals2> getGoals2() {
        return goals2;
    }

    public void setGoals2(List<Goals2> goals2) {
        this.goals2 = goals2;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Object getScore1et() {
        return score1et;
    }

    public void setScore1et(Object score1et) {
        this.score1et = score1et;
    }

    public Object getScore2et() {
        return score2et;
    }

    public void setScore2et(Object score2et) {
        this.score2et = score2et;
    }

    public Object getScore1p() {
        return score1p;
    }

    public void setScore1p(Object score1p) {
        this.score1p = score1p;
    }

    public Object getScore2p() {
        return score2p;
    }

    public void setScore2p(Object score2p) {
        this.score2p = score2p;
    }

    public Boolean getKnockout() {
        return knockout;
    }

    public void setKnockout(Boolean knockout) {
        this.knockout = knockout;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("num", num).append("date", date).append("time", time).append("team1", team1).append("team2", team2).append("score1", score1).append("score2", score2).append("score1i", score1i).append("score2i", score2i).append("goals1", goals1).append("goals2", goals2).append("group", group).append("stadium", stadium).append("city", city).append("timezone", timezone).append("score1et", score1et).append("score2et", score2et).append("score1p", score1p).append("score2p", score2p).append("knockout", knockout).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(goals2).append(score2i).append(goals1).append(score2et).append(score2).append(knockout).append(score1i).append(date).append(city).append(timezone).append(time).append(num).append(score1p).append(stadium).append(score2p).append(score1et).append(score1).append(group).append(team1).append(team2).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Match) == false) {
            return false;
        }
        Match rhs = ((Match) other);
        return new EqualsBuilder().append(goals2, rhs.goals2).append(score2i, rhs.score2i).append(goals1, rhs.goals1).append(score2et, rhs.score2et).append(score2, rhs.score2).append(knockout, rhs.knockout).append(score1i, rhs.score1i).append(date, rhs.date).append(city, rhs.city).append(timezone, rhs.timezone).append(time, rhs.time).append(num, rhs.num).append(score1p, rhs.score1p).append(stadium, rhs.stadium).append(score2p, rhs.score2p).append(score1et, rhs.score1et).append(score1, rhs.score1).append(group, rhs.group).append(team1, rhs.team1).append(team2, rhs.team2).isEquals();
    }

}
