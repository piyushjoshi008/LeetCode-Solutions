class Solution {
    public int digitFrequencyScore(int n) {
        int arr[] = new int[10];
        for(;n>0;n=n/10){
            int temp=n%10;
            arr[temp]++;
        }
        int sum=0;
        for(int i=1;i<10;i++){
            sum+=arr[i]*i;
        }
        return sum;
    }
}