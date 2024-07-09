package com.alura.scpegasus.core.domain;

public class Adress {
    private Integer id;
    private String zipCode;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String complement;

    public Adress(Integer addressId, String zipCode, String state, String city, String neighborhood, String street, String complement) {
        this.id = addressId;
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.complement = complement;
    }

    public Integer getId() {
        return id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public String getComplement() {
        return complement;
    }
}
