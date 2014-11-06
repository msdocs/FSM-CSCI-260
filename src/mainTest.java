import java.util.Scanner;
public class  mainTest{
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
		System.out.println("Enter A & B with a space Between Each Letter ");
		String S = word.next();

		if(S.length() % 2 == 0){
			System.out.println("Forgot to tell you that  you can only use odd number of [A] sorry");
			System.out.println("Try again");
			main(args);
		}

		else{
			ArrayBoundQueue<String> queue = new ArrayBoundQueue<String>(S.length());
			ArrayBoundStack<String> stack = new ArrayBoundStack<String>(S.length());
			int count1 = 0;
            int count2 = 0;

        for(int i = 0; i < S.length(); i++){
				queue.queue(S.substring(i,i+1));
				stack.push(S.substring(i,i+1));
			}

		for(int j = 0; j < S.length(); j++){
				String a = queue.noqueue();
				String b = stack.pop();

		if(a.equalsIgnoreCase("A") ){
			    count1++;
					}

        if(a.equalsIgnoreCase("B")){
                 count2++;
                                }


                                }

         if (count1 == count2 +1){
            System.out.println("Matched a^n+1 b^n!");
            System.out.println("Done");
         }
         else{
            System.out.println("Not true for a^n+1 b^n" );
         	System.out.println("Try again");
         		main(args);
			}}


		}

    }
