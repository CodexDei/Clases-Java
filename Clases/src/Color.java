public enum Color {

    BLANCO("Blanco"),
    AZUL("Azul"),
    ROJO("Rojo"),
    NEGRO("Negro"),
    NARANJA("Naranja"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    GRIS("Gris");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
