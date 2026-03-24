class Solution{
    public int lastRemaining(int n) {
       int start=1;
       boolean leftToRight=true;
       int remain=n;
       int step=1;
       while(remain>1)
       {
        if(leftToRight||remain%2!=0)
        {
            start+=step;
        }
        step*=2;
        remain/=2;
        leftToRight=!leftToRight;
       }
       return start;
    }
}
