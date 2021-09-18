public class Variable {   
    public static void main(String[] args) {
    double Screen = 15.6;
    String TypeScreen = "IPS";
    String ScreenResolution = "1920x1080";
    String CPU = "i3-8130U";
    byte CpuCores = 2;
    short CpuThreads = 4;
    float CpuSpeed = 2.2f;
    int RAM = 8192;
    String TypeRam = "DDR4";
    long SSD = 512;
        System.out.println("Диагональ экрана в дюймах: "+Screen);
        System.out.println("Разрешение экрана: "+ScreenResolution);
        System.out.println("Тип матрицы: "+TypeScreen);
        System.out.println("Модель процессора: "+CPU);
        System.out.println("Кол-во ядер: "+CpuCores);
        System.out.println("Кол-во потоков: "+CpuThreads);
        System.out.println("Частота процессора: "+CpuSpeed +"GHz");
        System.out.println("Объем ОЗУ: "+RAM+"Mb");
        System.out.println("Объем SSD: "+SSD+"GB");
    }
}