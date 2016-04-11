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
			// 获得类指定的注解
			Table t = (Table) clazz.getAnnotation(Table.class);
			System.out.println(t.value());

			Field f = clazz.getDeclaredField("id");
			FeildAnno feildAnno = f.getAnnotation(FeildAnno.class);
			System.out.println(feildAnno.colName() + "---" + feildAnno.type() + "----" + feildAnno.length());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("all") // 强制按下警告注解
	private void test() {
		int a = 0;
		int b = 1;
	}

	@Deprecated // 注解表示方法是不被建议使用的。
	private static void test1() {

	}

	@Override // 注解表示子类要重写父类的对应方法。
	void testOverWite() {
		// 如果方法利用此注释类型进行注解但没有重写超类方法，则编译器会生成一条错误消息。
	}
	/*
	 * 二、元注解 ① @Target
	 * 
	 * @Target 表示该注解用于什么地方，可取的值包括：
	 * 
	 * ElemenetType.CONSTRUCTOR 构造器声明 ElemenetType.FIELD 域声明（包括 enum 实例）
	 * ElemenetType.LOCAL_VARIABLE 局部变量声明 ElemenetType.METHOD 方法声明
	 * ElemenetType.PACKAGE 包声明 ElemenetType.PARAMETER 参数声明 ElemenetType.TYPE
	 * 类，接口（包括注解类型）或enum声明 ElementType.ANNOTATION_TYPE 注解
	 * 
	 * 
	 * ② @Retention
	 * 
	 * @Retention 表示在什么级别保存该注解信息。可选的 RetentionPolicy 参数包括：
	 * 
	 * RetentionPolicy.SOURCE 注解将被编译器丢弃 RetentionPolicy.CLASS
	 * 注解在class文件中可用，但会被VM丢弃 RetentionPolicy.RUNTIME
	 * JVM将在运行期也保留注释，因此可以通过反射机制读取注解的信息。
	 * 
	 * ③ @Documented
	 * 
	 * @Documented 将此注解包含在 javadoc 中
	 * 
	 * 
	 * ④ @Inherited
	 * 
	 * @Inherited 允许子类继承父类中的注解
	 */

}
