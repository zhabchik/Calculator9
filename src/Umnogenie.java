public class Umnogenie {
    String str1;
    int num;

    Umnogenie(String str1, int num) {
        this.str1 = str1;
        this.num = num;
    }

    public void umnogenie(){ //"hello" * 5
        str1 = str1.substring(1, str1.length() - 1);
        System.out.print("\"");

        for ( int i = 0; i < num; i++) { // num = 5
            System.out.print(str1);
        }
        System.out.print("\"");
        System.out.println();
    }
}