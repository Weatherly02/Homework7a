package prractice;

public class practiceHwk {
    public static void main(String[] args) {

        int z = 1;
        int k = 2;
        int r = k;

        if (k < z) {
            r = k;
        }
        System.out.println(z);    //R3.1 values
        System.out.println(k);
        System.out.println(r + "\n");

        int b = 1;
        int m = -1;
        if (b < -m) {
            System.out.print(b);
        } else {
            System.out.print("m" + m + "\n");  //R3.4
        }

        for (int n = 0; n < 10; n++) {
            int result = n * n;
            System.out.println(result);   //R4.1 for loop
        }

        int u = 0;
        while (u < 10) {
            System.out.println(u * u);  //R4.1  while loop
            u++;
        }

        for (int s = 1; s < 10; s++) {
            System.out.println(s + " ");   // R4.4  loop prints
        }

    }
}









