public class Calculator {   
    public static void main(String[] args)  {
// здесь меняем значение переменных a and b 
    int a = 5;
    int b = 2;

    char x= '%';// для выбора  меняем значение переменной
//переменный с операторами
    int oper = 0;

    if (x == '+') {
        oper = a + b;
                System.out.println("Summa   " + a + '+'+ b + '  =  '+ oper);       
    } else if (x == '-') {
        oper = a - b;
                System.out.println("Raznost  "+ a +'  -  '+ b +'  = '+ oper);
    } else if (x == '*') {
        oper = a * b;
                System.out.println("Proizvedenie   " + a + '  *  ' + b + '  =  '+ oper);    
    } else if (x == '/') {
    oper = a / b;
                System.out.println("Delenie  " + a + ' /  ' + b + ' =  '+ oper);
    } else if (x == '%') {
        oper = a % b;
                System.out.println("Delenie po moduliu  " + a + '   %  ' + b +'='+ oper);
    } else if (x == '^') {
    int result= 1;
    for (int i= 1; i <= b ;i++) {
        result = result * a;
        }
        System.out.println(a + "  v stepeni  " + b + "  =   " + result);
        }
    }
}



