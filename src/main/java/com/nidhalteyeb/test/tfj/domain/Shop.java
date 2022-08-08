package com.nidhalteyeb.test.tfj.domain;

public class Shop {

    private String town;

    private Employee manager;

    private Shop(final Builder builder) {
        this.town = builder.town;
        this.manager = builder.manager;
    }

    public String getTown() {
        return town;
    }

    public Employee getManager() {
        return manager;
    }

    private static class Builder {
        private String town;

        private Employee manager;

        public Builder town(String town) {
            this.town = town;
            return this;
        }

        public Builder manager(Employee manager) {
            this.manager = manager;
            return this;
        }
    }
}
