package sz.com.cn.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@SuppressWarnings("all")
public class AnnotationTest extends BaseAnnotation {
	public static void main(String[] args) {
		test1();
		try {
			Class clazz = Class.forName("sz.com.cn.annotation.StudentInfo");
			Annotation[] annos = clazz.getAnnotations();
			for (Annotation a : annos) {
				System.out.println(a);
			}
			// �����ָ����ע��
			Table t = (Table) clazz.getAnnotation(Table.class);
			System.out.println(t.value());

			Field f = clazz.getDeclaredField("id");
			FeildAnno feildAnno = f.getAnnotation(FeildAnno.class);
			System.out.println(feildAnno.colName() + "---" + feildAnno.type() + "----" + feildAnno.length());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("all") // ǿ�ư��¾���ע��
	private void test() {
		int a = 0;
		int b = 1;
	}

	@Deprecated // ע���ʾ�����ǲ�������ʹ�õġ�
	private static void test1() {

	}

	@Override // ע���ʾ����Ҫ��д����Ķ�Ӧ������
	void testOverWite() {
		// ����������ô�ע�����ͽ���ע�⵫û����д���෽�����������������һ��������Ϣ��
	}
	/*
	 * ����Ԫע�� �� @Target
	 * 
	 * @Target ��ʾ��ע������ʲô�ط�����ȡ��ֵ������
	 * 
	 * ElemenetType.CONSTRUCTOR ���������� ElemenetType.FIELD ������������ enum ʵ����
	 * ElemenetType.LOCAL_VARIABLE �ֲ��������� ElemenetType.METHOD ��������
	 * ElemenetType.PACKAGE ������ ElemenetType.PARAMETER �������� ElemenetType.TYPE
	 * �࣬�ӿڣ�����ע�����ͣ���enum���� ElementType.ANNOTATION_TYPE ע��
	 * 
	 * 
	 * �� @Retention
	 * 
	 * @Retention ��ʾ��ʲô���𱣴��ע����Ϣ����ѡ�� RetentionPolicy ����������
	 * 
	 * RetentionPolicy.SOURCE ע�⽫������������ RetentionPolicy.CLASS
	 * ע����class�ļ��п��ã����ᱻVM���� RetentionPolicy.RUNTIME
	 * JVM����������Ҳ����ע�ͣ���˿���ͨ��������ƶ�ȡע�����Ϣ��
	 * 
	 * �� @Documented
	 * 
	 * @Documented ����ע������� javadoc ��
	 * 
	 * 
	 * �� @Inherited
	 * 
	 * @Inherited ��������̳и����е�ע��
	 */

}
