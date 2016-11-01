package se.joshua.party.runner.entity;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceRouting;
import com.so4it.common.component.entity.AbstractEntityBuilder;
import com.so4it.common.component.entity.IdEntity;
import com.so4it.common.util.object.Required;

import java.time.LocalDate;
import java.util.Set;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
@SpaceClass
public class PlayerEntity extends IdEntity<String> {

    private String id;
    private String firstName;
    private String lastName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String email;
    private String userName;
    private Set<Long> attributes;


    public PlayerEntity(Builder builder) {
        this.id = builder.id;
        this.firstName = Required.notNull(builder.firstName, "firstName", builder.isTemplate());
        this.lastName = Required.notNull(builder.lastName, "lastName", builder.isTemplate());
        this.startDate = Required.notNull(builder.startDate, "startDate", builder.isTemplate());
        this.endDate = Required.notNull(builder.endDate, "endDate", builder.isTemplate());
        this.email = Required.notNull(builder.email, "email", builder.isTemplate());
        this.userName = Required.notNull(builder.userName, "userName", builder.isTemplate());
        this.attributes = Required.notNull(builder.attributes, "attributes", builder.isTemplate());
    }


    @Override
    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Long> getAttributes() {
        return attributes;
    }

    public void setAttributes(Set<Long> attributes) {
        this.attributes = attributes;
    }

    @SpaceRouting
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public static Builder builder(){
        return new Builder(false);
    }

    public static class Builder extends AbstractEntityBuilder<PlayerEntity> {
        private String id;
        private String firstName;
        private String lastName;
        private LocalDate startDate;
        private LocalDate endDate;
        private String email;
        private String userName;
        private Set<Long> attributes;


        public Builder(boolean template) {
            super(template);
            attributes = createSet();
        }

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

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @Override
        public PlayerEntity build() {
            return new PlayerEntity(this);
        }
    }
}
