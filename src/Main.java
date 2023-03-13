public class Main {
    public static void main(String[] args) {
        int arr[]={3, 1 ,6, 8 ,90, 54, 12};

        int target=77;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target)
                System.out.println("true");


        }
        System.out.println("false");
    }
}
//time complexity:O(n)
//space complexity:O(1)