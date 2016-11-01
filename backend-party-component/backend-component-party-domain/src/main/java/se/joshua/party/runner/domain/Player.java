package se.joshua.party.runner.domain;



import com.so4it.common.util.Required;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String email;
    private String userName;
    private Set<Long> attributes;


    public Player() {

    }

    public Player(Builder builder) {
        this.firstName = Required.notNull(builder.firstName, "firstName");
        this.lastName = Required.notNull(builder.lastName, "lastName");
        this.startDate = Required.notNull(builder.startDate, "startDate");
        this.endDate = Required.notNull(builder.endDate, "endDate");
        this.email = Required.notNull(builder.email, "email");
        this.userName = Required.notNull(builder.userName, "userName");
        this.attributes = Required.notNull(builder.attributes, "attributes");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public Set<Long> getAttributes() {
        return attributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        if (!getFirstName().equals(player.getFirstName())) return false;
        if (!getLastName().equals(player.getLastName())) return false;
        if (!getStartDate().equals(player.getStartDate())) return false;
        return getEndDate().equals(player.getEndDate());

    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getStartDate().hashCode();
        result = 31 * result + getEndDate().hashCode();
        return result;
    }

    public static class Builder {

        private String firstName;
        private String lastName;

        private LocalDate startDate;
        private LocalDate endDate;
        private String email;
        private String userName;
        private Set<Long> attributes;


        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {

            this.lastName = lastName;
            return this;
        }

        public Builder withStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder withEndDate(LocalDate endDate) {

            this.endDate = endDate;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder withAttributes(Set<Long> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }


}
