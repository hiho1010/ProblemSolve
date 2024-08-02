use std::io;

fn main() {
    // 표준 입력을 사용하여 입력을 받습니다.
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Failed to read line");

    // 입력받은 문자열을 공백으로 분리하여 벡터에 저장합니다.
    let nums: Vec<i32> = input
        .split_whitespace()
        .map(|s| s.parse().expect("Parse error"))
        .collect();

    // 두 수의 합을 계산하여 출력합니다.
    let result = nums[0] + nums[1];
    println!("{}", result);
}