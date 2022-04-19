public class ShortyHumanUpdated extends ShortyHuman implements Moves{
    public ShortyHumanUpdated(String name, int age, char gender, int health, LiveStatus status) {
        super(name, age, gender, health, status);
    }
    @Override
    public String grabSomeone(ShortyHuman h) {
        return (name +
                " схватил коротышку по имени " + h.name + " на ");
    }
    @Override
    public String runTo(Location l) {
        return name + " побежал в " + l;
    }
    @Override
    public String lie() {
        return "лежал " + name;
    }
    @Override
    public String loseConsciousness() {
        return name + " потерял сознание";
    }
    @Override
    public String findYourselfSomewhere(Location l) {
        return "Скоро они были " +  l;
    }
    @Override
    public String lookAround() {
        return " озирался по сторонам";
    }
    @Override
    public String sitOn(Location l) {
        return "сидит на " + l;
    }
    @Override
    public String fallOnSomething(Location l) {
        return " в изнеможении упал на " + l;
    }
    @Override
    public String runInto(Location l) {
        return name + " выбежал к " + l;
    }
    @Override
    public String turnInto() {
        class Lamb{
            String transform(){
                return " превратится в барашка ";
            }
        }
        Lamb l = new Lamb();
        return name + l.transform() + " и тогда его уже ничто не спасет ";
    }
    @Override
    public String fear() {
        return "Он боялся, что ";
    }








    @Override
    public String toString() {
        return "ShortyHumanUpdated{" +
                "health=" + health +
                ", ListToFly='" + ListToFly + '\'' +
                ", status=" + status +
                ", c=" + c +
                ", q=" + q +
                '}';
    }
}
