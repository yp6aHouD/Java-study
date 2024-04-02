import static java.lang.System.out;

@SuppressWarnings("static-access")
public class StaticVars 
{
    public static void main(String[] args)
    {
        
        out.println("bigValue: " + MutableInteger.bigValue);
        // out.println("bigValue " + IntegerHolder.value); // недопустимо

        MutableInteger holder1 = new MutableInteger(42);
        MutableInteger holder2 = new MutableInteger(7);

        out.println("holder1: " + holder1.value);
        out.println("holder2: " + holder2.value);
        out.println();

        holder1.value++;
        holder2.value++;
        MutableInteger.bigValue++;

        out.println("holder1: " + holder1.value);
        out.println("holder2: " + holder2.value);
        out.println("bigValue: " + MutableInteger.bigValue);
        out.println();

        holder1.bigValue++;
        out.println("bigValue в соответствии с holder1: " + holder1.bigValue);
        out.println("bigValue в соответствии с holder2: " + holder2.bigValue);
    }
}

class MutableInteger {
    int value;
    static int bigValue = 1_000_000;

    public MutableInteger(int value) {
        this.value = value;
    }
}