package fifthModule.task25;

public class PlanetTester {
    public String test(SpaceObject object) {
        if (object instanceof Planet) {
            return "planet";
        }
        return "not planet";
    }

}
