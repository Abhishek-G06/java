public class InetegertoRoman {
    public static void main(String[] args) {
		int num = 3454;
		System.out.print(intToRoman(num));
	}
	public static String intToRoman(int num) {
        String[] symbol = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] value = { 1,4,5,9,10,40,50,90,100,400,500,900,1000};

        String ans = "";
        
        for(int i = value.length -1; i >= 0 && num > 0; i--){
            while(num >= value[i]){
                num -= value[i];
                ans+=(symbol[i]);
            }
        }
        return ans;     
    }
}
