import java.util.Scanner;

public class StringB3 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String pera = scan.nextLine();
		String ans[] = pera.split(" ");
		System.out.println("srno"+'\t' + "originalString" + '\t' + "ReverseString" + '\t' + "Length" + "\t" + "Vowel" + "\t" + "Consonent" + "\t" + "Palindrome");
		System.out.println();
		int k=1;
		for(int i=0;i<ans.length;i++){	
			StrBuffer buf = new StrBuffer(ans[i]);
			String newStr = buf.reverse().toString();
			int vowel = 0,consonent=0;
			for(int j=0;j<newStr.length();j++){
				if(newStr.charAt(j)=='a'||newStr.charAt(j)=='e'||newStr.charAt(j)=='i'||newStr.charAt(j)=='o'||newStr.charAt(j)=='u'||newStr.charAt(j)=='A'||newStr.charAt(j)=='E'||newStr.charAt(j)=='I'||newStr.charAt(j)=='O'||newStr.charAt(j)=='U'){
					vowel++;
				}else{
					consonent++;
				}
			}
			boolean flag = false;
			if(newStr.equals(ans[i])){
				flag = true;
			}
			System.out.println(k+"\t" + ans[i] + "\t" + newStr + "\t" + newStr.length() + "\t" + vowel + "\t" + consonent + "\t" + flag);
			k++;
		}
	}
}