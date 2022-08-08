package com.nidhalteyeb.test.tfj.domain;

import java.util.List;

public class Inventory {

    private List<Material> materials;

    private Shop shop;

    private Inventory(final Builder builder) {
        this.materials = builder.materials;
        this.shop = builder.shop;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public Shop getShop() {
        return shop;
    }

    private static class Builder {
        private List<Material> materials;

        private Shop shop;

        public Builder materials(List<Material> materials) {
            this.materials = materials;
            return this;
        }

        public Builder shop(Shop shop) {
            this.shop = shop;
            return this;
        }

        public Inventory build() {
            return new Inventory(this);
        }
    }
}
