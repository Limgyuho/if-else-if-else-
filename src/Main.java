class Main {
	public static void main(String[] args) {
		int age = 55;
		//오직 정수만이 들어갈수있는 age라는 변수에 55를 넣는다

		if (age >= 1 && age < 10) {
			//만약 age라는 변수가 1이상 그리고 10미만 이라는 조건이며 참이면 실행 거짓이면 다음 코ㄷ로 넘어간다
			System.out.println("영유야/아동 입니다.");
		} else if (age >= 10 && age < 20) {
			// 위의 조건식이 거짓이고 해당 조건식이 참일때 실행
			System.out.println("10대 입니다.");
		} else if (age >= 20 && age < 30) {
			System.out.println("20대 입니다.");
		} else if (age >= 30 && age < 40) {
			System.out.println("30대 입니다.");
		} else if (age >= 40 && age < 50) {
			System.out.println("40대 입니다.");
		} else if (age >= 50) {
			System.out.println("중/노년층 입니다.");
		}

		System.out.println("끝!");
	}
}