package inheritance;

public class Food {

    //Instance variables
    public static final boolean isTangible = true;
    public String taste;
    protected String name;
    boolean isSpicy;
    private boolean isOrganic;

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic +
                '}';
    }
}
