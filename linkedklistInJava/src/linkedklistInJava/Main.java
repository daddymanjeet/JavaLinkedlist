package linkedklistInJava;
//Other imports go here
//Do NOT change the class name
class node
{
 int data;
 node next;
 node(int data)
 {
     this.data=data;
     next=null;
 }
}
class linklist
{
 node head;
 void insert(int data)
 {
     node new_node=new node(data);
     if(head==null)
     {
         head=new_node;
     }
     else
     {
         node last=head;
         while(last.next!=null)
         {
             last=last.next;
         }
         // new_node.next=last.next;
         last.next=new_node;
     }
 }
 void sp_insert(int index,int data)
 {
     node new_node=new node(data);
     if (index==0)
     {
         new_node.next=head;
         head=new_node;
     }
     else
     {
         node last=head;
         index--;
         for( ; index>0;index--)
         {
             last=last.next;
         }
         new_node.next=last.next;
         last.next=new_node;
     }
 }
 void delete(int data)
 {
     node last=head;
     if(last.data==data)
     {
         head=last.next;
     }
     else
     {
         while(last.next.data!=data)
         {
             last=last.next;
         }
         last.next=last.next.next;
         
     }
 }
 void sp_delete(int index)
 {
     node last=head;
     if(index==0)
     {
         head=head.next;
     }
     else
     {
         index--;
         for( ; index>0;index--)
         {
             last=last.next;
         }
         last.next=last.next.next;
     }
 }
 int size()
 {
     int size=0;
     node last=head;
     while(last!=null)
     {
         size++;
         last=last.next;
     }
     System.out.print(size);
     return size;
 }
 void bubble()
 {
     for(node last=head;last!=null;last=last.next)
     {
         for(node last1=last;last1!=null;last1=last1.next)
         {
             if(last.data>last1.data)
             {
                 int temp=last.data;
                 last.data=last1.data;
                 last1.data=temp;
             }
         }
     }
 }
 void print()
 {
     node last=head;
     while(last!=null)
     {
         System.out.print(last.data+" ");
         last=last.next;
     }
 }
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linklist l=new linklist();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(66);
        l.insert(55);
        l.print();
        System.out.println();
        l.sp_insert(0,0);
        l.sp_insert(4,4);
        l.print();
        System.out.println();
        l.delete(4);
        l.print();
        System.out.println();
        l.sp_delete(0);
        l.sp_delete(2);
        l.print();
        System.out.println();
        l.size();
        System.out.println();
        l.bubble();
        l.print();
        System.out.println();
        node head=l.head;
        rev_print(head);
	}
	static void rev_print(node head)
    {
        if(head==null)
        {
            return ;
        }
        rev_print(head.next);
        System.out.print(head.data+" ");
    }

}
