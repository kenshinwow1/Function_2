//Function_2

public class Main {
    public static void main(String[] args) {
byte[] nums1 = new byte[]{5,6,8};

int summ1 =  summaArray(nums1);
        System.out.println("Summa 1:" + summ1);

        byte[] nums2 = new byte[]{3,4,5,6,8};
        int summ2 =  summaArray(nums2);
        System.out.println("Summa 2:" + summ2);


    }

    public static int summaArray(byte[]arr){
        int summa = 0;
        for(byte i = 0; i <arr.length; i++)
            summa += arr[i];

        return summa;

    }

}