import java.util.Scanner;

public class stack {
    class NodeS
    {
        int data1;
        int date2;
        int result;
        NodeS next;

    }
    NodeS top;
    stack()
    {
        this.top=null;
    }

    public void push(int data1,int data2, int result)
    {
        NodeS temp=new NodeS();
        if(temp==null)
        {
            System.out.println("false");
            return;
        }
        temp.data1=data1;
        temp.date2=data2;
        temp.result=result;
        temp.next=top;
        top=temp;
    }

    public void display()
    {
        if(top==null)
            System.out.println("Empty");
        else
        {
            NodeS temp=top;
            while(temp!=null)
            {
                System.out.println(temp.data1+"\t"+ temp.date2+"\t"+ temp.result);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {


            int n = sc.nextInt();
            int ar[] = new int[n];
            for (int x = 0; x < n; x++)
                ar[x] = sc.nextInt();
            stack obj1=new stack();
            for(int x=0;x<n;x++)
            {
                for(int y=x+1;y<n;y++)
                {
                    int temp=0;

                    if(ar[x]>ar[y])
                    {
                        temp=ar[x];
                        ar[x]=ar[y];
                        ar[y]=temp;
                    }
                }
            }

            for(int x=0;x<n-1;x++)
            {
                obj1.push(ar[x],ar[x+1],ar[x]*ar[x+1]);
            }
            obj1.display();
        }catch(Exception e)
        {
            return;
        }

    }
}