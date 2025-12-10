package core.basesyntax;

import java.util.Objects;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private User (Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder() {

        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(name, age);
        }
    }

    public static User of(String name, int age) {
        return new User(name,age);
    }

}

