package study02;

public class Demo {
	//主方法
	public static void main(String[] args) {
		//定义数组变量
		int[] arr = {12,56,789,213,45,0,12,456,12,483};
		//实例化类
		Demo demo = new Demo();
		//调用冒泡排序方法
		demo.mmpx(arr);
		//调用数组的遍历方法
		demo.szbl(arr);
		
	}
	
	//冒泡排序
	public void mmpx(int[] arr) {
		//定义交换变量
		int c;
		//开始进行循环
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					//如果 前一个数小于后一个数  进行交换
					c = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = c;
					}
				
			}

		}
	}
	
	//数组遍历
	public void szbl(int[] arr) {
		for(int x=0;x<arr.length;x++) {
			System.out.println(arr[x]);
		}
	}
}
