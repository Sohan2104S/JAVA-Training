class LargestOfFour{
	public static void main(String[]args){
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		int lar=( ((a>c)?((a>d)?(a):(b)):((c>d)?(c):(d)) )   ((b>c)?((b>d)?(b):(c)):((c>d)?(c):(d))));
	 
	}
}