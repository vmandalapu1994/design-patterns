package com.design_pattern.builder.implementation1;

public class User {


    private final String name;

    private final String email;

    private final String address;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.address = userBuilder.email;
    }

    public UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {

        private String name;

        private String address;

        private String email;

        public UserBuilder() {

        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            // Validate required fields and their values.
            return new User(this);
        }

    }
}
