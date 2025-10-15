public class demo {
    int a;
    int b;
    int c;
    void problem(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        try{
            b=a/c;
            System.out.println(b);
        }
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println("ok");
        }
        finally{
            System.out.println("it is done");
        }
    }
    public static void main(String[] args) {
        demo var_1 = new demo();
        var_1.problem(10,10,0);
    }


}

