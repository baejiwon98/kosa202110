package package5;

public class kakaoBank implements Bank {
	
//	kakaoBank class ������ �߻�޼ҵ� �ΰ��� �������� default �޼ҵ带 ����ߴ�.
	public void withDraw(int price) {
		System.out.println("Kakao Bank �� �������.");
		if (price <= Bank.MAX_INTEGER) {
			System.out.println(price + "**(����)�� �����մϴ�.** ");
		}else {
			System.out.println(price + "**(����) �������**");
		}
	}
	
	public void deposit(int price1) {
		System.out.println("Kakao Bank �� �Աݷ���.");
		System.out.println(price1 + "**(����)�� �Ա��մϴ�.**");
	}
	
	// interface ���� ������ default �޼ҵ�. (����� ���� ���������ڸ� �ٲپ� �־�� �Ѵ�.)
	public String findDormancyAccount(String custId) {
		System.out.println("**������������ 00���� ������ �޸���� ã���ֱ� �**");
		System.out.println("**�������������� �����ϴ� ����**");
		switch (custId) {
		case "A" :
			System.out.println("kakao���� 000-000-0000-01");
			break;
		case "B" :
			System.out.println("kakao���� 000-000-0000-02");
			break;
		case "C" :
			System.out.println("kakao���� 000-000-0000-03");
			break;
		}
		return custId;
	}
}