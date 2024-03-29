# 1. 전략패턴

### ✅ 전략패턴의 정의
- 전략패턴은 알고리즘군(행동)을 정의하고 캡슐화(객체로 만듦)해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해 줍니다.
- 전략패턴을 사용하면 클라이언트로(서브클래스)부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다.

### ✅ 전략패턴을 사용해야 하는 상황
- 요구사항에 따라 바뀌는 부분이 있다면 이를 따로 뽑아서 캡슐화 한다.

### ✅ 전략패턴을 사용할 때 생기는 이점
- 코드에 요구사항에 따라 바뀌는 부분이 생길 때(ex. 객체에 새로운 행동이 추가) 개발자는 구현방법으로 상속과 인터페이스 구현을 쉽게 떠올릴 수 있다. 그러나 이렇게 기능 확장을 설계할 때 생길 수 있는 문제가 있다.
  - 상속 : 서브클래스마다 행동(동작 방식)이 바뀔 수 있는데 서브클래스에서 한 가지 행동만 사용하도록 하는 것은 올바르지 못함
    - 예) 슈퍼클래스에 fly() 라는 메서드를 정의. 그런데, 서브클래스 중에서 fly() 행동을 다르게 하거나 못 할 수도 있음.
  - 인터페이스 : 특정 행동(기능) 필요로 하는 서브클래스가 인터페이스를 구현하는 방식은 코드를 재활용할 수 없다는 문제점이 있음
    - 예) 5개 슈퍼클래스 중 3개의 슈퍼클래스가 동일한 fly() 를 구현했는데, 해당 fly() 에 변경이 생기면 모든 서브클래스의 코드를 수정해야 함
- 이럴 때 전략패턴을 사용해 변화하는 행동을 클래스 내부의 메서드로 정의하지 않고 다른 클래스에 위임하면 위에서 살펴본 문제점 없이 기능을 확장할 수 있다

### ✅ 디자인 원칙
- 애플리케이션에서 달라지는 부분을 찾아내고 달라지지 않는 부분과 분리한다.
- 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
- 상속보다는 구성을 활용한다. 구성이란 A has a B 관계를 나타내기 위에 두 클래스를 합치는 것을 의미한다.

