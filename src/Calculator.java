import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in); //Для чтения из консоли
        String str = console.nextLine(); //"Hello" + 5

        if (str.charAt(0) == '\"'){

        }else {
            System.out.println("ошибка");
            System.exit(-1);
        }

        if (str.indexOf('\"', 1) != -1){

        }else {
            System.out.println("ошибка");
            System.exit(-1);
        }

        String str1 = str.substring(0, str.indexOf('\"', 1) + 1);

        String strDop = str.substring(str1.length());
        char ch = strDop.charAt(1);

        String str2 = strDop.substring(3);
        int strNum = 0;
        if (str2.charAt(0) == '\"' && str2.charAt(str2.length() - 1) == '\"'){

        }else if (str2.charAt(0) != '\"' && str2.charAt(str2.length() - 1) != '\"'){
            try {
                strNum = Integer.parseInt(str2);
            } catch (NumberFormatException e){
                System.out.println("Операция не возможна");
                e.printStackTrace();
                System.exit(-1);
            }

            if (ch == '+' || ch == '-'){
                System.out.println("операция не возможна");
                System.exit(-1);
            }
        }else {
            System.out.println("это не строка и не число");
            System.exit(-1);
        }

        if (strNum < 0){
            System.out.println("число еньше 0");
            System.exit(-1);
        }

        switch (ch){
            case '+':
                AddString addStr = new AddString(str1, str2);
                System.out.println(addStr.addString());
                break;
            case '-':
                Minus strMinus = new Minus(str1, str2);
                System.out.println(strMinus.minus());
                break;
            case '*':
                Umnogenie umnogenie = new Umnogenie(str1, strNum);
                umnogenie.umnogenie();
                break;
            case '/':
                try {
                    Delenie delenie = new Delenie(str1, strNum);
                    System.out.println(delenie.delenie());
                }catch (ArithmeticException e){
                    System.out.println("деление на 0 невозможно");
                    e.printStackTrace();
                    System.exit(-1);
                }
                break;
            default:
                System.out.println("нет такогоо знака. Ошибка!");
                System.exit(-1);
                break;
        }

    }

}