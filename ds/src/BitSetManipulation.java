import java.util.BitSet;
import java.util.Scanner;

public class BitSetManipulation
{

        public static void main(String[] args)
        {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            BitSet bit1 = new BitSet(n);
            BitSet bit2 = new BitSet(n);

            int numberOfTestCases = scan.nextInt();
            for(int i=0 ; i < numberOfTestCases; i++)
            {
                String operator = scan.next();
                int j = scan.nextInt();
                int k = scan.nextInt();
                switch (Operation.valueOf(operator))
                {

                    case AND:
                        if(j==1)
                        {
                            if(k == 1)
                            {
                                bit1.and(bit1);
                            }
                            else
                            {
                                bit1.and(bit2);
                            }
                        }
                        else
                        {
                            if(k == 1)
                            {
                                bit2.and(bit1);
                            }
                            else
                            {
                                bit2.and(bit2);
                            }
                        }
                        break;
                    case OR:
                        if(j==1)
                        {
                            if(k == 1)
                            {
                                bit1.or(bit1);
                            }
                            else
                            {
                                bit1.or(bit2);
                            }
                        }
                        else
                        {
                            if(k == 1)
                            {
                                bit2.or(bit1);
                            }
                            else
                            {
                                bit2.or(bit2);
                            }
                        }
                        break;
                    case XOR:
                        if(j==1)
                        {
                            if(k == 1)
                            {
                                bit1.xor(bit1);
                            }
                            else
                            {
                                bit1.xor(bit2);
                            }
                        }
                        else
                        {
                            if(k == 1)
                            {
                                bit2.xor(bit1);
                            }
                            else
                            {
                                bit2.xor(bit2);
                            }
                        }
                        break;
                    case FLIP:
                        if(j==1)
                        {
                            bit1.flip(k);
                        }
                        else
                        {
                            bit2.flip(k);
                        }

                        break;
                    case SET:
                        if(j==1)
                        {
                            bit1.set(k);
                        }
                        else
                        {
                            bit2.set(k);
                        }
                        break;
                    default :
                        System.out.println("haha");

                }
                System.out.printf("%d %d%n", bit1.cardinality(), bit2.cardinality());
            }
        }
}

enum Operation
{
    AND,OR,XOR,FLIP,SET;


}
