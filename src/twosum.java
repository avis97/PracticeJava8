public class twosum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=89;
        int start=0;
        int end=arr.length-1;
        boolean flag=false;
        while(start<end){
            int sum=(arr[start]+arr[end]);
            if(sum==target){
                flag=true;
                System.out.println("sum is "+arr[start]+" "+arr[end]);
                break;
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        if(flag==false){
            System.out.println("Not Possible");
        }
    }
}
