class min{
    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];
            
            System.out.println(min);
        

    }
    public static void main(String args[]){
        int a[]= {2,3,1,4,6};
        min(a);
    }
}