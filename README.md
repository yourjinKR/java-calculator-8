# java-calculator-precourse
- 기능 구현 전 요구사항을 읽고 해당 과제에 대해 구현할 기능 목록을 정리했습니다.
- 최종 결과물과 본 기능 목록서는 내용이 상이할 수 있습니다.
- 각 메소드명은 임시로 작성했습니다.

## 구현할 기능 목록
> ⚠️ : `IllegalArgumentException`
> 
### `boolean checkCustomGubunJa(String solution)`

- `"//"`와 `"\n"`가 있는지 확인

### `boolean validateGubunJa(String solution)`

- 구분자 지정 문법이 올바른지 검사
  - 해당 문자 사이에 문자가 존재하지 알을 경우 ⚠️
  - 해당 문자 사이에 “문자”가 아닌 “문자열”이 있을 경우 ⚠️
- 실행조건 : 커스텀 구분자가 있을때

### `? splitByGubunJa(String solution)`

- 커스텀 구분자 문구와 계산 영역을 분리
- 실행조건 : 커스텀 구분자 없거나 검증된 커스텀 구분자가 있을 경우

### `boolean validateNumString(char gubunja, String numberStr)`

- 계산 영역에 구분자와 숫자 외 다른 문자가 있는지
  - 있다면 ⚠️
  - 없다면 true
- 실행조건 : 구분자와 숫자 외 문자 있는지 검증

### `List<int> splitNumberByGubunJa(char gubunja, String numberStr)`

- 계산 영역을 구분자 기준으로 분리
- 예시 : `"2:3:4"` → `[2, 3, 4]`

### `int calcNumStr(List<int> number)`

- 문자열을 계산 후 결과 리턴