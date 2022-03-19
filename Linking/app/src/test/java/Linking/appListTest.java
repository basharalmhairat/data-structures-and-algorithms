/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Linking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class appListTest {

    @Test
    public void testInsertEmpty() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        assertEquals("", list.toString());
    }

    @Test
    public void testInsertOneValueToList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);

        assertEquals("3", list.toString());
    }

    @Test
    public void testInsertMultipleValueToList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);
        list.insert( 2);
        assertEquals("{2}->3", list.toString());
    }

    @Test
    public void testIncludeTrueValue() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);
        list.insert( 2);
        assertEquals("true", list.includes(2).toString());
    }

    @Test
    public void testIncludeFalseValue() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);
        list.insert( 2);
        assertEquals("false", list.includes(5).toString());
    }
    @Test
    public void testReturnCollectionValues(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 4);
        list.insert( 3);
        list.insert( 2);
        list.insert( 1);

        assertEquals("{1}->{2}->{3}->4",  list.toString());
    }

    @Test
    public void testInsertAfterMiddle(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);
        list.insert( 2);
        list.insert( 1);

        list.insertAfter( 2, 4);
        assertEquals("{1}->{2}->{4}->3",  list.toString());
    }
    @Test
    public void testInsertAfterLast() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(3);
        list.insert(2);
        list.insert(1);

        list.insertAfter(1, 4);
        assertEquals("{1}->{4}->{2}->3", list.toString());
    }

    @Test
        public void testInsertAfterHead() {
            LinkedList<Integer> list = new LinkedList<Integer>();
            list.insert(3);
            list.insert(2);
            list.insert(1);
            list.insertAfter(1, 4);
            assertEquals("{1}->{4}->{2}->3", list.toString());
        }

    @Test
    public void testInsertBeforeHead() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insertBefore(1, 4);
        assertEquals("{4}->{1}->{2}->3", list.toString());
    }
        @Test
    public void testAppendEmpty(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.append( 1 );
        assertEquals("",  list.toString());
    }

    @Test
    public void testInsertBeforeLast(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);
        list.insert( 2);
        list.insert( 1);

        list.insertBefore( 3 ,4);
        assertEquals("{1}->{2}->{4}->3",  list.toString());
    }

    @Test
    public void testInsertBeforeMiddle(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);
        list.insert( 2);
        list.insert( 1);

        list.insertBefore( 2, 4);
        assertEquals("{1}->{4}->{2}->3",  list.toString());
    }

    @Test
    public void testInsertAppendLast(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert( 3);
        list.insert( 2);
        list.insert( 1);

        list.append( 4);
        assertEquals("{1}->{2}->{3}->4",  list.toString());
    }

    @Test
    public void testKthEndHappy() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert( 1);
        list.insert( 2);
        list.insert( 3);
        list.insert( 5);
        assertEquals("3", list.kthEnd(2));
    }

    @Test
    public void testKthEndGreaterThanSize() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert( 1);
        list.insert( 2);
        list.insert( 3);
        list.insert( 5);
        assertEquals("Your interred length bigger than the list size." ,list.kthEnd( 6));
    }


    @Test
    public void testKthEnd_KLessThanZero() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert( 1);
        list.insert( 2);
        list.insert( 3);
        list.insert( 5);
        list.kthEnd( -1);
        assertEquals("Your interred length less than zero." ,list.kthEnd( -2));


    }

    @Test
    public void testKthEnd_KEqualsSize() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert( 1);
        list.insert( 2);
        list.insert( 3);
        list.insert( 5);
        assertEquals("1", list.kthEnd( 4));
    }

    @Test
    public void testKthEnd_SizeEqualsOne() {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert( 1);
        assertEquals("1", list.kthEnd( 1));
    }

    @Test
    public void testMergeList(){
        LinkedList<Integer> listOne = new LinkedList<>();
        listOne.insert( 7);
        listOne.insert( 5);
        listOne.insert( 3);
        listOne.insert( 1);

        LinkedList<Integer> listTwo = new LinkedList<>();
        listTwo.insert( 8);
        listTwo.insert( 6);
        listTwo.insert( 4);
        listTwo.insert( 2);

        assertEquals("{1}->{2}->{3}->{4}->{5}->{6}->{7}->8",listOne.zipLists(listOne,listTwo).toString());
    }

}
