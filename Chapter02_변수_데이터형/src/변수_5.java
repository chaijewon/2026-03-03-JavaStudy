/*
 *    변수 
 *     1. 국어 / 수학 / 영어 / 총점 / 평균 / 학점 / 등수
 *                                            int 
 *        ---------------------  ----  ---- String / char
 *           int                 double
 *           
 *     2. 문자열 저장 : String 
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int drink=12;
        // 
        // drink=drink-5;
        // drink-=5;// 누적 / 차감 
        // System.out.println("남은 음료수:"+drink);
        // 남은 음료수: 7
        /*
         *   샌드위치 ==> 250 
         *   사과  ==> 100 
         *   쥬스 ==> 150
         *   
         *   샌드위치 1 사과 2 쥬스 1 
         *   => 총 칼로리 
         */
		/*int sandwich=250;
		int apple=100;
		int juice=150;
		int ksum=sandwich+apple*2+juice;
		System.out.println(ksum);
        */
		/*
		 *   이름은 홍길동 / 성별 남자 / 나이 20 / 키 180.5 / card false
		 *   장바구니 
		 *     우유 = 1200 => 2개
		 *     빵 =1500 => 3개 
		 *     계란 =200 => 10
		 *   ------------------------------
		 *   
		 *   
		 */
		String name="홍길동";
		String sex="남자";
		int age=20;
		double height=180.5;
		boolean isCard=false;
		
		int milk=1200*2;
		int bread=1500*3;
		int egg=200*10;
		
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("나이:"+age);
		System.out.println("키:"+height);
		System.out.println("카드 존재여부:"+isCard);
		
		System.out.println("장바구니의 총합:"+(milk+bread+egg));
		
        String msg="""
        		 지난달 27일 뉴욕 메츠와 시범경기에서 2⅓이닝 1피안타, 2볼넷, 무실점을 기록했던 와이스는 2경기 연속 무실점 행진을 이어갔다.

2024년 6월 대체 외국인 선수로 한화 유니폼을 입은 와이스는 지난해 30경기에서 16승 5패, 평균자책점 2.87로 호투했다.

와이스는 한화에서 활약을 바탕으로 휴스턴 애스트로스와 260만달러에 1년 계약을 맺었다.
        		 """
        		 ;
        
        System.out.println(msg);
	}

}
