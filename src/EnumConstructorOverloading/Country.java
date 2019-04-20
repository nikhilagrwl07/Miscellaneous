package EnumConstructorOverloading;

public enum Country {
    USA("United States of America", 33.6),
    INDIA("India", 35.0),
    CANADA("Canada", 40.0);

    private String countryName;
    private double averageAge;

    Country(String countryName, double averageAge) {
        this.countryName = countryName;
        this.averageAge = averageAge;
    }

    public String getCountryName() {
        return countryName;
    }

    public double getAverageAge() {
        return averageAge;
    }

    public static double calcalateAverageAge() {
        double totalAge = 0;
        for(Country country : Country.values()) {
            totalAge += country.getAverageAge();
        }

        double avgAge = totalAge/Country.values().length;
        return avgAge;
    }
}
