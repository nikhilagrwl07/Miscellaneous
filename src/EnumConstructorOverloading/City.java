package EnumConstructorOverloading;

public enum City {
    NEW_YORK(Country.USA),
    MUMBAI(Country.INDIA),
    DELHI(Country.INDIA),
    SEATTLE(Country.USA),
    TORANTO(Country.CANADA);


    private Country country;

    City(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
