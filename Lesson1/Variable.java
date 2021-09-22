public class Variable {   
    public static void main(String[] args) {
        double screen = 15.6;
        char typeScreen1 = 'I', typeScreen2 = 'P', typeScreen3 = 'S';
        int screenResolution1 = 1920;
        int screenResolution2 = 1080;
        char cpu1 = 'I';
        byte cpu2 = 3;
        byte cpuCores = 2;
        short cpuThreads = 4;
        float cpuSpeed = 2.2f;
        int ram = 8192;
        int typeRam = 4;
        long ssd = 512;
        boolean status_Work = true;
        System.out.println("Диагональ экрана в дюймах: " + screen);
        System.out.println("Разрешение экрана: " + screenResolution1 + "x" + screenResolution2 );
        System.out.println("Тип матрицы: " + typeScreen1 + typeScreen2 + typeScreen3 );
        System.out.println("Модель процессора: " + cpu1 + cpu2);
        System.out.println("Кол-во ядер: " + cpuCores);
        System.out.println("Кол-во потоков: " + cpuThreads);
        System.out.println("Частота процессора: " + cpuSpeed + "GHz");
        System.out.println("Объем ОЗУ: " + ram + "Mb");
        System.out.println("Объем ОЗУ: DDR" + typeRam);
        System.out.println("Объем SSD: " + ssd + "GB");
        System.out.println("Статус в сети: status_Work);
    }
}