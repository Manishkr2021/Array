// class Max{
//     static void max(int arr[]){
//         int max=arr[0];
//         for(int i=1;i<arr.length;i++)
//         if(max<arr[i])
//         max=arr[i];
//         System.out.println(max);
//     }



//     public static void main(String args[]){
//         int a[]= {10,20,3,56,23,50,12};
//         max(a);

//     }
// }


//  To find Smallest Number in Array
class Min{
    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        if(min>arr[i]) 
        System.out.println(min);

    }
    public static void main(String args[]){
        int a[]= {12,23,22,56,9,7,5,3,13,35};
        min(a);
    }
}