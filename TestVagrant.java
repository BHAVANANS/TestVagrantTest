class TestVagrant{
    public static void main(String[] args) {
        int GST[]=new int[4];
        String[] product= {"Leather wallet","Umbrella","Cigerette","Honey"};
        int[] unit_price={1100,900,200,100};
        int[] gstprice={18,12,28,0};
        int[] quantity={1,4,3,2};
        for(int i=0;i<4;i++){
            GST[i]=(unit_price[i] * gstprice[i])/100 * quantity[i];
            System.out.println();
            System.out.println("The GST price for the item "+ product[i] +" is:" +GST[i]);
        }
        int max=GST[0];
        for(int i=1;i<4;i++){
            if(GST[i]>max){
                max=GST[i];
        }
        }
        System.out.println("The product for which the maximum GST amount paid is:"+max);
        
        int total[] =new int[4];
        int sum=0;
        for(int i=0;i<4;i++){
            total[i]=unit_price[i] * quantity[i] + gstprice[i];
            sum+=total[i];
            System.out.println("The amount paid for " +product[i]+" is:"+total[i]);
        }
 
        // for(int i=0;i<4;i++){
            
        // }
        System.out.println("Total amount to be paid to the shop-keeper:"+sum);
    }
}