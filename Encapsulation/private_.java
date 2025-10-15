public class private_ {
    private int c;
    void add(int a,int b){
        c =a+b;
    }
    void show(){
        System.out.println(c);
    }
}
class b extends private_{
    public static void main(String[] args){
        private_ var_1 = new private_();
        var_1.add(2,3);
        // var_1.c=10;
        var_1.show();
        
    } 
}
