# java-calculator-precourse

## SeparatorHandler
> 구분자 관리 및 계산 가능한 데이터 형식으로 변환
### field
#### `String basicSeparator`
- 기본 구분자
#### `String customSeparator`
- 커스텀 구분자
#### `String calcArea`
- 계산 영역
### method
#### `boolean validateCustomSeparator(String solution)`
- 문자열에 올바른 형식의 커스텀 구분자 지정문이 있는지 검증

#### `String cutCustomSeperator(String solution)`
- 커스텀 구분자 지정문에 해당되는 영역을 잘라낸 문자열을 반환 

#### `String getCustomSeparator(String solution)`
- 문자열에서 커스텀 구분자를 얻어옴

#### `boolean validateCalcArea()`
- 계산 영역이 올바른 형식으로 작성됐는지 검증

#### `List<Long> splitNumberBySeparator()`
- **구분자들**을 기준으로 계산 영역 문자열을 배열로 변환
  - _구분자들 : 기본 구분자 + 커스텀 구분자_
- 배열로 변환된 값들을 숫자로 타입 변환하여 Long 타입의 List를 반환

#### `Long parseLong(String stringMember)`
- String -> Long 타입 변환 과정에서 발생하는 예외를 `IllegalArgumentException`로 예외처리

<br>

## Calculator
> 타입에 따른 계산 및 결과값 반환
### method
#### `Long sum(List<Long> numList)`
- long 타입의 배열의 합을 반환

<br>

## MessageHelper
> 요구사항에 맞는 출력 양식 제공
### field
#### `String INPUT_INTRO`
- `public statinc final` 지정자로 상수값으로 관리
#### `String RESULT_HEADER`
- `public statinc final` 지정자로 상수값으로 관리
