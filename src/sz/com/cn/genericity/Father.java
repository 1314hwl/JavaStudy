package sz.com.cn.genericity;

//���͸���
//1.�ౣ�����෺��,��������Son1
//2.�಻�������෺��,���ఴ��ʵ��
//3.���า�Ǹ��෽���游�����
//4.����ʹ�ø���������游�����
//5.�����Զ���ķ������Լ�����
public abstract class Father<T1, T2> {
	T1 age;

	abstract void test(T2 name);
}
// ����
// 1.ȫ������

class Son1<T2, T1, A, B> extends Father<T1, T2> {

	@Override
	void test(T2 name) {
		// TODO Auto-generated method stub

	}

}

// 2.���ֱ���

class Son2<T2, A, B> extends Father<Integer, T2> {

	@Override
	void test(T2 name) {
		// TODO Auto-generated method stub

	}

}

// 1.��������
// ������:
class Son3 extends Father<String, Integer> {

	@Override
	void test(Integer name) {
		// TODO Auto-generated method stub

	}

}

// 2.û������-���Ͳ���
class Son4 extends Father {

	@Override
	void test(Object name) {
		// TODO Auto-generated method stub

	}

}
