//Global Declarations
Snake Bob;

void setup() {
  size(1500,700);
  Bob = new Snake(0,0);
}

void draw() {
  background(255,255,255);
  Bob.display();
}

void keyPressed() {
  if (keyCode == UP || key == 'w') {
    Bob.move(0);
  }
  else if (keyCode == RIGHT || key == 'd') {
    Bob.move(1);
  }
  else if (keyCode == DOWN || key == 's') {
    Bob.move(2);
  }
  else if (keyCode == LEFT || key == 'a') {
    Bob.move(3);
  }
}