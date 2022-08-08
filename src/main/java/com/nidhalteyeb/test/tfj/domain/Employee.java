package com.nidhalteyeb.test.tfj.domain;

public class Employee {

    private String lastName;

    private String firstName;

    private String imageUrl;

    private String email;

    private String login;

    private String password;

    private boolean active;

    private Shop shop;

    private Employee(final Builder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.imageUrl = builder.imageUrl;
        this.email = builder.email;
        this.login = builder.login;
        this.password = builder.password;
        this.active = builder.active;
        this.shop = builder.shop;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public Shop getShop() {
        return shop;
    }

    private static class Builder {
        private String lastName;

        private String firstName;

        private String imageUrl;

        private String email;

        private String login;

        private String password;

        private boolean active;

        private Shop shop;

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder active(boolean actif) {
            this.active = actif;
            return this;
        }

        public Builder shop(Shop shop) {
            this.shop = shop;
            return this;
        }
    }
}
