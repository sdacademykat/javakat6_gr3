
package pl.sdacademy.tournament.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Team1 {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Team1() {
    }

    /**
     * 
     * @param name
     * @param code
     */
    public Team1(String name, String code) {
        super();
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("code", code).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(code).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team1) == false) {
            return false;
        }
        Team1 rhs = ((Team1) other);
        return new EqualsBuilder().append(name, rhs.name).append(code, rhs.code).isEquals();
    }

}
