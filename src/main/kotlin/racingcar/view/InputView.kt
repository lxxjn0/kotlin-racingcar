package racingcar.view

const val CAR_NAME_DELIMITER = ","

fun inputCarNames(): String? {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    return readLine()
}

fun inputAttempt(): String? {
    println("시도할 횟수는 몇 회인가요?")
    return readLine()
}
