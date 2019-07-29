package general;

import static com.sun.tools.doclint.Entity.lang;

public enum Currency {
    RUB("Российский рубль"), USD("Доллар США"), EUR("Евро");

    private String description;

    Currency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
