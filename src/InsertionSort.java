import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Nhap vao phan tu thu " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang da nhap la: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        insertionSort(array);

        System.out.println("\nMang sau khi sap xep la: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}