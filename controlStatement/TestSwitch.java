package controlStatement;

public class TestSwitch {
    public static void main(String[] args) {
        int i = (int)(6 * Math.random())+1;

        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("else");
        }

        char c = 'a';
        int rand = (int)(26*Math.random());
        char c2 = (char)(c + rand);
        System.out.println(c2);
        switch (c2){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音");
                break;
            case 'y':
            case 'w':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
        }
    }
}
