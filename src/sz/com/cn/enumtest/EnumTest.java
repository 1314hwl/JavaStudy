package sz.com.cn.enumtest;

public class EnumTest {

	private enum ColorEnum {
		red, yellow, bule, orange
	}

	public enum OrderState {
		/** ��ȡ�� */
		CANCEL {
			public String getName() {
				return "��ȡ��";
			}
		},
		/** ����� */
		WAITCONFIRM {
			public String getName() {
				return "�����";
			}
		},
		/** �ȴ����� */
		WAITPAYMENT {
			public String getName() {
				return "�ȴ�����";
			}
		},
		/** ������� */
		ADMEASUREPRODUCT {
			public String getName() {
				return "�������";
			}
		},
		/** �ȴ����� */
		WAITDELIVER {
			public String getName() {
				return "�ȴ�����";
			}
		},
		/** �ѷ��� */
		DELIVERED {
			public String getName() {
				return "�ѷ���";
			}
		},
		/** ���ջ� */
		RECEIVED {
			public String getName() {
				return "���ջ�";
			}
		};

		public abstract String getName();// ��ʵ�ֳ���ķ���,ö���������һ���������,ÿһ��Ԫ�ض���һ��ö�ٶ���
	}

	public enum Gender {
		// ö�ٶ��������һ���������,��Ϊ
		MAN("man"), WOMAN("woman");
		private final String sex;

		Gender(String sex) {
			this.sex = sex;
		}

		String getSex() {
			return sex;
		}
	}

	public static void main(String[] args) {
		for (OrderState mOrderState : OrderState.values()) {
			System.out.println(mOrderState + "====>" + mOrderState.getName());
		}
	}
}
