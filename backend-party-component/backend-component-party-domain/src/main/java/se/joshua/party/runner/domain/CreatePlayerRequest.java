package se.joshua.party.runner.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class CreatePlayerRequest implements Serializable {
    private static final long serialVersionUID = 1L;



    private String firstName;
    private String lastName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String email;
    private String userName;
    private Set<Long> attributes;

    private CreatePlayerRequest(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.email = builder.email;
        this.userName = builder.userName;
        this.attributes = builder.attributes;
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

    public static Builder builder (){
        return new Builder();
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

        public CreatePlayerRequest build() {
            return new CreatePlayerRequest(this);
        }
    }
}
