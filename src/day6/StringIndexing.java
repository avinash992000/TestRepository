package day6;

public class StringIndexing {

	public static void main(String[] args) {
		String path = "home/index/test.html";
		String str = path.substring(path.indexOf("/")+1,path.lastIndexOf("/"));
		System.out.println("str:"+str);
		
		System.out.println("File name:"+path.substring(path.indexOf(".")+1));
		System.out.println("File name:"+path.substring(path.lastIndexOf(".")+1));
		
		String Str1="dd/mm/yyyy";
		String Str2 = Str1.substring(Str1.indexOf("/")+1,Str1.lastIndexOf("/"));
		System.out.println("month:"+Str2);

	}

}
