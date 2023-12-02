package Chapter02;

// equals()를 재정의하려거든 hashCode 도 재정의하라
public class Item10 {

    // hashCode 도 재엉의 해야 하는 이유
    // 1. equals()와 hashCode를 모두 사용하는 클래스(HashMap, HashSet)에서 오작동을 일으킬 가능성이 존재하기 때문에
    // hashCode : 객체를 대표하는 32bit 정수 값(해시값)을 반환하는 함수
    // equals() 재정의시, 논리적 동치성(동등성)으로 객체를 비교하도록 재정의 할 것이다.
    // 하지만 hashCode()의 기본행동은 물리적 동치성(동일성)을 기준으로 해시값 계산
    // 따라서 동등성으로 객체를 비교하지만, 해당 객체를 대표하는 값은 동일성으로 반환돼
    // 해당 메서드를 이용하는 컬렉션 클래스에서 오작동을 일으킬 가능성이 있다.

}
