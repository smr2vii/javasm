public class Uzduotis_1 {
    public static void main(String[] args) {


        int skaicius = 22;

        if (skaicius > 0) {
            if (skaicius < 13) {
                switch (skaicius){
                    case 1:
                        System.out.println("sausis");
                        break;
                    case 2:
                        System.out.println("VASARIS");
                        break;
                    case 3:
                        System.out.println("kovas");
                        break;
                    case 4:
                        System.out.println("BALANDIS");
                        break;
                    case 5:
                        System.out.println("geguze");
                        break;
                    case 6:
                        System.out.println("BIRZELIS");
                        break;
                    case 7:
                        System.out.println("liepa");
                        break;
                    case 8:
                        System.out.println("RUGPJUTIS");
                        break;
                    case 9:
                        System.out.println("rugsejis");
                        break;
                    case 10:
                        System.out.println("SPALIS");
                        break;
                    case 11:
                        System.out.println("lapkritis");
                        break;
                    case 12:
                        System.out.println("GRUODIS");
                        break;
                }
            }else{
                System.out.println("netinkamas skaicius");
            }
        }else {
            System.out.println("netinkamas skaicius");
        }

    }
}
