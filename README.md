# 🏓 Ping Pong Game (Java Swing)

## 📌 Overview
This is a simple **Ping Pong (Ball & Paddle) game** built using **Java Swing**.  
The player controls a paddle to bounce a moving ball and score points.

---

## 🎮 Features
- Smooth ball animation using `Timer`
- Paddle movement using keyboard (Left & Right arrow keys)
- Collision detection (ball + walls + paddle)
- Score tracking system
- Game Over popup with restart option
- Lightweight and beginner-friendly project

---

## 🕹️ Controls
| Key | Action |
|-----|--------|
| ⬅ Left Arrow | Move paddle left |
| ➡ Right Arrow | Move paddle right |

---

## ⚙️ How It Works
- The ball moves continuously using a `Timer`.
- It bounces when it hits:
  - Left/Right walls
  - Top wall
  - Paddle
- If the ball crosses the bottom boundary → **Game Over**
- Player can restart or exit the game.

---

## 🧠 Concepts Used
- Java Swing (`JPanel`, `JFrame`)
- Event Handling (`KeyListener`, `ActionListener`)
- Graphics (`paint`, `Graphics`)
- Game Loop using `Timer`
- Collision Detection

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ping-pong-java.git
