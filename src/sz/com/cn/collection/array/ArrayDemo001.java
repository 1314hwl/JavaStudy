package sz.com.cn.collection.array;

/**
 * @author henry 冒泡排序
 */
public class ArrayDemo001 {

	public static void main(String[] args) {
		int[] sortArray = { 9, 8, 7, 4, 5, 6 };
		sort(sortArray);

	}

	private static void sort(int[] data) {
		int len = data.length;

		for (int j = 0; j < len - 1; j++) {
			System.out.println("=====第" + (j + 1) + "趟=====");
			boolean isChange = true;// 是否有过交换的标志
			for (int i = 0; i < len - 1 - j; i++) {
				if (data[i] > data[i + 1]) {
					int temp = data[i + 1];
					data[i + 1] = data[i];
					data[i] = temp;
					isChange = false;
				}
				for (int a : data) {
					System.out.print(a + "\t");
				}
				System.out.print("\n");
				if (isChange) {// 数组中都没有交换过,说明数组已经是顺序
					return;
				}
			}
		}
	}

}
