import java.util.*;

class main{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int array[]=new int[x];
		for(int i=0;i<x;i++){
			array[i]=i;
			System.out.print(array[i]+" ");
		}
		System.out.println();
		randomise(array);
		for(int i=0;i<x;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	private static void randomise(int arr[]){
		Random rand=new Random();
		for(int i=0;i<arr.length/2;i++){
			int x=rand.nextInt(arr.length);
			int y=rand.nextInt(arr.length);
			if(y==x){
				y=rand.nextInt(arr.length);
			}
			
			//test code starts
			System.out.println("yes "+arr[x]+"-"+arr[arr.length-x-1]+"\t"+arr[y]+"-"+arr[arr.length-y-1]);
			//test code ends

			
			int temp=0;
			//shuffling 1
			temp=arr[x];
			arr[x]=arr[arr.length-x-1];
			arr[arr.length-x-1]=temp;
			
			//shuffling 2
			temp=arr[y];
			arr[y]=arr[arr.length-y-1];
			arr[arr.length-y-1]=temp;
		}
	}
}
