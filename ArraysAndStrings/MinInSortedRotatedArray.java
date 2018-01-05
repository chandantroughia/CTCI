class MinSortedRotatedArray{
  public static int findMin(int[] arr){

    int low = 0, high = arr.length - 1;

    while(low <= high){

      if(arr[low] <= arr[high]) return arr[low];
      int mid = low + (high - low)/2;
      int next = (mid + 1) % arr.length;
      int prev = (mid + arr.length - 1) % arr.length;

      if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
        return arr[mid];
      }

      else if(arr[mid] <= arr[high]) high = mid - 1;
      else if(arr[low] <= arr[mid]) low = mid + 1;
    }
    return -1;
  }

  public static int findMin2(int[] nums){
    int low = 0, high = nums.length - 1;
        while(low < high){
            int mid = (high + low)/2;
            if(nums[mid] < nums[high]){
                high = mid - 1;
            }
            else if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high--;
            }
        }
        return nums[low];
  }

  public static void main(String[] args){
    int[] arr = {11,12,15,18,2,5,6,8};
    System.out.println(findMin(arr));
    System.out.println(findMin2(arr));

  }
}
