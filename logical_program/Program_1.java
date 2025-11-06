package logical_program;

public class Program_1 {

	public static void main(String[] args) {
		Demo.change("ANIKET");
		Demo.change("HFCTFGGYJTCYRTJJRJKAXKJHSDSF NBKLOURTSDZCHGUTYDGC");
		
	}

}
class Demo{
	public static void change(String str3) {
		String str = str3;// add the str3 value into the str
		StringBuffer sb= new StringBuffer();// create the new stringbuffer sb
		for(int i=0;i<str.length();i++) {
			String str2= null;
			
		// give the value
			if(str.charAt(i)=='E' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='W' || str.charAt(i)=='T' || str.charAt(i)=='K' ) {
				StringBuffer sb3=new  StringBuffer();
				 // Append the value of the Sb3 into the Str2
				str2 =sb3.append(str.charAt(i)).toString().toLowerCase();
				// then the append the into the SB to str2
				sb.append(str2);
				
			}
			else {
				sb.append(str.charAt(i));
				
			}
		}
		System.out.println(sb.toString());
	}
}
