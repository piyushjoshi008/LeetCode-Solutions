class Solution {
    public int calPoints(String[] operations) {
        int result[]=new int[operations.length];
        int i=-1;
        for(String ch : operations){
            if(ch.equals("D")){
                int temp=result[i]*2;
                result[++i]=temp;
            }else if(ch.equals("+")){
                int temp=result[i]+result[i-1];
                result[++i]=temp;
            }else if(ch.equals("C")){
                i--;
            }else{
                result[++i]=Integer.parseInt(ch);
            }
        }
        int sum=0;
        for(int j=0;j<=i;j++){
            sum+=result[j];
        }
        return sum;
    }
}