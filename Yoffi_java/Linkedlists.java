class linked_lists
{
    int number;
    linked_lists next;
}
class Linkedlists{
    public static void main(String[] args)
    {
        linked_lists head;
        head = new linked_lists();
        create(head);
        System.out.println("The linked list is:");
        printMyList(head);
        System.out.println("Number of items:"+count(head));
    }
    static void create(linked_lists list)
    {
        String s;
        System.out.println("Enter a number(enter -999 at end to stop): ");
        s=System.console().readLine();
        list.number = Integer.parseInt(s);
        if(list.number == -999)
        {
            list.next = null;
        }
        else
        {
            list.next = new linked_lists();
            create(list.next);
        }
    }
    static void printMyList(linked_lists list)
    {
        if(list.next != null)
        {
            System.out.print(list.number+"-->");

            if(list.next.next == null)
            {
                System.out.print(list.next.number);
            }
            printMyList(list.next);
        }
    }
    static int count(linked_lists list)
    {
        if(list.next==null)
        {
            return 0;
        }
        else
        {
            return (1 + count(list.next));
        }
    }
}