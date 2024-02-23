abstract class Chains
{
    public abstract void material();
}
public class index {

    public static void main(String[] args) {
        Chains obj = new Chains() 
        {
           public void material(){
            System.out.println("This chain is Gold");
           } 
        };
        obj.material();
    }
}