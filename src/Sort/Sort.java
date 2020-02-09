package Sort;

public class Sort {

	public static void main(String[] args) {
		int[] data = { 2, 4, 1, 3, 5, 9, 6, 11, 0, 7, 4 };

		Sort sort = new Sort();
		// sort.bubbleSort(data);
		// sort.quickSort(data);
		// sort.selectSort(data);
		// sort.insertSort(data);
		// sort.mergeSort(data,0,data.length-1);
		//sort.quickSort(data,0,data.length-1);
		// Arrays.sort(data);
		 sort.heapSort(data);
//		 int kTh = sort.getKth(data, 2);
//		 System.out.println(kTh);
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");

	}
	public void heapSort(int []data){
		int len = data.length;
		for(int i = len/2-1;i>=0;i--){
			siftdown(data,i,len-1);
		}
		for(int i = len-1;i>0;i--){
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			siftdown(data,0,i-1);
		}
	}
	private void siftdown(int[] data,int start,int end){
		int i=start,temp = data[start],j = i*2+1;
		while(j<=end){
			if(j<end&&data[j]<data[j+1]){
				j++;
			}
			if(temp>data[j])break;
			else{
				data[i] = data[j];
				i = j;
				j=i*2+1;
			}
		}
		data[i] =temp ;
	}
	
	
	public void quickSort(int[] data, int low, int high) {
		if (low < high) {
			int pos = partition(data, low, high);
			quickSort(data, low, pos - 1);
			quickSort(data, pos + 1, high);
		}
	}

	private int partition(int[] data, int low, int high) {
		int temp = data[low];
		while (low < high) {
			while (low < high && data[high] >= temp) {
				high--;
			}
			data[low] = data[high];
			while (low < high && data[low] <= temp) {
				low++;
			}
			data[high] = data[low];
		}
		data[low] = temp;
		return low;
	}

	public int getKth(int[] data, int k) {
		if (k < 1 || data.length == 0) {
			return -1;
		}
		return getK(data, 0, data.length - 1, k);
	}

	private int getK(int[] data, int low, int high, int k) {
		if (low < high) {
			int pos = partition(data, low, high);
			if (pos == data.length - k)
				return data[pos];
			else if (pos < data.length - k) {
				return getK(data, pos + 1, high, k);
			} else {
				return getK(data, low, pos - 1, k);
			}

		} else
			return data[low];
	}
	// 堆排序

	// public void heapSort(int [] data){
	// int len = data.length;
	// for(int i = len/2-1;i>=0;i--){
	// siftDown(data,i,len-1);
	// }
	// for(int i = len-1;i>0;i--){
	// int temp = data[0];
	// data[0] = data[i];
	// data[i] = temp;
	// siftDown(data,0,i-1);
	// }
	// }
	// private void siftDown(int[] data,int start,int end){
	// int i = start,j = i*2+1;
	// int temp = data[start];
	// while(j<=end){
	// if(j<end&&data[j]<data[j+1]){
	// j++;
	// }
	// if(data[j]<temp)break;
	// else{
	// data[i] = data[j];
	// i = j;
	// j=i*2+1;
	// }
	// }
	// data[i] =temp;
	// }
	//

	// //冒泡
	// public void bubbleSort(int [] data){
	// int len = data.length;
	// for(int i = 0;i<len-1;i++){
	// for(int j =0;j<len-1-i;j++){
	// if(data[j]>data[j+1]){
	// int temp = data[j];
	// data[j] = data[j+1];
	// data[j+1] = temp;
	// }
	// }
	// }
	// }
	// //快排
	// public void quickSort(int []data){
	// quickSort(data,0,data.length-1);
	// }
	// private void quickSort(int[] data ,int low,int high ){
	// if (low<high) {
	// int mid = findMid(data, low, high);
	// quickSort(data, low, mid - 1);
	// quickSort(data, mid + 1, high);
	// }
	// }
	// private int findMid(int[] data,int low,int high){
	// int temp = data[low];
	// while(low<high){
	// while(low<high&&data[high]>temp){
	// high--;
	// }
	// data[low] = data[high];
	// while(low<high&&data[low]<=temp){
	// low++;
	// }
	// data[high] = data[low];
	// }
	// data[low] = temp;
	// return low;
	//
	// }
	// //归并排序
	public void mergeSort(int[] data, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(data, low, mid);
			mergeSort(data, mid + 1, high);
			merge(data, low, mid, high);
		}
	}

	private void merge(int[] data, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int k = 0;
		int i = low, j = mid, m = mid + 1, n = high;
		while (i <= j && m <= n) {
			if (data[i] < data[m]) {
				temp[k++] = data[i++];
			} else {
				temp[k++] = data[m++];
			}
		}
		while (i <= j) {
			temp[k++] = data[i++];
		}
		while (m <= n) {
			temp[k++] = data[m++];
		}
		for (k = 0; k < temp.length; k++) {
			data[low + k] = temp[k];
		}
	}
	//
	// //选择排序
	public void selectSort(int[] data) {
		int len = data.length;
		for (int i = 0; i < len - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < len; j++) {
				if (data[j] < data[min_index]) {
					min_index = j;
				}
			}
			int temp = data[i];
			data[i] = data[min_index];
			data[min_index] = temp;
		}
	}

	//插入排序
	public void insertSort(int[] data) {
		int len = data.length;
		for (int i = 0; i < len - 1; i++) {
			int temp = data[i + 1];//待插入
			int j;
			for (j = i; j >= 0; j--) {
				if (data[j] > temp) {
					data[j + 1] = data[j];//后移
				} else {
					break;
				}
			}
			data[j + 1] = temp;
		}
	}

}
