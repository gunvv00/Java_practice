package practice;

import java.util.Arrays;
import java.util.Random;

// �Ĵ� Ŭ���� ����
// 1) �������� �������� �����ؾ��Ѵ�.
// 2) �������� ���� �����̴�
// 3) �������� ���� �޼ҵ��̴�
// 4) �ʵδ� �Ժη� �����ϸ� ������ ������ �ſ츹��
// 5) �Ϲ������� �ܺ� ������ ������Ŵ(private) class �������� ���ٰ���
// 6) �޼ҵ�� �Ϲ������� �ܺ� ȣ���� ������ �ϱ⶧���� �Ϲ������� ������ �㰡��
// 7)public : ��� ���ٰ���
// 8)default : ���� ��Ű�������� ��� ���ٰ���

//�н��� �Ĵ� �Ϲ����� �Ĵ��� ��
class Restaurant {
//�ʵ�(����): ����
   int money = 100000;
   String[] foods = {"¥���","«��","�Ⱥ�ä","������"};
   int sel; //�ʵ� ������ �ڵ����� �ʱ�ȭ ��
   
   //�޼ҵ�(���) : ����
   void cleaning() {
      System.out.println("�Ĵ��� û���մϴ�");
   }
   void prepareFoods() {
      System.out.println("���� ��Ḧ �����ϴ�");
   }
   void welcom() {
      System.out.println("� ������");
   }
   void byeBye() {
      System.out.println("�ȳ��� ������");
   }
   void getMoney(int m) {
      money += m;
      System.out.println(m+"�� ���İ����� ����");
   }
   void calcMoney() {
      System.out.println("���� ���� " + money + "�̴�");
   }
   void anyFood() {
      System.out.println("� ���� ��Ƿ��� ?");
      System.out.println(Arrays.toString(foods));
      Random rd = new Random();
      sel = rd.nextInt(foods.length);
      System.out.println(foods[sel]+"�̿�");
   }
   void cookFood() {
      System.out.println(foods[sel]+"�� �丮�ϴ�");
   }
   void sendFood() {
      System.out.println(foods[sel]+ "���Խ��ϴ�.");
      System.out.println("���ְ� �弼��");
   }
}
public class RunRestruant{
   public static void main(String[] args) {
      Restaurant rest = new Restaurant();
      //���� ��
      rest.cleaning();
      rest.prepareFoods();
      // �ֹ����� ���
      for(int i=0; i<10;i++) {
         System.out.println("--------------------");
         rest.welcom();
      //   if(i==5)
      //      rest.foods = new String[] {"��","��������"};
         rest.anyFood();
         rest.cookFood();
         rest.sendFood();
         rest.getMoney(9000);
      //   rest.money = -100000;
         rest.byeBye();
         System.out.println("--------------------");
         System.out.println();
      }
      //���� ���� ��
      rest.calcMoney();
      rest.cleaning();
   }
}