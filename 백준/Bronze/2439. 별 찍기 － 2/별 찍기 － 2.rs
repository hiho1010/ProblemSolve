use std::io::{self, Write};

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Failed to read line");
    let n: usize = input.trim().parse().expect("Please enter a number");

    for i in 1..=n {
        let spaces = " ".repeat(n - i);
        let stars = "*".repeat(i);
        println!("{}{}", spaces, stars);
    }
}