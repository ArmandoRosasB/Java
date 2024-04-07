package Arreglos;

public class Busqueda {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;

        int search = search(arr, target);
        int binSearch = binarySearch(arr, target);

        System.out.println("search = " + search);
        System.out.println("binSearch = " + binSearch);
    }

    public static int search (int [] arr, int target){
        int res = -1;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) res = i;
        }

        return res;
    }

    public static int binarySearch (int [] arr, int target){
        int res = -1;
        int start = 0, end = arr.length - 1;
        int mid;

        while (start <= end){
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                res = mid;
                break;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}
