public class Arrays <T extends Number>{
    private  T [] nums;

    public Arrays(T... nums) {
        this.nums = nums;
    }

    public double avg(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i].doubleValue();
        }
        return  sum/ nums.length;
    }

    public boolean samAvg (Arrays<?> arrays){
        return Math.abs(this.avg() - arrays.avg()) < 0.0001;
    }
}
