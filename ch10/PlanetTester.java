public class PlanetTester
{
    public static void main(String[] args)
    {
        Planet planet1 = new Planet("Mercury");
        Planet planet2 = new Planet("Venus");
        Planet planet3 = new Planet("Earth");
        Planet planet4 = new Planet("Mars");
        Planet planet5 = new Planet("Jupiter");
        Planet planet6 = new Planet("Saturn");
        Planet planet7 = new Planet("Uranus");
        Planet planet8 = new Planet("Neptune");
        Planet planet9 = new Planet("Pluto");

        Planet[] planets = new Planet[9];
        planets[0] = planet1;
        planets[1] = planet2;
        planets[2] = planet3;
        planets[3] = planet4;
        planets[4] = planet5;
        planets[5] = planet6;
        planets[6] = planet7;
        planets[7] = planet8;
        planets[8] = planet9;

        for(Planet planet:planets)
        {
            System.out.println(planet.getName());
        }

    }
}
