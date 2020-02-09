
public class BinarySearch {
	public static void main(String[] args) {
		int a[] ={1,2,3,6,7,9,13,15,22,24,34,66,76,87,500};
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.search(a, 13,0,a.length-1));
		System.out.println(bs.search1(a, 0,0,a.length-1));

	}
	
	public int  search(int[] data,int tar,int low,int high){
		if(low>high)return -1;
		int mid = (low+high)/2;
		if(data[mid]==tar) return mid;
		if(data[mid]>tar) return search(data,tar,low,mid-1);
		else return search(data,tar,mid+1,high);
	}
	
	public int search1(int [] data,int tar,int low,int high){
		while(low<=high){
			int mid = (low+high)/2;
			if(data[mid]==tar) return mid;
			if(data[mid]>tar){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		return -1;
	}
	
//	public void search(int[] a,int target){
//		System.out.println(search(a,target,0,a.length-1));
//	}
//	private int search(int [] a,int target,int low,int high){
//		if(low>high)return -1;
//		int mid = (low+high)/2;
//		if(a[mid]==target)return mid;
//		if(target<a[mid]){
//			return search(a,target,low,mid-1);
//		}else{
//			return search(a,target,mid+1,high);
//		}
//	}
	
	

}
