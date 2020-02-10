package practice;

import java.util.Arrays;
import java.util.Random;

// 식당 클래스 설계
// 1) 명사형과 동사형을 구분해야한다.
// 2) 명사형은 보통 변수이다
// 3) 동사형은 보통 메소드이다
// 4) 필두는 함부로 접근하면 문제의 소지가 매우많음
// 5) 일반적으로 외부 접근을 금지시킴(private) class 내에서만 접근가능
// 6) 메소드는 일반적으로 외부 호출을 전제로 하기때문에 일반적으로 접근을 허가함
// 7)public : 모두 접근가능
// 8)default : 같은 패키지에서는 모든 접근가능

//분식을 파는 일반적인 식당의 예
class Restaurant {
//필드(변수): 명사
   int money = 100000;
   String[] foods = {"짜장면","짬뽕","팔보채","탕수육"};
   int sel; //필드 변수는 자동으로 초기화 됨
   
   //메소드(기능) : 동사
   void cleaning() {
      System.out.println("식당을 청소합니다");
   }
   void prepareFoods() {
      System.out.println("음색 재료를 손질하다");
   }
   void welcom() {
      System.out.println("어서 오세요");
   }
   void byeBye() {
      System.out.println("안녕히 가세요");
   }
   void getMoney(int m) {
      money += m;
      System.out.println(m+"을 음식값으로 받음");
   }
   void calcMoney() {
      System.out.println("오늘 돈은 " + money + "이다");
   }
   void anyFood() {
      System.out.println("어떤 음식 드실래요 ?");
      System.out.println(Arrays.toString(foods));
      Random rd = new Random();
      sel = rd.nextInt(foods.length);
      System.out.println(foods[sel]+"이요");
   }
   void cookFood() {
      System.out.println(foods[sel]+"을 요리하다");
   }
   void sendFood() {
      System.out.println(foods[sel]+ "나왔습니다.");
      System.out.println("맛있게 드세요");
   }
}
public class RunRestruant{
   public static void main(String[] args) {
      Restaurant rest = new Restaurant();
      //영업 전
      rest.cleaning();
      rest.prepareFoods();
      // 주문들어올 경우
      for(int i=0; i<10;i++) {
         System.out.println("--------------------");
         rest.welcom();
      //   if(i==5)
      //      rest.foods = new String[] {"쥐","바퀴벌레"};
         rest.anyFood();
         rest.cookFood();
         rest.sendFood();
         rest.getMoney(9000);
      //   rest.money = -100000;
         rest.byeBye();
         System.out.println("--------------------");
         System.out.println();
      }
      //영업 종료 후
      rest.calcMoney();
      rest.cleaning();
   }
}