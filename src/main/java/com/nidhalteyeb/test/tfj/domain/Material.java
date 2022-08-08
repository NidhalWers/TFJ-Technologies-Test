package com.nidhalteyeb.test.tfj.domain;

import java.util.List;

public class Material {

    private String name;

    private String description;

    private String brand;

    private String imageUrl;

    private MaterialSize size;

    private int rentalDuration;

    private double rentalCost;

    private double replacementCost;

    private List<Category> categories;

    private Material(final Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.brand = builder.brand;
        this.imageUrl = builder.imageUrl;
        this.size = builder.size;
        this.rentalDuration = builder.rentalDuration;
        this.rentalCost = builder.rentalCost;
        this.replacementCost = builder.replacementCost;
        this.categories = builder.categories;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public MaterialSize getSize() {
        return size;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public List<Category> getCategories() {
        return categories;
    }

    private static class Builder {

        private String name;

        private String description;

        private String brand;

        private String imageUrl;

        private MaterialSize size;

        private int rentalDuration;

        private double rentalCost;

        private double replacementCost;

        private List<Category> categories;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder size(MaterialSize size) {
            this.size = size;
            return this;
        }

        public Builder rentalDuration(int rentalDuration) {
            this.rentalDuration = rentalDuration;
            return this;
        }

        public Builder rentalCost(double rentalCost) {
            this.rentalCost = rentalCost;
            return this;
        }

        public Builder replacementCost(double replacementCost) {
            this.replacementCost = replacementCost;
            return this;
        }

        public Builder categories(List<Category> categories) {
            this.categories = categories;
            return this;
        }

        public Material build() {
            return new Material(this);
        }
    }

}
