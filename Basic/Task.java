class Pirogram {

    String s;
    int size;
    int a[] = new int[5];
   void StringPalindromeOrNot(String m){
        s = m;
        int flag = 0;
    
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag =1;
                break;
            }
        }
        if(flag==1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
   }

   void fibonacciSeries(int n){
        System.out.print( "1, 1, ");
        size = n;
        int a=1,b=1,c;
        for(int i=1;i<=n-2;i++){
            c = a+b;
            System.out.print(c + ", ");
            a = b;
            b = c; 
        }
        System.out.println(" ");
   }

   void sortOrderD(int arr[]){
        int i,j;
        for(i=0;i<5;i++){

                for(j=i+1;j<5;j++){

                    if(arr[i] < arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
        }

        for(i=0;i<5;i++){
            a[i] = arr[i];
        }
        for(i=0;i<5;i++){
            System.out.print(a[i] + " ");
        }
   }
}


public class Task {

    public static void main(String[] args) {
        
        //create obj..

        Pirogram obj = new Pirogram();
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = (int)(Math.random()*100);
        }
         System.out.println("String palindrome or not : ");
         obj.StringPalindromeOrNot("madam");
         System.out.println("Fibonacci serices : ");
         obj.fibonacciSeries(8);
         System.out.println("Desc order : ");
         obj.sortOrderD(arr);

    }
    
}