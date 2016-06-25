import java.sql.Time;
import java.util.*;
public class JavaDeque {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        Counter counter = new Counter(100000+1);

        for (int i = 0; i < n; i++)
        {
            if(max == m)
            {
                break;
            }
            int num = in.nextInt();
            if(deque.size() < m)
            {
                counter.add(num);
                deque.addLast(num);
            }
            if(deque.size() == m)
            {
                int removed = deque.removeFirst();
                if(counter.getSize() > max)
                {
                    max = counter.getSize();
                }
                counter.remove(removed);
            }

        }

        System.out.println(max);
    }
}

class Counter
{
    int size = 0;
    int numbers[];

    public Counter(int capacity)
    {
        this.numbers = new int[capacity];
    }

    public void add(int num)
    {
        if(this.numbers[num] == 0)
        {
            this.size += 1;
        }
        this.numbers[num]+=1;
    }

    public void remove(int num)
    {
        if(this.numbers[num] > 0)
        {
            this.numbers[num]-=1;
            if(this.numbers[num] == 0)
            {
                this.size -= 1;
            }
        }
    }

    public int getSize()
    {
        return this.size;
    }

}