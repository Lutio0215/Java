package study01;
/**@version 1.0
 * @author 狗叁
 *
 *
 */
//数组的选择排序
public class Demo {
	//主方法
	public static void main(String[] args) {
		Demo demo = new Demo();
		int[] arr = {12,56,789,213,45,0,12,456,12,483};
		arr = demo.bubbleSort(arr);
		demo.szbl(arr);
		
		
		
	}
	//冒泡排序方法
	public static int[] bubbleSort(int[] arr) {
        // 外层for循环控制循环次数
        for(int i=0;i<arr.length;i++){
            int tem = 0;
            // 内层for循环控制相邻的两个元素进行比较
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   tem = arr[j];
                   arr[j]= arr[i];
                   arr[i] = tem;
               }
            }
        }
        return arr;
    }
	//数组的遍历
	public static void szbl(int[] arr) {
		for(int c = 0;c<arr.length;c++) {
			System.out.println(arr[c]);
			}
	}

}
