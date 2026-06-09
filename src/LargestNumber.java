public class LargestNumber {
    public static void main(String[] args){
        int[] arr = {20,10, 30, 60};
        System.out.println("The largest number is : " + largestNumber(arr));
        System.out.println("########################################################");
        System.out.println("The smallest number is  : " + smallestNumber(arr));

    }

    static int largestNumber(int[] arr){
        int largestNum = arr[0];
        for(int i =1; i< arr.length; i++){
            if(arr[i] > largestNum){
                largestNum = arr[i];
            }
        }
        return largestNum;
    }

    static int smallestNumber(int[] arr){
        int minimumNum = arr[0];
        for(int arrNums : arr){
            if(arrNums < minimumNum){
                minimumNum = arrNums;
            }
        }
        return minimumNum;
    }


}
