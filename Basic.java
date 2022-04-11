// class Basic{
//     public static void main(String args[]){
//         int ar[]= new int [5];
//         ar[0]=10;
//         ar[1]=20;
//         ar[2]=30;
//         ar[3]=40;
//         // ar[4]=50;
//         // ar[5]=60;
//         for(int i=0;i<ar.length;i++){
//             System.out.println(ar[i]);
//         }

//     }
// }

// class Basic{
//     public static void main(String args[]){
//         int ar[]= {10,20,30,40,50,90};
//         for(int i=0; i<ar.length; i++){
//             System.out.println(ar[i]);
//         }
//     }
// }

//for each loop
// class Basic{
//     public static void main(String args[]){
//         int ar[]={10,20,30,40,50};
//         for(int i:ar){
//             System.out.println(i);
//         }
//     }
// }

// for each loop
// class Basic{
//     public static void main(String args[]){
//         int a[]={2,4,6,7};
//         // for each loop
//         for(int i:a){
//             System.out.print(i+"  ");
//         }
//     }
// }

// for each type using run time

import java.util.*;
class Basic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]= new int[5];
        // storing
        System.out.println("Enter Array Element to store");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        //Printing
        for(int i:ar){
            System.out.println(i);
        }
    }
}