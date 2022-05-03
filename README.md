
#### 도서관리 프로그램(IN-MEMORY 방식) 

## 1)개요

도서관리 프로그램을 프로그램이 구현되는 동안만 정보들이 저장이 될 수 있도록 만들었습니다.  

## 2)기능

도서관리 프로그램을 이용하기 위해서는 회원가입이 필요하고 로그인을 하게 되면 도서관리 프로그램에 구현된 기능들을 사용할 수 있게 됩니다. 

회원가입, 로그인, 도서 대출, 도서 반납, 책 입고와 책 목록에서의 제거, 비밀번호 찾기, 회원정보 수정 등의 기능을 이용할 수 있습니다. 

프로그램을 종료하게 되면은 저장했던 정보들은 사라지게 됩니다. 

책 입고와 제거를 하기 위해서는 매니저 아이디로만 로그인을 해야만 합니다. 

## 3)구현 방법

In-memory 방식에서는 ArrayList와 HashMap을 이용해 프로그램을 구현하였습니다. 회원정보와 책에 관한 정보들을 전부 ArrayList를 생성하여 저장하였습니다. 그리고 getter와 setter method를 활용해

서 정보 조회와 도서 대출 등에 활용할 수 있었습니다.

ArrayList의 특성상 그렇게 되면 책이 중복되더라도 여러 권을 저장할 수 있고, 하나씩 누군가 책을 빌려가더라도 동일한 책이 1권씩 제거되어 

책의 권수를 지정할 수 있고, 관리에 용이합니다. 

ArrayList는 배열과 달리 크기를 유연하게 정할 수 있다는 장점이 있습니다. 

HashMap 같은 경우는 key와 value값이 나뉘어져 있어 로그인과 회원정보들을 관리하는데에 용이하게 사용할 수 있습니다.

key에 이름과 주민번호를 지정해두면 key값만으로 value에 접근해 회원정보들의 객체를 생성해 저장해두면 쉽게 사용이 가능합니다.

그리고 loginlist를 만들 때에도 key값에 id와 password를 쓰고 이름과 주민번호 휴대폰번호 등을 입력하면 로그인시에도 정보 조회등에 용이하게 사용할 수 있습니다.  

booklist에도 key값에 id와 password 빌린 도서와 빌린 도서의 작가 빌린 날짜 등을 기록해두어 관리를 용이하게 할 수 있도록 했습니다.

프로그램을 실행하면 다시 초기로 돌아가게 됩니다.

## 4)시연 동영상

도서관리 프로그램 시연 영상입니다.

<iframe width="853" height="480" src="https://www.youtube.com/embed/qSjuKNe8xIg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

