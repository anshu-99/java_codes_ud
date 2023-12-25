public class GcdPrint {
    public static void main(String[] args) {
        int a=12;
        int b=30;
        int hcf=1;

        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0&&b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" is: "+hcf);
        int a1 = 0, b1 = 1, c;
        System.out.println("Fibonacci Series:");

        for (int i = 0; i <= 20; i++) {
            System.out.print(a1 + "\t");
            c = a1 + b1;
            a1 = b1;
            b1 = c;
        }
        System.out.println();
        int up;
        int down;
        int next;
        for(int i=1;i<=10;i++){
            up=0;
            down=1;
            System.out.print(down+" ");
            for(int j=1;j<i;j++){
                next=up+down;
                System.out.print(next+" ");
                up=down;
                down=next;
            }
            System.out.println();
        }
        byte[] byteArray = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100}; // ASCII values for "Hello World"

        String result = new String(byteArray);

        System.out.println("Converted String: " + result);
    }
    }
    
