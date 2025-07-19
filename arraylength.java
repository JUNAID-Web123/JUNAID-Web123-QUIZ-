// import java.io.*;
// class java{
//     public static void main(String [] args){
//         System.out.println("good morning");
//     }
// }

// local variable
// import java.io.*;
// class add{
//     public static void main(String [] args){
//          int a=12;
//          int b=23;
//          int c=a+b;
//          System.out.println(c); 
//     }
// }

//Instance variable
// import java.io.*;
// class A{
//     int data=50;
//     static int data1=100;
//     void method(){
//         int n=90;
//         System.out.println("Instance variable: " + data);
//         System.out.println("Static variable: " + data1);
//         System.out.println("Local variable: " + n); 
//     }
// }

// import java.io.*;
// class Enum{
//     public enum Season{WINTER , SPRING, SUMMER, AUTUMN}
//     public static void main(String[]args){
//         for(Season s : Season.values())
//         System.out.println(s);
//     }
// }


// import java.io.*;
// class add{
//     static int a=12;
//     static int b=12;
//     static int c=a+b;
   
//     public static void main(String [] args){
//         System.out.println(add.c);
//     }

//     }
// import java.io.*;
// class main{
//     public static void main(String[]args){
//         int age=20;
//         if (age>18){
//             System.out.println("eligible to vote ");
//         }

// //     }
// }
// import java.io.*;
// class even_odd{
//     public static void main(String [] args){
//         int a=23;
//         if (a%2==0){
//             System.out.println("even");
//         }
//         else {
//             System.out.println("odd");
//         }
//     }
// }
// import java.io.*;
// class marks{
//     public static void main(String[]args){
//         int marks=65;
//         if (marks==100){
//             System.out.println("o");
//         }
//         else if (marks<100 && marks>80){
//             System.out.println("a+");

//         }
//         else if (marks<100 && marks>60){
//             System.out.println("A");
//         }
//         else if (marks<60 && marks>50){
//             System.out.println("B+");
//         }
//         else{
//             System.out.println("F");
//         }
//     }
// }
// import java.io.*;
// class donate{
//     public static void main(String[]args){
//         int age=20;
//         int weight=40;
//         if (age>18){
//             if (weight>=45){
//                 System.out.println("Donate");
//             }
            
//         else{
//             System.out.println("Not eligible");
//         }     
//         }
//     }
// }

// import java.io.*;
// class license{
//     public static void main(String[]args){
//         int age=12;
//         if (age>=18){
//             System.out.println("eligible");
//             if(age>=60){
//                 System.out.println("But you are too old to ride the car , so not eligible ");
//             }
           
//         }
//         else {
//             System.out.println("not eligible");
//         }

//     }
// }

// import java.io.*;
// class main{
//     public static void main(String[]args){
//         int num=10;
//         switch(num){
//             case 10 :
//             System.out.println("10");
//             break;
//             case 20:
//             System.out.println("20");
//             break;
//             default:
//             System.out.println("invalid");
//             break;
            
//         }
//     }
// }

// class loop{
//     public static void main(String[]args){
//         for(int i=1 ; i>=1; i++){
//             System.out.println(i);

//         }
//     }
// }

// class a{
//     public static void main(String[]args){
//         aa:
//            for(int i=1 ; i<=3 ; i++){
//              bb:
//                 for(int j=1 ; j<=3 ; j++){
//                     if(i==2 && j==2){
//                         break bb;
//                     }
//                     System.out.println(i+" "+j);

//                 }
//            }
//     }
// }/

// class while1{
//     public static void main(String[]args){
//         int i=1;
//         while (i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
    
// }

// class while2{
//     public static void main(String[]args){
//         int i =1;
//         int n=10;
//         int sum=0;
//         do {
//             sum = sum+i;
//             i++;  
//         }
//         while(i<=n);
//         System.out.println(sum);  

//     }
// }

// class a{
//     public static void main(String[]args){
//         for(int i=1 ; i<=10 ; i++){
//             if(i==5){
//                 continue;
//             }
//             System.out.println(i);
//         }
        
//     }
    
// }
// 14/07/2025

// import java.io.*;
// class public1 {
//     public static void main(String[]args){
//         for(int i=12345 ; i>0 ;){
//             int digit=i%10;
//             System.out.println(digit);
            // i=i/10;
//         }
//     }

// }


// import java.io.*;
// class public1 {
//     public static void main(String[]args){
//         int i=54321;
//         do{
//             int digit=i%10;
//             System.out.println(digit);
//             i=i/10;
//         }
//         while(i>0);
//     }

// }

// import java.io.*;
// class public2 {
//     public static void main(String[]args){
//         int rev=0;
//         for(int i=1234; i>0 ; i=i/10){
//             int digit=i%10;
//             rev= rev*10+digit;
           
//         }
//          System.out.println(rev);
//         }
//     }

// import java.io.*;
// class public2 {
//     public static void main(String[]args){
//         int rev=0 , i=123456;
//         do{
//             int digit=i%10;
//             rev= rev*10+digit;
//             i=i/10;
            
//         }
//         while(i>0);
//         System.out.println(rev); 
//         }
         
//         }
// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int sum=0;
//         for(int i=1234; i>0 ; i=i/10){
//             int digit=i%10;
//             sum+=digit;
//         }
//         System.out.println(sum);
//     }
//     } 
// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int sum=0;
//         int i=12345;
//         do{
//             int digit=i%10;
//             sum+=digit;
//             i/=10;
//         }
//         while(i>0);
//         System.out.println(sum);
//     }
//     } 

// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int product=1;
//         int i=12345;
//         do{
//             int digit=i%10;
//             product*=digit;
//             i/=10;
//         }
//         while(i>0);
//         System.out.println(product);
//     }
//     } 

// import java.io.*;
//  class public3 {
//     public static void main(String[]args){
//        int i=12345;
//        int product=1;
//        while(i>0){
//         int digit=i%10;
//         product*=digit;
//         i/=10;
//        }
//         System.out.println(product);
//     }
//     }   
    
    
// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int prod=01;
//         for(int i=12345 ; i>0 ; i/=10){
//             int digit=i%10;
//             prod*=digit;
            
//         }
       
//         System.out.println(prod);
//     }
//     }     
// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int count=0;
//         int i=9870;
        
//         while(i>0){
//             count++;
//             i/=10;
//         }
//         System.out.println(count);
//     }
//     } 

// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int count=0;
//         for(int i=12345; i>0 ; i/=10 ,count++){
            
//         }
//         System.out.println(count);
//     }
//     }  
    
// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int count=0;
//         int i=9870;
        
//         do{
//             count++;
//             i/=10;
//         }
//         while(i>0);
//         System.out.println(count);
//     }
//     }     

// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int i=121, rev=0 ,temp=i;
//         while(i>0){
//             int digit=i%10;
//             rev=rev*10+digit;
//             i/=10;
//         }
//         if(temp==rev){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
        
//     }
//     }  

// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int rev=0;
//         int n=121;
//         int temp=n;
//         for(int i=temp; i>0; i/=10){
//             int digit=i%10;
//             rev=rev*10+digit;
//         }

//         if(temp==rev){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
    
        
//     }
//     }  


// import java.io.*;
//  class public2 {
//     public static void main(String[]args){
//         int i=121, rev=0 ,temp=i;
//         do{
//             int digit=i%10;
//             rev=rev*10+digit;
//             i/=10;
//         }
//         while(i>0);
//         if(temp==rev){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
        
//     }
//     } 
// import java.io.*;
// class Star1{
//    public static void main(String[] args) {
//              for (int i = 1; i <= 5; i++) {
//              for (int j = 1; j <= i; j++) {
//  System.out.print("* "); // Print star
//  }
//  System.out.println(); // Move to next line
//  }
//  }
// }
// import java.io.*;
// class pattern{
//    public static void main(String[] args) {
//       for(int i=1;i<=5;i++){
//          for(int j=1;j<=i;j++){
//             System.out.println("*");
//          }
//          System.out.println();
//       }
//    }
// }

// import java.io.*;
// class pattern{
//    public static void main(String[] args) {
//       for(int i=1;i<=5;i++){
//          for(int j=1;j<=i;j++){
//             System.out.print(i);
//          }
//          System.out.println();
//       }
//    }
// }
// import java.io.*;
// class pattern{
//    public static void main(String[] args) {
//       for(int i=5;i>=1;i--){
//          for(int j=1;j<=i;j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//    }
// }
// class Pattern {
//     public static void main(String[] args) {
//         int sp = 20;

//         for (int i = 5; i >= 1; i--) {
            
//             for (int k = 1; k <= sp; k++) {
//                 System.out.print(" ");
//             }
//             sp++; 

            
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*  ");
//             }

            
//             System.out.println();
//         }
//     }
// }
// class main{
//    public static void main(String[] args) {
//       int sum;
//       int number[] = {1,2,3,4,5};
//       System.out.println("1st number"+number[0]);
//       System.out.println("2nd number"+number[1]);
//       System.out.println("3rd number"+number[2]);
//       System.out.println("4th number"+number[3]);
//       System.out.println("5th number"+number[4]);
//       sum=number[0]+number[1]+number[2]+number[3]+number[4];
//       System.out.println("sum of all numbers is "+sum);


      
//    }
// }

// class main{
//    public static void main(String[] args) {
//       int sum=0;
//       int number[] = {1,2,3,4,5};
//       System.out.println("1st number"+number[0]);
//       System.out.println("2nd number"+number[1]);
//       System.out.println("3rd number"+number[2]);
//       System.out.println("4th number"+number[3]);
//       System.out.println("5th number"+number[4]);
//       for(int i=0; i<number.length ; i++){
//          sum+=number[i];
         
//       }
//       System.out.println(sum);
//    }
// }
// class main{
//    public static void main(String[] args) {
//       int sum=0;
//       int number[] = {1,2,3,4,5};
//       for(int i=0 ; i<number.length ; i++){
//          System.out.println(number[i]);
//          System.out.println(number.length);
//          System.out.println(number);
//       }
//    }
// }

// class main{
//    public static void main(String[] args) {
//       int sum=0;
//       int number[] = {2,-9,0,5,12,-25,22,9,8,12};
      
//       Double avg;
//       for(int i=0;i<number.length;i++){
//          sum+=number[i];
//       }
//       int arraylength = number.length;
//       avg = (double)sum/(double)arraylength ;
//       System.out.println(avg);
//    }
// }

// class pattern{
//    public static void main(String[] args) {
//       for(int i=5 ; i>=0; i--){
//          for(int j=0 ; j<=i ; j++){
//             System.out.print("*");
//          }
//          System.out.println();
//       }
//    }
// }
// class pattern{
//    public static void main(String[] args) {
//       int num[] = {1,2,3,4,5};
//       int sum = 0;
//       for(int i=0 ; i<num.length ; i++){
//          System.out.println(num[i]);
//          num[3] = 5;
//          sum+=num[i];
        
//       }
      
//       System.out.println(sum);

//    }
// }

// import java.util.Scanner;

// class pattern{
//    public static void main(String[] args){
//       int [] num = new int[2];
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter the array");
//       int n = sc.nextInt();
//       for(int i=0 ; i<num.length ; i++){
//          num[i] = sc.nextInt();
//          System.out.println(num[i]);
//       }
//    }  
//    }
// import java.util.Scanner;
// public class puppy{
// public puppy(String name){
//     System.out.println("passed name is"+name);
// }
// public static void main(String [] args){
//     puppy mypuppy= new puppy("tommy");
// }
// }


// public class puppy{
//     int puppyAge;
//     String puppycolour;
//     public puppy(String name ){
//         System.out.println(name);
        

//     }
//     public void setAge(int age , String colour){
//         puppyAge=age;
//         puppycolour = colour;

//     }
//     public int getAge(){
//         System.out.println(puppyAge);
//         System.out.println(puppycolour);
//         return puppyAge;
//     }
//     public static void main(String [] args){
//         puppy mypuppy = new puppy("tommy");
//         mypuppy.setAge(2 , "black");
//         mypuppy.getAge();
//         System.out.println(mypuppy.puppyAge);
//         System.out.println(mypuppy.puppycolour);
//     }

// }



// public class academic{
//     String stcourse;
//     String Stcourse;
//     public academic(String name1, String name2){
//         System.out.println(name1 );
//         System.out.println(name2);

//     }
//     public void setcourse(String course1 , String course2){
//         stcourse=course1;
//         Stcourse = course2;

//     }
//     public void getcourse(){
//         System.out.println(stcourse);
//         System.out.println(Stcourse);
//     }
//     public static void main(String[] args) {
//         academic students = new academic("junaid ", "lesin");
//         students.setcourse("cse","ise");
//         students.getcourse();
        

        
//     }

// }

// import java.io.*;
// class pattern{
//     public static void main(String[] args) {
//          for(int i=0 ; i<=5 ; i++){
//             for(int j= 0 ; j<=i ; j++){
//                 System.out.print("* ");
//         }
//         System.out.println();
        
//     }
   
//     }
// }


// public class arraylength{
//     public static void main(String[] args) {
//         int [][] arr ={{1,2,3,4,5},{6,7,8,9}};
//         System.out.println("array length"+ " " +arr.length);
//     }
// }


// public class arraylength{
//     public static void main(String[] args) {
//         int [] array ={1,2,3,4,5};
//         for(int i=0 ; i<array.length ; i++){
//             System.out.println("the item at index"+i+" "+array[i]);

//         }
//     }
// }

// public class arraylength{
//     public static void main(String[] args) {
//         int sum=0;
//         int [] array ={1,2,3,4,5};
//         for(int i=0 ; i<array.length ; i++){
//             sum +=array[i];
            

//         }
//         System.out.println(sum);

//     }
// }

        
// public class arraylength{
//     public static void main(String[] args) {
//         int sum=0;
//         int [] array ={1,2,3,4,5};
//         int max = array[0] ; int min = array[0]; 
//         for(int i=1  ; i<array.length ; i++){
//             if(array[i]>max)max=array[i];
//             if(array[i]<min)min=array[i];
//         }
//         System.out.println(max);
//         System.out.println(min);

//     }
// }
