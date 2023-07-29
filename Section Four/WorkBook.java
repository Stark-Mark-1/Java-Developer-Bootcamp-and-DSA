public class WorkBook{
    public static void main(String[] args) {
        // for(int i = 0; i<=4; i++){ workbook 4.1 
        //     wirte();
        // }
        //workbook 4.2:
        System.out.println("Thank You!");
        waiter(100);
    }
    // public static void wirte(){ workbook 4.1
    //     System.out.println("I will not copy and paste code");
    //     System.out.println("I will use Camel Case when writing class name");
    //     System.out.println("I will use lower Camel Case while writing function names");
    //     System.out.println("I will use lower Camel Case while writing variable names");
    // }
    public static void waiter(double bill){
        System.out.println("You service was good please accept this tip : $" + (15*bill)/100);
    }
}