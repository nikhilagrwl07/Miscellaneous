package EnumConstructorOverloading;

public class MainDriver{
    public static void main(String[] args) {
        Country country = Country.INDIA;
        System.out.println("Country Name - " + country.getCountryName());
        System.out.println("Country's average age - " + country.getAverageAge());

        City city = City.NEW_YORK;
        System.out.println("City Name - " + city);
        System.out.println("Country Name - " + city.getCountry().getCountryName());

    }
}
