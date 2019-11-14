class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world assending");
        int a = 34;
        int b = 30;
        int c = 44;
           if (a>b){
               if (b>c){
                   System.out.println(a);
                   System.out.println(b);
                   System.out.println(c);
               }
           }
           if (a>c){
               if (c>b){
                   System.out.println(a);
                   System.out.println(c);
                   System.out.println(b);
               }
           }
           if (b>a){
               if (a>c){
                   System.out.println(b);
                   System.out.println(a);
                   System.out.println(c);
               }
           }
           if (b>c){
               if (c>a){
                   System.out.println(b);
                   System.out.println(c);
                   System.out.println(a);
               }
           }
           if (c>a){
               if (a>b){
                   System.out.println(c);
                   System.out.println(a);
                   System.out.println(b);
               }
           }
           if (c>b){
               if (b>a){
                   System.out.println(c);
                   System.out.println(b);
                   System.out.println(a);
               }
           }
       } 
}