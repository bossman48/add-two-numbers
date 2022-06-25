import java.util.Enumeration;
import java.util.Hashtable;

public class DenemeProjesi {
    public static void main(String[] args) {

/*
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l1.next=l12;
        ListNode l13= new ListNode(3);
        l12.next=l13;
        l13.next=null;

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l2.next=l22;
        ListNode l23= new ListNode(4);
        l22.next=l23;
        l23.next=null;

        printList(addTwoNumbers(l1,l2));

        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);

        printList(addTwoNumbers(l3,l4));*/

        ListNode l5 = new ListNode(9);
        ListNode l51 = new ListNode(9);
        l5.next=l51;
        ListNode l52 = new ListNode(9);
        l51.next=l52;
        ListNode l53 = new ListNode(9);
        l52.next=l53;
        ListNode l54 = new ListNode(9);
        l53.next=l54;
        ListNode l55 = new ListNode(9);
        l54.next=l55;
        ListNode l56 = new ListNode(9);
        l55.next=l56;


        ListNode l6 = new ListNode(9);
        ListNode l61 = new ListNode(9);
        l6.next=l61;
        ListNode l62 = new ListNode(9);
        l61.next=l62;
        ListNode l63 = new ListNode(9);
        l62.next=l63;

        printList(addTwoNumbers(l5,l6));

        ListNode l7 = new ListNode(1);
        ListNode l71 = new ListNode(9);
        l7.next=l71;
        ListNode l72 = new ListNode(9);
        l71.next=l72;
        ListNode l73 = new ListNode(9);
        l72.next=l73;
        ListNode l74 = new ListNode(9);
        l73.next=l74;
        ListNode l75 = new ListNode(9);
        l74.next=l75;
        ListNode l76 = new ListNode(9);
        l75.next=l76;
        ListNode l77 = new ListNode(9);
        l76.next=l77;
        ListNode l78 = new ListNode(9);
        l77.next=l78;
        ListNode l79 = new ListNode(9);
        l78.next=l79;


        ListNode l8 = new ListNode(9);
        
        printList(addTwoNumbers(l7,l8));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode temp=new ListNode();
        ListNode tempResult=temp;
        int carry=0;
        int l1Value=0;
        int l2Value=0;
        while(l1!=null || l2!=null){
            if(l1!=null) {
                l1Value = l1.val;
                if(l1.next != null)
                    l1 = l1.next;
                else
                    l1=null;
            }
            else {
                l1Value = 0;
            }

            if(l2!=null) {
                l2Value = l2.val;
                if(l2.next != null)
                    l2 = l2.next;
                else
                    l2=null;
            }
            else {
                l2Value = 0;
            }

            if(l1Value+l2Value+carry>=10){
                temp.val = (l1Value+l2Value+carry)%10;
                carry=1;
            }
            else{
                temp.val = l1Value+l2Value+carry;
                carry=0;
            }
            if(l1!=null || l2!=null ) {
                ListNode temp2 = new ListNode();
                temp.next = temp2;
                temp = temp.next;
            }

        }
        if(carry==1) {
            ListNode temp2 = new ListNode(carry);
            temp.next = temp2;
        }
        else {
            temp = null;
            System.gc();
        }


        return tempResult;
    }
    public static void printList(ListNode src){
        System.out.println();
        while(src.val >= 0){
            System.out.print(src.val+" ");
            if(src.next!=null)
                src=src.next;
            else{
                return;
            }
        }
        System.out.println();
    }

}
class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val =val;
    };
    ListNode(int val,ListNode next){
        this.val = val;
        this.next=next;
    }
}
