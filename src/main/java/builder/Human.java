package main.java.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
public class Human {

    private final String name;
    private final String lastName;
    private final int age;
    private final String height;
    private final String weight;
    private final String eyesColor;
    private final String hairColor;
    private final String birthPlace;
    private final Date birthDate;
    private final int numberOfSibling;
    private final boolean married;

    private Human(HumanBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
        this.eyesColor = builder.eyesColor;
        this.hairColor = builder.hairColor;
        this.birthPlace = builder.birthPlace;
        this.birthDate = builder.birthDate;
        this.numberOfSibling = builder.numberOfSibling;
        this.married = builder.married;
    }

    @NoArgsConstructor
    public static class HumanBuilder {

        private String name;
        private String lastName;
        private int age;
        private String height;
        private String weight;
        private String eyesColor;
        private String hairColor;
        private String birthPlace;
        private Date birthDate;
        private int numberOfSibling;
        private boolean married;

        public HumanBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public HumanBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public HumanBuilder withHeight(String height) {
            this.height = height;
            return this;
        }

        public HumanBuilder withWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public HumanBuilder withEyesColor(String eyesColor) {
            this.eyesColor = eyesColor;
            return this;
        }

        public HumanBuilder withHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public HumanBuilder withBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }

        public HumanBuilder withBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public HumanBuilder withNumberOfSibling(int numberOfSibling) {
            this.numberOfSibling = numberOfSibling;
            return this;
        }

        public HumanBuilder isMarried(boolean married) {
            this.married = married;
            return this;
        }

        public Human build() {
            Human human = new Human(this);
            return human;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthDate=" + birthDate +
                ", numberOfSibling=" + numberOfSibling +
                ", married=" + married +
                '}';
    }
}
