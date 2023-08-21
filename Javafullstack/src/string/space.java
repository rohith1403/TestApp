package string;

public class space {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My    Name is  philic";
		String s1=s.replace("    "," ");
		String s2=s1.replace("   ", " ");
		String s3=s2.replace("Welcom to ","JAVA");
		System.out.println(s3);
	}
	}