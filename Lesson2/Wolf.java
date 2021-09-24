public class Wolf {
    private String name;
    private String sex;
    private String colour;
    private int age;
    private int weight;

    public void setName (String name) {
        this.name = name;
    }

    public void getName () {
        return name;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }

    public void getSex () {
        return sex;
    }

    public void setColour (String colour) {
        this.colour = colour;
    }

    public void getSex () {
        return sex;
    }

    public void setAge (int age) {
        if (age > 8) {
            System.out.println("Incorrect age!!!")
            System.out.println("Put correct age < 8 ")
        } else {
            this.age = age;
        }

        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public int getWeight () {
        return weight;
    }

    public void go() {
        System.out.println("Idti");
    }

    public void sit() {
        System.out.println("Sidet'");
    }

    public void run() {
        System.out.println("Begat'");
    }

    public void bark() {
        System.out.println("Vyt'");
    }

    public void hunt() {
        System.out.println("Ohotitsia");
    }
}