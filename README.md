# Kotlin

### 언어 특징
* Type Inference (타입 추론)
  * 컴파일 시점에 컴파일러가 문맥을 고려해서 변수 타입을 결정
* Nullable Type
  * 코드 작성단에서 nullpoint exception이 발생할 수 있는 지점의 여부를 미리 검사 할 수 있다
  * 1장에서 간략히 6장에서 자세히

### 함수형 프로그래밍과 객체지향 프로그래밍 차이
* 함수형 프로그래밍
  * 일급 객체 함수 : 함수를 변수에 저장할 수 있고, 함수를 인자로 다른 함수에 전달이 가능하며, 함수에서 새로운 함수를 만들어서 반환이 가능
  * 한번 생성되면 내부 상태가 절대로 바뀌지 않는 불변 객체
  * 입력이 같으면 항상 같은 출력을 내놓고 다른 객체의 상태를 변경하지 않으며, 외부 환경과 상호작용하지 않는 순수 함수
