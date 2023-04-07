public class SortBinary {
    public static int binarySearch(int[] list, int x) {
        int low=0;
        int hight= list.length-1;
        while (hight>=low) {
            int mid=(low + hight)/2;
                if (x < list[mid]) {
                    hight=mid-1;
                } else if ( x==list[mid]) return mid;
            else low=mid+1;
        } return -1; // ko tim thay
    }

    public static void main(String[] args) {
        int [] xec={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(xec,3));
    }
}
