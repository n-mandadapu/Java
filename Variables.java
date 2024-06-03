class Example{
    int id;
    static int attempts=1;                  //statict variable 
    public Example(int id){
        this.id=id;                         //instance variable
    }
    public int addition(int a , int b){     //local variable 
        return a+b;
    }
    public float widening(int a){           //widening
        float f=a;
        return f;
    }
    public int narrowing(float f){          //type casting
        int a=(int)f;
        return a;
    }
}

public class Variables {
    public static void main(String[] args) {
        Example e= new Example(10);
        System.out.println(e.id);
        System.out.println(e.addition(10, 10));
        int a = 257;
        int b= 127;
        byte k = (byte)b;           //type casting normal 
        byte q = (byte)a;
        System.out.println(k);
        System.out.println(q);           //type casting beyond the limits of byte(-128 to 127) so will print 257%127 ie 1
    }
}
