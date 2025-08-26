
class Practice{
    private int a;
    private int b;

    public Practice(){
        System.out.println("Hey, I'm Constructor!");
    }
    public Practice(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void setter(int a,int b){
        this.a = a;
        this.b= b;
    }
    public void getDetails(){
        System.out.println("A:"+ a +" " + "B: "+b);
//        System.out.println("Hello World!");
    }
}

public class Demo{
    public static void main(String [] args){
        Practice practice = new Practice(3,4);
        practice.getDetails();
    }
}