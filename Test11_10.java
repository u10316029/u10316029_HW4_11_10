/*U10316029
 * 郭政慶
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Test11_10{
	/**main method*/
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);//Create a Scanner
		MyStack <String> str = new MyStack <String>();//Create a Stack
		System.out.println("Please enter five Strings :");//Prompt the user to enter five Strings
		String[] a1 = new String[5];//Create a array to store the Strings
		for(int i = 0; i <= 4; i++){
			 a1[i] =input.next();
			 str.push(a1[i]);
		}
		System.out.println("Your Strings display in reverse order is :");
		String[] a2 = new String[5];
		for(int i = 0; i <=4; i++){
			a2[i] = str.pop();
			System.out.println(a2[i]);//Display the result
		}
		input.close();//Close input
	}
}
class MyStack <Object> extends ArrayList<Object>{
	public int getSize(){//Return the number of elements in the stack
		return super.size();
	}
	public Object peek(){//Return the top element in the stack without removing it
		return super.get(getSize()-1);
	}
	public Object pop(){//Return and remove the top element in the stack 
		Object a = super.get(getSize()-1);
		super.remove(getSize()-1);
		return a;
	}
	public void push(Object a){//Add a new element to the top of the stack
		super.add(a);
	}
	@Override
	public String toString(){
		return "stack : " + super.toString();
	}
}
