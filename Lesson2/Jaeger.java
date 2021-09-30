public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float weight;
    private float height;
    private int strength;
    private int armor;

    piulic void setModelname(String modelName) {
        this.modelName = modelName;
    }
    piulic String getModelname() {
        return modelName;
    }

    piulic void setMark(String mark) {
        this.mark = mark;
    }
    piulic String getMark() {
        return mark;
    }

    piulic void setOirigin(String origin) {
        this.origin = origin;
    }
    piulic String getModelname() {
        return origin;
    }

    piulic void setOirigin(String origin) {
        this.origin = origin;
    }
    piulic String getModelname() {
        return origin;
    }



    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }
}
