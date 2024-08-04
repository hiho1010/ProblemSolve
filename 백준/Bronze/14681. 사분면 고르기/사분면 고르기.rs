use std::io;

fn main() {
    // 표준 입력으로부터 입력을 받기 위한 설정
    let mut input = String::new();
    
    // x 좌표 입력 받기
    io::stdin().read_line(&mut input).expect("Failed to read line");
    let x: i32 = input.trim().parse().expect("Invalid input");
    
    // y 좌표 입력 받기
    input.clear();
    io::stdin().read_line(&mut input).expect("Failed to read line");
    let y: i32 = input.trim().parse().expect("Invalid input");
    
    // 사분면 판별
    if x > 0 && y > 0 {
        println!("1");
    } else if x < 0 && y > 0 {
        println!("2");
    } else if x < 0 && y < 0 {
        println!("3");
    } else if x > 0 && y < 0 {
        println!("4");
    }
}