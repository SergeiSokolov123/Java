public class Country {
    private String name;
    private int population;
    private double squareKilometer;
    private String capitalName;
    private String accessToTheSea;

    public Country(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquareKilometer() {
        return squareKilometer;
    }

    public void setSquareKilometer(double squareKilometer) {
        this.squareKilometer = squareKilometer;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getAccessToTheSea() {
        return accessToTheSea;
    }

    public void setAccessToTheSea(String accessToTheSea) {
        this.accessToTheSea = accessToTheSea;
    }
}
